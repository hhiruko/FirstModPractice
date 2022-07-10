package AdditionalTasks;

public class ShuffleString {
    private final String string;
    private final int[] indices;

    public ShuffleString(String string, int[] indices) {
        this.string = string;
        this.indices = indices;
    }

    public String shuffle(){
        StringBuilder str = new StringBuilder();
        str.setLength(string.length());
        int index = 0;
        for (char c: string.toCharArray()) {
            str.setCharAt(indices[index] - 1, c);
            index++;
        }
        return str.toString();
    }
}
