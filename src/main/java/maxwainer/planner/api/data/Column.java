package maxwainer.planner.api.data;

import maxwainer.planner.api.utils.BComparable;
import maxwainer.planner.api.utils.PCloneable;

public interface Column extends BComparable<Column>, PCloneable<Column> {

  Object getObject();

  DataType getType();

  String getName();

  boolean isNullable();

}
