package com.gym;

import com.gym.interfaces.Pulseble;
import com.gym.interfaces.reward.Reward;

import java.util.List;
import java.util.Objects;

public class Runner extends Sportsman implements Training, Pulseble {

    public double distance;

    public Runner(int weight, int height, int age, String name, List<Reward> rewards, double distance) {
        super(weight, height, age, name, rewards);
        setDistance(distance);
    }

    public void setDistance(double newDistance){
        if (newDistance < 0 || newDistance > 500 )
            throw new IllegalArgumentException("Illegal distance");
        distance=newDistance;
    }

    public double getDistance(){
        return this.distance;
    }

/*
    public boolean warmUp(double distance){
        System.out.println("The runner" + this.getName() + "warmed up by running" + this.distance*0.1 );
        return true;
    };
*/
    public void exercise(double distance){
            if(isWarmedUp()){
        double newDistance = this.getDistance() +distance*0.01;
        System.out.println("The runner " + this.getName() + " exercised by running" + this.distance + "and improved his skill. Next time he can run" + newDistance);
        this.setDistance(newDistance);}
        else {
                System.out.println("Go and warm up!You can harm yourself!");
            }
    };

    public void stretch(){
        System.out.println("The runner " + this.getName() + " stretched and feels much better");
    };

    protected String getWarmUpAction(){
        return "The runner " + this.getName() + " warmed up by running" + this.distance*0.1 ;

    };

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Runner runner = (Runner) o;
        return Double.compare(runner.distance, distance) == 0;
    }

    @Override
    public int hashCode() {

        return Objects.hash(distance);
    }

    public  void checkPulse()
    {
        System.out.println("I checked my pulse");
    }
}
