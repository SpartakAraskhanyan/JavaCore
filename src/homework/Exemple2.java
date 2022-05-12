package homework;

public class Exemple2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }

            for (int k = 0; k < i; k++) {
                System.out.print(" *");
            }
            System.out.println();

        }
        for (int a = 1; a <= 5; a++) {
            for (int s = 1; s < a; s++) {
                System.out.print(" ");
            }
            for (int l = 5; l >= a; l--) {
                System.out.print(" *");
            }
            System.out.println();


        }


    }
}
