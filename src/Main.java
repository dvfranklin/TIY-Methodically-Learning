

public class Main {
    public static void main(String[] args){

        Display output = new Display();

        // Initialize two Player objects (name, health, mana, gold)
        Player playerOne = new Player("Mario", 100, 25, 0);
        Player playerTwo = new Player("Luigi", 70, 50, 0);

        // Initialize two Enemy objects (name, health)
        Enemy troll = new Enemy("cave troll", 40);
        Enemy shrek = new Enemy("ogre", 90);

        // Initialize two Treasure objects (name, value)
        Treasure ring = new Treasure("shiny golden ring", 50);
        Treasure amulet = new Treasure("crystal amulet", 100);

        // Initialize two Quest objects (name, gold reward, exp reward)
        Quest rescue = new Quest("Rescue Mission", 45, 250);
        Quest explore = new Quest("Explore Dungeon", 80, 150);

        // Initialize two Dungeon objects (name, number of levels)
        Dungeon castle = new Dungeon("Bowser's Castle", 4);
        Dungeon mausoleum = new Dungeon("The Mausoleum", 8);


        // Display the toString versions of each pair of objects
        output.printOutput(playerOne, playerTwo);
        output.printOutput(troll, shrek);
        output.printOutput(ring, amulet);
        output.printOutput(rescue, explore);
        output.printOutput(castle, mausoleum);


        // Mario transforms into Wario, who is apparently rich
        playerOne.setPlayerName("Wario");
        playerOne.setPlayerGold(100);

        // Cave troll moves to the forest and becomes stronger
        troll.setEnemyType("forest troll");
        troll.setEnemyHealth(60);

        // The amulet transforms into super valuable ruby
        amulet.setTreasureName("ruby amulet");
        amulet.setTreasureValue(200);

        // Change Quest location
        explore.setQuestName("Explore the Jungle");

        // The mausoleum gets deeper
        mausoleum.setDungeonLevels(10);

        System.out.println("And now, after some changes:");
        System.out.println();

        // Display the toString versions of each pair of objects
        output.printOutput(playerOne, playerTwo);
        output.printOutput(troll, shrek);
        output.printOutput(ring, amulet);
        output.printOutput(rescue, explore);
        output.printOutput(castle, mausoleum);

    }

}
