import { FormsModule } from '@angular/forms';
import { Component, EventEmitter, Input, Output } from '@angular/core';
import { Fruits } from '../fruits';

@Component({
  selector: 'app-display',
  imports: [FormsModule],
  templateUrl: './display.html',
  styleUrl: './display.css'
})
export class Display {
  @Input() fruits:Fruits[] = [
    {
      name: "",
      image: "",
      description:""
    }
  ]

  @Output() btnClick = new EventEmitter<string>();
 
  onClick(name:string) {
    console.log("in dispaly"+name);
    this.btnClick.emit(name);
 
}
}