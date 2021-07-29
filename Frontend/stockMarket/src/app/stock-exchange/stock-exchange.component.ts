import { StockExchangeService } from './../stock-exchange.service';
import { Component, OnInit } from '@angular/core';
import { StockExchange } from '../stock-exchange';


@Component({
  selector: 'app-stock-exchange',
  templateUrl: './stock-exchange.component.html',
  styleUrls: ['./stock-exchange.component.css']
})
export class StockExchangeComponent implements OnInit {

  stockexchanges: any;
  companies: any;
  name!:string;
  name1!:string;
  name2!:string;
  id: number=0;
  message: any;
  stock: StockExchange = new StockExchange(0,"","","","");
  variable: boolean=false;
  constructor(private service: StockExchangeService) { }

  ngOnInit(): void {
  }

  public clearAll()
  {
    this.stockexchanges=[];
    this.variable=false;
  }

  public registerNow()
  {
    let resp=this.service.registerStockExchange(this.stock);
    resp.subscribe((data)=>this.message=data);
  }

  public searchAll()
  {
    let resp= this.service.getStockExchanges();
    resp.subscribe((data)=>this.stockexchanges=data);
  }

  public findStockExchangeByName()
  {
    let resp=this.service.findByName(this.name);
    resp.subscribe((data)=>this.stockexchanges=data);
  }

  public findCompaniesInStockExchange()
  {
    this.variable=true;
    let resp=this.service.findAllCompanies(this.name1);
    resp.subscribe((data)=>this.companies=data);
    //this.name1="";
  }

  public delete(id: number)
  {
    let resp= this.service.deleteStockExchange(id);
    resp.subscribe((data)=>this.message=data);
  }


}
