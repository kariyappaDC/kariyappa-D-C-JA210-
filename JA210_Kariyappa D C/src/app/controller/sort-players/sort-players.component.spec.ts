import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SortPlayersComponent } from './sort-players.component';

describe('SortPlayersComponent', () => {
  let component: SortPlayersComponent;
  let fixture: ComponentFixture<SortPlayersComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ SortPlayersComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(SortPlayersComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
