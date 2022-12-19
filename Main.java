public class Main {
    public static void main(String[] args) {
        intamount = 1000;
        int wallet = 50;

        int percent;
        if (amount >= 1000) {

            percent = amount / 100;
            System.out.println("Итоговая сумма: " + (amount + wallet) + " Начисенно бонусов " + percent);
        } else {
            System.out.println("Итоговая сумма:" + (amount + wallet) + " Бонусов не начисено");
        }

    }

}
