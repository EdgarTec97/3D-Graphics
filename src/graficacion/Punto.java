package graficacion;
public class Punto {
    int  x,y,xs,ys;

    public int getYs() {
        return ys;
    }

    public int getXs() {
        return xs;
    }


    public void setYs(int ys) {
        this.ys = ys;
    }
    public void setXs(int xs) {
        this.xs = xs;
    }

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }
    
}
