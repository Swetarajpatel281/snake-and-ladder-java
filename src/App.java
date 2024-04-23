import player.player;
import dice.dice;
import coordinates.coordinates;
import jumper.Jumper;
import java.util.HashMap;

import board.Board;
import game.Game;

public class App {
    public static void main(String[] args) throws Exception {
        HashMap<String,  Jumper> map= new HashMap<>();
        map.put("6", new Jumper(new coordinates(9, 5), new coordinates(6, 6)));
        map.put("98", new Jumper(new coordinates(3, 0), new coordinates(0, 2)));
        map.put("96", new Jumper(new coordinates(2, 6), new coordinates(0, 4)));
        map.put("78", new Jumper(new coordinates(8, 9), new coordinates(2, 2)));




          //print player details

        player p1 = new player();
        p1.setplayerInfoFromInput(p1);
        p1.getplayerdetail();
        player p2 = new player();
        p2.setplayerInfoFromInput(p2);
        p2.getplayername();
       
     //print dice outcomes.   
        // dice dice = new dice();
        // System.out.println(dice.dicedetail());

    //  print coordinates    
        // coordinates c = new coordinates(9, 3);
        // // System.out.println(c.printCoordinates());
        // coordinates d = new coordinates(7, 5);

//print player is jumping by ladder or snake.
        //  Jumper j = new Jumper(c, d) ;  
        //  System.out.println( j.getjumpername());  
         
// print board 

        Board b = new Board(10,map);
         b.printboard();

         Game game = new Game(b, new player[] {p1,p2}, new dice());
         game.play();
 }

  
}
