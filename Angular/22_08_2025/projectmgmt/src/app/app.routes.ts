import { Routes } from '@angular/router';
import { Productlist } from './productlist/productlist';
import { Addproduct } from './addproduct/addproduct';
import { Editproduct } from './editproduct/editproduct';
import { Deleteproduct } from './deleteproduct/deleteproduct';

export const routes: Routes = [
    { path: '', component: Productlist },
    {path:'productlist', component:Productlist},
    {path:'addproduct', component:Addproduct},
    {path:'editproduct/:id', component:Editproduct},
    {path:'deleteproduct/:id', component:Deleteproduct}
];