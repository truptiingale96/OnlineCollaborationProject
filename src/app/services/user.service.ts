// import { Injectable } from '@angular/core';

// @Injectable({
//   providedIn: 'root'
// })
// export class UserService {

//   constructor() { }
// }
import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  private baseUrl='http://localhost:8080/api/';

  constructor(private http:HttpClient) { }

  getUserList():Observable<any>{
    return this.http.get(`${this.baseUrl}`+'user-list');
  }

  createUser(user: object):Observable<Object>{
    return this.http.post(`${this.baseUrl}`+'save-user',user);
  }

  deleteUser(userId: number):Observable<any>{
    return this.http.delete(`${this.baseUrl}/delete-user/${userId}`,{responseType:'text'});
  }

  getUser(userId: number):Observable<Object>{
    return this.http.get(`${this.baseUrl}/user/${userId}`);
  }

  updateUser(userId: number, value: any):Observable<Object>{
    return this.http.post(`${this.baseUrl}/update-user/${userId}`,value);
  }

  activateUser(userId: number):Observable<any>{
    return this.http.post(`${this.baseUrl}/active-user/${userId}`,{responseType:'text'});
  }
}


