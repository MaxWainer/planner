package maxwainer.planner;

import static maxwainer.planner.utils.fx.AlertUtils.error;
import static maxwainer.planner.utils.fx.AlertUtils.info;
import static maxwainer.planner.utils.fx.ButtonUtils.button;
import static maxwainer.planner.utils.fx.ControlUtils.passwordField;

import com.google.common.util.concurrent.Atomics;
import java.time.LocalDate;
import java.util.concurrent.atomic.AtomicReference;
import javafx.application.Application;
import javafx.scene.AccessibleAttribute;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public final class PlannerApplication extends Application {

  private static PlannerApplication INSTANCE;

  public static PlannerApplication getInstance() {
    if (INSTANCE == null) {
      INSTANCE = new PlannerApplication();
    }

    return INSTANCE;
  }

  @Override
  public void start(Stage stage) throws Exception {
    SystemLoader loader = new SystemLoader();
    stage.setTitle("Planner - By Max_Wainer");
    stage.setWidth(500);
    stage.setHeight(1000);

    DatePicker startDatePicker = new DatePicker();
    DatePicker endDatePicker = new DatePicker();

    VBox vbox = new VBox(20);
    Scene scene = new Scene(vbox, 100, 100);

    scene.setFill(Color.PAPAYAWHIP);

    stage.setScene(scene);

    startDatePicker.setValue(LocalDate.now());
    endDatePicker.setValue(startDatePicker.getValue().plusDays(1));

    AtomicReference<String> enteredPassword = new AtomicReference<>();
    vbox.getChildren().add(new Label("Enter an example password:"));
    vbox.getChildren().add(passwordField(passwordField -> {
      passwordField.setOnAction(event -> {

      });
      return passwordField;
    }));
    vbox.getChildren().add(button("Get password", button -> {
      button.setOnMouseClicked(click -> {
          info("Entered password: " + enteredPassword, alert -> alert).showAndWait();

      });
      return button;
    }));

    stage.show();
  }
}
