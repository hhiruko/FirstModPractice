package MainTasks;

public class ArrayOddCheck {
    private final int[] array;

    public ArrayOddCheck(int[] array) {
        this.array = array;
    }

    public void outputOdds(){
        for (int e: array) {
            if(e % 2 != 0){
                System.out.println(e);
            }
        }
    }

    public int arraySum(){
        int sum = 0;
        for (int e: array) {
            sum = sum + e;
        }
        return sum;
    }

    public int getSecondBiggest(){
        int temp = getBiggest();
        int second = 0;
        for (int e: array) {
            if(e == temp){
                break;
            }
            else if(e > second){
                second = e;
            }
        }
        return second;
    }

    private int getBiggest(){
        int temp = 0;
        for (int e: array) {
            if(e > temp){
                temp = e;
            }
        }
        return temp;
    }
}
