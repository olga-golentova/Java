package com.gym;

import com.gym.interfaces.Warmable;
import com.gym.interfaces.reward.NotFoundRewardException;
import com.gym.interfaces.reward.Reward;
import com.gym.interfaces.reward.Rewardable;

import java.lang.*;
import java.util.ArrayList;
import java.util.List;


public abstract class Sportsman implements Warmable, Rewardable {

    private int weight;
    private int height;
    private int age;
    private String name;
    private boolean isWarmedUp;
    private List<Reward> rewards;

    public Sportsman(int weight, int height, int age, String name, List<Reward> rewards) {
        setWeight(weight);
        setHeight(height);
        setAge(age);
        setName(name);
        this.rewards = new ArrayList<>(rewards);
    }

    public int getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setWeight(int newWeight) {
        if (newWeight < 0 || newWeight > 275 )
            throw new IllegalArgumentException("Illegal weight");
        weight = newWeight;
    }

    public void setHeight(int newHeight) {
        if (newHeight < 0 || newHeight > 300 )
            throw new IllegalArgumentException("Illegal height");
        height = newHeight;
    }

    public void setAge(int newAge) {
        if (newAge < 0 || newAge > 110)
            throw new IllegalArgumentException("Illegal age");
        age = newAge;
    }

    public void setName(String newName) {
        name = newName;
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

    @Override
    public void addReward(Reward reward) {
        if (reward == null)
            throw new NullPointerException();
        rewards.add(reward);
    }

    @Override
    public void removeReward(Reward reward) throws NotFoundRewardException {
        if (reward == null)
            throw new NullPointerException();
        if (rewards.contains(reward)) {
            rewards.remove(reward);
        }else {
            throw new NotFoundRewardException();
        }
    }

    @Override
    public List<Reward> getRewards() {
        return new ArrayList<>(rewards);
    }

    protected abstract String getWarmUpAction();

    public void getShower(){
    System.out.println("I got showered after training in a gym shower");
    }

    public void eat(){
        System.out.println("I ate a protein bar");
    }


}
