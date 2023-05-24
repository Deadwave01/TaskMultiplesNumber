package vlad.firstblood;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        MultiplesNumber(14);
    }

    public static boolean MultiplesNumber(int number){
        if(number < 0 || number < 2){
            return false;
        } else {
            int sum = 0;
            int[] array = new int[number/2];
            for(int i = 2,a = 0; i <= number && a < array.length; i+=2,a++){
                array[a] = i;
                sum += i;
            }
            System.out.println(Arrays.toString(array) + "; " + sum);
            return true;
        }
    }
}
