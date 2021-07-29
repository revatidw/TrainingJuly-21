import { SignupService } from './../signup.service';
import { Component, OnInit } from '@angular/core';
import { Userlogin } from '../userlogin';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  constructor(private service: SignupService) { }

  user: Userlogin= new Userlogin("","");
  message:any;
  errorMessage = 'Invalid Credentials';
  successMessage: string|undefined;
  invalidLogin = false;
  loginSuccess = false;
  ngOnInit(): void {
  }

  public login()
  {
    let resp= this.service.login(this.user);
    resp.subscribe((data)=>{
      this.invalidLogin = false;
      this.loginSuccess = true;
      this.successMessage = 'Login Successful.';
    }, () => {
      this.invalidLogin = true;
      this.loginSuccess = false;
    });  
   

  }

}
