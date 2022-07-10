package MainTasks;

public class Calculator {
    private final int a;
    private final int b;

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int sum(){
        return a+b;
    }

    public int subtract(){
        return a-b;
    }

    public int multiply(){
        return a*b;
    }

    public double divide(){
        return (double) a/b;
    }

    public int remainder(){
        return a%b;
    }
}
