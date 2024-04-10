public class third {
    public static void main(String[] args) {

        int[] array1 = new int[10];
        int[] array2 = new int[10];
        int[] array3 = new int[10];

        for (int i = 0; i < 10; i++){
            array1[i] = (int) (Math.random() * 11);
            array2[i] = (int) (Math.random() * 11);
        }

        for (int i = 0; i < 10; i++){
            array3[i] = array1[i] + array2[i];
        }

        System.out.println("Перший масив:");
        printArray(array1);
        System.out.println("Другий масив:");
        printArray(array2);
        System.out.println("Сума елементів:");
        printArray(array3);

    }

    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

}