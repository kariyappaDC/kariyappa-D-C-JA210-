import { Component } from '@angular/core';
import { Player } from 'src/app/model/Player';
import { PlayerService } from 'src/app/service/player.service';


@Component({
  selector: 'app-add-players',
  templateUrl: './add-players.component.html',
  styleUrls: ['./add-players.component.css']
})
export class AddPlayersComponent {



  constructor(private  service:PlayerService){

  }

  addPlayer(player:Player){

  this.service.addPlayer(player).subscribe(

    (response)=>{  console.log(response)

      alert(" player added successfully")
    } ,

    (err)=>{ console.log(err)}



);

}


}
