package maxwainer.planner.utils.fx;

import java.util.function.UnaryOperator;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import org.jetbrains.annotations.NotNull;

public final class AlertUtils {

  private AlertUtils() {
    throw new UnsupportedOperationException();
  }

  public static Alert alert(@NotNull Alert.AlertType type, @NotNull String text,
      @NotNull UnaryOperator<Alert> alertBuilder, @NotNull ButtonType... types) {
    return alertBuilder.apply(new Alert(type, text, types));
  }

  public static Alert error(@NotNull String text, @NotNull UnaryOperator<Alert> alertBuilder,
      @NotNull ButtonType... types) {
    return alert(AlertType.ERROR, text, alertBuilder, types);
  }

  public static Alert warn(@NotNull String text, @NotNull UnaryOperator<Alert> alertBuilder,
      @NotNull ButtonType... types) {
    return alert(AlertType.WARNING, text, alertBuilder, types);
  }

  public static Alert info(@NotNull String text, @NotNull UnaryOperator<Alert> alertBuilder,
      @NotNull ButtonType... types) {
    return alert(AlertType.INFORMATION, text, alertBuilder, types);
  }

  public static Alert confirm(@NotNull String text, @NotNull UnaryOperator<Alert> alertBuilder,
      @NotNull ButtonType... types) {
    return alert(AlertType.CONFIRMATION, text, alertBuilder, types);
  }

  public static Alert none(@NotNull String text, @NotNull UnaryOperator<Alert> alertBuilder,
      @NotNull ButtonType... types) {
    return alert(AlertType.NONE, text, alertBuilder, types);
  }
}
