package club.management.system;

/**
 * class responsible for student members account
 * fees are membership fees for yr.
 * allow for setfeesTotal to be set because of addons to membership
 */
public class Student {
    private int id;
    private String name;
    private int handicap;
    private static int feesPaid;
    private static int feesTotal;


    public Student(int id, String name, int handicap){
        this.id = id;
        this.name = name;
        this.handicap = handicap;
        this.feesPaid= 0;
        this.feesTotal = 500000;

    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setHandicap(int handicap) {
        this.handicap = handicap;
    }

    public int getHandicap() {
        return handicap;
    }

    public static void updateFees(int newpayment) {
        feesPaid += newpayment;
        Club.updateTotalRevenue(newpayment);

    }

    public int getFeesPaid() {
        return feesPaid;
    }


    public void setFeesTotal(int feesTotal) {
        this.feesTotal = feesTotal;
    }
    public int getFeesTotal() {
        return feesTotal;
    }
}
