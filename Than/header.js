/**
 * 
 */
const btnMenu = document.querySelector('#btn_menu');
const navMenu = document.querySelector('#menu');
const navLogin = document.querySelector('#login');

btnMenu.addEventListener('click', () => {
  navMenu.classList.toggle('no-none');
  navLogin.classList.toggle('no-none');
})