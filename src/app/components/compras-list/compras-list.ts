import { Component, OnInit } from '@angular/core';
import { Compras } from '../../services/compras';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-compras-list',
  imports: [CommonModule, FormsModule],
  templateUrl: './compras-list.html',
  styleUrls: ['./compras-list.css'],
})
export class ComprasList implements OnInit {

  compras: any[] = [];
  filtro: string = '';

  constructor(private comprasService: Compras) {}

  ngOnInit(): void {
    this.cargarCompras();
  }

  cargarCompras(): void {
    this.comprasService.getCompras().subscribe(data => {
      this.compras = data;
    });
  }

  buscar(): void {
    if (this.filtro.trim() === '') {
      this.cargarCompras();
    } else {
      this.comprasService.buscarCompras(this.filtro).subscribe(data => {
        this.compras = data;
      });
    }}
  }