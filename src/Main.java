public class Main {
    public static void main(String[] args) {
        int balance = 35;
        int refill = 1001;
        int bonusCoefficient = 100;
        // bonusCoefficient - сколько рублей нужно потратить, чтобы получить 1 бонусный рубль
        int bonus;
        if (refill > 1000) {
            bonus = (int) (refill / bonusCoefficient);
        } else {
            bonus = 0;
        }
        int totalBalance = balance + refill + bonus;
        System.out.println("Итоговый баланс: " + totalBalance + " рублей");
        System.out.println("Бонус составил: " + bonus + " рублей");


    }
}
