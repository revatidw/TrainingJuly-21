import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Sector } from './sector';

@Injectable({
  providedIn: 'root'
})
export class SectorService {

  constructor(private http: HttpClient) { }

  public registerSector(sec: Sector)
  {
    return this.http.post("http://localhost:8002/sector/addNewSector",sec, {responseType:'text' as 'json'});
  }
  public getSectors()
  {
    return this.http.get("http://localhost:8002/sector/getAll");
  }

  public findByName(name: string)
  {
    return this.http.get("http://localhost:8002/sector/details/"+name);
  }

  public findAllCompanies(name: string)
  {
    return this.http.get("http://localhost:8002/sector/allCompany/"+name);
  }
}
