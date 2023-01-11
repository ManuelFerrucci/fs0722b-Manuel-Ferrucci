import { Component, OnInit, Output, EventEmitter, Input } from '@angular/core';
import { User } from 'src/app/interface/user.interface';
import { UserService } from 'src/app/service/user.service';

@Component({
  selector: 'app-post-attivi',
  templateUrl: './post-attivi.component.html',
  styleUrls: ['./post-attivi.component.scss'],
})
export class PostAttiviComponent implements OnInit {
  @Output() onChangeStatus = new EventEmitter();

  constructor(private posts: UserService) {}

  postAttivi: User[] = [];
  postNonAttivi: User[] = [];
  arrayTotale:User[]=this.posts.getPost();

  ngOnInit(): void {
    //console.log(array);
    this.arrayTotale.forEach((element) => {
      if (element.active == true) {
        this.postAttivi.push(element);
      } else {
        this.postNonAttivi.push(element);
      }
    });
    console.log(this.postAttivi);
  }

  changeStatus(idSelezionato: number) {
    console.log(idSelezionato);
    this.arrayTotale.forEach((element, index) => {
      if (element.id == idSelezionato) {
        if (element.active == true) {
          element.active = false;
          this.postNonAttivi.push(element);
        } else {
          element.active = true;
          this.postAttivi.push(element);
          this.postNonAttivi.splice(index);
        }
      }
    });
    console.log(this.postAttivi);
    console.log(this.postNonAttivi);
  }
}
