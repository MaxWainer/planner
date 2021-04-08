package maxwainer.planner

import maxwainer.planner.style.StylesController
import tornadofx.*

fun main(args: Array<String>) {
    launch<PlannerApplication>(args)
}

class PlannerApplication : App(MainView::class, StylesController::class)