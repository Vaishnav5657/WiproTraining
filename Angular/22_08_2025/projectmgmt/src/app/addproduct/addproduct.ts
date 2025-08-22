import { Component } from '@angular/core';
import { Productservice } from '../productservice';
import { Router } from '@angular/router';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-addproduct',
  imports: [FormsModule],
  templateUrl: './addproduct.html',
  styleUrl: './addproduct.css'
})
export class Addproduct {

   constructor(private productService: Productservice, private router: Router){}

  name:string='';
  price:number=0;
  category:string=''

  submit(){
    this.productService.addProduct({name:this.name, price:this.price, category:this.category}).subscribe((response)=>{
      this.name= '',
      this.price = 0,
      this.category =''
      this.router.navigate(['/productlist'])
    }, error=>{
      console.log("Error adding new product", error)
    })
  }
}
