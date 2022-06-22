package codeAcademy.vytautas.paskaita20.miniPOS;

import java.time.LocalDateTime;
import java.util.ArrayList;

class Main {

    public static void main(String[] args) {
        ArrayList<Discount> discounts = new ArrayList<>();
        Discount discount = new Discount();
        discount.setBarCode("1234");
        discount.setDiscountPercent(12);
        discount.setActivationDate(LocalDateTime.now().minusDays(12));
        discount.setEndDate(LocalDateTime.now().plusDays(2));
        discounts.add(discount);

        discount.setBarCode("1235");
        discount.setDiscountPercent(20);
        discount.setActivationDate(LocalDateTime.now().plusDays(12));
        discount.setEndDate(LocalDateTime.now().plusDays(24));
        discounts.add(discount);

        Operations operations = new Operations();
        operations.run1(discounts);
    }
}
