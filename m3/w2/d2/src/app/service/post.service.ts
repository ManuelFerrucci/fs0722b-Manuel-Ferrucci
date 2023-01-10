import { Injectable } from '@angular/core';
import { Post } from '../interface/post.interface';

@Injectable({
  providedIn: 'root'
})



export class PostService {

  constructor() {
   }

  getPosts(){
    let p = fetch("../../assets/db.json").then((response) => response.json()).then((datavalue:Post[]) => {
    console.log(datavalue)
    return datavalue;
  })

  return p;
  }
}


