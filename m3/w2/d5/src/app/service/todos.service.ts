import { Injectable } from '@angular/core';
import { Todo } from '../interface/todo.interface';

@Injectable({
    providedIn: 'root',
})
export class TodosService {
    todoList: Todo[] = [];

    constructor() {}

    getToDoList() {
        return this.todoList;
    }

    add(todo: Omit<Todo, 'id'>): Promise<Todo> {
        return new Promise((res, rej) => {
            setTimeout(() => {
                const newTodo: Todo = { ...todo, id: this.todoList.length + 1 };
                this.todoList.push(newTodo);
                res(newTodo);
            }, 2000);
        });
    }

    remove(tod: Omit<Todo, 'completed'>): Promise<number> {
        return new Promise((res, rej) => {
            setTimeout(() => {
                this.todoList = this.todoList.filter(
                    (todo) => todo.id !== tod.id
                );
                res(tod.id);
            }, 2000);
        });
    }

    update(id: number): Promise<Todo> {
        return new Promise((res, rej) => {
            setTimeout(() => {
                this.todoList[id - 1].completed = true;
            }, 2000);
        });
    }

    getFiltered(a: boolean): Promise<Todo[]> {
        return new Promise((res, rej) => {
            setTimeout(() => {
                if (res) {
                    res(this.todoList.filter((p) => p.completed == a));
                } else {
                    rej('');
                }
            }, 2000);
        });
    }
}
