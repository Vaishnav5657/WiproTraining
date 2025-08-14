const input = document.getElementById("myInput");
const label = document.getElementById("charRemaining");

input.addEventListener("input", function () {
    let remaining = 50 - input.value.length;
    label.innerHTML = remaining + " characters remaining";
});
