import { LoginComponent } from './login/login.component';
import { SignupComponent } from './signup/signup.component';
import { IpoComponent } from './ipo/ipo.component';
import { StockExchangeComponent } from './stock-exchange/stock-exchange.component';
import { CompanyComponent } from './company/company.component';
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { SectorComponent } from './sector/sector.component';

const routes: Routes = [{path:"company", component: CompanyComponent},
{path:"sector", component: SectorComponent},{path:"stock-exchange", component: StockExchangeComponent},
{path:"ipo", component: IpoComponent},{path:"signup", component: SignupComponent},
{path:"login", component: LoginComponent}];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
