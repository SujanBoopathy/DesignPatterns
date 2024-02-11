package com.design.pattern.DuckSimulator;

public class MiniDuckSimulator {
    public static void main(String args[]){
        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.performQuack();
        mallard.performFly();
        mallard.setFlyBehaviour(new FlyWithRocket());
        mallard.performFly();
    }
}
