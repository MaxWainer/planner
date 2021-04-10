package maxwainer.planner;

import org.jetbrains.annotations.NotNull;

public class SystemLoader {
  private final OS os;
  private final String rawOs;

  public SystemLoader() {
    rawOs = System.getProperty("os.name");
    os = OS.of(rawOs);

    if (os == OS.NONE) {
      throw new UnsupportedOperationException(
          "Unable to enable program on current OS! If your OS listed and you get this message, open issue on github page (github.com/MaxWainer/planner/issues/new). Raw os info: "
              + rawOs
      );
    }
  }

  public OS getOs() {
    return os;
  }

  public String getRawOs() {
    return rawOs;
  }

  public enum OS {
    SHIT,
    LINUX,
    MACOSX,
    NONE;

    public static OS of(@NotNull String name) {
      name = name.toLowerCase();

      if (name.contains("windows")) {
        return SHIT;
      } else if (name.contains("linux")) {
        return LINUX;
      } else if (name.contains("macos") || name.contains("darwin")) {
        return MACOSX;
      } else {
        return NONE;
      }
    }
  }

}
