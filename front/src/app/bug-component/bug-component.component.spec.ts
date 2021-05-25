import { ComponentFixture, TestBed } from '@angular/core/testing';

import { BugComponentComponent } from './bug-component.component';

describe('BugComponentComponent', () => {
  let component: BugComponentComponent;
  let fixture: ComponentFixture<BugComponentComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ BugComponentComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(BugComponentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
