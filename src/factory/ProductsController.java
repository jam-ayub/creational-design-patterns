package factory;

import factory.matcha.Controller;
import factory.matcha.MatchaViewEngine;
import factory.sharp.SharpController;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class ProductsController extends SharpController {
    public void listProducts() {
        // get products from database
        Map<String, Objects> context = new HashMap<>();
        // context.put(products)
        render("product.html", context);
    }
}
