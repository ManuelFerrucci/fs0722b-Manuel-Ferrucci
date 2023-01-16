import { Component, OnInit, ɵisObservable } from '@angular/core';
import { Interfaccia } from 'src/app/interface/interfaccia.interface';
import { PhotoPostService } from 'src/app/service/photo-post.service';

@Component({
    selector: 'app-post',
    templateUrl: './post.component.html',
    styleUrls: ['./post.component.scss'],
})
export class PostComponent implements OnInit {
    foto: Interfaccia[] = [];
    finito: boolean = true;

    constructor(private ps: PhotoPostService) {}

    ngOnInit(): void {
        this.ps
            .get()
            .subscribe((data) => ((this.foto = data), console.log(this.foto)));
    }
}
