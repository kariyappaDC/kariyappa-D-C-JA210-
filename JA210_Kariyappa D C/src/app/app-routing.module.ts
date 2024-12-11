import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AppComponent } from './app.component';
import { DisplayPlayersComponent } from './controller/display-players/display-players.component';
import { AddPlayersComponent } from './controller/add-players/add-players.component';
import { UpdatePlayersComponent } from './controller/update-players/update-players.component';


const routes: Routes = [

  { path: 'home', component: AppComponent },
  { path: 'display-players', component: DisplayPlayersComponent },
  { path: 'add-player', component: AddPlayersComponent },
  { path: 'update-player', component: UpdatePlayersComponent }

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
