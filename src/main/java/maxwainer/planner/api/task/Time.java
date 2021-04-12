package maxwainer.planner.api.task;

import java.util.Date;
import maxwainer.planner.api.utils.BComparable;
import maxwainer.planner.api.utils.PCloneable;

public interface Time extends BComparable<Time>, PCloneable<Time> {

  Date getStart();

  Date getEnd();

}
