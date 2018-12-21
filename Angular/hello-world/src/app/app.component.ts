import { Component } from '@angular/core';

/*
  Component directive - this decorator defines the AppComponent
  class to be component (reusable portion of the view)
*/
@Component({
  // tag name for the custom HTML element representing this component 
  selector: 'app-root',
  // where is the template?
  templateUrl: './app.component.html',
  // styles sheets used in this compnent
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'hello-world';
}
