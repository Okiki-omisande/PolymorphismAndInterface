public class CommissionEmployee extends  Employee {
    private final double CommissionRate;
    private final double GrossSales;

    public CommissionEmployee(String firstname, String lastname, String socialSecurityNumber,
                              double CommissionRate, double GrossSales) {
        super(firstname, lastname, socialSecurityNumber);

        if (CommissionRate < 0.0 || CommissionRate >= 1.0)
            throw new IllegalArgumentException("rate should be 0.0 < commissionRate > 1.0");
        this.CommissionRate = CommissionRate;

        if (GrossSales < 0.0)
            throw new IllegalArgumentException("GrossSales should be greater than 0.0");
        this.GrossSales = GrossSales;
    }

    public double getCommissionRate() {
        return CommissionRate;
    }

    public double getGrossSales() {
        return GrossSales;
    }

    @Override
    public double getPayableAmount() {
        return CommissionRate * GrossSales;
    }
    @Override
    public String toString(){
        return String.format("%s:%n%n%s%s: %.2f%n%s: %.2f%n%s: $%.2f%n","Commissioned Employee",super.toString(),
                "Gross Sales",getGrossSales(),"Commission Rate",getCommissionRate(),"Earnings",getPayableAmount());
    }
}
