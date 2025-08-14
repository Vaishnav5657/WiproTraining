// function seprateFirst(...args){
//     let first = args[0];
//     let rest = args.slice(1)
//     return {first, rest}

// }

// console.log(seprateFirst(1,2,3,4,5))

function separateFirstRest(first, ...rest) {
    return {
        first: first,
        rest: rest
    };
}

// Example usage
console.log(separateFirstRest(10, 20, 30, 40));
console.log(separateFirstRest("A", "B", "C"));
