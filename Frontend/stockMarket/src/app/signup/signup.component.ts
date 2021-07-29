import { SignupService } from './../signup.service';
import { Component, OnInit } from '@angular/core';
import { User } from '../user';
 
@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css']
})
export class SignupComponent implements OnInit {

  message: any;
  user: User= new User("","","","");
  constructor(private service: SignupService) { }

  ngOnInit(): void {
  }


  public register()
  {
    let resp= this.service.register(this.user);
    resp.subscribe((data)=>this.message=data);
    //this.service.signin().subscribe((data)=>this.message=data);
  }


}
