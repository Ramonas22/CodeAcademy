package codeAcademy.zilvinas.nullExcercies.examples.example5;

class Example4 {
    public static void main(String[] args) {
        Account account = new Account();
        try {
            account.withdraw(90);
            System.out.println("Money taken out");
            account.withdraw(50);
            System.out.println("Money withdraw");
        }catch (AccountException e){
            System.out.println("Error. After withdraw balance would be " + e.getBalance());
        }


    }
}
