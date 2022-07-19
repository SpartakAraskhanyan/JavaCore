package homework.autoAm;

public class Car {

    private String model;
    private String brand;
    private double price;
    private CarType carType;
    private TransmissionType transmissionType;


    public Car(String model,String brand,double price,CarType carType,TransmissionType transmissionType){
        this.model = model;
        this.brand = brand;
        this.price = price;
        this.carType = carType;
        this.transmissionType = transmissionType;
    }



    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    public TransmissionType getTransmissionType() {
        return transmissionType;
    }

    public void setTransmissionType(TransmissionType transmissionType) {
        this.transmissionType = transmissionType;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", carType=" + carType +
                ", transmissionType=" + transmissionType +
                '}';
    }
}
