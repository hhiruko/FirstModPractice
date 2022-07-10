package MainTasks;

public class NumberCheck {
    private final int number;

    public NumberCheck(int number) {
        this.number = number;
    }

    public boolean isNegative(){
        return number < 0;
    }

    public boolean isPositive(){
        return number > 0;
    }
}
