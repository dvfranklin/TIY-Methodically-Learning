/**
 * The Dungeon class represents a dungeon the player can explore.
 */

public class Dungeon {

    /**
     * The name of the Dungeon.
     */
    private String dungeonName;

    /**
     * How many levels deep the Dungeon is.
     */
    private int dungeonLevels;


    /**
     * Constructor for a new Dungeon object.
     *
     * @param name The name of the Dungeon
     * @param levels How many levels are in the Dungeon.
     */
    public Dungeon(String name, int levels){
        this.dungeonName = name;
        this.dungeonLevels = levels;
    }

    /**
     * Returns a String describing the Dungeon object.
     *
     * @return The aforementioned String.
     */
    public String toString(){
        return "The " + this.dungeonName + " dungeon is " + this.dungeonLevels + " levels deep.";
    }

    /**
     * Getter for dungeonName
     *
     * @return The name of the Dungeon object
     */
    public String getDungeonName(){
        return this.dungeonName;
    }

    /**
     * Getter for dungeonLevels
     *
     * @return The number of levels in the Dungeon
     */
    public int getDungeonLevels(){
        return this.dungeonLevels;
    }

    /**
     * Setter for dungeonName
     * @param name The new name to assign to Dungeon
     */
    public void setDungeonName(String name){
        this.dungeonName = name;
    }

    /**
     * Setter for dungeonLevels
     *
     * @param levels The new number of levels to assign to Dungeon
     */
    public void setDungeonLevels(int levels){
        if(validDungeonLevels(levels)){
            this.dungeonLevels = levels;
        }
    }

    /**
     * Makes sure new value of Dungeon levels is positive before setting
     * @param levels Number of levels attempting to be passed to setter
     * @return True if valid, false if not
     */
    public boolean validDungeonLevels(int levels){
        if(levels > 0){
            return true;
        } else{
            return false;
        }
    }
}
