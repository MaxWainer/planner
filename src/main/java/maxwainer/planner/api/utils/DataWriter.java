package maxwainer.planner.api.utils;

import maxwainer.planner.api.data.Column;
import maxwainer.planner.api.data.DataType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface DataWriter extends Writer<Column> {

  void write(@NotNull DataType type, @NotNull String name, @Nullable Object object, boolean isNullable);

}
