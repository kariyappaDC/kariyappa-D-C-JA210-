import { Component } from '@angular/core';
import { Player } from 'src/app/model/Player';
import { PlayerService } from 'src/app/service/player.service';


@Component({
  selector: 'app-update-players',
  templateUrl: './update-players.component.html',
  styleUrls: ['./update-players.component.css']
})
export class UpdatePlayersComponent {


  constructor(private  service:PlayerService){

  }

  updatePlayerDetails(player: Player) {
    this.service.updatePlayerDetails(player).subscribe(
      (response) => {
        console.log(response);
        alert("Player updated successfully..");
      },
      (err) => {
        if (err.status === 404) {
          alert(err.error); 
        }
      }
    );
  }

}
