package maxwainer.planner.api.utils;

import java.util.List;

public interface Writer<T> extends Comparable<Writer<T>>, Cloneable {

  void write(T o);

  List<T> get();

}
