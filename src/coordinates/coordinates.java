package coordinates;

public class coordinates {
int row;
int col;

public coordinates (int row, int col) {
    this.row = row;
    this.col = col;

}

public String printCoordinates(){
StringBuilder sb = new StringBuilder();
sb.append('[').append(this.row).append(',').append(this.col).append(']');
return sb.toString();
}
public int getrow(){
    return this.row;
}
public int getrcolValue(){
    return this.col;
}
}
