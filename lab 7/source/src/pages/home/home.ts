import { Component, ViewChild, ElementRef } from '@angular/core';
import { NavController } from 'ionic-angular';

declare var google: any;

@Component({
  selector: 'page-home',
  templateUrl: 'home.html'
})
export class HomePage {

@ViewChild('map') mapElement: ElementRef;
map: any;

  constructor(public navCtrl: NavController) {}
  
  ionViewDidLoad(){
  this.loadMap();
  }
  
  loadMap() {
let latLng = new google.maps.LatLng(40.689247,-74.044502);

let mapOptions = {
  center: latLng,
  zoom: 15,
  mapTypeId: google.maps.MapTypeId.ROADMAP
}

this.map = new google.maps.Map(this.mapElement.nativeElement, mapOptions);    

var locations = [
  ['Bondi Beach', 40.689247,-74.044502, 4],
  ['Coogee Beach', 40.689247,-74.044502, 5],
  ['Cronulla Beach', 40.7128,74.0060, 3],
  ['Manly Beach', 40.6892,74.0445, 2],
  ['Hussain Sagar', 40.6892,74.0445, 1]
];

var infowindow = new google.maps.InfoWindow();

var marker, i;

for (i = 0; i < locations.length; i++) {  
  marker = new google.maps.Marker({
    position: new google.maps.LatLng(locations[i][1], locations[i][2]),
    map: this.map
  });

  google.maps.event.addListener(marker, 'click', (function(marker, i) {
    return function() {
      infowindow.setContent(locations[i][0]);
      infowindow.open(this.map, marker);
    }
  })(marker, i));
}
}


}