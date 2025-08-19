import { Component } from '@angular/core';
import { NgClass, NgStyle } from '@angular/common';

@Component({
  selector: 'app-ex2',
  imports: [NgClass,NgStyle],
  templateUrl: './ex2.html',
  styleUrl: './ex2.css'
})
export class Ex2 {

flag:boolean=true
  flag1:boolean=false
  getngClass(){
    return {
      'app':this.flag, 
      'app2':this.flag1
  }
}
}