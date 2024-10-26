package factory;

import factory.matcha.Controller;
import factory.matcha.MatchaViewEngine;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class ProductsController extends Controller {
    public void listProducts() {
        // get products from database
        Map<String, Objects> context = new HashMap<>();
        // context.put(products)
        render("product.html", context);
    }
}
