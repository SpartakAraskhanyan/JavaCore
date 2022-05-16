package homework.Arrays;

public class ArrayExample5 {
    public static void main(String[] args) {
        int numbers[] = {2,5,8,10,32,22,11,66,12,30};
        int x = 11;

        for (int i = 0; i < numbers.length; i++){
            if(x == numbers[i]){
                System.out.println(i);
            }
        }





    }
}
