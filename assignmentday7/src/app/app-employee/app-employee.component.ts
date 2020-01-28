import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-employee',
  templateUrl: './app-employee.component.html',
  styleUrls: ['./app-employee.component.css']
})
export class AppEmployeeComponent implements OnInit {
  employee: object[];
  constructor() { }

  ngOnInit() {
    this.employee = [{ID: 1, NAME: 'Shubham', SALARY: 20000, DEPARTMENT: 'BACKEND' },
    {ID: 2, NAME: 'Simran', SALARY: 22000, DEPARTMENT: 'UI' },
    {ID: 3, NAME: 'Harshal', SALARY: 22000, DEPARTMENT: 'DEVOPS' },
    {ID: 4, NAME: 'Harish', SALARY: 25000, DEPARTMENT: 'MARKETING' },
    {ID: 5, NAME: 'Kirti', SALARY: 10000, DEPARTMENT: 'HR' },
    {ID: 6, NAME: 'Shubh', SALARY: 22000, DEPARTMENT: 'DESIGN' }];
 }
  }


