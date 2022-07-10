package AdditionalTasks;

public class OddSubArraySum {
    private final int[] array;

    public OddSubArraySum(int[] array) {
        this.array = array;
    }

    public int getSum(){
        int sum = 0;

        int l = array.length;

        // not sure why this works and how
        for(int i = 0; i < l; i++)
        {
            sum += (((i + 1) * (l - i) + 1) / 2) * array[i];
        }

        return sum;
    }
}
