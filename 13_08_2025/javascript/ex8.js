// List of employees
let employees = [
    { name: "vaishnav", role: "Manager", empId: 101, salary: 75000 },
    { name: "Rohan", role: "QA", empId: 103, salary: 50000 },
    { name: "aranjay", role: "Manager", empId: 104, salary: 80000 },
    { name: "Ankit", role: "Developer", empId: 105, salary: 60000 },
    { name: "harsh", role: "Manager", empId: 106, salary: 72000 }
];

// Calculate total salary of all Managers
let totalManagerSalary = employees
    .filter(emp => emp.role === "Manager")
    .reduce((sum, emp) => sum + emp.salary, 0);

console.log("Total Salary drawn by all Managers: ₹" + totalManagerSalary);
