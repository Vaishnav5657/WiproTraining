function login() {
    let userId = document.getElementById("userId").value;
    let password = document.getElementById("password").value;

    if (userId && password) {
        localStorage.setItem("userId", userId);
        document.getElementById("status").innerText = `Logged in as ${userId}`;
    } else {
        alert("Please enter User ID and Password");
    }
}

function logout() {
    localStorage.removeItem("userId");
    document.getElementById("status").innerText = "Logged out";
}
