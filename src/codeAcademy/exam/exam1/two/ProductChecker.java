package codeAcademy.exam.exam1.two;

class ProductChecker {
    static void check(Product product){
        if(product instanceof Bread){
            System.out.print("Bread ");
        } else if (product instanceof Butter) {
            System.out.print("Butter ");
        } else if (product instanceof Cheese) {
            System.out.print("Cheese ");
        } else if (product instanceof Milk) {
            System.out.print("Milk ");
        } else if (product instanceof Yogurt) {
            System.out.print("Yogurt ");
        } else {
            System.out.print("Product ");
        }

        if(product.canBeConsumed()){
            System.out.println("Can be consumed");
        }else {
            System.out.println("Cannot be consumed");
        }
    }
}
