import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { Newtask } from '../newtask/newtask';
import { Tasklist } from '../tasklist/tasklist';
import { Task } from '../task';

@Component({
  selector: 'app-home',
  imports: [CommonModule, Newtask, Tasklist],
  templateUrl: './home.html',
  styleUrl: './home.css'
})
export class Home {

  tasks: Task[] = [];

  private lastId = 0;

  addTask(newTask: { description: string; category: string }) {
    const task: Task = {
      id: ++this.lastId,
      description: newTask.description,
      category: newTask.category
    };
    this.tasks.push(task);
  }

  deleteTask(id: number) {
    this.tasks = this.tasks.filter(t => t.id !== id);
  }
}
