public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("Bom Dia!");
        for (int i = 0; i < 20; i++) {
            System.out.println("a");
        }
        for (int i = 0; i < 20; i++) {
            System.out.println("b");
            if (i == 10)
                System.out.println("PAAAAAAAAAAAAAAAAAAAIIIIIIIIIIN");
        }

        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = i;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(array[i]);
        }
    }
}
