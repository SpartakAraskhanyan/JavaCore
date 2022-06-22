package homework.Arrays;


public class DynamicArrayDemo {
    public static void main(String[] args) {
        DynamicArray dynamicArray = new DynamicArray();
        dynamicArray.add(4);
        dynamicArray.add(5);
        dynamicArray.add(654);
        dynamicArray.add(9);
        dynamicArray.add(7);
        dynamicArray.add(10);
        dynamicArray.add(5);
        System.out.println(dynamicArray.isEmpty());
        System.out.println(dynamicArray.getByIndex(-5));
        System.out.println(dynamicArray.getFirstIndexByValue(5));
        dynamicArray.set(1, 3);
        dynamicArray.printArray();
        dynamicArray.add(2, 6);
        System.out.println();
        dynamicArray.delete(3);
        dynamicArray.printArray();

    }
}
