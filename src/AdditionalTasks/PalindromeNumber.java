package AdditionalTasks;

public class PalindromeNumber {

    public boolean isPalindrome(int n){
        int temp = n;
        int sum = 0, r = 0;
        while (temp > 0){
            r = temp % 10;

            sum = (sum * 10) + r;

            temp = temp/10;
        }

        return n == sum;
    }
}
