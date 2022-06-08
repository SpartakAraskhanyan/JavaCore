package homework.bracechecker;

public class Stack {

    private int[] array = new int[10];
    private int size;

    public Stack() {
        size = -1;
    }

    public void push(int volue) {
        if (size == array.length) {
        } else {
            array[++size] = volue;
        }
    }

    public int pop() {
        if (size < 0) {
            return 0;
        } else {
            return array[size--];
        }
    }

}
