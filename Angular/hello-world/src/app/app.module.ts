import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BearComponent } from './bear/bear.component';

@NgModule({
  // What components are present in the module?
  declarations: [
    AppComponent,
    BearComponent
  ],
  // Other modules which this module depends on
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  // Services which will be shared by all components
  providers: [],
  // Which components should be initialized at app start?
  bootstrap: [AppComponent, BearComponent]
})
export class AppModule { }
