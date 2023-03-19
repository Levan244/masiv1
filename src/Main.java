public class Main {
    public static void main(String[] args) {
        task1();
        System.out.println();
        task2();
        System.out.println();
        task3();
        System.out.println();
        task4();
        System.out.println();

    }

    private static void task1() {
        System.out.println("Задача 1");
        int[] weights = new int[]{1, 2, 3};
        double[] fractionalNumber = {1.57, 7.654, 9.986};
        char[] letters = {'a', 'b', 'c', 'd'};

    }

    private static void task2() {
        System.out.println("Задача 2");
        int[] weights = new int[]{1, 2, 3};
        double[] fractionalNumber = {1.57, 7.654, 9.986};
        char[] letters = {'a', 'b', 'c', 'd'};

        for (int i = 0; i < weights.length; i++) {
            System.out.print(weights[i]);
            if (i != weights.length - 1) {
                System.out.print(", ");
            }

        }
        System.out.println();
        for (int i = 0; i < fractionalNumber.length; i++) {
            System.out.print(fractionalNumber[i]);
            if (i != fractionalNumber.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < letters.length; i++) {
            System.out.print(letters[i]);
            if (i != letters.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    private static void task3() {
        System.out.println("Задача 3");

        int[] weights = new int[]{1, 2, 3};
        double[] fractionalNumber = {1.57, 7.654, 9.986};
        char[] letters = {'a', 'b', 'c', 'd'};

        for (int i = weights.length - 1; i >= 0; i--) {
            System.out.print(weights[i]);

            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = fractionalNumber.length - 1; i >= 0; i--) {
            System.out.print(fractionalNumber[i]);

            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = letters.length - 1; i >= 0; i--) {
            System.out.print(letters[i]);

            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

    }


    private static void task4() {
        System.out.println("Задача 4");

        int[] weights = new int[]{1, 2, 3};

        for (int i = 0; i < weights.length; i++){
            if (weights[i] % 2 != 0) {
                weights[i]++;
                System.out.println(weights[i]);
            }

        }

    }

}



