const navMenu = document.querySelector('#menu');
const navMenu1 = document.querySelector('#menu1');
const navDown = document.querySelector('.a');
const navDown1 = document.querySelector('.a1');
const menuPhanquyen = document.querySelector('#phanquyen');
const menuQlfim = document.querySelector('#qlfim');
const menuTkadmin = document.querySelector('#tkadmin');
const menuDTfim = document.querySelector('#dtfim');
const menuqluser = document.querySelector('#qluser');

function Button() {
    navMenu.classList.toggle('off');
    navDown.classList.toggle('down');
}

function Button1() {
    navMenu1.classList.toggle('off');
    navDown1.classList.toggle('down');
}

function phanquyen() {
    menuPhanquyen.classList.toggle('none');
    menuQlfim.classList.add('none');
    menuTkadmin.classList.add('none');
    menuDTfim.classList.add('none');
    menuqluser.classList.add('none');
    document.querySelector('#menu .l').classList.remove('active');
    document.querySelector('#menu a').classList.remove('active');
    document.querySelector('#menu1 a').classList.remove('active');
    document.querySelector('#menu1 .j').classList.remove('active');
    const btnA = document.querySelector('.t');
	document.querySelector('#menu1').classList.remove('off');
	document.querySelector('#menu1 .k').classList.add('active');
	document.querySelector('.a1').classList.add('down');

	btnA.innerHTML = "Quản lý user >> phân quyền:";
}

function qlfim() {
    menuQlfim.classList.toggle('none');
    menuPhanquyen.classList.add('none');
    menuTkadmin.classList.add('none');
    menuDTfim.classList.add('none');
    menuqluser.classList.add('none');
    document.querySelector('#menu1 .k').classList.remove('active');
    document.querySelector('#menu a').classList.remove('active');
    document.querySelector('#menu1 a').classList.remove('active');
    document.querySelector('#menu1 .j').classList.remove('active');
    const btnA = document.querySelector('.t');
	document.querySelector('#menu').classList.remove('off');
	document.querySelector('#menu .l').classList.add('active');
	document.querySelector('.a').classList.add('down');

	btnA.innerHTML = "Quản lý đăng tải >> quản lý phim:";
}

function tkadmin() {
    menuTkadmin.classList.toggle('none');
    menuPhanquyen.classList.add('none');
    menuQlfim.classList.add('none');
    menuDTfim.classList.add('none');
    menuqluser.classList.add('none');
    const btnA = document.querySelector('.t');
    const btnB = document.querySelector('#menu1 a');
    document.querySelector('#menu1 .k').classList.remove('active');
    document.querySelector('#menu .l').classList.remove('active');
    document.querySelector('#menu a').classList.remove('active');
    document.querySelector('#menu1 .j').classList.remove('active');
    document.querySelector('#menu1').classList.remove('off');
    document.querySelector('.a1').classList.add('down');
    btnB.classList.add('active');
    btnA.innerHTML = "Quản lý user >> tài khoản admin:";
    
    const ipnElement = document.querySelector('#fullpass');
    const btnElement = document.querySelector('#btnPassword');
    btnElement.addEventListener('click', function() {
        // step 3
        const currentType = ipnElement.getAttribute('type');
        // step 4
        ipnElement.setAttribute('type', currentType === 'password' ? 'text'
                : 'password');

        if (currentType === 'password') {
            btnElement.classList.add('b');
        } else {
            btnElement.classList.remove('b');
        }
    });

}

function dtfim() {
    menuDTfim.classList.toggle('none');
    menuPhanquyen.classList.add('none');
    menuQlfim.classList.add('none');
    menuTkadmin.classList.add('none');
    menuqluser.classList.add('none');
    document.querySelector('#menu1 .k').classList.remove('active');
    document.querySelector('#menu1 a').classList.remove('active');
    document.querySelector('#menu1 .j').classList.remove('active');
    document.querySelector('#menu .l').classList.remove('active');
    const btnA = document.querySelector('.t');
	document.querySelector('#menu').classList.remove('off');
	document.querySelector('#menu a').classList.add('active');
	document.querySelector('.a').classList.add('down');
	btnA.innerHTML = "Quản lý đăng tải >> đăng tải phim:";

}

function qluser() {
    menuqluser.classList.toggle('none');
    menuPhanquyen.classList.add('none');
    menuQlfim.classList.add('none');
    menuTkadmin.classList.add('none');
    menuDTfim.classList.add('none');
    document.querySelector('#menu1 .k').classList.remove('active');
    document.querySelector('#menu .l').classList.remove('active');
    document.querySelector('#menu a').classList.remove('active');
    document.querySelector('#menu1 a').classList.remove('active');
    const btnA = document.querySelector('.t');
	document.querySelector('#menu1').classList.remove('off');
	document.querySelector('#menu1 .j').classList.add('active');
	document.querySelector('.a1').classList.add('down');
	btnA.innerHTML = "Quản lý user >> quản lý user:";
}
