// package week03.geometry;

public class Point {
    
    private float x;
    private float y;

    public Point(){
        // default constructor
        this.x = 0;
        this.y = 0;
    }

    public Point(float x, float y){
        this.x = x;
        this.y = y;
    }

    public Point(Point p){
        this.x = p.x;
        this.y = p.y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y){
        this.y = y;
    }

    public void translate(float dx, float dy){
        this.x += dx;
        this.y += dy;
    }

    public float distance(Point p){
        float dx = this.x - p.x;
        float dy = this.y - p.y;

        return (float) Math.sqrt(dx * dx + dy * dy);
    }

    @Override
    public String toString(){
        return "(" + this.x + ", " + this.y + ")";
    }
    

    @Override
    public boolean equals(Object obj){
        if (obj == this){
            return true;
        }
        if (!(obj instanceof Point)){
            return false;
        }

        // if (obj.getClass() != this.getClass()){
        //     return false;
        // }

        Point p = (Point) obj;
        return this.x == p.x && this.y == p.y;
    }

}
