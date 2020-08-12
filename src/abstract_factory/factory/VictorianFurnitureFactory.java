package abstract_factory.factory;

import abstract_factory.furniture.Chair;
import abstract_factory.furniture.Sofa;
import abstract_factory.furniture.VictorianChair;
import abstract_factory.furniture.VictorianSofa;

public class VictorianFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        System.out.println("Create victorian chair");
        return new VictorianChair();
    }

    @Override
    public Sofa createSofa() {
        System.out.println("Create victorian sofa");
        return new VictorianSofa();
    }
}
