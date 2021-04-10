package maxwainer.planner.utils.fx;

import java.util.function.UnaryOperator;
import javafx.scene.control.Button;
import org.jetbrains.annotations.NotNull;

public final class ButtonUtils {

  public static Button button(@NotNull UnaryOperator<Button> buttonBuilder) {
    return button("Button", buttonBuilder);
  }

  public static Button button(@NotNull String name, @NotNull UnaryOperator<Button> buttonBuilder) {
    return buttonBuilder.apply(new Button(name));
  }

  private ButtonUtils() {
    throw new UnsupportedOperationException();
  }
}
