package codeAcademy.vytautas.paveldejimas.classHierarchyFruitEdition;

import java.util.ArrayList;
import java.util.List;

class Runner {

    public static void main(String[] args) {
        System.out.println("\n");
        Fruit fruit = new Fruit("Grape", "Violet");
        fruit.Iam();
        fruit.IInherit();
        System.out.println("-----------------\n");

        ExoticFruit exoticFruit = new ExoticFruit("Tubler", "Green", "South America");
        exoticFruit.Iam();
        exoticFruit.IInherit();
        System.out.println("-----------------\n");

        Pineapple pineapple = new Pineapple("Great", "Yellowish", " South Africa");
        pineapple.Iam();
        pineapple.IInherit();
        System.out.println("-----------------\n");

        Mango mango = new Mango("Tipy", "Orange", " no idea");
        mango.Iam();
        mango.IInherit();
        System.out.println("-----------------\n");

        LithuanianFruit lithuanianFruit = new LithuanianFruit("disgusted as fruit potato", "Brown");
        lithuanianFruit.Iam();
        lithuanianFruit.IInherit();
        System.out.println("-----------------\n");


        Pear pear = new Pear("small", "neon green");
        pear.Iam();
        pear.IInherit();
        System.out.println("-----------------\n");

        Apple apple = new Apple("garden", "Red");
        apple.Iam();
        apple.IInherit();
        System.out.println("-----------------\n");

        Lilac lilac = new Lilac("biggy", "light green");
        lilac.Iam();
        lilac.IInherit();
        System.out.println("-----------------\n");

        Antaninis antaninis = new Antaninis("medium", "White");
        antaninis.Iam();
        antaninis.IInherit();
        System.out.println("-----------------\n");

        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");


        //Not the best practice since if class will be added that will not extend in a way fruit class program will crash
        List<Object> list = new ArrayList<>();
        list.add(fruit);
        list.add(exoticFruit);
        list.add(pineapple);
        list.add(mango);
        list.add(lithuanianFruit);
        list.add(pear);
        list.add(apple);
        list.add(lilac);
        list.add(antaninis);

        for (Object object : list
        ) {
            ((Fruit) object).Iam();
            ((Fruit) object).IInherit();
            System.out.println("-----------------\n");
        }

        System.out.println("Is fruit instance of Pineapple " + (fruit instanceof  Pineapple));
        System.out.println("Is pineapple instance of fruit " + (pineapple instanceof Fruit));


        //Casting example
        Apple castingExample = new Apple("ExampleCast" , "color");
        LithuanianFruit castingExample1 = (LithuanianFruit) castingExample;

    }
}
