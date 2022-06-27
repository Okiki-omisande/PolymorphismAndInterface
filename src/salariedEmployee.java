public class salariedEmployee extends Employee{
private final double wages;

 public salariedEmployee(String firstname, String lastname, String socialSecurityNumber,double wages){
     super(firstname, lastname, socialSecurityNumber);
     if (wages < 0.0)
         throw new IllegalArgumentException("wages should be a non-negative");
     this.wages = wages;
 }

    public double getWages() {
        return wages;
    }

    @Override
    public double getPayableAmount() {
        return getWages();
    }

    @Override
    public String toString(){
        return String.format("%s:%n%n%s%s: $%.2f%n%s: $%.2f%n", "salaried employee",super.toString(),
                "Wages", getWages(),"Earnings",getPayableAmount());
    }
}
