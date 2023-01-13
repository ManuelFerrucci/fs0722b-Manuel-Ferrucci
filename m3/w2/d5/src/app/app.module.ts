import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';
import { Route, RouterModule } from '@angular/router';

import { AppComponent } from './app.component';
import { DaFareComponent } from './components/da-fare/da-fare.component';
import { CompletatiComponent } from './components/completati/completati.component';
import { NavbarComponent } from './components/navbar/navbar.component';
import { HomeComponent } from './components/home/home.component';

const routes: Route[] = [
  {
    path: 'home',
    component: HomeComponent,
  },
  {
    path: 'todos',
    component: DaFareComponent,
  },
  {
    path: 'completed',
    component: CompletatiComponent,
  },
  {
    path: '**',
    component: HomeComponent,
  },
];

@NgModule({
  declarations: [
    AppComponent,
    DaFareComponent,
    CompletatiComponent,
    NavbarComponent,
    HomeComponent,
  ],
  imports: [BrowserModule, RouterModule.forRoot(routes), FormsModule],
  providers: [],
  bootstrap: [AppComponent],
})
export class AppModule {}
