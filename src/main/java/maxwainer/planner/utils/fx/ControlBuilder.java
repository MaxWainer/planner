package maxwainer.planner.utils.fx;

import java.util.function.UnaryOperator;
import javafx.scene.control.Control;
import org.jetbrains.annotations.NotNull;

public class ControlBuilder<T extends Control> {
  private final T component;

  public ControlBuilder(T component) {
    this.component = component;
  }

  public ControlBuilder<T> supply(@NotNull UnaryOperator<T> builder) {
    builder.apply(component);
    return this;
  }

  public T build() {
    return component;
  }

  public static <T extends Control> ControlBuilder<T> builder(@NotNull T parent) {
    return new ControlBuilder<>(parent);
  }

}
