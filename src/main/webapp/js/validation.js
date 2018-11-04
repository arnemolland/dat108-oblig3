"use strict"

const
	firstName = document.querySelector('#firstname-input'),
	lastName = document.querySelector('#lastname-input'),
	phone = document.querySelector('#phone-input'),
	password = document.querySelector('#password-input'),
	passwordConf = document.querySelector('#passwordconf-input')

const
	firstNameError = document.querySelector('#firstname-error'),
	lastNameError = document.querySelector('#lastname-error'),
	phoneError = document.querySelector('#phone-error'),
	passwordError = document.querySelector('#password-error'),
	passwordConfError = document.querySelector('#passwordconf-error')

const submitButton = document.querySelector('#submit-button')

submitButton.disabled = true

const stringNotEmpty = s => s.length > 0
const string8Numbers = s => /^\d{8}$/.test(s)
const stringLength5 = s => s.length >= 5

const ready = {
	firstName: false,
	lastName: false,
	phone: false,
	password: false,
	passwordConf: false
}

const readyForSubmit = () => {
	for (let a in ready) {
		if (ready[a] == false) {
			submitButton.disabled = true
			return
		}
	}
	
	submitButton.disabled = false
}

firstName.addEventListener('keyup', () => {
	if (stringNotEmpty(firstName.value)) {
		firstNameError.style.visibility = 'hidden'
		ready.firstName = true
	} else {
		firstNameError.style.visibility = 'visible'
		ready.firstName = false
	}

	readyForSubmit()
})

lastName.addEventListener('keyup', () => {
	if (stringNotEmpty(lastName.value)) {
		lastNameError.style.visibility = 'hidden'
		ready.lastName = true
	} else {
		lastNameError.style.visibility = 'visible'
		ready.lastName = false
	}

	readyForSubmit()
})

phone.addEventListener('keyup', () => {
	if (string8Numbers(phone.value)) {
		phoneError.style.visibility = 'hidden'
		ready.phone = true
	} else {
		phoneError.style.visibility = 'visible'
		ready.phone = false
	}

	readyForSubmit()
})

password.addEventListener('keyup', () => {
	if (stringLength5(password.value)) {
		passwordError.style.visibility = 'hidden'
		ready.password = true
	} else {
		passwordError.style.visibility = 'visible'
		ready.password = false
	}

	readyForSubmit()
})

passwordConf.addEventListener('keyup', () => {
	if (password.value === passwordConf.value) {
		passwordConfError.style.visibility = 'hidden'
		ready.passwordConf = true
	} else {
		passwordConfError.style.visibility = 'visible'
		ready.passwordConf = false
	}

	readyForSubmit()
})
