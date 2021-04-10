package maxwainer.planner.utils;

import com.google.common.base.Objects;
import org.jetbrains.annotations.NotNull;

public final class Triple<F, S, T> {

  private @NotNull F first;
  private @NotNull S second;
  private @NotNull T third;

  public Triple(@NotNull F first, @NotNull S second, @NotNull T third) {
    this.first = first;
    this.second = second;
    this.third = third;
  }

  public @NotNull F getFirst() {
    return first;
  }

  public void setFirst(@NotNull F first) {
    this.first = first;
  }

  public @NotNull S getSecond() {
    return second;
  }

  public void setSecond(@NotNull S second) {
    this.second = second;
  }

  public @NotNull T getThird() {
    return third;
  }

  public void setThird(@NotNull T third) {
    this.third = third;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Triple<?, ?, ?> triple = (Triple<?, ?, ?>) o;
    return Objects.equal(first, triple.first) && Objects
        .equal(second, triple.second) && Objects.equal(third, triple.third);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(first, second, third);
  }

  @Override
  public String toString() {
    return "Triple{" +
        "first=" + first +
        ", second=" + second +
        ", third=" + third +
        '}';
  }
}
