package maxwainer.planner.api

import maxwainer.planner.api.controller.DataController
import maxwainer.planner.api.controller.TaskController

interface SimpleApplication {

    val dataController: DataController

    val taskController: TaskController

}