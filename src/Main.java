/*
2)Create an abstract class Battery.java with parameters:
Abstract Methods:
+ double getPower(); // Возвращает power в вт
+ double getLifeTime(); // Время жизни в с

Create a class ToshibaBattery.java that extends Battery.java class:
- double voltage; // Напряжение в Вольт
- double currency; // Сила тока в А
- double energy; // Общая энергия в Дж
- double extraEnergy; // Дополнительная энергия в Дж

Implement all abstract methods

Calculate power and lifetime by using voltage, currency and energy. Use formulas from physics.

Create a class DuracellBattery.java that extends Battery.java class:
- double voltage; // Напряжение в Вольт
- double currency; // Сила тока в А
- double energy; // Общая энергия в Дж
- double internalVoltage; // Внутреннее напряжение в Вольт. (E - epsilon)
Implement all abstract methods
Рассчитайте мощность и срок службы, используя напряжение, сила тока и энергию. Используйте формулы из физики.

Create a class FlashLight.java with parameters:
- Battery batteries[];
Constructors default and parameterized
Getters and Setters
+ double getTotalPower(); // This method returns total power of all batteries
+ double getTotalEnergy(): // This method returns total energy of all batteries
+ double getTotalLifeTime(); // This method returns lifetime of flashlight according to its batteries
You will calculate Total lifetime by dividing Total Energy into Total Power
In main class, create 5 objects of Toshiba batteries and 5 objects of Duracell batteries with different
parameters.
Create 3 objects of FlashLights with different parameters.
Print lifetimes of all flashlights.
Print data of flashlight with maximum lifetime value.
Print data of flashlight with maximum power value
 */

public class Main {
    public static void main (String[] args){
        ToshibaBattery tb1 = new ToshibaBattery(1.1, 2.1, 3.1, 1.5);
        ToshibaBattery tb2 = new ToshibaBattery(1.2, 2.2, 3.2, 1.6);
        ToshibaBattery tb3 = new ToshibaBattery(1.3, 2.3, 3.3, 1.7);
        ToshibaBattery tb4 = new ToshibaBattery(1.4, 2.4, 3.4, 1.8);
        ToshibaBattery tb5 = new ToshibaBattery(1.5, 2.5, 3.5, 1.9);

        DuracellBattery db1 = new DuracellBattery(1.5, 1.6, 2.5, 2.1);
        DuracellBattery db2 = new DuracellBattery(1.6, 1.7, 2.6, 2.2);
        DuracellBattery db3 = new DuracellBattery(1.7, 1.8, 2.7, 2.3);
        DuracellBattery db4 = new DuracellBattery(1.8, 1.9, 2.8, 2.4);
        DuracellBattery db5 = new DuracellBattery(1.9, 2.0, 2.9, 2.5);

        Battery[] batteries = {tb2, db2, tb1, db1, tb4, db4, tb5, db5, tb3, db3};

        FlashLight flashLight1 = new FlashLight(batteries);

        ToshibaBattery tb11 = new ToshibaBattery(1.5, 2.5, 2.5, 2.1);
        ToshibaBattery tb22 = new ToshibaBattery(1.6, 2.6, 2.6, 2.2);
        ToshibaBattery tb33 = new ToshibaBattery(1.7, 2.7, 2.7, 2.3);
        ToshibaBattery tb44 = new ToshibaBattery(1.8, 2.8, 2.8, 2.4);
        ToshibaBattery tb55 = new ToshibaBattery(1.9, 2.9, 2.9, 2.5);

        DuracellBattery db11 = new DuracellBattery(1.7, 1.5, 3.1, 2.1);
        DuracellBattery db22 = new DuracellBattery(1.8, 1.6, 3.2, 2.2);
        DuracellBattery db33 = new DuracellBattery(1.9, 1.9, 3.3, 2.3);
        DuracellBattery db44 = new DuracellBattery(2.0, 2.0, 3.4, 2.4);
        DuracellBattery db55 = new DuracellBattery(2.1, 2.1, 3.5, 2.5);

        Battery[] batteries1 = {tb22, db22, tb11, db11, tb44, db44, tb55, db55, tb33, db33};

        FlashLight flashLight2 = new FlashLight(batteries1);

        ToshibaBattery tb111 = new ToshibaBattery(2.1, 2.1, 2.5, 3.0);
        ToshibaBattery tb222 = new ToshibaBattery(2.2, 2.2, 2.6, 3.1);
        ToshibaBattery tb333 = new ToshibaBattery(2.3, 2.3, 2.7, 3.2);
        ToshibaBattery tb444 = new ToshibaBattery(2.4, 2.4, 2.8, 3.3);
        ToshibaBattery tb555 = new ToshibaBattery(2.5, 2.5, 2.9, 3.4);

        DuracellBattery db111 = new DuracellBattery(1.1, 2.2, 2.5, 3.0);
        DuracellBattery db222 = new DuracellBattery(1.2, 2.2, 2.6, 3.1);
        DuracellBattery db333 = new DuracellBattery(1.3, 2.3, 2.7, 3.2);
        DuracellBattery db444 = new DuracellBattery(1.4, 2.4, 2.8, 3.3);
        DuracellBattery db555 = new DuracellBattery(1.5, 2.5, 2.9, 3.4);

        Battery[] batteries2 = {tb222, db222, tb111, db111, tb444, db444, tb555, db555, tb333, db333};

        FlashLight flashLight3 = new FlashLight(batteries2);

        FlashLight[] flashLights = {flashLight1, flashLight2, flashLight3};

        for (int i=0; i< flashLights.length; i++){
            System.out.println(flashLights[i].getTotalLifeTime());
            }

        System.out.println();

        double max = Integer.MIN_VALUE;
        int index = 0;
        for (int i=0; i< flashLights.length; i++){
            if(flashLights[i].getTotalLifeTime()>max){
                max = flashLights[i].getTotalLifeTime();
                index = i;
            }
        }

        System.out.println(flashLights[index].getTotalLifeTime());
        System.out.println();

        double max1 = Integer.MIN_VALUE;
        FlashLight maxLights = null;
        for (int i=0; i< flashLights.length; i++){
            if(flashLights[i].getTotalPower()>max1){
                max1 = flashLights[i].getTotalPower();
                maxLights = flashLights[i];
            }
        }

        System.out.println(maxLights.getTotalPower());
    }
}
