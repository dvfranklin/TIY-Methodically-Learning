/**
 * The Quest class represents an individual quest in the game.
 */

public class Quest {

    /**
     * The name of the Quest.
     */
    private String questName;


    /**
     * How much gold the Player will earn for completing the Quest.
     */
    private int questGoldReward;

    /**
     * How much experience the Player will earn for completing the Quest.
     */
    private int questExpReward;


    /**
     * Constructor for a new Quest object.
     *
     * @param name The name of the Quest.
     * @param gold The gold reward for completing the Quest.
     * @param exp The experience reward for completing the Quest.
     */
    public Quest(String name, int gold, int exp){
        this.questName = name;
        this.questGoldReward = gold;
        this.questExpReward = exp;
    }

    /**
     * Returns a String describing the Quest object.
     *
     * @return The aforementioned String.
     */
    public String toString(){
        return "The " + this.questName + " quest rewards " + this.questGoldReward + " gold pieces and " + questExpReward + " experience.";
    }


    /**
     * Getter for questName
     *
     * @return The name of the Quest object
     */
    public String getQuestName(){
        return this.questName;
    }

    /**
     * Getter for questGoldReward
     *
     * @return The amount of gold awarded for completing the quest
     */
    public int getQuestGoldReward(){
        return this.questGoldReward;
    }


    /**
     * Getter for questExpReward
     *
     * @return The amount of experience awarded for completing the quest
     */
    public int getQuestExpReward(){
        return this.questExpReward;
    }

    /**
     * Setter for questName
     *
     * @param name The new name to assign to Quest
     */
    public void setQuestName(String name){
        this.questName = name;
    }

    /**
     * Setter for questGoldReward
     *
     * @param gold The new gold reward to assign to Quest
     */
    public void setQuestGoldReward(int gold){
        this.questGoldReward = gold;
    }

    /**
     * Setter for questExpReward
     *
     * @param exp The new experience reward to assign to Quest
     */
    public void setQuestExpReward(int exp){
        if(validExpReward(exp)) {
            this.questExpReward = exp;
        }
    }

    /**
     * Make sure Quest exp reward is valid
     * @param exp Tests for a positive value
     * @return True if valid, false if not
     */
    public boolean validExpReward(int exp){
        if(exp > 0){
            return true;
        } else {
            return false;
        }
    }
}
