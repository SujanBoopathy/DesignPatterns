package com.design.pattern.StarBuzz;

public class HouseBlend extends Beverage{
    public HouseBlend(){
        description = "HouseBlend";
    }
    @Override
    public double cost() {
        return 1.50;
    }
}
