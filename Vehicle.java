package cardealership;

public class Vehicle {
    private int year;
    private String make;
    private String model;
    private boolean certified;
    private int odometer;
    private String colour;
    private boolean automatic;
    private int price;
    private String condition;

    public Vehicle(int year, String make, String model, Boolean certified, int odometer, String colour, boolean automatic, int price, String condition) {
        this.year = year;
        this.make = make;
        this.model = model;
        this.certified = certified;
        this.odometer = odometer;
        this.colour = colour;
        this.automatic = automatic;
        this.price = price;
        this.condition = condition;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean isCertified() {
        return certified;
    }

    public void setCertified(boolean certified) {
        this.certified = certified;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public boolean isAutomatic() {
        return automatic;
    }

    public void setAutomatic(boolean automatic) {
        this.automatic = automatic;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "year=" + year +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", certified=" + certified +
                ", odometer=" + odometer +
                ", colour='" + colour + '\'' +
                ", automatic=" + automatic +
                ", price=" + price +
                ", condition='" + condition + '\'' +
                '}';
    }
}
