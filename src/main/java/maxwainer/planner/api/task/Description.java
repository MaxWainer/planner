package maxwainer.planner.api.task;

import maxwainer.planner.api.utils.BComparable;
import maxwainer.planner.api.utils.PCloneable;

public interface Description extends BComparable<Description>, PCloneable<Description> {

  String getRaw();

}
