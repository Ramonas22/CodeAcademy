package codeAcademy.exam.exam1.two;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Main {
    public static void main(String[] args) {
        Product bread = new Bread();
        Product butter = new Butter();
        Product cheese = new Cheese();
        Product milk = new Milk();
        Product yogurt = new Yogurt();

        List<Product> productList = new ArrayList<Product>(Arrays.asList(bread,butter,cheese,milk,yogurt));

        for (Product product: productList
             ) {
            ProductChecker.check(product);
        }
    }
}
