package codeAcademy.vytautas.taskForce1.task2;

import java.util.ArrayList;
import java.util.Arrays;

class Main {

    public static void main(String[] args) {
        Item item1 = new Item("Cookies", 1.5);
        Item item2 = new Item("Milk", 2.0);

        Item item3 = new Item();
        item3.setName("FizzyWater");
        item3.setPrice(1.3);

        Item item4 = new Item();
        item4.setName("Chicken Ramen");
        item4.setPrice(1.9);

        ArrayList<Item> items = new ArrayList<>(Arrays.asList(item1, item2, item3, item4));

        cheapItems(items, 1.6);

        DiscountedItem item5 = new DiscountedItem("Crocs", 20.0, 30);
        DiscountedItem item6 = new DiscountedItem("Magazine", 1.5, 12);

        DiscountedItem item7 = new DiscountedItem();

        item7.setName("Bananas");
        item7.setPrice(1.2);
        item7.setDiscountPercentage(50);

        DiscountedItem item8 = new DiscountedItem();
        item8.setName("IceCream");
        item8.setPrice(0.5);
        item8.setDiscountPercentage(80);

        ArrayList<DiscountedItem> discountedItemArrayList = new ArrayList<>(Arrays.asList(item5, item6, item7, item8));
        lowestDiscount(discountedItemArrayList);

        item8.sellItem();
    }

    static void cheapItems(ArrayList<Item> items, Double price) {
        for (Item itemTemp : items
        ) {
            if (itemTemp.getPrice() < price) {
                itemTemp.itemInfo();
            }
        }
    }

    static void lowestDiscount(ArrayList<DiscountedItem> discountedItems) {
        if (discountedItems.size() > 0) {
            int min = 0;
            System.out.println("Item with lowest discount ");
            for (int i = 0; i < discountedItems.size(); i++) {
                if (discountedItems.get(i).getDiscountPercentage() < discountedItems.get(min).getDiscountPercentage()) {
                    min = i;
                }
            }
            discountedItems.get(min).itemInfo();
        } else {
            System.out.println("Provided empty list :'(");
        }
    }
}
