package maxwainer.planner.utils.fx;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import org.jetbrains.annotations.NotNull;

public class AlertBuilder {

  private final Alert alert;

  public AlertBuilder(@NotNull Alert.AlertType type) {
    this.alert = new Alert(type);
  }

  public AlertBuilder() {
    this(AlertType.INFORMATION);
  }

  public AlertBuilder type(@NotNull AlertType type) {
    alert.setAlertType(type);
    return this;
  }

  public AlertBuilder title(@NotNull String text) {
    alert.setTitle(text);
    return this;
  }

  public AlertBuilder header(@NotNull String text) {
    alert.setHeaderText(text);
    return this;
  }

  public AlertBuilder description(@NotNull String ...text) {
    alert.setContentText(String.join("\n", text));
    return this;
  }

  public AlertBuilder show() {
    alert.showAndWait();
    return this;
  }

  public Alert build() {
    return alert;
  }

  public static AlertBuilder builder() {
    return new AlertBuilder();
  }

}
