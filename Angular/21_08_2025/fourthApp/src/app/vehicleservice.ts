import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Vehicle} from './vehicle';

@Injectable({
  providedIn: 'root'
})
export class Vehicleservice {

  constructor(private http: HttpClient) {}

  getVehicles(): Observable<Vehicle[]> {
    return this.http.get<Vehicle[]>('http://localhost:3000/vehicles');
  }
  
}
