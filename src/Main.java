import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Employee employee = new Employee("Carmen", 35, 20000, "Manager");
        Intern intern = new Intern("Carmen", 35, 30000, "Manager");
        System.out.println(intern.getSalary());

        Employee employee1 = new Employee("Vicky", 28, 20000, "Cazadora de Yahnam");
        Employee employee2 = new Employee("Emma", 31, 20000, "Emperatríz del mal");
        Employee employee3 = new Employee("Ana", 35, 20000, "Manager");
        Employee employee4 = new Employee("Jose", 35, 20000, "Manager");
        Employee employee5 = new Employee("María", 35, 20000, "Manager");
        Employee employee6 = new Employee("Carmen", 35, 20000, "Manager");
        Employee employee7 = new Employee("Beatriz", 35, 20000, "Manager");
        Employee employee8 = new Employee("Carlos", 35, 20000, "Manager");
        Employee employee9 = new Employee("Eduardo", 35, 20000, "Manager");
        Employee employee10 = new Employee("Carmen", 35, 20000, "Manager");

        Employee[] employees = new Employee[]{};
        employees = new Employee[]{employee1, employee2, employee3, employee4, employee5, employee6, employee7,
        employee8, employee9, employee10};

        FileWriter fileWriter = new FileWriter("employees.txt", false);

        for (int i = 0; i < employees.length ; i++) {
            fileWriter.write(employees[i].getName());
            fileWriter.write(" ");
            fileWriter.write(String.valueOf(employees[i].getAge()));
            fileWriter.write(" ");
            fileWriter.write(String.valueOf(employees[i].getSalary()));
            fileWriter.write(" ");
            fileWriter.write(employees[i].getRol());
            fileWriter.write("\n");
            System.out.println(employees[i].getAge());

        }

        fileWriter.close();


    }
}
