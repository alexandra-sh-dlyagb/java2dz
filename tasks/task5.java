//2?+5? = 7?
package tasks;

import java.util.Arrays;

public class task5 {
    public static void main(String[] args) {
        int N = 3; //кол-во элементов в массиве
        int k = 10;//значения элементов не превышают k
        int [] arrays = new int [N];
        generateCombination(arrays, 0, k);
        System.out.println("-----------------------------------");
        System.out.println("были перечислены все возможные комбинации из 3 цифр");
        System.out.println("Давайте найдем нужную нам");
        check(arrays);

    } 

    private static void generateCombination(int[] arrays, int index, int k){
        if (index == arrays.length){
            System.out.println(Arrays.toString(arrays));
            return;
        }
        for (int i = 0; i<k; i++){
            arrays[index] = i;
            generateCombination(arrays, index+1, k);
        } 
    }

    private static void check(int[] arrays ){
        if (arrays[0] + arrays[1] == arrays[2]){
            System.out.printf("d% + d% = d%", arrays[0], arrays[1], arrays[2]);
        }
    }
    
}
