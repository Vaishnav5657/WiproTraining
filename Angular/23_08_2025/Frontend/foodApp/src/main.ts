import { bootstrapApplication } from '@angular/platform-browser';
import { appConfig } from './component/app/app.config';
import { App } from './component/app/app';

bootstrapApplication(App, appConfig)
  .catch((err) => console.error(err));
