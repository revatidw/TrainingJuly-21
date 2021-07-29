import { CompanyService } from './../company.service';
import { Component, OnInit } from '@angular/core';
import { Company } from '../company';
import { temp } from '../temp';

@Component({
  selector: 'app-company',
  templateUrl: './company.component.html',
  styleUrls: ['./company.component.css']
})
export class CompanyComponent implements OnInit {

  message: any;
  companies: any;
  comp : Company= new Company(0,"",0,"","","","",0);
  name!:string;
  name1!:string;
  name2!:string;
  name3!:string;
  

  constructor(private service:CompanyService) { }

  ngOnInit(): void {
  }

  public clearAll()
  {
    this.companies=[];
  }

  public registerNow()
  {
    let resp=this.service.doRegistration(this.comp);
    resp.subscribe((data)=>this.message=data);
  }

  public searchAll()
  {
    let resp= this.service.getCompanies();
    resp.subscribe((data)=>this.companies=data);
  }

  public delete(id: number)
  {
    let resp= this.service.deleteCompany(id);
    resp.subscribe((data)=>this.message=data);
  }

  public findCompanyByName()
  {
    let resp=this.service.findByName(this.name);
    resp.subscribe((data)=>this.companies=data);
    this.name="";
  }

  public findbyPattern()
  {
    let resp=this.service.findByPattern(this.name1);
    resp.subscribe((data)=>this.companies=data);
    this.name1="";
  }

  public findbyStockExchange()
  {
    let resp=this.service.findByStock(this.name2);
    resp.subscribe((data)=>this.companies=data);
    this.name2="";
  }

  public findbySector()
  {
    let resp=this.service.findBySector(this.name3);
    resp.subscribe((data)=>this.companies=data);
    this.name3="";
  }

}
