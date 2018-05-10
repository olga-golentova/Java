package com.gym;
import com.gym.interfaces.reward.Reward;
import com.gym.interfaces.reward.RewardUtils;
import com.gym.interfaces.reward.Value;
import com.sun.istack.internal.NotNull;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Runner run1 =new Runner(75, 180, 30, "Sam"
                , new ArrayList<Reward>(),  0.8);
        run1.exercise();
        run1.warmUp();
        run1.exercise();
       // run1.stretch();
        run1.addReward(RewardUtils.createReward("National",Value.GOLD))  ;
        System.out.println(run1.getRewards());
       // run1.removeReward(RewardUtils.createReward("National",Value.GOLD)) ;

        Chessplayer cp1 = new Chessplayer(90,175,33,"John", new ArrayList<>());
        cp1.exercise();
      //  cp1.warmUp();
      //  cp1.stretch();
        cp1.addReward(RewardUtils.createReward("International",Value.SILVER));



    }
}

