// 1) Define the Employee interface
interface Employee {
  empId: number;
  empName: string;
  salary: number;
}

// 2) Create a list (array) of employees
const employees: Employee[] = [
  { empId: 101, empName: "John",  salary: 45000 },
  { empId: 102, empName: "Priya", salary: 52000 },
  { empId: 103, empName: "Aman", salary: 60000 },
];

// 3) Function that prints employees and returns the count
function printEmployees(list: Employee[]): number {
  console.log("Employee List:");
  for (const e of list) {
    console.log(`ID: ${e.empId}, Name: ${e.empName}, Salary: ₹${e.salary}`);
  }
  return list.length;
}

// 4) Call the function and show the count
const count = printEmployees(employees);
console.log("Total employees:", count);

