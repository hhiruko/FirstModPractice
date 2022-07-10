package AdditionalTasks;

import MainTasks.Calculator;

public class NumberOfSteps {
    private final int number;

    public NumberOfSteps(int number) {
        this.number = number;
    }

    public int getNumberOfSteps(){
        int count = 0;
        int n = number;

        while (n > 0){
            if(n % 2 == 0){
                n = divide(n);
                count++;
            }
            else {
                n = subtract(n);
                count++;
            }
        }

        return count;
    }

    private int subtract(int a){
        return a-1;
    }

    private int divide(int a){
        return a/2;
    }

}
