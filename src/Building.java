public class Building implements carbonFootPrint{
    private final double electricity;
    private final double naturalGas;
    private final double waterSupply;

    public Building(double electricity,double naturalGas, double waterSupply){
        if(electricity < 0.0)
            throw new IllegalArgumentException("electricity must be non-negative");
        this.electricity = electricity;

        if(naturalGas < 0.0)
            throw new IllegalArgumentException("naturalGas must be non-negative");
        this.naturalGas = naturalGas;

        if(waterSupply < 0.0)
            throw new IllegalArgumentException("waterSupply must be non-negative");
        this.waterSupply = waterSupply;
    }

    public double getElectricity() {
        return electricity;
    }

    public double getNaturalGas() {
        return naturalGas;
    }

    public double getWaterSupply() {
        return waterSupply;
    }

    @Override
    public double getCarbonFootPrint(){
        return ((getElectricity() * 0.21233) / 1000) + ((getNaturalGas() * 0.18316) / 1000) + ((getWaterSupply() * 0.149) / 1000);
    }

    @Override
    public String toString(){
        return String.format("%s%n%s: %.1f%n%s: %.1f%n%s: %.1f%n%s: %.3f tons of carbon%n","Building","electricity",getElectricity(),"naturalGas",
                getNaturalGas(),"waterSupply",getWaterSupply(),"carbonEmission",getCarbonFootPrint());
    }
}
