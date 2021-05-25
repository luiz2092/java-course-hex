import { TestBed } from '@angular/core/testing';

import { BugComponentService } from './bug-component.service';

describe('BugComponentService', () => {
  let service: BugComponentService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(BugComponentService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
