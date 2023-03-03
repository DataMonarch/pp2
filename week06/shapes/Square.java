public class Square extends Rectangle {

    public Square(int side) {
        super(side, side);
    }
    
    public int getSide() {
        return getWidth();
    }
    
    public void setSide(int side) {
        setWidth(side);
        setHeight(side);
    }

    
}
