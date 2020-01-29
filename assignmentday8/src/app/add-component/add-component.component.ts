import { Component, OnInit, Output, EventEmitter } from '@angular/core';
import { FormBuilder } from '@angular/forms';

@Component({
  selector: 'app-add-component',
  templateUrl: './add-component.component.html',
  styleUrls: ['./add-component.component.css']
})

export class AddComponentComponent implements OnInit {

  id = '';
  name = '';
  sal = '';
  dept = '';
  @Output() empCreated = new EventEmitter();

  onAddEmp()
  {
    const emp = {
              id: this.id,
              name: this.name,
              sal: this.sal,
              dept: this.dept

    };
    this.empCreated.emit(emp);
  }

  constructor() { }

  ngOnInit() {
  }

}
