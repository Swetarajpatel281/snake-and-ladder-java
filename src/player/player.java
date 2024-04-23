package player;
import java.util.*;
public class player {
    String name; 
    String contactNo;
    String emailId;
    String address;
    int age;

    public void setplayerDetail (String name, String contactNo, String emailId, String address, int age) {
      this.name = name;
      this.contactNo = contactNo;
      this.emailId = emailId;
      this.address = address;
      this.age = age;
    
    }

    public void setplayername (String name) {
        this.name = name;
    }
    public void getplayerdetail (){
        System.out.println("player name " + this.name );
        System.out.println("player contactNo " + this.contactNo );
        System.out.println("player emailId " + this.emailId );
        System.out.println("player address " + this.address);
        System.out.println("player age " + this.age );
        

    }
    public String getplayername (){
        System.out.println("player name"+ this.name);
        return this.name;
    }
    public void setplayerInfoFromInput(player p){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the player details:");
        System.out.println("Enter the player name");
        String name = scn. nextLine();
        System.out.println("Enter the player contactNo");
        String contactNo = scn.nextLine();
        System.out.println("Enter the player  emailId ");
        String emailId = scn.nextLine();
        System.out.println("Enter the player address");
        String address = scn.nextLine();
        System.out.println("Enter the player age");
        int age = scn.nextInt();
        p.setplayerDetail(name, contactNo, emailId, address, age);
      
    }

}
