import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';

const httpOptions = {
  headers: new HttpHeaders({'Content-Type': 'application/json'})
}
@Injectable({
  providedIn: 'root'
})
export class BikeService {

  constructor(private httpClient: HttpClient) { 
   
  }

  public getBikes(){
    let token = localStorage.getItem('access_token');
    return this.httpClient.get('/server/api/v1/bikes',
    {
      headers: new HttpHeaders().set('Authorization','Bearer' + token)
    });
  }

  public getBike(id: number){
    let token = localStorage.getItem('access_token');
    return this.httpClient.get('/server/api/v1/bikes/'+id,{
      headers: new HttpHeaders().set('Authorization','Bearer' + token)
    });
  }

  public createBikeRegistration(bike){
    let token = localStorage.getItem('access_token');
    let body = JSON.stringify(bike);
    return this.httpClient.post('/server/api/v1/bikes',body, httpOptions);
  }
}
