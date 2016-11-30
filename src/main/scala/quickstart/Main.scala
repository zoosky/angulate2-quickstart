package quickstart

import angulate2.std._
import angulate2.platformBrowser.BrowserModule

@NgModule(
  imports = @@[BrowserModule],
  declarations = @@[AppComponent],
  bootstrap = @@[AppComponent]
)
class AppModule {

}

@Component(
  selector = "my-app",
  template = "<h1>Hello Angular!<h1>"
)
class AppComponent {

}
