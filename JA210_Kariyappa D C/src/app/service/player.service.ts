import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Player } from '../model/Player';


@Injectable({
  providedIn: 'root'
})
export class PlayerService {

  baseURL: string = "http://localhost:8181/api/players/";

  constructor(private http: HttpClient) { }


  addPlayer(player: Player): Observable<Player> {
    return this.http.post<Player>(this.baseURL + "add", player);
  }


  getAllPlayers(): Observable<Player[]> {
    return this.http.get<Player[]>(this.baseURL + "get");
  }


  updatePlayerDetails(player: Player): Observable<Player> {
    return this.http.put<Player>(`${this.baseURL}update/${player.pId}`, player);
  }
}
