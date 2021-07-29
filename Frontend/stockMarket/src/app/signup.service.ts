import { Userlogin } from './userlogin';
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { User } from './user';

@Injectable({
  providedIn: 'root'
})
export class SignupService {

  constructor(private http:HttpClient) { }

  public signin()
  {
    return this.http.get("http://localhost:8005/login");
  }
  public register(user: User)
  {
    return this.http.post("http://localhost:8005/api/v1/registration",user, {responseType:'text' as 'json'});
  }

  public login(user: Userlogin)
  {
    return this.http.post("http://localhost:8005/api/v1/hello",user, {responseType:'text' as 'json'});
  }
}
