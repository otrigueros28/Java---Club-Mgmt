package club.management.system;

public class PgaPro {
    private int id;
    private String name;
    private int salary;
    private int incomeEarned;

    public PgaPro(int id, String name, int salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.incomeEarned = 0;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }
    public void payPro(int salary){
        incomeEarned += salary;
        Club.updateExpenses(salary);
    }
}
