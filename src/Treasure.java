/**
 * The Treasure class represents a piece of treasure.
 */

public class Treasure {

    /**
     * The name of the piece of Treasure.
     */
    private String treasureName;

    /**
     * How much gold the Treasure can be sold for.
     */
    private int treasureValue;


    /**
     * Constructor for a new Treasure object
     *
     * @param name The name of the Treasure.
     * @param value How much gold the Treasure is worth.
     */
    public Treasure(String name, int value){
        this.treasureName = name;
        this.treasureValue = value;
    }

    /**
     * Returns a String describing the Treasure object.
     *
     * @return The aforementioned String.
     */
    public String toString(){
        return "The " + this.treasureName + " is worth " + this.treasureValue + " gold pieces.";
    }

    /**
     * Getter for treasureName
     *
     * @return The name of the Treasure object
     */
    public String getTreasureName(){
        return this.treasureName;
    }

    /**
     * Getter for treasureValue
     *
     * @return The amount of gold the Treasure is worth
     */
    public int getTreasureValue(){
        return this.treasureValue;
    }

    /**
     * Setter for treasureName
     *
     * @param name The new name to assign to Treasure
     */
    public void setTreasureName(String name){
        this.treasureName = name;
    }

    /**
     * Setter for treasureValue
     *
     * @param value The new value to assign to Treasure
     */
    public void setTreasureValue(int value){
        this.treasureValue = value;
    }
}
