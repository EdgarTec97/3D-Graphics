package graficacion;
public class Circulo {
    int diametro,origenx,origeny;
    int origenxs,origenys;
    

    public Circulo(int diametro, int origenx, int origeny) {
        this.diametro= diametro;
        this.origenx = origenx;
        this.origeny = origeny;
    }
        


    public int getOrigenys() {
        return origenys;
    }
    public int getOrigenxs() {
        return origenxs;
    }

    public void setOrigenys(int origenys) {
        this.origenys = origenys;
    }

    public void setOrigenxs(int origenxs) {
        this.origenxs = origenxs;
    }
    
    public void setDiametro(int diametro) {
        this.diametro = diametro;
    }
    public int getDiametro() {
        return diametro;
    }

    public void setOrigenx(int origenx) {
        this.origenx = origenx;
    }
    public int getOrigenx() {
        return origenx;
    }

    public void setOrigeny(int origeny) {
        this.origeny = origeny;
    }
    public int getOrigeny() {
        return origeny;
    }
    
}
