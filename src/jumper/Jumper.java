package jumper;
import coordinates.coordinates;
public class Jumper {
 public coordinates start;
 public coordinates end;
 public String name;

public Jumper (coordinates start, coordinates end){
    this.start = start;
    this.end = end;
    if (start.getrow() > end.getrow()) this.name = "ladder";
    else this.name = "snake";
}
public String getjumpername(){
    return this.name;
}

}
