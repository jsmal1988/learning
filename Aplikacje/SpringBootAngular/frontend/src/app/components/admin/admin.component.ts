import { Component, OnInit } from '@angular/core';
import { BikeService } from 'src/app/services/bike.service';

@Component({
  selector: 'app-admin',
  templateUrl: './admin.component.html',
  styleUrls: ['./admin.component.css']
})
export class AdminComponent implements OnInit {
  public bikes;

  constructor(private bikeService: BikeService) { }

  ngOnInit() {
    this.getBikes();
  }

  private getBikes(): void{
    this.bikeService.getBikes().subscribe(
      resp => (this.bikes = resp),
      err => console.log(err),
      () => console.log('bikes loaded')
    )
  }

}
