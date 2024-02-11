package com.design.pattern.DuckSimulator;

public class MallardDuck extends Duck{
    public MallardDuck(){
        quackBehaviour = new Quack();
        flyBehaviour = new FlyWithWings();
    }

    public void display(){
        System.out.println(" I am Mallard Duck ");
    }
}
