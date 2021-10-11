package entities;

public class Worker extends Human{
    protected int seniority;
    protected double salary;

    public Worker(String name, String surname, int age, boolean gender, String address,
                  int seniority, double salary) {
        super(name, surname, age, gender, address);
        this.seniority = seniority;
        this.salary = salary;
    }

    public int getSeniority() {
        return seniority;
    }

    public void setSeniority(int seniority) {
        this.seniority = seniority;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
