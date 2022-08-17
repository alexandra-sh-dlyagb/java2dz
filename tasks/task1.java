package tasks;

public class task1 {
    public static void main(String[] args) {
        String str = "aaaaaaaaaaabbbbbbbbcccccccddddddddddd";
        String helper_str = "aaaaaaaaaaabbbbbbbbcccccccddddddddddde";
        char [] my_new_array = helper_str.toCharArray();
        char value = my_new_array[0];
        int counter = 0;
        StringBuilder answer_string = new StringBuilder();

        for (int i = 0; i < my_new_array.length; i++){
            if (my_new_array[i] == value){
                counter++;
            }else{
                answer_string.append (value);
                answer_string.append (counter);
                value = my_new_array[i];
                counter = 1;
                }
        }
        System.out.println(answer_string.toString());
    }
}
