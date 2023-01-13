import { Component, OnInit } from '@angular/core';
import { Todo } from 'src/app/interface/todo.interface';
import { TodosService } from 'src/app/service/todos.service';

@Component({
    selector: 'app-home',
    templateUrl: './home.component.html',
    styleUrls: ['./home.component.scss'],
})
export class HomeComponent implements OnInit {
    constructor(private p: TodosService) {}

    ngOnInit(): void {}
}
