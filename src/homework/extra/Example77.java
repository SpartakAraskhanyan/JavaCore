package homework.extra;

public class Example77 {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            for (int j = 4; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <=i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        for (int k = 0; k < 4; k++) {
            for (int x = 0; x <= k ; x++) {
                System.out.print(" ");
            }
            for (int y = 4; y > k ; y--) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
