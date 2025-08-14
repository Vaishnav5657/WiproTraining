// calculator.ts
var Calculator = /** @class */ (function () {
    function Calculator() {
    }
    // Method to add two numbers
    Calculator.prototype.add = function (a, b) {
        return a + b;
    };
    // Method to subtract two numbers
    Calculator.prototype.subtract = function (a, b) {
        return a - b;
    };
    return Calculator;
}());
// --- Using the Calculator class ---
var calc = new Calculator();
console.log("Addition:", calc.add(10, 5)); // 15
console.log("Subtraction:", calc.subtract(10, 5)); // 5
