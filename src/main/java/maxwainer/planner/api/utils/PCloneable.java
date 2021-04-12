package maxwainer.planner.api.utils;

public interface PCloneable<T> extends Cloneable {

  T cloneObject() throws CloneNotSupportedException;

}
