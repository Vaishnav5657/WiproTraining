import { CommonModule} from '@angular/common';
import { Component,Input, Output, EventEmitter } from '@angular/core';
import { Task } from '../task';

@Component({
  selector: 'app-tasklist',
  imports: [CommonModule],
  templateUrl: './tasklist.html',
  styleUrl: './tasklist.css'
})
export class Tasklist {

  @Input() tasks: Task[] = [];
  @Output() deleteTask = new EventEmitter<number>();

}
