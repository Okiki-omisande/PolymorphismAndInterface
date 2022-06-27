public class hourlyEmployee extends Employee {
    private double hours;
    private double wages;

    public hourlyEmployee(String firstname, String lastname, String socialSecurityNumber,double hours,double wages) {
        super(firstname, lastname, socialSecurityNumber);

        if(hours < 0 || hours > 160)
            throw new IllegalArgumentException("hours should be between 0-160");
        this.hours =hours;

        if (wages < 0.0)
            throw new IllegalArgumentException("wages must be non-negative");
        this.wages = wages;
    }

    public void setHours(double hours){
        if(hours < 0 || hours > 160)
            throw new IllegalArgumentException("hours should be between 0-160");
        this.hours =hours;
    }

    public double getHours() {
        return hours;
    }

    public void setWages(double wages){
        if (wages < 0.0)
            throw new IllegalArgumentException("wages must be non-negative");
        this.wages = wages;
    }

    public double getWages() {
        return wages;
    }
@Override
    public double getPayableAmount(){
        if (hours <= 40)
            return getHours() * getWages() ;
        return (40 + ((hours - 40) / 2)) * getWages();
    }

    @Override
    public String toString(){
        return String.format("%s:%n%n%s%s: %.2f%n%s: $%.2f%n%s: $%.2f%n", "Hourly employee",super.toString(),"Hours",getHours(),"Wages",
                getWages(),"Earnings",getPayableAmount());
    }
}
