package cardealership;

public class Dealership {
    public static void demo()
    {
        var cust = new Customer("Tom", 28, "2772 Meadow Rd, Mississauga ON HQEWWQ", 8000);
        var jetta = new Vehicle(2000, "VW", "Jetta GLX", false, 183322, "black", true, 2700, "a bit rusty, but running");
        var bmw = new Vehicle(2020, "BMW", "i3", false, 0000021, "grey", true, 15000, "brand new");
        var employee = new Employee("Sarah", "Junior", "2763, Montevideo dr, Mississauga ON L62kjs", 26);
        cust.purchaseCar(bmw, employee, true);
        System.out.println(cust.toString());
        System.out.println(jetta.toString());
        System.out.println(employee.toString());





    }


}
