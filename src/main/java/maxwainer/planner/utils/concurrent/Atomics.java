package maxwainer.planner.utils.concurrent;

import com.google.common.util.concurrent.AtomicDouble;
import com.google.common.util.concurrent.AtomicDoubleArray;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;
import org.checkerframework.checker.nullness.qual.Nullable;

public final class Atomics {

  private Atomics() {
    throw new UnsupportedOperationException();
  }

  public static AtomicInteger intValue() {
    return intValue(-1);
  }

  public static AtomicInteger intValue(int initial) {
    return new AtomicInteger(initial);
  }

  public static AtomicBoolean booleanValue() {
    return booleanValue(false);
  }

  public static AtomicBoolean booleanValue(boolean initial) {
    return new AtomicBoolean(initial);
  }

  public static AtomicLong longValue() {
    return longValue(-1);
  }

  public static AtomicLong longValue(long initial) {
    return new AtomicLong(initial);
  }

  public static AtomicDouble doubleValue() {
    return doubleValue(-1);
  }

  public static AtomicDouble doubleValue(double initial) {
    return new AtomicDouble(initial);
  }

  public static AtomicIntegerArray intArray() {
    return intArray(-1);
  }

  public static AtomicIntegerArray intArray(int ...initial) {
    return new AtomicIntegerArray(initial);
  }

  public static AtomicDoubleArray doubleArray() {
    return doubleArray(-1);
  }

  public static AtomicDoubleArray doubleArray(double ...initial) {
    return new AtomicDoubleArray(initial);
  }

  public static AtomicLongArray longArray() {
    return longArray(-1);
  }

  public static AtomicLongArray longArray(long ...initial) {
    return new AtomicLongArray(initial);
  }

  public static <T> AtomicReference<T> reference() {
    return new AtomicReference<>();
  }

  public static <T> AtomicReference<T> reference(@Nullable T initial) {
    return new AtomicReference<>(initial);
  }

  public static <T> AtomicReferenceArray<T> referenceArray(int initial) {
    return new AtomicReferenceArray<>(initial);
  }

  public static <T> AtomicReferenceArray<T> referenceArray(T ...initial) {
    return new AtomicReferenceArray<>(initial);
  }

}
