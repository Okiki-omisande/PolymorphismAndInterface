public class Car implements carbonFootPrint {
    private final double Kilometer;
    private final double amountOfTimesTravelled;

    public Car(double kilometer, double amountOfTimesTravelled){
        if(kilometer < 0.0)
            throw new IllegalArgumentException("kilometer must be non-negative");
        this.Kilometer = kilometer;

        if(amountOfTimesTravelled < 0.0)
            throw new IllegalArgumentException("amount of time travelled must be non-negative");
        this.amountOfTimesTravelled = amountOfTimesTravelled;
    }

    public double getKilometer() {
        return Kilometer;
    }

    public double getAmountOfTimesTravelled() {
        return amountOfTimesTravelled;
    }

    @Override
    public double getCarbonFootPrint() {
        return ((getKilometer() * getAmountOfTimesTravelled())* 0.22143) / 1000;
    }

    @Override
    public String toString(){
        return String.format("%s%n%s: %.1f%n%s: %.1f%n%s: %.3f tons of carbon%n","Car","kilometers",getKilometer(),"amountOfTimesTravelled",
                getAmountOfTimesTravelled(),"carbonEmission",getCarbonFootPrint());
    }
}
