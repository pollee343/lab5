package сlasses;

public class Coordinates {
    private int x;
    private Float y;

    public  Coordinates(int x, Float y){
        this.x=x;
        this.y=y;
    }
    public int getX(){
        return x;
    }

    public Float getY() {
        return y;
    }

    public String toString(){
        return "Координаты X: " + x + " Y: " + y;
    }
}
