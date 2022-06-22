package codeAcademy.vytautas.paskaita20.miniPOS;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

class Operations {
    static int counter = 0;

    private Receipt createNewReceipt(ArrayList<Discount> discounts) {
        Receipt receipt = new Receipt();
        int tempInt = 0, tempInt2 = 0;
        //Pick to add or pass on Receipt type
        while (tempInt != 2) {
            tempInt = addReceiptTypeYesNo();
            if (tempInt == 1) {
                while (tempInt2 != 4) {
                    tempInt2 = addReceiptType();
                    switch (tempInt2) {
                        case 1 -> {
                            receipt.setReceiptType(Receipt.receiptTypes.SALE);
                            tempInt2 = 4;
                        }
                        case 2 -> {
                            receipt.setReceiptType(Receipt.receiptTypes.REFUND);
                            tempInt2 = 4;
                        }
                        case 3 -> {
                            receipt.setReceiptType(Receipt.receiptTypes.Z_REPORT);
                            tempInt2 = 4;
                        }
                        case 4 -> System.out.println("Canceled");
                        default -> System.out.println("Entered wrong option");
                    }
                    tempInt = 2;
                }
            } else if (tempInt != 2) {
                System.out.println("Entered wrong command");
            }
        }
        receipt.setReceiptNO("" + counter);
        counter++;
        run2(receipt, discounts);
        return receipt;
    }

