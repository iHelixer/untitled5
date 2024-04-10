import java.util.Random;

public class four {
    public static void main(String[] args) {

        Random random = new Random();
        int[] array = new int[15];

        System.out.println("Масив:");
        for (int i = 0; i < array.length; i++){
            array[i] = random.nextInt(11);
            System.out.print(array[i] + "");
        }

        int a =0;
        for (int b : array){
            if (b % 2 ==0){
                a++;
            }
        }

        System.out.println("\nКількість парних елементів:" + a);


    }

}
