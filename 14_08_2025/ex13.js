// Multiply function
export function multiply(a, b) {
    return a * b;
}

// Divide function with zero check
export function divide(a, b) {
    if (b === 0) {
        return "Error: Division by zero";
    }
    return a / b;
}
