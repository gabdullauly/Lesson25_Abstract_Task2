public class DuracellBattery extends Battery{
    private double voltage;
    private double currency;
    private double energy;
    private double internalVoltage;

    public DuracellBattery(){}
    public DuracellBattery(double voltage, double currency, double energy, double internalVoltage){
        this.voltage = voltage;
        this.currency = currency;
        this.energy = energy;
        this.internalVoltage = internalVoltage;
    }

    public double getVoltage(){
        return voltage;
    }

    public double getCurrency(){
        return currency;
    }

    public double getEnergy(){
        return energy;
    }

    public double getInternalVoltage(){
        return internalVoltage;
    }

    public void setVoltage(double voltage){
        this.voltage = voltage;
    }

    public void setCurrency(double currency){
        this.currency = currency;
    }

    public void setEnergy(double energy){
        this.energy = energy;
    }

    public void setInternalVoltage(double internalVoltage){
        this.internalVoltage = internalVoltage;
    }

    @Override
    public double getPower(){
        return (2*voltage-currency)*energy+internalVoltage;
    }

    @Override
    public double getLifeTime() {
        return (3*voltage*currency)-energy+internalVoltage;
    }
}
