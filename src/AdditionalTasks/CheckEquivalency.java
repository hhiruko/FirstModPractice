package AdditionalTasks;

public class CheckEquivalency {
    private final String[] array1, array2;

    public CheckEquivalency(String[] array1, String[] array2) {
        this.array1 = array1;
        this.array2 = array2;
    }

    public boolean check(){
        String str1 = concatenate(array1);
        String str2 = concatenate(array2);

        return str1.equals(str2);
    }

    private String concatenate(String[] array){
        StringBuilder str = new StringBuilder();
        for (String s: array) {
            str.append(s);
        }
        return str.toString();
    }
}
