import java.util.Arrays;
import java.util.Random;

public class gyak {
    public static void main(String[] args) {


        Random random = new Random();
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            int randN = random.nextInt(1, 200);
            array[i] = randN;
        }
        System.out.println(Arrays.toString(array));

        System.out.println(minimum(array));

        System.out.println(paros(array));

        System.out.println(paratlan(array));

        }

    public static int minimum(int[]array){
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i]<min){
                min=array[i];
            }
        }
        return min;
    }
    public static int paros(int[] array){
        int paros = 0;

        for (int i = 0; i <array.length ; i++) {
            if (array[i]%2==0){
                paros++;
            }
        }
        return paros;

    }

    public static int paratlan(int[] array){
        int paratlan = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i]%2!=0){
                paratlan+=array[i];
            }
        }
        return paratlan;
    }



    }
