package cardealership;

public class Employee {
    private String name;
    private String senority;
    private String address;
    private int age;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSenority() {
        return senority;
    }

    public void setSenority(String senority) {
        this.senority = senority;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



    public Employee(String name, String senority, String address, int age) {
        this.name = name;
        this.senority = senority;
        this.address = address;
        this.age = age;
    }

    public void sellCar(Vehicle vehicle, Employee employee, boolean finance)
    {
        System.out.println(vehicle.toString() + " was from " );
    }

    public static void handleCustomer(Customer cust, boolean finance, Vehicle vehicle)
    {
        if(finance == true) {
            double loanAmount = vehicle.getPrice() - cust.getCashOnHand();
            runCreditHistory(cust, loanAmount);
        }
        else if (vehicle.getPrice() <= cust.getCashOnHand())
        {
            processTransaction(cust, vehicle);
        }
        else
        {
            System.out.println(" Customer will need more money to purchase vehicle: " + vehicle);
        }

    }

    private static void processTransaction(Customer cust, Vehicle vehicle) {
        System.out.println("Customer " + cust.getName() + " has bought a " + vehicle.getYear() + " " +vehicle.getMake() + " " +vehicle.getModel());
    }

    public static void runCreditHistory(Customer cust, double doubleAmount)
    {
        System.out.println("Ran credit history for customer "+ cust.getName());
        System.out.println("Your loan was approved. Amount " + doubleAmount);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", senority='" + senority + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                '}';
    }
}
