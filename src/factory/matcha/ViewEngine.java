package factory.matcha;

import java.util.Map;
import java.util.Objects;

public interface ViewEngine {
    String render(String viewName, Map<String, Objects> context);
}
