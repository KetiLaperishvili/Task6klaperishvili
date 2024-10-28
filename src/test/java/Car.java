public class Car {
    private String model;
    private Integer year;
    private Double price;


    public Car(String model, int year, double price) {
        this.model = model;


        if (year >= 2000 && year <= 2024) {
            this.year = year;
        } else {
            this.year = null;
            System.out.println("Error: Year " + year + " is invalid. It must be between 2000 and 2024.");
        }


        if (price >= 0) {
            this.price = price;
        } else {
            this.price = null;
            System.out.println("Error: Price " + price + " is invalid. It cannot be negative.");
        }
    }


    public Car(String model) {
        this(model, 2020, 20000);
    }


    @Override
    public String toString() {
        return "Car(model=" + model + ", year=" + year + ", price=" + price + ")";
    }


    public static void main(String[] args) {
        Car car1 = new Car("Toyota", 2011, 10000);
        Car car2 = new Car("Ford", 2012, 12000);
        Car car3 = new Car("Honda");
        Car car4 = new Car("Opel", 2013, 13000);


        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
    }
}
