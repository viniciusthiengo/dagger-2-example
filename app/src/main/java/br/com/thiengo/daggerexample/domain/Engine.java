package br.com.thiengo.daggerexample.domain;

/**
 * Created by viniciusthiengo on 10/5/15.
 */
public class Engine {
    private int rpm;

    public Engine(){
        this.rpm = 0;
    }

    public int getRpm(){
        return rpm;
    }

    public void accelerate(int value){
        rpm = rpm + value;
    }

    public void brake(){
        rpm = 0;
    }
}
