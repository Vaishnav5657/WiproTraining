import { Directive, ElementRef, Renderer2 } from '@angular/core';

@Directive({
  selector: '[appHighlighttext]'
})
export class Highlighttext {

  constructor(private el: ElementRef, private renderer: Renderer2) { 

    // set text color to yellow
    this.renderer.setStyle(this.el.nativeElement, 'color', 'yellow');
    // add strikethrough
    this.renderer.setStyle(this.el.nativeElement, 'text-decoration', 'line-through');
  }

}