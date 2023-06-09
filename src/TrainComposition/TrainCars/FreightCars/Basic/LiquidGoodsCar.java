package TrainComposition.TrainCars.FreightCars.Basic;

import TrainComposition.TrainCars.Abstract.FreightCars;
import TrainComposition.TrainCars.Abstract.TrainCarFreightType;
import TrainComposition.TrainCars.Interfaces.LiquidGoods;

public class LiquidGoodsCar extends FreightCars implements LiquidGoods {
    private final String liquidComposition;
    private final int trainCarCapacity;
    public LiquidGoodsCar(
            String security,
            String sender,
            double netWeight,
            double grossWeight,
            String liquidComposition,
            int trainCarCapacity
    ) {
        super(
                security,
                sender,
                netWeight,
                grossWeight,
                TrainCarFreightType.LIQUID_GOODS_CAR
        );

        this.liquidComposition = liquidComposition;
        this.trainCarCapacity = trainCarCapacity;
    }

    @Override
    public String toString() {
        return "Liquid goods car: " + super.toString() +
                ", liquid composition: " + liquidComposition +
                ", train car capacity: " + trainCarCapacity;
    }
}
