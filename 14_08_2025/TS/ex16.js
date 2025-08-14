// 2) Create a list (array) of employees
var employees = [
    { empId: 101, empName: "John", salary: 45000 },
    { empId: 102, empName: "Priya Shah", salary: 52000 },
    { empId: 103, empName: "Aman Verma", salary: 60000 },
];
// 3) Function that prints employees and returns the count
function printEmployees(list) {
    console.log("Employee List:");
    for (var _i = 0, list_1 = list; _i < list_1.length; _i++) {
        var e = list_1[_i];
        console.log("ID: ".concat(e.empId, ", Name: ").concat(e.empName, ", Salary: \u20B9").concat(e.salary));
    }
    return list.length;
}
// 4) Call the function and show the count
var count = printEmployees(employees);
console.log("Total employees:", count);
