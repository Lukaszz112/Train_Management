package TrainComposition.TrainCars.Abstract;

import TrainComposition.TrainCars.Exceptions.InvalidTypeOfGoodsException;
import TrainComposition.TrainCars.Exceptions.TooHeavyGoodsException;

import java.util.Objects;

public abstract class FreightCars extends TrainCar {
    private String sender;
    private TrainCarFreightType typeOfGoods;
    private double weightOfTheGoods = 0;

    public FreightCars(
            String security,
            double netWeight,
            double grossWeight,
            TrainCarFreightType typeOfGoods
    ) {
        super(
                security,
                netWeight,
                grossWeight
        );
        this.typeOfGoods = typeOfGoods;
    }

    public void addLoad(TrainCarFreightType typeOfGoods, double weightOfTheGoods, String sender){
        if(!Objects.equals(typeOfGoods, this.typeOfGoods)){
            throw new InvalidTypeOfGoodsException(
                    "This type of goods is not correct to current car! Choose another one."
            );
        }else if(getNetWeight() + this.weightOfTheGoods + weightOfTheGoods > getGrossWeight()){
            throw new TooHeavyGoodsException(
                    "These goods are too heavy for current car! Choose another one or remove some goods"
            );
        }else{
            this.weightOfTheGoods += weightOfTheGoods;
            this.sender = sender;
            System.out.println("Added successfully! Current car weight: " +
                    getNetWeight() +
                    this.weightOfTheGoods
            );
        }
    }
}