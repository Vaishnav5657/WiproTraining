import { CommonModule, DatePipe, UpperCasePipe } from '@angular/common';
import { Component, signal } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { FahrenheitePipe } from './fahrenheite-pipe';


@Component({
  selector: 'app-root',
  imports: [FormsModule, UpperCasePipe,CommonModule,DatePipe,FahrenheitePipe],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  protected readonly title = signal('pipedemo');
  userInput: string = '';
  selectDate:any;
  temperatureC: number = 0;
}

