import { CommonModule } from '@angular/common';
import { Component, Output, EventEmitter } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-newtask',
  imports: [CommonModule, FormsModule],
  templateUrl: './newtask.html',
  styleUrl: './newtask.css'
})
export class Newtask {

  description = '';
  category = ' ';
  categories = ['Work', 'Study', 'Exercise'];

  @Output() addTask = new EventEmitter<{ description: string; category: string }>();

  submit() {
    if (!this.description.trim()) return;
    this.addTask.emit({ description: this.description, category: this.category });
    this.description = '';
    this.category = 'Work';
  }

}

