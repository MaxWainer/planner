package maxwainer.planner.api;

import maxwainer.planner.api.controller.DataController;
import maxwainer.planner.api.controller.TaskController;

public interface Planner {

  TaskController getTaskController();

  DataController getDataController();

}
