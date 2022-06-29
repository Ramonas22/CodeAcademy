package codeAcademy.vytautas.taskForce1.task1;

import java.util.ArrayList;
import java.util.Arrays;

class Main {

    public static void main(String[] args) {
        Shop shop1 = new Shop("Jonavos g. 60", 150, TradeNetwork.MAXIMA);
        Shop shop2 = new Shop("Panemumes g. 45", 45, TradeNetwork.IKI);

        Shop shop3 = new Shop();

        shop3.setAddress("Pramones g. 6B");
        shop3.setEmployeesCount(80);
        shop3.setTradeNetwork(TradeNetwork.LIDL);

        Shop shop4 = new Shop();
        shop4.setAddress("Gelezinio Vilko g. 145C");
        shop4.setEmployeesCount(35);
        shop4.setTradeNetwork(TradeNetwork.RIMI);

        ArrayList<Shop> shopArrayList = new ArrayList<>(Arrays.asList(shop1,shop2,shop3,shop4));
        highestEmployeeCountShop(shopArrayList);

        for (Shop shopTemp: shopArrayList
             ) {
            shopTemp.turnOnCooling();
        }


    }

    static void highestEmployeeCountShop(ArrayList<Shop> shops) {

        if (shops.size() > 0) {
            int max = 0;
            System.out.println("Highest employee count fielding shop: ");
            for (int i = 0; i < shops.size(); i++) {
                if (shops.get(i).getEmployeesCount() > shops.get(max).getEmployeesCount()) {
                    max = i;
                }
            }
            shops.get(max).print();
        } else {
            System.out.println("Provided list is empty :(");
        }
    }
}
