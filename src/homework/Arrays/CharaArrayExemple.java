package homework.Arrays;

public class CharaArrayExemple {
    public static void main(String[] args) {
        char[] chars = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e'};
        char c = 'o';
        int count = 0;
        int i;
        for (i = 0; i < chars.length; i++) {
            if (chars[i] == c) {
                count++;
            }


        }
        System.out.print("count =" + count);

        System.out.println();

        char[] chars2 = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e'};
        int l = 0;
        int g = 0;

        l = (chars2.length - 1) / 2;


        g = chars2.length / 2;


        System.out.print("middle = " + chars2[l] + ", " + chars2[g]);

        System.out.println();

        char[] chars3 = {'j', 'a', 'v', 'a', 'l', 'o', 'l', 'y'};
        if (chars3[chars3.length - 1] == 'y' && chars3[chars3.length - 2] == 'l') {
            System.out.print(true);
        } else {
            System.out.print(false);
        }


        System.out.println();

        char[] bobArray = {'b', 'a', 'b', 'o', 'l', 'a'};
        boolean y = false;

        for (int j = 0; j < bobArray.length; j++) {
            if (bobArray[j] == 'b' && bobArray[j + 2] == 'b') {
                y = true;

            }
        }
        System.out.print(y);


        System.out.println();

        char[] text = {' ', ' ', 'b', 'a', 'r', 'e', 'v', ' ', ' '};
        for (int j = 0; j < text.length; j++) {
            if (text[j] != ' ') {
                System.out.print(text[j]);
            }
        }
    }
}
