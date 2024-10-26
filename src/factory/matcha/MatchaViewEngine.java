package factory.matcha;

import java.util.Map;
import java.util.Objects;

public class MatchaViewEngine implements ViewEngine {
    @Override
    public String render(String viewName, Map<String, Objects> context) {
        return "View rendered by Matcha";
    }
}
