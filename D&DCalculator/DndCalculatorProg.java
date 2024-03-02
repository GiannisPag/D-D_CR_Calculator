import java.util.Scanner;
import javax.swing.*;
/* Implements all packages bellow:
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel; 
*/
import java.awt.*;
/* Implements all packages bellow:
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; 
*/

public class DndCalculatorProg 
{    
    public static void main(String[] args)
    {
        InterfaceTest interfaceTest = new InterfaceTest();

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many players are in your party? ");
        int numberOfPlayers = scanner.nextInt();

        if(numberOfPlayers == 1) 
        {
            System.out.println("You have " + numberOfPlayers + " player in your party.");
        } else if (numberOfPlayers == 0)
        {
            System.out.println("You don't have any players in your party.");
        } else 
        {
            System.out.println("You have " + numberOfPlayers + " players in your party.");
        }

        Player[] playerClasses = new Player[numberOfPlayers];
        for (int x = 0; x<playerClasses.length; x++) 
        {
            System.out.println("Give me your race: ");
            String rRace = scanner.next(); 
            System.out.println("Give me your class: ");
            String subClass = scanner.next();    // next() does not skip the first iteration while nextLine() does.
            System.out.println("Give me your player level: ");
            int playerLevel = scanner.nextInt();
                        
            Player newPlayer = new Player(playerLevel, subClass, rRace);
            
            playerClasses[x] = newPlayer;
        }

        System.out.println("What difficulty do you want? ");
        System.out.println("A. Easy ");
        System.out.println("B. Medium ");
        System.out.println("C. Difficult ");
        System.out.println("D. Impossible ");
        String difficulty = scanner.next();
        
        // switch (difficulty) {
        //     case A:
                
        //         break;
        
        //     default:
        //         break;
        // }

        System.out.println("List of Players:");
        System.out.println("===========================\n");
        for (int x = 0; x<playerClasses.length; x++)
        {
            System.out.println("Player [" + x + "] Race" + playerClasses[x].getRace() + "Subclass: " + playerClasses[x].getSubClass() + ", Level: " + playerClasses[x].getLevel());
        }

        scanner.close(); 
    }
}