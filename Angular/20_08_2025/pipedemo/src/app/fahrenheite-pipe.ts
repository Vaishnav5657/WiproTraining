import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'fahrenheite'
})
export class FahrenheitePipe implements PipeTransform {

  transform(value: number, ...args: unknown[]): string {
    return (value*(9/5))+32+'F';
  }

}
