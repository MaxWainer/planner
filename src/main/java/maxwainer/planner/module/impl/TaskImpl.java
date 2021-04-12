package maxwainer.planner.module.impl;

import java.util.UUID;
import maxwainer.planner.api.task.Description;
import maxwainer.planner.api.task.Task;
import maxwainer.planner.api.task.Time;
import org.jetbrains.annotations.NotNull;

public class TaskImpl implements Task {

  @Override
  public Time getTime() {
    return null;
  }

  @Override
  public boolean isAnnounceable() {
    return false;
  }

  @Override
  public Description getDescription() {
    return null;
  }

  @Override
  public String getRawDescription() {
    return null;
  }

  @Override
  public UUID getTaskUniqueId() {
    return null;
  }

  @Override
  public boolean compare(@NotNull Task task) {
    return false;
  }

  @Override
  public Task cloneObject() throws CloneNotSupportedException {
    return (Task) clone();
  }
}
