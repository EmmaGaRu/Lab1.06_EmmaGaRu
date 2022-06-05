public class Intern extends Employee {

    private final int MAX_SALARY = 20000;
    public Intern(String name, int age, int salary, String rol) {
        super(name, age, salary, rol);
    }
    public void salaryMax(int salary) {
        if (salary > MAX_SALARY) {
        }
        System.out.println("Pasa el salario máximo");

        }

}

