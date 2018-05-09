package com.gym;

import com.gym.interfaces.reward.Reward;

import java.util.List;
import java.util.Objects;

public class Chessplayer extends Sportsman  {



    public Chessplayer(int weight, int height, int age, String name, List<Reward> rewards) {
        super(weight, height, age, name, rewards);

    }

    public void exercise(){
        if(isWarmedUp()){

            System.out.println("The chess player " + this.getName() + " exercised by playing the game and improved his skill. We can't determine his improvements");
            }
        else {
            System.out.println("Go and warm up!Your brain still isn't working!");
        }
    };

    public void stretch(){
        System.out.println("The chess player " + this.getName() + " doesn't need to stretch, it hurts!!!!");
    };

    protected String getWarmUpAction(){
        return "Chess player " + this.getName() + " warmed up doing some math"  ;

    };

    public void setChesses(){
        System.out.println("I set my chesses");
    };

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Chessplayer chessplayer = (Chessplayer) o;
//        return Double.compare(c.distance, distance) == 0;
//    }
//
//    @Override
//    public int hashCode() {
//
//        return Objects.hash(distance);
//    }
}
