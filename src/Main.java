import AdditionalTasks.*;
import MainTasks.*;

public class Main {

    public static void main(String[] args) {

        //First task
        System.out.println("First Task");
        Calculator calculator = new Calculator(7,3);
        System.out.println(calculator.sum());
        System.out.println(calculator.subtract());
        System.out.println(calculator.multiply());
        System.out.println(calculator.divide());
        System.out.println(calculator.remainder());
        System.out.println();

        //Second task
        System.out.println("Second Task");
        int[] arr = new int[20];
        for(int i = 0; i < 20; i++){
            arr[i] = i;
        }
        ArrayOddCheck checkArray = new ArrayOddCheck(arr);
        checkArray.outputOdds();
        System.out.println();

        //Third task
        System.out.println("Third Task");
        int a = 1;
        int b = 2;
        System.out.println("Values: " + a + " and " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Swapped Values: " + a + " and " + b);
        System.out.println();

        //Fourth task
        System.out.println("Fourth Task");
        BiggestOfThree biggestOfThree = new BiggestOfThree(3, 4, 5);
        System.out.println(biggestOfThree.getBiggest());
        System.out.println();

        //Fifth task
        System.out.println("Fifth Task");
        NumberCheck numberCheck = new NumberCheck(-3);
        System.out.println("Is it positive? " + numberCheck.isPositive());
        System.out.println("Is it negative? " + numberCheck.isNegative());
        System.out.println();

        //Sixth task
        System.out.println("Sixth Task");
        ChangeAsToBs changeAsToBs = new ChangeAsToBs();
        System.out.println(changeAsToBs.change("Adam is a good man."));
        System.out.println();

        //Seventh task
        System.out.println("Seventh Task");
        System.out.println(checkArray.arraySum());
        System.out.println();

        //Eighth task
        System.out.println("Eighth Task");
        System.out.println(checkArray.getSecondBiggest());
        System.out.println();

        //Shuffle String
        System.out.println("Shuffle String");
        int[] array = {9, 10, 11, 8, 1, 2, 3, 4, 5, 6, 7};
        ShuffleString shuffleString = new ShuffleString("lot parking", array);
        System.out.println(shuffleString.shuffle());
        System.out.println();

        //Palindrome Number
        System.out.println("Palindrome Number");
        int num = 12321;
        PalindromeNumber number = new PalindromeNumber();
        System.out.println(number.isPalindrome(num));
        System.out.println();

        //Number of Steps to Reduce a Number
        System.out.println("Number of Steps to Reduce a Number");
        NumberOfSteps numberOfSteps = new NumberOfSteps(14);
        System.out.println(numberOfSteps.getNumberOfSteps());
        System.out.println();

        //Check If Two String Arrays are Equivalent
        System.out.println("Check If Two String Arrays are Equivalent");
        String[] word1 = {"ab", "c"};
        String[] word2 = {"a", "bc"};
        CheckEquivalency checkEquivalency = new CheckEquivalency(word1, word2);
        System.out.println(checkEquivalency.check());
        System.out.println();

        //Sum of All Odd Length Sub Arrays
        System.out.println("Sum of All Odd Length Sub Arrays");
        int[] oddArr = {1, 2, 3, 4};
        OddSubArraySum sum = new OddSubArraySum(oddArr);
        System.out.println(sum.getSum());
        System.out.println();
    }
}