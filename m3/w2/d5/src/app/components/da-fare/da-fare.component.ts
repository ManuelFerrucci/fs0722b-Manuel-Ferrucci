import { Component, OnInit } from '@angular/core';
import { TodosService } from 'src/app/service/todos.service';
import { Todo } from 'src/app/interface/todo.interface';

@Component({
    selector: 'app-da-fare',
    templateUrl: './da-fare.component.html',
    styleUrls: ['./da-fare.component.scss'],
})
export class DaFareComponent implements OnInit {
    constructor(private td: TodosService) {}

    toDoListNew: Todo[] = [];
    nuovoToDo!: string;
    controllo: boolean = false;

    async prova() {
        console.log(this.controllo);
        this.toDoListNew = await this.td.getFiltered(false);
        if (this.toDoListNew != undefined) {
            this.controllo = true;
        }
    }

    ngOnInit(): void {
        this.prova();
    }

    ngOnChange(): void {}

    async aggiungi() {
        if (this.nuovoToDo.trim() != '') {
            const todoMom: Todo = {
                id: 1,
                title: this.nuovoToDo,
                completed: false,
            };
            console.log(this.nuovoToDo);
            this.td.add(todoMom);
            this.prova();
            this.nuovoToDo = '';
        } else {
            this.nuovoToDo = '';
        }
    }

    async aggiorna(id: number) {
        this.td.update(id);
        this.prova();
    }

    async elimina(id: number) {
        const momToDo: Todo = { id: id, title: 'andiamo', completed: true };
        this.td.remove(momToDo);
        this.prova();
        console.log(this.toDoListNew);
    }
}
