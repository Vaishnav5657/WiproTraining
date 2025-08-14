// Create date object for 13 August 2030
let date = new Date(2030, 7, 13); 
let days = ["Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"];

// Get the day of the week
let dayName = days[date.getDay()];
console.log("13 August 2030 will be a:", dayName);
