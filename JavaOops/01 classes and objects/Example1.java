public class example1 {
    // Data Member
    private String brand;
    private String model;
    private int year;

    // Construcutor
    public example1 (String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Members Method 
    public void displayInfo() {
        System.out.println("Brand " + brand);
        System.out.println("Model " + model);
        System.out.println("Year " + year);
    }

    public static void main(String[] args) {
        example1 Car = new example1("Toyota", "Corolla", 2020);
        Car.displayInfo();
    }
}



