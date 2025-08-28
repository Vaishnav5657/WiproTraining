import { ChangeDetectorRef, Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Router, RouterLink } from '@angular/router';
import { JwtToken } from '../../interface/jwt-token';
import { User } from '../../interface/user';
import { UserService } from '../../service/user-service';

@Component({
  selector: 'app-login',
  imports: [FormsModule, RouterLink],
  templateUrl: './login.html',
  styleUrl: './login.css'
})
export class Login {

  constructor(private router:Router,
    private userService: UserService,
    private cdr: ChangeDetectorRef
    
  ){}

  user = {
    userEmail:'',
    passWord:'',
    userName:''
  }

  users:User[]=[]

  jwtToken : JwtToken={token:''} 

  ngOnInit(){
    this.userService.getUser().subscribe((user)=>{
      this.cdr.detectChanges();
      this.users = user;
    })
  }

  login(){
    console.log("inside login ")
    this.userService.login(this.user).subscribe((token)=>{
      this.jwtToken = token;
      localStorage.setItem('tokenValue', this.jwtToken.token)
      // console.log("jwt token is", this.jwtToken)
      this.router.navigate(['/food'])
    }, (error)=>{
      console.log("error while sign in ", error)
    }
  )
  
  }

}
