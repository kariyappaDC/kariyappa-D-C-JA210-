import { Component } from '@angular/core';
import { Player } from 'src/app/model/Player';
import { PlayerService } from 'src/app/service/player.service';

@Component({
  selector: 'app-sort-players',
  templateUrl: './sort-players.component.html',
  styleUrls: ['./sort-players.component.css']
})
export class SortPlayersComponent {


  playerList: Player[] = [];


  constructor(private  service:PlayerService){

  }

  sortPlayers(){
    this.service.sortPlayers().subscribe(
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
