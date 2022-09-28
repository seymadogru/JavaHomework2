public class Main {
    public static void main(String[] args){
        Customer customer = new Customer();
        Employee employee = new Employee();
        employee.firstName ="Şeyma";
        customer.email="seymadogru37@gmail.com";

        CustomerManager customerManager = new CustomerManager();
        EmployeeManager employeeManager = new EmployeeManager();
        customerManager.Add();
        employeeManager.BestEmployee();
    }
}
