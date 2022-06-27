public class Bicycle implements carbonFootPrint {
    private final double CarbonExhaled;

    public Bicycle(double CarbonExhaled){
        if (CarbonExhaled < 0.0)
            throw new IllegalArgumentException("Carbon Exhaled must be non integers");
            this.CarbonExhaled = CarbonExhaled;
    }

    public double getCarbonExhaled() {
        return CarbonExhaled;
    }

    @Override
    public double getCarbonFootPrint(){
        return (getCarbonExhaled() * 0.1234) / 1000;
    }

    @Override
    public String toString(){
        return String.format("%s%n%s: %.1f%n%s: %.3f tons of carbon","Bicycle","CarbonExhaled", getCarbonExhaled(),"CarbonEmission",getCarbonFootPrint());
    }
}
