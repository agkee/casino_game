package game;

/**
 * @author Celine Murugi, Jeff Kim
 */

import Result.RouletteResult;
import Result.SlotResult;
import player.Bet;
import player.Player;
import winnings.SlotMachineWinning;

import java.util.HashMap;


public class PlaySlotMachine extends AbstractGame{


    /**
     * Constructor for slot machine. Calling it from the front end starts
     * the slot machine game
     */
    public PlaySlotMachine() {
        if (playerChosenValue == casinoChosenValue){
            CURRENT_MONEY = SlotMachineWinning.getReward();
        }
        else {
            CURRENT_MONEY = Bet.getBet() * -1;
        }
    }

    public SlotResult playSlotMachine() {
        SlotResult res = new SlotResult(0, 0, 0);

        return res;
    }


    /**
     * a getter method for the current money; to be passed
     * to the front end as the updated value
     * @return the value of the current amount of money
     */
    public int getCurrentMoney(){
        return CURRENT_MONEY;
    }


}
