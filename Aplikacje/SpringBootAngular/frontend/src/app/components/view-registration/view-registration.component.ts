import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { BikeService } from 'src/app/services/bike.service';

@Component({
  selector: 'app-view-registration',
  templateUrl:'view-registration.component.html',
  styleUrls: ['./view-registration.component.css']
})
export class ViewRegistrationComponent implements OnInit {
  public bikeReg;
  constructor(private bikeService: BikeService, private route: ActivatedRoute) { }

  ngOnInit() {
    this.getBikeReg(this.route.snapshot.params.id);
  }

  public getBikeReg(id:number):void{
    this.bikeService.getBike(id).subscribe(
      data => this.bikeReg = data,
      err => console.error(err),
      () => console.log('bikes loaded')
      )
  }

}
