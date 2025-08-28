import { CommonModule } from '@angular/common';
import { ChangeDetectorRef, Component } from '@angular/core';
import { FormBuilder, FormGroup, ReactiveFormsModule, Validators } from '@angular/forms';
import { MatButtonModule } from '@angular/material/button';
import { MatNativeDateModule } from '@angular/material/core';
import { MatDatepickerModule } from '@angular/material/datepicker';
import { MatFormFieldModule } from '@angular/material/form-field';
import { MatInputModule } from '@angular/material/input';
import { MatSelectModule } from '@angular/material/select';

@Component({
  selector: 'app-registrationcomp',
  imports: [ReactiveFormsModule,
    CommonModule,
    MatFormFieldModule,
    MatInputModule,
    MatButtonModule,
    MatDatepickerModule,
    MatNativeDateModule,
    MatSelectModule],
  templateUrl: './registrationcomp.html',
  styleUrl: './registrationcomp.css'
})
export class Registrationcomp {

  subjects: string[] = ['Computer Science', 'Mathematics', 'Physics', 'Commerce', 'Arts'];

  fg:FormGroup
  constructor(private fb: FormBuilder, private cdr:ChangeDetectorRef){
    this.fg= this.fb.group({
    email : ['', [Validators.required, Validators.email]],
    name : ['', [Validators.required]],
    doB : [new Date(), [Validators.required]],
    subject: ['', [Validators.required]]

    })

  }

  ngOnInit(){
    this.cdr.detectChanges()
  }

onSubmit(){
  console.log("submitted")
}

}

