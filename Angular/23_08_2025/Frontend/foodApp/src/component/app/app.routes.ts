import { Routes } from '@angular/router';
import { Login } from '../login/login';
import { UserRegister } from '../user-register/user-register';
import { FoodList } from '../food-list/food-list';

export const routes: Routes = [
    {path: '' , component : Login},
    {path: 'login', component: Login},
    {path:'food', component:FoodList},
    {path: 'login/register', component: UserRegister}
];
