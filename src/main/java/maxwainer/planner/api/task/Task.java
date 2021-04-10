package maxwainer.planner.api.task;

import java.util.UUID;

public interface Task extends Comparable<Task>, Cloneable {

  Time getTime();

  boolean isAnnounceable();

  Description getDescription();

  String getRawDescription();

  UUID getTaskUniqueId();

}
