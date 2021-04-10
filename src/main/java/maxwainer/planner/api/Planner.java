package maxwainer.planner.api;

import maxwainer.planner.api.controller.*;

public interface Planner {

  TaskController getTaskController();

  DataController getDataController();

}
