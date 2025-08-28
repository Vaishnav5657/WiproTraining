import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Registrationcomp } from './registrationcomp';

describe('Registrationcomp', () => {
  let component: Registrationcomp;
  let fixture: ComponentFixture<Registrationcomp>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Registrationcomp]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Registrationcomp);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
