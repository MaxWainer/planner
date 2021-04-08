package maxwainer.planner

import tornadofx.View
import tornadofx.hbox
import tornadofx.label

class MainView : View() {
    override val root = hbox {
        label("Hello, world!")
    }
}