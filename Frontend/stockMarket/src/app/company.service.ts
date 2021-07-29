import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Company } from './company';
import { temp } from './temp';

@Injectable({
  providedIn: 'root'
})
export class CompanyService {

  constructor(private http:HttpClient) { }


  public doRegistration(comp : Company)
   {
     
     return this.http.post("http://localhost:8001/company/add", comp, {responseType:'text' as 'json'});

   }
  public getCompanies()
  {
    return this.http.get("http://localhost:8001/company/getAll");
  }

  public deleteCompany(id: number)
  {
    return this.http.delete("http://localhost:8001/company/delete/"+id);
  }

  public findByName(name: string)
  {
    return this.http.get("http://localhost:8001/company/details/"+name);
  }

  public findByPattern(pattern: string)
  {
    return this.http.get("http://localhost:8001/company/getMatching/"+pattern);
  }

  public findByStock(stock:string)
  {
    return this.http.get("http://localhost:8001/company/stockexchange/"+stock);
  }

  public findBySector(sector: string)
  {
    return this.http.get("http://localhost:8001/company/sector/"+sector);
  }
}
