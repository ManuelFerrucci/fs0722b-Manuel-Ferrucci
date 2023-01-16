import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Interfaccia } from '../interface/interfaccia.interface';
import { Subject, catchError, throwError } from 'rxjs';

@Injectable({ providedIn: 'root' })
export class ServiceNameService {
    constructor(private httpClient: HttpClient) {}
}

@Injectable({
    providedIn: 'root',
})
export class PhotoPostService {
    baseUrl = 'https://jsonplaceholder.typicode.com/photos';
    favoritesSub = new Subject<number>();
    favoritesCounter = 0;
    constructor(private http: HttpClient) {}

    get() {
        return this.http.get<Interfaccia[]>(this.baseUrl).pipe(
            catchError((err) => {
                return throwError(this.getErrorMess(err.status));
            })
        );
    }

    delete(id: number) {
        return this.http.get<Interfaccia[]>(`${this.baseUrl}/${id}`).pipe(
            catchError((err) => {
                return throwError(this.getErrorMess(err.status));
            })
        );
    }

    addFavorite() {
        this.favoritesCounter++;
        this.favoritesSub.next(this.favoritesCounter);
    }

    private getErrorMess(status: number) {
        let mess = '';
        if (status == 404) {
            mess = 'Not found';
        } else if (status == 500) {
            mess = 'Server not responding';
        } else {
            mess = 'Tutto a posto';
        }
        return mess;
    }
}
