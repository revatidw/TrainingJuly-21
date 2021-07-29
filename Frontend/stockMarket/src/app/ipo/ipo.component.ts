import { IpoService } from './../ipo.service';
import { Component, OnInit } from '@angular/core';
import { Ipo } from '../ipo';

@Component({
  selector: 'app-ipo',
  templateUrl: './ipo.component.html',
  styleUrls: ['./ipo.component.css']
})
export class IpoComponent implements OnInit {

  message: any;
  ipo_in: Ipo= new Ipo(0,"","",0,0,"","");
  ipos: any;
  variable1: boolean= false;
  id: number=0;
  ipo_temp:any;
  constructor(private service: IpoService) { }

  ngOnInit(): void {
  }

  public clearAll()
  {
    this.ipos=[];
    this.variable1=false;
  }

  public registerNow()
  {
    let resp=this.service.registerIpo(this.ipo_in);
    resp.subscribe((data)=>this.message=data);
  }

  public searchAll()
  {
    let resp= this.service.getIpos();
    resp.subscribe((data)=>this.ipos=data);
  }

  public delete(id: number)
  {
    let resp= this.service.deleteIpo(id);
    resp.subscribe((data)=>this.message=data);
  }

  public find()
  {
    this.variable1=true;
    let resp=this.service.findById(this.id);
    resp.subscribe((data)=>this.ipo_temp=data);
  }



}
