import { Component, OnInit } from '@angular/core';
import { TodosService } from 'src/app/service/todos.service';
import { Todo } from 'src/app/interface/todo.interface';

@Component({
    selector: 'app-completati',
    templateUrl: './completati.component.html',
    styleUrls: ['./completati.component.scss'],
})
export class CompletatiComponent implements OnInit {
    constructor(private td: TodosService) {}

    toDoListNew: Todo[] = [];
    nuovoToDo!: string;
    controllo: boolean = true;

    async prova() {
        console.log(this.controllo);
        this.toDoListNew = await this.td.getFiltered(true);
        if (this.toDoListNew != undefined) {
            this.controllo = true;
        }
    }

    ngOnInit(): void {
        this.prova();
    }

    ngOnChange(): void {}

    async aggiungi() {
        const todoMom: Todo = {
            id: 1,
            title: this.nuovoToDo,
            completed: true,
        };
        console.log(this.nuovoToDo);
        this.td.add(todoMom);
        this.prova();
    }

    async elimina(id: number) {
        const momToDo: Todo = { id: id, title: 'andiamo', completed: true };
        this.td.remove(momToDo);
        this.prova();
        console.log(this.toDoListNew);
    }


}
