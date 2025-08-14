// Unordered array of cities
let cities = ["Mumbai", "Delhi", "Bangalore", "Kolkata", "Pune", "Chennai", "Ahmedabad"];

// Get HTML elements
let loadBtn = document.getElementById("loadBtn");
let cityDropdown = document.getElementById("cityDropdown");

// On button click
loadBtn.addEventListener("click", function() {
    // Clear existing options (except default)
    cityDropdown.innerHTML = '<option value="">-- Select a City --</option>';

    // Sort cities alphabetically
    let sortedCities = cities.sort();

    // Add sorted cities to dropdown
    sortedCities.forEach(function(city) {
        let option = document.createElement("option");
        option.value = city;
        option.textContent = city;
        cityDropdown.appendChild(option);
    });
});
