import { Component } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Productservice } from '../productservice';
import { Product } from '../product';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-editproduct',
  imports: [FormsModule],
  templateUrl: './editproduct.html',
  styleUrl: './editproduct.css'
})
export class Editproduct {

  constructor(private productService: Productservice
    , private router: Router
    , private activatedRoute: ActivatedRoute
  ){}

  id:string|null='';
  product:Product={
    name:'',
    category:'',
    price:0
  }


  ngOnInit(){
    this.id = this.activatedRoute.snapshot.paramMap.get('id');
    if(this.id){
      this.productService.findProductById(this.id).subscribe(product=>{
        this.product = product;
      })
    }
  }

  save(){
    this.productService.saveProduct(this.product).subscribe({
      next:(product)=>{
        this.router.navigate(['/productlist'])
      },
      error:(error)=>{
        console.log(error);
      }
    })
  }
}
