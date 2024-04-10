public class sec {
    public static void main(String[] args) {

        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }

        System.out.println("Початковий масив:");
        out(array);

        for (int i = 1; i < array.length; i += 2) {
            array[i] = 0;
        }

        System.out.println("\nОновлений масив:");
        out(array);
    }

    public static void out(int[] array) {
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println();

    }
}