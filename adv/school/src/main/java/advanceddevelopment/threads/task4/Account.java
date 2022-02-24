package advanceddevelopment.threads.task4;

public class Account {

    private float money;

    public Account(float money) {
        this.money = money;
    }

    public float getMoney() {
        return money;
    }

    public void setMoney(float money) {
        this.money = money;
    }

    public synchronized void pay(float amount) throws InterruptedException {
        if (amount > money) {
            System.out.println("not enough money");
            wait();
        }
        money = money - amount;
        System.out.println(String.format("pay %f, saldo %f", amount, money));
    }

    @Override
    public String toString() {
        return "Account{" +
                "money=" + money +
                '}';
    }
}
