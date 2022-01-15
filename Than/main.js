
var image = document.querySelector('#img');
var imgs = ['./images/poster-phim.jpg', './images/anime-ốc sên.jpg', './images/img-avengers.jpg','./images/anime-seirei-gensouki-1-250x350.jpg']
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
