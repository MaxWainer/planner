package maxwainer.planner.utils.fx;

import java.util.function.UnaryOperator;
import javafx.scene.control.PasswordField;
import org.jetbrains.annotations.NotNull;

public final class ControlUtils {

  private ControlUtils() {
    throw new UnsupportedOperationException();
  }

  public static PasswordField passwordField(@NotNull UnaryOperator<PasswordField> passwordFieldBuilder) {
    return passwordFieldBuilder.apply(new PasswordField());
  }

}
