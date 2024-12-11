import { Component } from '@angular/core';
import { Player } from 'src/app/model/Player';
import { PlayerService } from 'src/app/service/player.service';


@Component({
  selector: 'app-display-players',
  templateUrl: './display-players.component.html',
  styleUrls: ['./display-players.component.css']
})
export class DisplayPlayersComponent {


  playerList: Player[] = [];


  constructor(private  service:PlayerService){

  }

  getAllPlayers(){
    this.service.getAllPlayers().subscribe(
      (player) => { 
        this.playerList = player;
        console.log(this.playerList);
      },
      (err) => { 
        console.log(err); 
      }
    );
  }








}
