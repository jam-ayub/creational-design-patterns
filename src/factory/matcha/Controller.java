package factory.matcha;

import java.util.Map;
import java.util.Objects;

public class Controller {
    public void render(String view, Map<String, Objects> context, ViewEngine engine) {
//        var engine = new MatchaViewEngine();
        var html = engine.render(view, context);
        System.out.println(html);
    }
}
