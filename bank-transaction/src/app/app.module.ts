import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { TransferModule } from './transfer/transfer.module';

@NgModule({
  declarations: [
    AppComponent
  ],
  imports: [
    BrowserModule,
    TransferModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
