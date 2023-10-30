import java.util.Arrays;
import java.util.Random;

class ArrayShuffler{
    public static void main(String[] args){

        int[] array = {1,2,3,4,5,6,7};
        Random r = new Random();
        //Fisher-yates shuffle algorithm
        // Start from the last element and swap one by one. We don't
        // need to run for the first element that's why i > 0
        for (int i = 6; i > 0; i--) {
            // Pick a random index from 0 to i
            int j = r.nextInt(i+1);
             
            // Swap arr[i] with the element at random index
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
        System.out.println("The suffled array is : " + Arrays.toString(array));
    }
}