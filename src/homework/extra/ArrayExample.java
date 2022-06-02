package homework.extra;

public class ArrayExample {

    public static void main(String[] args) {
        char[] chars3 = {'j', 'a', 'v', 'a', 'l', 'o', 'l', 'y'};
        char[] chars4 = new char[chars3.length];
        int index = 0;
        for (int i = chars3.length - 1; i >= 0; i--) {

            chars4[index] = chars3[i];
            index++;
        }


        for (int j = 0; j < chars4.length; j++) {
            System.out.print(chars4[j] + " ");


        }


    }
}
