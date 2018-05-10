package com.gym;

import com.gym.interfaces.Warmable;
import com.gym.interfaces.reward.Reward;

import java.util.List;

public abstract class ActiveSportsman extends Sportsman implements Warmable {
    private boolean isWarmedUp;

    public ActiveSportsman(int weight, int height, int age, String name, List<Reward> rewards) {
        super(weight, height, age, name, rewards);
    }

    @Override
    public boolean isWarmedUp() {
        return isWarmedUp;
    }

    @Override
    public final void warmUp() {
        if (isWarmedUp) {
            System.out.println("Is already warmed up!");
        } else {
            isWarmedUp = true;
            System.out.println(getWarmUpAction());
        }
    }
    protected abstract String getWarmUpAction();
}
