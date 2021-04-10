package maxwainer.planner.utils.fx;

import java.util.function.UnaryOperator;
import javafx.scene.Parent;
import javafx.scene.Scene;
import org.jetbrains.annotations.NotNull;

public final class SceneUtils {

  private SceneUtils() {
    throw new UnsupportedOperationException();
  }

  public static Scene scene(@NotNull Parent parent, @NotNull UnaryOperator<Scene> sceneBuilder) {
    return sceneBuilder.apply(new Scene(parent));
  }

}
