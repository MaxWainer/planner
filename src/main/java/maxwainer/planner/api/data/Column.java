package maxwainer.planner.api.data;

public interface Column {

  Object getObject();

  DataType getType();

  String getName();

  boolean isNullable();

}
