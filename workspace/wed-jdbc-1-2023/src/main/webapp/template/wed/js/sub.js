/**
 * 
 */

// step 1
const ipnElement = document.querySelector('#fullpass');
const btnElement = document.querySelector('#btnPassword');

// step 2
btnElement.addEventListener('click', function() {
  // step 3
  const currentType = ipnElement.getAttribute('type');
  // step 4
  ipnElement.setAttribute(
    'type',
    currentType === 'password' ? 'text' : 'password'
  );

  if(currentType === 'password') {
    btnElement.classList.add('b');
  } else {
    btnElement.classList.remove('b');
  };

});






// Đối tượng 'Validator'
function Validator(options) {

  function getParent(element, selector) {
      while (element.parentElement) {
          if (element.parentElement.matches(selector)) {
              return element.parentElement;
          }
          element = element.parentElement;
      }
  }

  var selectorRules = {};


  // Hàm thực viện validate
  function validate(inputElement, relu) {
      var errorMessage ;
      var errorElement = getParent(inputElement, options.formGroupSelector).querySelector(options.errorSelector);

      // lấy ra các relu của selector
      var relus = selectorRules[relu.selector];

      // lặp qua từng relu và kiểm tra
      // nếu có lỗi thì dùng việc kiểm tra
      for ( var i = 0; i < relus.length; i++) {
          switch (inputElement.type) {
              case 'radio':
              case 'checkbox':
                  errorMessage = relus[i](
                      formElement.querySelector(relu.selector + ':checked')
                  );
                  break;
              default: 
                  errorMessage = relus[i](inputElement.value);
          }
          if (errorMessage) break;
      }

      if (errorMessage) {
          errorElement.innerHTML = errorMessage;
          getParent(inputElement, options.formGroupSelector).classList.add('invlid');
      } else {
          errorElement.innerHTML = '';
          getParent(inputElement, options.formGroupSelector).classList.remove('invlid');
      }

      return !errorMessage;
  }


  // lấy element của form cần validate
  var formElement = document.querySelector(options.form);

  if (formElement) {

      // khi submit form
      formElement.onsubmit = function(e) {
          e.preventDefault();

          var isFormvalid = true;

          // thực hiện lặp qua từng relu và validate
          options.relus.forEach( function (relu) {
              var inputElement = formElement.querySelector(relu.selector);
              var isValid = validate(inputElement, relu);
              if (!isValid) {
                  isFormvalid = false;
              }
          });

          

          if (isFormvalid) {

              // Trường hợp onsubmit với js
              if (typeof options.onsubmit === 'function' ) {
                  var enableInputs = formElement.querySelectorAll('[name]:not([disable])');
                  var formValues = Array.from(enableInputs).reduce( function (values, input) {
                      
                      switch(input.type) {
                          case 'radio':
                              values[input.name] = formElement.querySelector('input[name="' + input.name + '"]:checked').value;
                              break;
                          case 'checkbox':
                              if (input.matches(':checked')) {
                                  values[input.name] = '';
                                  return values;
                              }
                              if (!Array.isArray(values[input.name])) {
                                  values[input.name] = [];
                              }
                              values[input.name].push(input.value);
                              break;
                          case 'file':
                              values[input.name] = input.files;
                              break;
                          default:
                              values[input.name] = input.value;
                      }
                      return values;
                  }, {} );
                  options.onsubmit(formValues);
              }
              // Trường hợp onsubmit có hành vi mặc định
              else {
                  formElement.submit();
              }
          }
      }


      // lặp qua mỗi relu và xử lý (lắng nghe sự kiện blur, input, ....)
      options.relus.forEach( function (relu) {

          // luu laij cac relu cho moi input

          if (Array.isArray(selectorRules[relu.selector])) {
              selectorRules[relu.selector].push(relu.test);
          }else{
              selectorRules[relu.selector] = [relu.test];
          }


          var inputElements = formElement.querySelectorAll(relu.selector);

          Array.from(inputElements).forEach(function (inputElement) {
              // xử lý trường hợp blur khỏi input
              inputElement.onblur = function () {
                  validate(inputElement, relu);
              }

              // xử lý trường mỗi khi người dùng nhập vào input 
              inputElement.oninput = function () {
                  var errorElement = getParent(inputElement, options.formGroupSelector).querySelector(options.errorSelector)
                  errorElement.innerHTML = '';
                  getParent(inputElement, options.formGroupSelector).classList.remove('invlid');
              }

              // Xử lý khi select chọn sai báo lỗi ngay
              inputElement.onchange = function () {
                  validate(inputElement, relu);
              }
          });
      });
  }
}



// định nghĩa relus
// nguyên tắc chung cho relu
// 1.khi có lỗi => messga lỗi
// 2.khi ko có lỗi => ko trả ra j cả (undefined)
Validator.isRequired = function (selector, message) {
  return {
      selector : selector,
      test: function (value) {
          return value ? undefined : message || 'Vui lòng nhập trường này !!!';
      }
  };
}

Validator.isEmail = function (selector, message) {
  return {
      selector : selector,
      test: function (value) {
          var regex = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
          return regex.test(value) ? undefined : message || 'Trường này phải là Email !!!';
      }
  };
}

Validator.minLength = function (selector, min, message) {
  return {
      selector : selector,
      test: function (value) {
          return value.length >= min ? undefined : message || `Vui lòng nhập vào ${min} ký  tự.`;
      }
  };
}

Validator.isConfirmed = function (selector, getConfirmValue, message) {
  return {
      selector : selector,
      test: function (value) {
          return value === getConfirmValue() ? undefined : message || 'Giá trị nhập vào không chính xác !!!';
      }
  };
}
