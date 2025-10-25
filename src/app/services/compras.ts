import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class Compras {
   private apiUrl = 'http://localhost:8080/compras'; 

  constructor(private http: HttpClient) { }

  getCompras(): Observable<any[]> {
    return this.http.get<any[]>(this.apiUrl);
  }

  buscarCompras(filtro: string): Observable<any[]> {
    return this.http.get<any[]>(`${this.apiUrl}/buscar?filtro=${filtro}`);
  }
}
