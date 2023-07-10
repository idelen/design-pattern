package FactoryMethod;

import FactoryMethod.framework.Factory;
import FactoryMethod.framework.Product;
import FactoryMethod.idcard.IDCardFactory;

public class FactoryMethodMain {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("Youngjin Kim");
        Product card2 = factory.create("Heungmin Son");
        Product card3 = factory.create("Kane");

        card1.use();
        card2.use();
        card3.use();
    }
}
