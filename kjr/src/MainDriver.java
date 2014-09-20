import java.awt.Color;

import kareltherobot.Directions;
import kareltherobot.UrRobot;
import kareltherobot.World;

public class MainDriver implements Directions
{
    public static void main(String args[])  {
        UrRobot karel = new UrRobot(2, 1, North, 0);  
        karel.move();
        karel.move();
        karel.move();
        karel.move();
        karel.move();
        karel.move();
        karel.pickBeeper();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.turnOff();  
    } 

    static {
        World.reset(); 
        World.readWorld("first.kwld"); 
        World.setBeeperColor(Color.magenta);
        World.setStreetColor(Color.blue);
        World.setNeutroniumColor(Color.green.darker());
        World.setDelay(50);  
        World.setVisible(true);
    }
}
