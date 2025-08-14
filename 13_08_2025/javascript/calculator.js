// function calculate(operation) {
//     let num1 = parseFloat(document.getElementById("num1").value);
//     let num2 = parseFloat(document.getElementById("num2").value);
//     let result = document.getElementById("result");

//     // Validation
//     if (isNaN(num1) || isNaN(num2)) {
//         result.textContent = "Please enter both numbers";
//         return;
//     }

//     let calcResult;
//     switch (operation) {
//         case 'add':
//             calcResult = num1 + num2;
//             break;
//         case 'subtract':
//             calcResult = num1 - num2;
//             break;
//         case 'multiply':
//             calcResult = num1 * num2;
//             break;
//         case 'divide':
//             if (num2 === 0) {
//                 result.textContent = "Cannot divide by zero";
//                 return;
//             }
//             calcResult = num1 / num2;
//             break;
//     }

//     result.textContent = calcResult;
// }



function calculate(operation) {
    let a = Number(document.getElementById("num1").value);
    let b = Number(document.getElementById("num2").value);
    let result;

    switch (operation) {
        case 'add':
            result = a + b;
            break;
        case 'subtract':
            result = a - b;
            break;
        case 'multiply':
            result = a * b;
            break;
        case 'divide':
            if (b === 0) {
                document.getElementById("result").innerText = "Cannot divide by zero";
                return;
            }
            result = a / b;
            break;
        default:
            result = "Invalid operation";
    }

    document.getElementById("result").innerText = "Result: " + result;
}
