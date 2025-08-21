import { Component } from '@angular/core';
import { Vehicleservice } from '../vehicleservice';
import { Vehicle } from '../vehicle';

@Component({
  selector: 'app-vehiclecomp',
  imports: [],
  templateUrl: './vehiclecomp.html',
  styleUrl: './vehiclecomp.css'
})
export class Vehiclecomp {

vehicles:Vehicle[]= []

  constructor(private vehicleService:Vehicleservice){

  }
  ngOnInit(){
    this.vehicleService.getVehicles().subscribe((data:Vehicle[])=>{
      this.vehicles = data
      console.log(this.vehicles)
    } , (error)=>{
      console.log("Error fetching vehicals", error)
  }
  )
  }
}
