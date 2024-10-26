package factory.sharp;

import factory.matcha.ViewEngine;

import java.util.Map;
import java.util.Objects;

public class SharpViewEngine implements ViewEngine {

    @Override
    public String render(String viewName, Map<String, Objects> context) {
        return "View Rendered by Sharp.";
    }
}
