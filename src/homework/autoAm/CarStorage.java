package homework.autoAm;

import homework.students.model.Student;

public class CarStorage {
    private Car[] array = new Car[10];
    private int size = 0;


    private void extend() {
        Car[] temp = new Car[array.length + 10];
        for (int i = 0; i < array.length; i++) {
            temp[i] = array[i];
        }
        array = temp;
    }


    public void addCar(Car car) {
        if (array.length == size) {
            extend();
        }
        array[size++] = car;
    }
    public void printAllCar() {
        for (int i = 0; i < size; i++) {
            System.out.println(i + ". " + array[i]);
        }
    }
    public int getSize() {
        return size;
    }


    public Car getCarByIndex(int index) {
        if (index < 0 || index >= size) {

            return null;
        }
        return array[index];
    }

}
