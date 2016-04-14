/**
 * The Enemy class represents a single enemy.
 */

public class Enemy {

    /**
     * Describes which type of Enemy this is.
     */
    private String enemyType;

    /**
     * The Enemy's current hit points.
     */
    private int enemyHealth;

    /**
     * Constructor for an Enemy.
     *
     * @param type What type of enemy
     * @param health The enemy's starting hit points
     */
    public Enemy(String type, int health){
        this.enemyType = type;
        this.enemyHealth = health;
    }


    /**
     * Returns a String describing the Enemy object.
     *
     * @return The aforementioned String.
     */
    public String toString(){
        return "The " + this.enemyType + " enemy has " + this.enemyHealth + " hit points.";
    }

    /**
     * Getter for enemyType
     *
     * @return The type of Enemy
     */
    public String getEnemyType(){
        return this.enemyType;
    }

    /**
     * Getter for enemyHealth
     *
     * @return The Enemy's hit points
     */
    public int getEnemyHealth(){
        return this.enemyHealth;
    }

    /**
     * Setter for enemyType
     *
     * @param type The new type to assign to Enemy
     */
    public void setEnemyType(String type){
        this.enemyType = type;
    }

    /**
     * Setter for enemyHealth
     *
     * @param health The new amount of health to assign to Enemy
     */
    public void setEnemyHealth(int health){
        this.enemyHealth = health;
    }
}
