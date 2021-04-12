package maxwainer.planner;

import java.time.LocalDate;
import java.util.concurrent.atomic.AtomicReference;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import maxwainer.planner.utils.fx.AlertBuilder;
import maxwainer.planner.utils.fx.ButtonBuilder;
import maxwainer.planner.utils.fx.ControlBuilder;

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

    stage.setScene(scene);

    startDatePicker.setValue(LocalDate.now());
    endDatePicker.setValue(startDatePicker.getValue().plusDays(1));

    AtomicReference<Object> enteredPassword = new AtomicReference<>();
    vbox.getChildren().add(new Label("Enter an example password:"));

    vbox.getChildren().add(
        ButtonBuilder.builder()
            .named("Click on me!")
            .action(e -> {
              AlertBuilder.builder()
                  .header("Alert header")
                  .title("Alert title!")
                  .description(
                      "First line",
                      "Second line",
                      "Third line"
                  )
                  .type(AlertType.ERROR)
                  .show();
            })
            .build()
    );

    ControlBuilder.builder(new PasswordField())
        .supply(field -> {


          return field;
        }).build();

    stage.show();
  }
}
