class Util {

    // a) Get today's date in dd-mm-YYYY format
    getDate() {
        let today = new Date();
        let dd = String(today.getDate()).padStart(2, '0');
        let mm = String(today.getMonth() + 1).padStart(2, '0'); // Months are 0-based
        let yyyy = today.getFullYear();
        return `${dd}-${mm}-${yyyy}`;
    }

    // b) Get value of PI
    getPIValue() {
        return Math.PI;
    }

    // c) Convert Celsius to Fahrenheit
    convertC2F(celsius) {
        return (celsius * 9/5) + 32;
    }

    // d) Get Fibonacci series up to n elements
    getFibonacci(n) {
        if (n <= 0) return [];
        if (n === 1) return [0];
        let fib = [0, 1];
        for (let i = 2; i < n; i++) {
            fib.push(fib[i - 1] + fib[i - 2]);
        }
        return fib;
    }
}

let util = new Util();

console.log("Today's Date:", util.getDate());
console.log("PI Value:", util.getPIValue());
console.log("25°C in Fahrenheit:", util.convertC2F(25));
console.log("Fibonacci (n=2):", util.getFibonacci(2));
console.log("Fibonacci (n=10):", util.getFibonacci(10));


// class Util{
//    getTodayDate(){
//     let today = new Date()
//     let day = today.getDate()
//     let month = today.getMonth()+1
//     let year = today.getFullYear()
//     return ${day}/${month}/${year}
    
//    }

//    getPivalue(){
//     return Math.PI;
//    }

//    convertToFahrenheit(celsius){
//     return (celsius * 9/5) + 32;
//    }

//    fibonacci(n){
//     let fib = [0, 1];
//     for (let i = 2; i < n; i++) {
//       fib[i] = fib[i - 1] + fib[i - 2];
//     }
//     return fib;
//    }
// }

// let util = new Util()

// console.log(util.getTodayDate())
// console.log(util.getPivalue())
// console.log(util.convertToFahrenheit(30))
// console.log(util.fibonacci(5))