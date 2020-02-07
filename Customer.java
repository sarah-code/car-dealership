package cardealership;

public class Customer
{
    private String name;
    private int age;
    private String address;
    private double cashOnHand;
    private Employee emp;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        address += " Dealership City";
        this.address = address;
    }


    public Customer(String name, int age, String address, double cashOnHand) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.cashOnHand = cashOnHand;
    }

    public void purchaseCar(Vehicle vehicle, Employee employee, boolean finance)
    {

        emp.handleCustomer(this, finance, vehicle);
    }

    public double getCashOnHand() {
        return cashOnHand;
    }

    public void setCashOnHand(double cashOnHand) {
        this.cashOnHand = cashOnHand;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", cashOnHand=" + cashOnHand +
                ", emp=" + emp +
                '}';
    }
}
