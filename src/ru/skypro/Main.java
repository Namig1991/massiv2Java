package ru.skypro;

public class Main {
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.print("Сумма трат за месяц составило " + sum + " рублей");
        System.out.println();

        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
           if ( arr[i] < min ) {
               min = arr[i];
           } else if ( arr[i] > max) {
               max = arr[i];
           }

        }
        System.out.println("Минимальная сумма трат за день составила " + min + " RUB");
        System.out.println("Максимальная сумма трат за день составила " + max + " RUB");
        System.out.println();

        double averageExpenses = sum / (double) arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + averageExpenses + "RUB");
        System.out.println();

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int m = reverseFullName.length - 1; m > 0; m--) {
            System.out.print(reverseFullName[m] );
        }
    }
}
