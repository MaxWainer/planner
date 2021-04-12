package maxwainer.planner.module.data;

import maxwainer.planner.api.data.Column;
import maxwainer.planner.api.data.DataType;
import org.jetbrains.annotations.NotNull;

public class ColumnImpl implements Column {
  private final Object object;
  private final DataType dataType;
  private final String name;
  private final boolean nullable;

  public ColumnImpl(Object object, DataType dataType, String name, boolean nullable) {
    this.object = object;
    this.dataType = dataType;
    this.name = name;
    this.nullable = nullable;
  }

  @Override
  public Object getObject() {
    return object;
  }

  @Override
  public DataType getType() {
    return dataType;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public boolean isNullable() {
    return nullable;
  }

  @Override
  public boolean compare(@NotNull Column column) {
    return object == column.getObject()
        && dataType == column.getType()
        && name.equals(column.getName())
        && nullable == column.isNullable();
  }

  @Override
  public Column cloneObject() throws CloneNotSupportedException {
    return null;
  }
}
