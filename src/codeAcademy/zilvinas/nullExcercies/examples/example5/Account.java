package codeAcademy.zilvinas.nullExcercies.examples.example5;

class Account {
    private int balance = 100;

    public void withdraw(int amount) throws AccountException {
        if (balance - amount >= 0) {
            balance -= amount;
        }else {
            throw new AccountException("Not enough money " , (balance-amount));
        }
    }
}
