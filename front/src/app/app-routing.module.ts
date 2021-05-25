import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { BugComponentComponent } from './bug-component/bug-component.component';

const routes: Routes = [
  {path: 'create', component : BugComponentComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
