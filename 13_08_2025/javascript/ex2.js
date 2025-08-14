// x = document.getElementById("demo").innerHTML;
// console.log(x);

// document.getElementById("demo").innerHTML = "Hello, JavaScript!";


function checkLength() {
    let text = document.getElementById("myInput").value;
    let length = text.length;
    document.getElementById("result").innerHTML = "Length: " + length;
}
