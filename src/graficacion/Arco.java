package graficacion;
public class Arco {
    int x,y,altura,ancho;

    public Arco(int x, int y, int ancho, int altura) {
        this.x = x;
        this.y = y;
        this.altura = altura;
        this.ancho = ancho;
    }

    public int getAltura() {
        return altura;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getAncho() {
        return ancho;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
}