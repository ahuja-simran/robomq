import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-show-emp',
  templateUrl: './show-emp.component.html',
  styleUrls: ['./show-emp.component.css']
})
export class ShowEmpComponent implements OnInit {
  @Input() emp = [];

  constructor() {
    console.log(this.emp);}

  ngOnInit() {
  }

}
