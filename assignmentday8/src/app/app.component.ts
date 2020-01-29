import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  storedEmp = [];
  onEmpAdded(emp) {
    this.storedEmp.push(emp);

 // title = 'assignmentday8';
}

}
