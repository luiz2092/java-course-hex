import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { map } from 'rxjs/operators'



@Injectable({
  providedIn: 'root'
})
export class BugComponentService {

  constructor(private http: HttpClient) {
  }

  createBug(formData: any): any {
    console.log('Service');
    console.log(formData);

    return this.http.post('http://localhost:8080/bug', formData)
      .pipe(map((res: any) => {
        console.log(res);
        return res;
      }));
  }
}
