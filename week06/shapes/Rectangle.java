public class Rectangle implements Cloneable, My2DInt {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getArea() {
        return width * (double) height;
    }
    
    public double getPerimeter() {
        return 2.0 * (width + height);
    }
    

    @Override
    public String toString() {
        return "Rectangle: [" + width + " " + height + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Rectangle)) {
            return false;
        }
        Rectangle r = (Rectangle) o;
        return this.width == r.width && this.height == r.height;
    }

    @Override
    protected Rectangle clone() {
        try {
            return (Rectangle) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(); // Shoauld never happen
        }
    }
}
