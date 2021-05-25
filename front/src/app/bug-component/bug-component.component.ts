import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { BugComponentService } from './services/bug-component.service';

@Component({
  selector: 'app-bug-component',
  templateUrl: './bug-component.component.html',
  styleUrls: ['./bug-component.component.css']
})
export class BugComponentComponent implements OnInit {

  addEmployeeForm = new FormGroup({
    email: new FormControl('', Validators.required),
    owner: new FormControl('', Validators.required),
    priority: new FormControl('', Validators.required),
    status: new FormControl('', Validators.required)

  });

  constructor(private bugService: BugComponentService) { }

  ngOnInit(): void {
  }

  handleForm(): void {
    console.log(this.addEmployeeForm.value);

    this.bugService.createBug(this.addEmployeeForm.value).subscribe((res: any) => {
      console.log(res);
    });
    
  }

}
