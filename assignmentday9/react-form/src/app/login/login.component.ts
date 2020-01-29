import { Component, OnInit } from '@angular/core';
import { FormControl, FormBuilder, FormGroup, Validators } from '@angular/forms';
import { IfStmt } from '@angular/compiler';


@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

 loginForm: FormGroup;
 submitted = false;
 invalidLogin = false;


  constructor(private formBuilder: FormBuilder) { }

  onSubmit() {
    this.submitted = true;
    if (this.loginForm.invalid) {
      console.log('Form invalid');
      return;
    }
    if (
      this.loginForm.controls.email.value === 'dhiraj@gmail.com' &&
      this.loginForm.controls.password.value === 'password'
      ) {
        window.alert('Login successful');
        console.log('Successful login');
      } else {
        console.log('Invalid details');
      }
  }
  ngOnInit() {
    this.loginForm = this.formBuilder.group({
    email: ['', Validators.required],
    password : ['', Validators.required]
    });
    }
}
