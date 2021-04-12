package maxwainer.planner.api.task;

import java.util.UUID;
import maxwainer.planner.api.utils.BComparable;
import maxwainer.planner.api.utils.PCloneable;

public interface Task extends BComparable<Task>, PCloneable<Task> {

  Time getTime();

  boolean isAnnounceable();

  Description getDescription();

  String getRawDescription();

  UUID getTaskUniqueId();

}
