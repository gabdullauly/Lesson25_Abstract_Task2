public class FlashLight {
    private Battery[] batteries;

    public FlashLight(){}
    public FlashLight(Battery[] batteries){
        this.batteries = batteries;
    }

    public Battery[] getBatteries(){
        return batteries;
    }

    public void setBatteries(Battery[] batteries){
        this.batteries = batteries;
    }

    public double getTotalPower(){
        double sum = 0;
        for (int i=0; i<batteries.length; i++){
            sum = sum + batteries[i].getPower();
        }
        return sum;
    }

    public double getTotalLifeTime(){
        double sum = 0;
        for (int i=0; i< batteries.length; i++){
            sum = sum + batteries[i].getLifeTime();
        }
        return sum;
    }

    public double getTotalEnergy(){
        return getTotalPower()*getTotalLifeTime();
    }
}
