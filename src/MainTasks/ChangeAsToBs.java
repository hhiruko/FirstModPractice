package MainTasks;

public class ChangeAsToBs {

    public ChangeAsToBs() {
    }

    public String change(String str){
        StringBuilder temp = new StringBuilder();

        for (char c: str.toCharArray()) {
            if(c == 'a'){
                temp.append('b');
            }
            else if(c == 'A'){
                temp.append('B');
            }
            else {
                temp.append(c);
            }
        }

        return temp.toString();
    }
}
