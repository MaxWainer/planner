package maxwainer.planner

import maxwainer.planner.api.SimpleApplication
import maxwainer.planner.api.controller.DataController
import maxwainer.planner.api.controller.TaskController
import maxwainer.planner.module.data.DataControllerImpl
import maxwainer.planner.module.style.StylesController
import maxwainer.planner.module.task.TaskControllerImpl
import maxwainer.planner.module.view.MainView
import tornadofx.*

fun main(args: Array<String>) {
    launch<PlannerApplication>(args)
}

class PlannerApplication : App(MainView::class, StylesController::class), SimpleApplication {
    override lateinit var dataController: DataController
    override lateinit var taskController: TaskController

    init {
        INSTANCE = this

        dataController = DataControllerImpl()
        taskController = TaskControllerImpl()
    }

    companion object {
        lateinit var INSTANCE: PlannerApplication
    }

}