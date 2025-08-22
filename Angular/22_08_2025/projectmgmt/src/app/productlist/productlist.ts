import { Component } from '@angular/core';
import { Productservice } from '../productservice';
import { Router, RouterLink } from '@angular/router';
import { Product } from '../product';
import { CurrencyPipe } from '@angular/common';

@Component({
  selector: 'app-productlist',
  imports: [RouterLink, CurrencyPipe],
  templateUrl: './productlist.html',
  styleUrl: './productlist.css'
})
export class Productlist {

  constructor(private productService:Productservice,private router:Router) { }

  products:Product[] = [];

  ngOnInit(){
    this.productService.getProducts().subscribe((data:Product[])=>{
      this.products = data;
    },(error)=>{
      console.log("Error in fetching the product list", error)
    })
  }

  addProduct(){
    this.router.navigate(['/addproduct'])
}
}