package maxwainer.planner.utils;

import com.google.common.base.Objects;
import org.jetbrains.annotations.NotNull;

public final class Pair<F, S> {
  private @NotNull F first;
  private @NotNull S second;

  public Pair(@NotNull F first, @NotNull S second) {
    this.first = first;
    this.second = second;
  }

  public @NotNull F getFirst() {
    return first;
  }

  public @NotNull S getSecond() {
    return second;
  }

  public void setFirst(@NotNull F first) {
    this.first = first;
  }

  public void setSecond(@NotNull S second) {
    this.second = second;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Pair<?, ?> pair = (Pair<?, ?>) o;
    return Objects.equal(first, pair.first) && Objects
        .equal(second, pair.second);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(first, second);
  }

  @Override
  public String toString() {
    return "Pair{" +
        "first=" + first +
        ", second=" + second +
        '}';
  }
}
