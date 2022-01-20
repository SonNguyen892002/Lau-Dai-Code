
var image = document.querySelector('#img');
var imgs = ['http://bien3d.com/wp-content/uploads/qua-hai-hung-voi-hinh-tuong-ga-he-ma-quai-poster-phim-kinh-di-it-2-bi-cac-phu-huynh-nem-da-kich-liet-856ab2.jpg', 'https://bloganchoi.com/wp-content/uploads/2019/11/poster-truy-cau.jpg', 'https://designer.com.vn/wp-content/uploads/2017/07/poster-phim-kinh-di.jpg','https://photo-cms-kienthuc.zadn.vn/zoom/800/uploaded/bientapkienthuc/2016_08_26/son26-8/newfolder4/pham-bang-bang-mat-nhon-hoat-dang-so-tren-poster-phim.jpg'];
var imgBtn = document.querySelectorAll('.circle');

if (image) {
	var isLenght = imgBtn.length;
	var isArray = [];

	imgBtn.forEach(e =>{
  		isArray.push(e);
	})

	var index = 1;

	changeImage = function () {
  		image.src = imgs[index];
  		index++;
  		if (index == 4) {
    		index = 0;
  		}
		document.querySelector('.total-heading .action').classList.remove('action');
		isArray[index].classList.add('action');
	}

	setInterval(changeImage,3000);

	imgBtn.forEach(btn =>{
	  btn.addEventListener('click', () =>{
	    document.querySelector('.total-heading .action').classList.remove('action');
	    btn.classList.add('action');
	    document.querySelector('#img').src = imgs[index];
	    index++;
	    if (index == 4) {
	      index = 0;
	    }
	  });
	});
}
