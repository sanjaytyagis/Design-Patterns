package FlyWeightDesignPattern;
import java.util.*;

public class CounterStrike {

    private static String[] playerType =  {"Terrorist", "CounterTerrorist"};
    
    private static String[] weapons = {"AK-47", "Maverick", "Gut Knife", "Desert Eagle"};
    
    //get Player type randomly
    public static String getRandPlayerType()
    {
        Random r = new Random();
  
        int randInt = r.nextInt(playerType.length);
  
        return playerType[randInt];
    }
    
    //get Weapon type randomly
    public static String getRandWeapon()
    {
        Random r = new Random();
  
        int randInt = r.nextInt(weapons.length);
  
        return weapons[randInt];
    }
  
    public static void main(String args[])
    {
    	
        for (int i = 0; i < 10; i++)
        {
            Player p = PlayerFactory.getPlayer(getRandPlayerType());
  
            p.assignWeapon(getRandWeapon());
  
            p.mission();
        }
    }
}
