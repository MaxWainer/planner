package maxwainer.planner.utils.fx;

import java.io.IOException;
import java.net.URL;
import java.util.function.UnaryOperator;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import org.jetbrains.annotations.NotNull;

public final class SceneUtils {

  private SceneUtils() {
    throw new UnsupportedOperationException();
  }

  public static Scene scene(@NotNull Parent parent, @NotNull UnaryOperator<Scene> sceneBuilder) {
    return sceneBuilder.apply(new Scene(parent));
  }

  public static Scene ofUrl(@NotNull URL url, double width, double height) throws IOException {
    return new Scene(FXMLLoader.load(url), width, height);
  }

  public static Scene ofUrl(@NotNull URL url) throws IOException {
    return ofUrl(url, -1, -1);
  }

}
