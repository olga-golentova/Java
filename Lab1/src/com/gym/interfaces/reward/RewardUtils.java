package com.gym.interfaces.reward;

import com.gym.Sportsman;

import java.util.Objects;

public class RewardUtils {
    public static  Reward createReward(String name, Value value){


        return new Reward() {
            @Override
            public String getName() {
                return name;
            }

            @Override
            public Value getValue() {
                return value;
            }

            @Override
            public int hashCode() {
                return Objects.hash(name,value);
            }

            @Override
            public boolean equals(Object obj) {
                if (obj == null) return false;
                if (!(obj instanceof Reward)) return false;
                Reward that = (Reward) obj;
                if (this == that) return true;
                return name.equals(that.getName()) && value.equals(that.getValue());
            }
        };
    }
}
