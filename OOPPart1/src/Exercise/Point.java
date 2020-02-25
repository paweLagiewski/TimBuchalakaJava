package Exercise;

public class Point {

    private int x;
    private int y;

    public Point(){

    }

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    public void setX(int x){
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance(){
        int x = 0;
        int y = 0;
        return (double)(distance(x,y));
//        return Math.sqrt((0-this.x)*(0-this.x) + (0-this.y)*(0-this.y));
    }

    public double distance(int x, int y){
        return (double)(Math.sqrt((x-this.x)*(x-this.x) + (y-this.y)*(y-this.y)));
    }

    public double distance(Point point) {
        return (double)(distance(point.x, point.y));
    }
}
