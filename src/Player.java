/**
 * The Player class represents an individual player in the game.
 */

public class Player {

    /**
     * The name of the Player.
     */
    private String playerName;

    /**
     * The Player's current hit points.
     */
    private int playerHealth;

    /**
     * The Player's current mana points.
     */
    private int playerMana;

    /**
     * The amount of gold the Player currently has.
     */
    private int playerGold;

    /**
     * Constructor for a Player.
     *
     * @param name   The Player's name
     * @param health The Player's starting hit points
     * @param mana   The Player's starting mana points
     * @param gold   The Player's starting gold
     */
    public Player(String name, int health, int mana, int gold) {
        this.playerName = name;
        this.playerHealth = health;
        this.playerMana = mana;
        this.playerGold = gold;
    }

    /**
     * Returns a String describing the Player's current state.
     *
     * @return The aforementioned String.
     */
    public String toString() {
        return this.playerName + " has " + this.playerHealth + " hit points, " + this.playerMana + " mana points and " + playerGold + " gold.";
    }

    /**
     * Getter for playerName
     *
     * @return The Player's name
     */
    public String getPlayerName() {
        return this.playerName;
    }

    /**
     * Getter for playerHealth
     *
     * @return The Player's hit points
     */
    public int getPlayerHealth() {
        return this.playerHealth;
    }

    /**
     * Getter for playerMana
     *
     * @return The Player's mana points
     */
    public int getPlayerMana() {
        return this.playerMana;
    }

    /**
     * Getter for playerGold
     *
     * @return The Player's gold total
     */
    public int getPlayerGold(){
        return this.playerGold;
    }

    /**
     * Setter for playerName
     *
     * @param name The new name to assign to Player
     */
    public void setPlayerName(String name){
        this.playerName = name;
    }

    /**
     * Setter for playerHealth
     *
     * @param health The new amount of hit points to assign to Player
     */
    public void setPlayerHealth(int health) {
        if (validPlayerHealth(health)) {
            this.playerHealth = health;
        }
    }

    /**
     * Setter for playerMana
     *
     * @param mana The new amount of mana to assign to Player
     */
    public void setPlayerMana(int mana){
        this.playerMana = mana;
    }

    /**
     * Setter for playerGold
     *
     * @param gold The new amount of gold to assign to Player
     */
    public void setPlayerGold(int gold){
        this.playerGold = gold;
    }

    /**
     * Make sure Player health is valid before setting
     * @param health Integer attempting to be set as new health
     * @return True if valid, false if not
     */
    public boolean validPlayerHealth(int health){
        if(health > 0){
            return true;
        } else{
            return false;
        }
    }
}
