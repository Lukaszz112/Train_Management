package TrainComposition.Locomotive;

import java.util.concurrent.atomic.AtomicInteger;

public class Locomotive{
    private final int numOfTrainCars;
    private final int numOfElectricTrainCars;
    private final double torsion;
    private final String name;
    private final String homeStation;
//    private String startingStation;
//    private String finalStation;
//    private double speed;
    private int uid;
    private static final AtomicInteger count = new AtomicInteger(0);

    public int getUid() {
        return uid;
    }
    public int getNumOfTrainCars() {
        return numOfTrainCars;
    }

    public int getNumOfElectricTrainCars() {
        return numOfElectricTrainCars;
    }

    public double getTorsion() {
        return torsion;
    }

    public Locomotive(
            String name,
            String homeStation,
            int numOfTrainCars,
            int numOfElectricTrainCars,
            double torsion
    ) {
        this.name = name;
        this.homeStation = homeStation;
        this.numOfElectricTrainCars = numOfElectricTrainCars;
        this.numOfTrainCars = numOfTrainCars;
        this.torsion = torsion;
        this.uid = count.incrementAndGet();
    }

    @Override
    public String toString() {
        return  "Uid: " + uid +
                ", maximum quantity of train cars: " + numOfTrainCars +
                ", maximum quantity of electric train cars: " + numOfElectricTrainCars +
                ", maximum weight of train cars: " + torsion +
                ", name: " + name;
    }
}