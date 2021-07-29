import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Ipo } from './ipo';

@Injectable({
  providedIn: 'root'
})
export class IpoService {

  constructor(private http:HttpClient) { }

  public registerIpo(ipo: Ipo)
  {
    return this.http.post("http://localhost:8001/ipo/add", ipo, {responseType:'text' as 'json'});
  }

  public getIpos()
  {
    return this.http.get("http://localhost:8001/ipo/findAll");
  }

  public deleteIpo(id: number)
  {
    return this.http.delete("http://localhost:8001/ipo/delete/"+id);
  }

  public findById(id: number)
  {
    return this.http.get("http://localhost:8001/ipo/findById/"+id);
  }

}
