package com.gym;

import com.gym.interfaces.reward.Reward;

import java.util.List;

public abstract class PassiveSportsman extends Sportsman implements Training {
    public PassiveSportsman(int weight, int height, int age, String name, List<Reward> rewards) {
        super(weight, height, age, name, rewards);
    }
}
