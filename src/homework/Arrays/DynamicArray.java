package homework.Arrays;

public class DynamicArray {

    private int[] array = new int[10];
    private int size = 0;

    public void add(int value) {
        if (array.length == size) {
            extend();
        }
        array[size++] = value;
    }

    public void printArray() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }

    private void extend() {
        int[] temp = new int[array.length + 10];
        for (int i = 0; i < array.length; i++) {
            temp[i] = array[i];
        }
        array = temp;
    }

    boolean isEmpty() {
        boolean y;
        if (size == 0) {
            return y = true;
        }
        return false;
    }

    int getByIndex(int index) {
        if (array.length < index || index < 0) {
            return 0;
        } else {
            return array[index];
        }

    }

    int getFirstIndexByValue(int value) {
        for (int i = 0; i < array.length; i++) {

            if (array[i] == value) {
                return i;
            }

        }
        return -1;

    }


    public void set(int index, int value) {
        array[index] = value;

    }

    public void add(int index, int value) {
        if (array.length == size) {
            extend();
        }
        for (int j = size; j > index - 1; j--) {
            array[j + 1] = array[j];
        }
        array[index] = value;
        size++;

    }

    public void delete(int index) {
        if (index >= 0 && index <= size) {

            for (int j = index; j < size; j++) {
                array[j] = array[j + 1];

            }
            size--;
        }else System.out.println("Error: ");


    }


}




