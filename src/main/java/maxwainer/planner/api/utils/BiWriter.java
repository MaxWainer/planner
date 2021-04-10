package maxwainer.planner.api.utils;

import java.util.Map;

public interface BiWriter<K, V> extends Cloneable, Comparable<BiWriter<K, V>> {

  void write(K k, V v);

  Map<K, V> get();

}
