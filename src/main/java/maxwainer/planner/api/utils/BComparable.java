package maxwainer.planner.api.utils;

import org.jetbrains.annotations.NotNull;

public interface BComparable<T> extends Comparable<T> {

  @Override
  default int compareTo(@NotNull T o) {
    return compare(o) ? 0 : 1;
  }

  boolean compare(@NotNull T t);

}
