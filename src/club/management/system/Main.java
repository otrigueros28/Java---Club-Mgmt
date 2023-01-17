package club.management.system;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        PgaPro rory = new PgaPro(21, "Rory", 10000 );
        PgaPro tiger = new PgaPro(1, "Tiger", 20000);
        PgaPro ricky = new PgaPro(33, "Ricky", 5000);

        List<PgaPro> prosList = new ArrayList<>();
        prosList.add(rory);
        prosList.add(tiger);
        prosList.add(ricky);


        Student trav = new Student(7, "Travis", 9);
        Student jesse = new Student(5, "Jesse", 15);
        Student jj = new Student(2, "Jj", 16);
        Student max = new Student(40, "Max", 4);
        Student alanah = new Student(97, "Alamah", 6);

        List<Student> clubMembers = new ArrayList<>();
        clubMembers.add(trav);
        clubMembers.add(jesse);
        clubMembers.add(jj);
        clubMembers.add( max);
        clubMembers.add(alanah);


        Club slocc = new Club(prosList, clubMembers);

        trav.updateFees(25000);
        jesse.updateFees(10000);
        jj.updateFees(30000);
        alanah.updateFees(25000);
        max.updateFees(-2000);

        tiger.payPro(tiger.getSalary());
        rory.payPro(rory.getSalary());
        ricky.payPro(ricky.getSalary());


        slocc.updateNetRev();
        System.out.println("SLO CC has earned $" + slocc.getTotalRevenue() + ".");
        System.out.println("SLO CC has paid $" + slocc.getTotalExpenses() + " in Salary.");
        System.out.println("SLO CC has paid Tiger $" + tiger.getSalary() + " in Salary.");
        System.out.println("SLO CC has received $" + alanah.getFeesPaid() + " from Alanah in Fees.");
        System.out.println("SLO CC has a Net Revenue of $" + slocc.getNetRevenue() + " for 2022.");


    }
}