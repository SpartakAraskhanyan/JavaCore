package homework.Arrays;

public class ArraySpaceExemple {
    public static void main(String[] args) {
        char[] spaceArray = {' ', 'c', 'a', 't', ' ', 'b', 'i', ' ', 'b', ' ', ' '};
        char[] spaceArray2 = new char[spaceArray.length];
        int a = 0;
        for (int i = 0; i < spaceArray.length; i++){

            if (spaceArray[i] == ' ') {

                a++;

            }
            if (spaceArray.length == ' ') {

                a--;
            }

        }
        for (int j = 0; j < spaceArray.length; j++) {
            spaceArray = spaceArray2;
            {
                System.out.print(spaceArray2[j]);
            }

        }
    }
}
