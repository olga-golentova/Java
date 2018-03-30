package com.gym.interfaces.reward;

import java.util.List;

public interface Rewardable {
    void addReward(Reward reward);

    /**
     * Removes one reward
     *
     * @param reward which i want to remove
     * @throws NotFoundRewardException when no reward was found
     */
    void removeReward(Reward reward) throws NotFoundRewardException;

    List<Reward> getRewards();
}
