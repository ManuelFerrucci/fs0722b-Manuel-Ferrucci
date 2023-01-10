import { Component, OnInit } from '@angular/core';
import { PostService } from 'src/app/service/post.service';
import { Post } from 'src/app/interface/post.interface';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.scss']
})
export class HomeComponent implements OnInit {
  //ps: PostService;
  constructor(private ps: PostService) {
    this.ps.getPosts().then((x) => {
      console.log(x);
    });
   }
  ngOnInit(): void {

  }
}
