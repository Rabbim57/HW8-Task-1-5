import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Task 1
        System.out.println("Task 1.1");
        int[] numberOne = new int[3];
        numberOne[0] = 1;
        numberOne[1] = 2;
        numberOne[2] = 3;
        for (int i = 0; i < 3; i++)
            System.out.println(numberOne[i]);

        System.out.println();
        System.out.println("Task 1.2");
        double[] numberTwo = new double[3];
        numberTwo[0] = 1.57;
        numberTwo[1] = 7.654;
        numberTwo[2] = 9.986;
        for (int i = 0; i < 3; i++)
            System.out.println(numberTwo[i]);

        System.out.println();
        System.out.println("Task 1.3");

        double[] numberThree = {1.55, 2.77, 3.45};
        for (int d = 0; d < numberThree.length; d++) {
            System.out.println(numberThree[d]);
        }


        System.out.println();
        System.out.println("Task 2-3");
        // Task 2-3

        int[] arry = new int[]{1, 7, 9};
        System.out.println(Arrays.toString(arry));

        for (int i = 0; i < arry.length / 2; i++) {
            int tmp = arry[i];
            arry[i] = arry[arry.length - 1 - i];
            arry[arry.length - 1 - i] = tmp;
        }

        System.out.println(Arrays.toString(arry));

        System.out.println();
        System.out.println("Task 4");
        // Task 4

        int[] numberFive = {1, 2, 3};
        numberFive[0] = 1;
        numberFive[1] = 7;
        numberFive[2] = 9;
        for (int i = 0; i < numberFive.length; i++) {
            if (numberFive[i] % 2 != 0) {
                numberFive[i]++;
            }
        }
        System.out.println(Arrays.toString(numberFive));
    }

}