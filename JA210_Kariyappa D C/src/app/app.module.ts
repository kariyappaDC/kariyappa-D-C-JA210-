import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';


import {HttpClientModule} from '@angular/common/http';

import { FormsModule } from '@angular/forms';
import { PlayerService } from './service/player.service';
import { AddPlayersComponent } from './controller/add-players/add-players.component';
import { DisplayPlayersComponent } from './controller/display-players/display-players.component';
import { UpdatePlayersComponent } from './controller/update-players/update-players.component';


@NgModule({
  declarations: [
    AppComponent,
    AddPlayersComponent,
    DisplayPlayersComponent,
    UpdatePlayersComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [PlayerService],
  bootstrap: [AppComponent]
})
export class AppModule { }
