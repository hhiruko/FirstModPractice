package MainTasks;

public class BiggestOfThree {
    private final int a, b, c;

    public BiggestOfThree(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getBiggest(){
        int temp = a;

        if(b >= a && b >= c){
            temp = b;
        }
        else if(c >= a){
            temp = c;
        }
        return temp;
    }
}
