import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DisplayPlayersComponent } from './display-players.component';

describe('DisplayPlayersComponent', () => {
  let component: DisplayPlayersComponent;
  let fixture: ComponentFixture<DisplayPlayersComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DisplayPlayersComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(DisplayPlayersComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
