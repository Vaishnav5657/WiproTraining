function pair<T, U>(first: T, second: U): [T, U] {
    return [first, second];
}

let numStrPair = pair<number, string>(101, "Vaishnav");
console.log(numStrPair);
let boolNumPair = pair<boolean, number>(true, 500);
console.log(boolNumPair); 
