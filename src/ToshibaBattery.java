public class ToshibaBattery extends Battery{
    private double voltage;
    private double currency;
    private double energy;
    private double extraEnergy;

    public ToshibaBattery (){}
    public ToshibaBattery (double voltage, double currency, double energy, double extraEnergy){
        this.voltage = voltage;
        this.currency = currency;
        this.energy = energy;
        this.extraEnergy = extraEnergy;
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

    public double getExtraEnergy(){
        return extraEnergy;
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

    public void setExtraEnergy(double extraEnergy){
        this.extraEnergy = extraEnergy;
    }

    @Override
    public double getPower(){
        return (2*voltage-currency)*energy+extraEnergy;
    }

    @Override
    public double getLifeTime(){
        return (3*voltage*currency)-energy+extraEnergy;
    }
}
