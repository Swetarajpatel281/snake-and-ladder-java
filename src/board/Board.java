package board;
import java.util.*;
import jumper.Jumper;
public class Board {
    int size;
    public String board[][];
     public HashMap<String,Jumper>jumper;
    
    public Board(int size, HashMap<String,Jumper>jumper){
        int count = 1;
        this.size = size;
        this.jumper = jumper;
        board = new String [size][size];

        for(int row = size -1; row>=0; row--) {
            if(row%2 ==0){
               
                for(int col = size-1; col>=0; col--){
                   
                    board[row][col]=count +"";
                    count++;
                }
            }
            else {
                for(int col = 0; col<size;col++){
                    board[row][col] = count+"";
                    count++;
                }

            }
        }
    }

    public void printboard(){
        for(int i=0;i<size;i++){
            for(int j=0; j<size;j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
    public int  getboardsize(){
       return this.size;
    }

}
