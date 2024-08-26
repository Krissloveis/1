import java.util.Scanner;

class CoffeeMachine {
    public static void main(String[] args) {
        int coffeeAmount = 2330;
        int milkAmount = 3210;
        int skinnedMilkAmount = 1290;
        int teaBags = 3;
        boolean isBlocked = true; // Предположим, что машина заблокирована
        int cappuccinoMilkRequired = 60;
        int cappuccinoCoffeeRequired = 15;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите напиток (1 - Капучино, 2 - Чай):");
        int choice = scanner.nextInt();
        if (!isBlocked) {
            switch (choice) {
                case 1:
                    if (canMakeCappuccino(coffeeAmount, milkAmount, cappuccinoCoffeeRequired, cappuccinoMilkRequired)) {
                        System.out.println("Готовим кофе");
                    } else {
                        System.out.println("Недостаточно ингредиентов для кофе");
                    }
                    break;
                case 2:
                    if (canMakeTea(teaBags)) {
                        System.out.println("Завариваем чай");
                    } else {
                        System.out.println("Недостаточно чайных пакетиков");
                    }
                    break;
                default:
                    System.out.println("Неверный выбор");
                    break;
            }
        } else {
            System.out.println("Машина заблокирована");
        }
        scanner.close();
    }
    public static boolean canMakeCappuccino(int coffeeAmount, int milkAmount, int coffeeRequired, int milkRequired) {
        return coffeeAmount >= coffeeRequired && milkAmount >= milkRequired;
    }
    public static boolean canMakeTea(int teaBags) {
        return teaBags > 0;
    }
}