    private int addReceiptType() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What type it is: "
                + "\n1. " + Receipt.receiptTypes.SALE
                + "\n2. " + Receipt.receiptTypes.REFUND
                + "\n3. " + Receipt.receiptTypes.Z_REPORT
                + "\n4. Cancel");
        return scanner.nextInt();
    }

    private int addReceiptTypeYesNo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do u want to add receipt type ?\nPress 1 to Yes, press 2 to No");
        return scanner.nextInt();
    }

    private Item createNewItem(ArrayList<Discount> discounts) {
        Scanner scanner = new Scanner(System.in);
        Item item = new Item();

        System.out.println("Enter item name");
        item.setName(scanner.next());

        System.out.println("Enter item barCode");
        item.setBarCode(scanner.next());

        System.out.println("Enter item price");
        item.setPrice(scanner.nextBigDecimal());

        for (Discount discountTemp : discounts
        ) {
            if (discountTemp.getBarCode().equals(item.getBarCode())
                    && discountTemp.getActivationDate().isBefore(LocalDateTime.now())
                    && discountTemp.getEndDate().isAfter(LocalDateTime.now())) {
                //Should be a simpler way to implement action below
                item.setPrice(item.getPrice().subtract(item.getPrice().multiply(BigDecimal.valueOf(discountTemp.getDiscountPercent())).divide(BigDecimal.valueOf(100), RoundingMode.UP)));
            }
        }

        return item;
    }

    private void addItemToReceipt(Receipt receipt, ArrayList<Discount> discounts) {
        ArrayList<Item> items = receipt.getItems();
        items.add(createNewItem(discounts));
        receipt.setItems(items);
    }

    private void removeItem(Receipt receipt) {
        Scanner scanner = new Scanner(System.in);
        String barcode;
        boolean pointer = true;

        System.out.println("Enter barcode of item to be removed ");
        barcode = scanner.next();

        for (int i = 0; i < receipt.getItems().size(); i++) {
            if (receipt.getItems().get(i).getBarCode().equals(barcode)) {
                receipt.getItems().remove(i);
                pointer = true;
                break;
            } else {
                pointer = false;
            }
        }
        if (!pointer) {
            System.out.println("Barcode not found in receipt");
        }
    }

    private void addClient(Receipt receipt) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter client name");
        receipt.getClient().setName(scanner.next());

        System.out.println("Enter client surname");
        receipt.getClient().setSurname(scanner.next());

        System.out.println("Enter client code");
        receipt.getClient().setCode(scanner.nextFloat());

        receipt.getClient().setGender(getGender());
    }

    private Client.genders getGender() {
        Scanner scanner = new Scanner(System.in);
        int tempInt;
        while (true) {
            System.out.println("Press 1 for male\nPress 2 for female");
            tempInt = scanner.nextInt();
            if (tempInt == 1) {
                return Client.genders.MALE;
            } else if (tempInt == 2) {
                return Client.genders.FEMALE;
            } else {
                System.out.println("Entered wrong command, try again");
            }
        }
    }

    private void payReceipt(Receipt receipt) {

        receipt.setSum(calculateSum(receipt.getItems()));
        receipt.setPaymentStatus(Receipt.paymentStatus.PAID);
        receipt.setPaymentDate(LocalDateTime.now());

        showReceiptInfo(receipt);

    }

    private BigInteger calculateSum(ArrayList<Item> items) {
        BigInteger localSum = new BigInteger("0");
        for (Item itemTemp : items
        ) {
            localSum = localSum.add(itemTemp.getPrice().toBigInteger());
        }
        return localSum;
    }

    private void showReceiptInfo(Receipt receipt) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM dd HH: mm");
        receipt.setSum(calculateSum(receipt.getItems()));

        System.out.println("Receipt No " + receipt.getReceiptNO());
        if (receipt.getReceiptType() != null) {
            System.out.println("type " + receipt.getReceiptType());
        } else {
            System.out.println("type not set");
        }
        System.out.println("total sum " + receipt.getSum());

        if (receipt.getPaymentStatus() != null) {
            System.out.println("status " + receipt.getPaymentStatus());
        }
        if (receipt.getPaymentDate() != null) {
            System.out.println("payment date " + receipt.getPaymentDate().format(formatter));
        }
        if (receipt.getClient().getGender() != null) {
            System.out.println("Client name " + receipt.getClient().getName()
                    + "\nsurname " + receipt.getClient().getSurname()
                    + "\ncode " + receipt.getClient().getCode()
                    + "\ngender " + receipt.getClient().getGender());
        }
        for (Item item : receipt.getItems()
        ) {
            printItem(item);
        }
    }

    private void printItem(Item item) {
        System.out.println("\nItem name " + item.getName() + "\nbarcode " + item.getBarCode() + "\nprice " + item.getPrice());
    }

    private void findMostExpensiveItem(ArrayList<Item> items) {
        int index = 0;
        for (int i = 1; i < items.size(); i++) {
            if (items.get(index).getPrice().byteValue() < items.get(i).getPrice().byteValue()) {
                index = i;
            }
        }
        System.out.println("Most expensive item in the list is: "
                + "\nname " + items.get(index).getName()
                + "\nbarcode " + items.get(index).getBarCode()
                + "\nprice " + items.get(index).getPrice()
        );
    }

    private void cheapestItem(ArrayList<Item> items) {
        int index = 0;
        for (int i = 1; i < items.size(); i++) {
            if (items.get(index).getPrice().byteValue() > items.get(i).getPrice().byteValue()) {
                index = i;
            }
        }
        System.out.println("Cheapest item in the list is: "
                + "\nname " + items.get(index).getName()
                + "\nbarcode " + items.get(index).getBarCode()
                + "\nprice " + items.get(index).getPrice()
        );
    }

    private int runInfo1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                \nChoose command to execute\s
                1. Create new receipt
                2. Pick receipt by NO
                3. Exit
                """);
        return scanner.nextInt();
    }

    private int runInfo2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                \nPick command to execute:\s
                1. Add item to receipt
                2. Remove item from receipt
                3. Create client
                4. Pay
                5. Show most expensive item in receipt
                6. Show cheapest item in receipt
                7. Show receipt info
                8. Exit
                """);
        return scanner.nextInt();
    }

    //Second level Run
    private void run2(Receipt receipt, ArrayList<Discount> discounts) {
        int tempInt = 0;
        while (tempInt != 8) {
            tempInt = runInfo2();
            switch (tempInt) {
                case 1 -> addItemToReceipt(receipt, discounts);
                case 2 -> {
                    if (!receipt.getItems().isEmpty()) {
                        removeItem(receipt);
                    } else {
                        System.out.println("Receipt is empty atm, add something to it");
                    }

                }
                case 3 -> addClient(receipt);
                case 4 -> {
                    if (!receipt.getItems().isEmpty()) {
                        payReceipt(receipt);
                    } else {
                        System.out.println("There are no items in receipt, nothing to pay for");
                    }
                }
                case 5 -> {
                    if (!receipt.getItems().isEmpty()) {
                        findMostExpensiveItem(receipt.getItems());
                    } else {
                        System.out.println("Receipt is empty atm, add something to it");
                    }
                }
                case 6 -> {
                    if (!receipt.getItems().isEmpty()) {
                        cheapestItem(receipt.getItems());
                    } else {
                        System.out.println("Receipt is empty atm, add something to it");
                    }
                }
                case 7 -> showReceiptInfo(receipt);
                case 8 -> {
                }
                default -> System.out.println("Entered wrong command try again from the list");
            }
        }
    }

    //Initial Run
    void run1(ArrayList<Discount> discounts) {
        int tempInt = 0;
        ArrayList<Receipt> receipts = new ArrayList<>();

        //Screen 1
        while (tempInt != 3) {
            tempInt = runInfo1();
            switch (tempInt) {
                case 1 -> receipts.add(createNewReceipt(discounts));
                case 2 -> {
                    if (!receipts.isEmpty()) {
                        pickReceiptByNO(receipts, discounts);
                    } else {
                        System.out.println("There are no receipt to pick from, Hint create new one first");
                    }
                }
                case 3 -> System.out.println("CY@");
                default -> System.out.println("Entered wrong command");
            }
        }
    }

    private int showReceiptsNo(ArrayList<Receipt> receipts) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Available receipt NOs");
        for (Receipt receipt : receipts) {
            System.out.println(receipt.getReceiptNO());
        }
        System.out.println("To exit press " + receipts.size());
        return scanner.nextInt();
    }

    private void pickReceiptByNO(ArrayList<Receipt> receipts, ArrayList<Discount> discounts) {
        int tempInt = 0;
        while (tempInt != receipts.size()) {
            tempInt = showReceiptsNo(receipts);
            for (Receipt receipt : receipts
            ) {
                if (receipt.getReceiptNO().equals("" + tempInt)) {
                    run2(receipt, discounts);
                    tempInt = receipts.size();
                }
            }
            if (receipts.size() > tempInt && tempInt < 0) {
                System.out.println("Picked wrong command, try again");
            }
        }
    }

}
