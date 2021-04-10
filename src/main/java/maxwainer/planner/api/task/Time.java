package maxwainer.planner.api.task;

import java.util.Date;

public interface Time extends Comparable<Time>, Cloneable {

  Date getStart();

  Date getEnd();

}
