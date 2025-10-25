import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ComprasList } from './compras-list';

describe('ComprasList', () => {
  let component: ComprasList;
  let fixture: ComponentFixture<ComprasList>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [ComprasList]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ComprasList);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
