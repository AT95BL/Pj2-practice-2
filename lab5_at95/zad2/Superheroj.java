public abstract class Superheroj{

    public String pravoImeSuperheroja;
    public int koordinataX;
    public int koordinataY;

    public Superheroj(String pravoImeSuperheroja){
        this.pravoImeSuperheroja = pravoImeSuperheroja;
    }

    public String getPravoImeSuperheroja(){
        return this.pravoImeSuperheroja;
    }

    public int getKoordinataX(){
        return this.koordinataX;
    }

    public void setKoordinataX(int koordinataX){
        this.koordinataX = koordinataX;
    }

    public int getKoordinataY(){
        return this.koordinataY;
    }

    public void setKoordinataY(int koordinataY){
        this.koordinataY = koordinataY;
    }

    @Override
    public String toString(){
        return "Pravo ime: " + this.pravoImeSuperheroja + "\n"
                + "Pozicija: (" + this.koordinataX + "," + this.koordinataY + ") \n";
    }
}