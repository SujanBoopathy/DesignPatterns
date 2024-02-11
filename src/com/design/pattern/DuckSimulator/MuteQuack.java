package com.design.pattern.DuckSimulator;

public class MuteQuack implements QuackBehaviour{
    public void quack(){
        System.out.println("I can't make sound , << Silence >>");
    }
}
