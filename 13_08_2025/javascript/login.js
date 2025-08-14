// Get elements
let email = document.getElementById("email");
let password = document.getElementById("password");
let emailError = document.getElementById("emailError");
let passwordError = document.getElementById("passwordError");
let loginBtn = document.getElementById("loginBtn");

// Email validation function
function validateEmail() {
    let emailValue = email.value.trim();
    let emailPattern = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;

    if (emailValue === "") {
        emailError.textContent = "Email cannot be empty";
        return false;
    } else if (!emailPattern.test(emailValue)) {
        emailError.textContent = "Invalid email format";
        return false;
    } else {
        emailError.textContent = "";
        return true;
    }
}

// Password validation function
function validatePassword() {
    let passwordValue = password.value.trim();

    if (passwordValue === "") {
        passwordError.textContent = "Password cannot be empty";
        return false;
    } else {
        passwordError.textContent = "";
        return true;
    }
}

// Validate on blur
email.addEventListener("blur", validateEmail);
password.addEventListener("blur", validatePassword);

// Validate on button click
loginBtn.addEventListener("click", function () {
    let isEmailValid = validateEmail();
    let isPasswordValid = validatePassword();

    if (isEmailValid && isPasswordValid) {
        alert("Login successful!");
    }
});
