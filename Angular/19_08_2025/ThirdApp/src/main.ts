import { bootstrapApplication } from '@angular/platform-browser';
import { appConfig } from './app/app.config';
import { App } from './app/app';
import { Ex2 } from './app/ex2/ex2';
import { Home } from './app/home/home';

bootstrapApplication(Ex2, appConfig)
  .catch((err) => console.error(err));

bootstrapApplication(Home, appConfig)
  .catch((err) => console.error(err));

  