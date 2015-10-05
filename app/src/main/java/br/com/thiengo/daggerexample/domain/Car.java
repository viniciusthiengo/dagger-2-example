package br.com.thiengo.daggerexample.domain;

import javax.inject.Inject;

/**
 * Created by viniciusthiengo on 10/5/15.
 */
public class Car {
    public static final String SPEED = "br.com.thiengo.daggerexample.domain.Car.SPEED";

    @Inject Engine engine;


    @Inject
    public Car(){}
    /*public Car( Engine e){
        this.engine = e;
    }*/

    public void increaseSpeed(int value){
        engine.accelerate(value);
    }

    public void stop(){
        engine.brake();
    }

    public int getSpeed(){
        return engine.getRpm();
    }
}
