package Gun2_Ders_OOP_1_ve_Odev.Inheritance;

public class Main {
    public static void main(String[] args){
        Customer customer = new Customer();
        Employee employee = new Employee();

        EmployeeManager employeeManager = new EmployeeManager();
        CustomerManager customerManager = new CustomerManager();

        employeeManager.bestEmployee();
    }
}
