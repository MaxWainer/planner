package maxwainer.planner.module.view

import tornadofx.View
import tornadofx.button
import tornadofx.hbox
import tornadofx.label

class MainView : View() {
    override val root = hbox {
        label("Hello, world!")
        button("An example button") {

        }
    }
}