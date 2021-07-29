import { StockExchange } from './stock-exchange';
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class StockExchangeService {

  constructor(private http: HttpClient) { }

  public registerStockExchange(stock: StockExchange)
  {
    return this.http.post("http://localhost:8000/stockexchange/add",stock, {responseType:'text' as 'json'});
  }
  public getStockExchanges()
  {
    return this.http.get("http://localhost:8000/stockexchange/getAll");
  }

  public findByName(id: string)
  {
    return this.http.get("http://localhost:8000/stockexchange/find/"+id);
  }

  public findAllCompanies(name: string)
  {
    return this.http.get("http://localhost:8000/stockexchange/company/"+name);
  }

  public deleteStockExchange(id: number)
  {
    return this.http.delete("http://localhost:8000/stockexchange/delete/"+id);
  }
}
