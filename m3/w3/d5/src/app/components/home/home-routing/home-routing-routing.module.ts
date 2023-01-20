import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from '../home.component';
import { NavbarComponent } from '../../navbar/navbar.component';
import { MoviesComponent } from '../../movies/movies.component';
import { UserComponent } from '../../user/user.component';
import { AuthGuard } from 'src/app/auth/auth.guard';

const routes: Routes = [
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class HomeRoutingRoutingModule { }
