let names = ["Amit", "Krishna", "Rohan", "Vaishnav", "Anil", "Suresh"];

let filteredNames = names.filter((name)=>name.length>5)
let upperCaseNames = filteredNames.map((name)=>{return name.toUpperCase()})
console.log(upperCaseNames);
