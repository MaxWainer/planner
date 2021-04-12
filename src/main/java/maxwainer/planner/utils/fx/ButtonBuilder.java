package maxwainer.planner.utils.fx;

import java.util.function.UnaryOperator;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.effect.BlendMode;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.Border;
import org.jetbrains.annotations.NotNull;

public final class ButtonBuilder {
  private final Button button;

  public ButtonBuilder() {
    this.button = new Button();
  }

  public ButtonBuilder named(@NotNull String name) {
    button.setText(name);
    return this;
  }

  public ButtonBuilder action(@NotNull EventHandler<ActionEvent> value) {
    button.setOnAction(value);
    return this;
  }

  public ButtonBuilder asCancel(boolean is) {
    button.setCancelButton(is);
    return this;
  }

  public ButtonBuilder asDefault(boolean is) {
    button.setDefaultButton(is);
    return this;
  }

  public ButtonBuilder visible(boolean is) {
    button.setVisible(is);
    return this;
  }

  public ButtonBuilder mouseEvent(@NotNull EventHandler<? super MouseEvent> value) {
    button.setOnMouseClicked(value);
    return this;
  }

  public ButtonBuilder apply(@NotNull UnaryOperator<Button> builder) {
    builder.apply(button);
    return this;
  }

  public ButtonBuilder background(@NotNull Background background) {
    button.setBackground(background);
    return this;
  }

  public ButtonBuilder blendMode(@NotNull BlendMode blendMode) {
    button.setBlendMode(blendMode);
    return this;
  }

  public ButtonBuilder border(@NotNull Border Border) {
    button.setBorder(Border);
    return this;
  }

  public ButtonBuilder minHeight(double value) {
    button.setMinHeight(value);
    return this;
  }

  public ButtonBuilder minWidth(double value) {
    button.setMinWidth(value);
    return this;
  }

  public ButtonBuilder minSize(double height, double width) {
    button.setMinSize(height, width);
    return this;
  }

  public ButtonBuilder maxHeight(double value) {
    button.setMaxHeight(value);
    return this;
  }

  public ButtonBuilder maxWidth(double value) {
    button.setMaxWidth(value);
    return this;
  }

  public ButtonBuilder maxSize(double height, double width) {
    button.setMaxSize(height, width);
    return this;
  }

  public Button build() {
    return button;
  }

  public static ButtonBuilder builder() {
    return new ButtonBuilder();
  }
}
