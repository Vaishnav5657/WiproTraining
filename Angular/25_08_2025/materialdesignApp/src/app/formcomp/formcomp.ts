import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormControl, ReactiveFormsModule } from '@angular/forms';

@Component({
  selector: 'app-formcomp',
  standalone: true,
  imports: [ReactiveFormsModule, CommonModule],
  templateUrl: './formcomp.html',
  styleUrls: ['./formcomp.css']
})
export class Formcomp {

  // form control bound to input
  name = new FormControl('');

  // property to hold reversed value
  reversedText: string = '';

  constructor() {
    // subscribe to value changes
    this.name.valueChanges.subscribe((value) => {
      this.reversedText = value ? value.split('').reverse().join('') : '';
    });
  }
}

