package controllers

import javax.inject.Inject

import play.api.mvc._

import scala.concurrent.{ExecutionContext, Future}

class Application @Inject()(implicit ec: ExecutionContext) extends Controller {

  def index: Action[AnyContent] = Action.async {
    Future(Ok(views.html.index("Your new application is ready.")))
  }

}
