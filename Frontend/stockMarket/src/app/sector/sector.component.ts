import { SectorService } from './../sector.service';
import { Component, OnInit } from '@angular/core';
import { Sector } from '../sector';
import { Company } from '../company';

@Component({
  selector: 'app-sector',
  templateUrl: './sector.component.html',
  styleUrls: ['./sector.component.css']
})
export class SectorComponent implements OnInit {

  sectors: any;
  message: any;
  companies: any;
  name!:string;
  name1!:string;
  variable: boolean=false;
  sec: Sector= new Sector(0,"","");
  constructor(private service: SectorService) { }

  ngOnInit(): void {
  }

  public clearAll()
  {
    this.sectors=[];
    this.variable=false;
  }

  public registerNow()
  {
    let resp=this.service.registerSector(this.sec);
    resp.subscribe((data)=>this.message=data);
  }

  public searchAll()
  {
    let resp= this.service.getSectors();
    resp.subscribe((data)=>this.sectors=data);
  }

  public findSectoryByName()
  {
    let resp=this.service.findByName(this.name);
    resp.subscribe((data)=>this.sectors=data);
    this.name="";
  }

  public findCompaniesInSector()
  {
    this.variable=true;
    let resp=this.service.findAllCompanies(this.name1);
    resp.subscribe((data)=>this.companies=data);
    
    this.name1="";
  }

}
