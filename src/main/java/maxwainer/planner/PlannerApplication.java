package maxwainer.planner;

import static maxwainer.planner.utils.fx.AlertUtils.error;
import static maxwainer.planner.utils.fx.AlertUtils.info;
import static maxwainer.planner.utils.fx.ButtonUtils.button;
import static maxwainer.planner.utils.fx.SceneUtils.scene;

import java.time.LocalDate;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
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

    DatePicker startDatePicker = new DatePicker();
    DatePicker endDatePicker = new DatePicker();

    new Scene(button("Get OS", button -> {
      button.setOnMouseClicked(click ->
          info("Your os (Raw): " + loader.getRawOs() + " / Detected as (App): " + loader.getOs(), alert -> alert).showAndWait()
      );
      return button;
    }));

    VBox vbox = new VBox(20);
    Scene scene = new Scene(vbox, 400, 400);
    stage.setScene(scene);

    startDatePicker.setValue(LocalDate.now());
    endDatePicker.setValue(startDatePicker.getValue().plusDays(1));

    vbox.getChildren().add(new Label("Start Date:"));
    vbox.getChildren().add(startDatePicker);
    vbox.getChildren().add(new Label("End Date:"));
    vbox.getChildren().add(endDatePicker);


    stage.show();
  }
}
