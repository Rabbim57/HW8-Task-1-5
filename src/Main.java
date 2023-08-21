public class Main {
    public static void main(String[] args) {


        // Task 1
        System.out.println();
        double[] number = {1, 2, 3};
        number[0] = 1.57;
        number[1] = 7.654;
        number[2] = 9.986;
        for (int meaning = 0; meaning < number.length; meaning++) {
            System.out.println("Значение " + meaning + " равна " + number[meaning]);

        }
        System.out.println();
        // Task 2
        double[] numberTwo = {1, 2, 3};
        numberTwo[0] = 1.57;
        numberTwo[1] = 7.654;
        numberTwo[2] = 9.986;
        for (int meaningTwo = 0; meaningTwo < number.length; meaningTwo++) {
            System.out.print(number[meaningTwo] + " ");
        }
        System.out.println();
        // Task 3
        double[] numberThree = {3, 2, 1};
        numberThree[0] = 1.57;
        numberThree[1] = 7.654;
        numberThree[2] = 9.986;
        for (int meaningThree = 0; meaningThree < number.length; meaningThree++)
            if (meaningThree == numberThree.length - 1) {
                System.out.println(numberThree[meaningThree] + " ");
            }
        System.out.println();
        // Task 4
        double[] numberFour = {3, 2, 1};
        numberFour[0] = 1.57;
        numberFour[1] = 7.654;
        numberFour[2] = 9.986;
        for (int meaningFour = 0; meaningFour <= number.length; meaningFour++) {
                System.out.println(numberFour[meaningFour] + 1 + " ");
            }



    }






}