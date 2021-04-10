package maxwainer.planner;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import static maxwainer.planner.utils.fx.ButtonUtils.*;
import static maxwainer.planner.utils.fx.AlertUtils.*;

public final class PlannerApplication extends Application {
  private static PlannerApplication INSTANCE;

  public static void main(String[] args) {
    launch(PlannerApplication.class, args);
  }

  @Override
  public void start(Stage stage) throws Exception {
    stage.setTitle("Named");

    Scene scene = new Scene(button("", e -> {
      e.setOnMouseClicked(click ->
        error("An example error!", alert -> alert).showAndWait()
      );
      return e;
    }));
    stage.setScene(scene);
    stage.show();
  }

  public static PlannerApplication getInstance() {
    if (INSTANCE == null)
      INSTANCE = new PlannerApplication();

    return INSTANCE;
  }
}
