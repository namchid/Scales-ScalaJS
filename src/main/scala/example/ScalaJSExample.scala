package example

import scala.scalajs.js
import org.scalajs.dom
import rx._

import edu.depauw.scales.graphics._
import edu.depauw.scales.reactive._
import edu.depauw.scales.music._
import edu.depauw.scales.demo._

object window extends js.Object {
  val innerHeight: Int = ???
}

object ScalaJSExample extends js.JSApp {
  def main(): Unit = {
    val playground = dom.document.getElementById("playground")

    val paragraph = dom.document.createElement("p")
    paragraph.innerHTML = "<strong>It works! Window height = " + window.innerHeight + ". Using Dynamic, that's " + js.Dynamic.global.window.innerHeight + ".</strong>"
    playground.appendChild(paragraph)

    /*-----------------------------------------*/
    import Base._
    import Reactive._
    
    /*------------------ACT DEMO------------------*/
    import ActDemo._
    actor2.act()

    /*------------------POWERPOINT DEMO------------------*/
    // import PowerPoint._
    // Reactor(KeyPress, getDisplay)



    /*------------------PRETTY PICTURE DEMO------------------*/
    // import PrettyPicture._
    // Reactor(ClockTickChanges(1, 1), fnBackground)
    // Reactor(ClockTickChanges(1, 20), fnCar)
    // Reactor(MousePosition, fnButterfly)

    /*------------------THE DR.HOWARD DEMO------------------*/
  }

}