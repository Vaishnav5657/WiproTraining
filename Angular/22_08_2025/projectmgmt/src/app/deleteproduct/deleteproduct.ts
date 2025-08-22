import { Component } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Productservice } from '../productservice';

@Component({
  selector: 'app-deleteproduct',
  imports: [],
  templateUrl: './deleteproduct.html',
  styleUrl: './deleteproduct.css'
})
export class Deleteproduct {
constructor(private router: Router,
    private productService: Productservice,
    private activatedRoute: ActivatedRoute
  ){}

  id:string| null= '';

  ngOnInit(){
    this.id = this.activatedRoute.snapshot.paramMap.get('id')
    this.productService.deleteProduct(this.id!).subscribe(()=>{
      this.router.navigate(['/productlist'])

    }, error =>{
      console.log("Error deleting product", error)
    })
  }
}
