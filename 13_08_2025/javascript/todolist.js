let addBtn = document.getElementById("addBtn");
let taskInput = document.getElementById("taskInput");
let taskList = document.getElementById("taskList");

// Function to add task
function addTask() {
    let taskText = taskInput.value.trim();

    if (taskText === "") {
        alert("Please enter a task!");
        return;
    }

    // Create list item
    let li = document.createElement("li");
    li.textContent = taskText;

    // Create delete button
    let deleteBtn = document.createElement("button");
    deleteBtn.textContent = "Delete";
    deleteBtn.classList.add("delete-btn");

    // Delete task on click
    deleteBtn.onclick = function () {
        taskList.removeChild(li);
    };

    // Append delete button to li
    li.appendChild(deleteBtn);

    // Add li to ul
    taskList.appendChild(li);

    // Clear input
    taskInput.value = "";
}

// Add task on button click
addBtn.addEventListener("click", addTask);

// Also allow pressing Enter to add task
taskInput.addEventListener("keypress", function (e) {
    if (e.key === "Enter") {
        addTask();
    }
});
