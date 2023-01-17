package club.management.system;
import java.util.List;

public class Club {
    private List<PgaPro> pgaPros;
    private List<Student> students;
    private static int totalRevenue;
    private static int totalExpenses;
    private static int netRevenue;


    public Club(List pgaPros, List students){
        this.pgaPros = pgaPros;
        this.students= students;
        totalExpenses = 0;
        totalRevenue = 0;
        netRevenue = 0;
    }

    public List<PgaPro> getPgaPros() {
        return pgaPros;
    }

    public void addPro(PgaPro pgaPro) {
       pgaPros.add(pgaPro);
    }


    public List<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }


    public static int getTotalRevenue() {
        return totalRevenue;
    }

    public static void updateTotalRevenue(int newRev) {
        totalRevenue += newRev;
    }


    public static int getTotalExpenses() {
        return totalExpenses;
    }
    public static void updateExpenses(int newExp) {
        totalExpenses += newExp;
    }

    public int getNetRevenue() {
        return netRevenue;
    }

    public static void updateNetRev() {
        netRevenue = getTotalRevenue()- getTotalExpenses();
    }
}
