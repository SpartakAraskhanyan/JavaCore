package homework.Arrays;

public class ArrayExemple3 {

    public static void main(String[] args) {
        //Տպեք մասիվի ամենափոքրը թիվը

        int nums[] = {2,5,8,10,32,22,11,66,12,30};
        int j = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < j) {
                j = nums[i];
            }
        }

        System.out.println("min value" + " = " + j);

    }

}
