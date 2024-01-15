import java.util.Random;

public class SuperZlikovac{

    public static int ID;

    public boolean imamKriptonita;
    public int id;
    public int koordinataX;
    public int koordinataY;

    Random randomKriptonit = new Random();
    Random xRandom = new Random();
    Random yRandom = new Random();

    public SuperZlikovac(){
        this.imamKriptonita = randomKriptonit.nextBoolean();
        this.id = ++ID;
        postaviKoordinate();
        Supercity.mapa[this.koordinataX][this.koordinataY] = this;
    }

    private void postaviKoordinate(){

        this.koordinataX = xRandom.nextInt(Supercity.BROJ_VRSTA);
        this.koordinataY = yRandom.nextInt(Supercity.BROJ_KOLONA);

        while(!validneKoordinate()){
            this.koordinataX = xRandom.nextInt(Supercity.BROJ_VRSTA);
            this.koordinataY = yRandom.nextInt(Supercity.BROJ_KOLONA);
        }
       
    }

    private boolean validneKoordinate(){
        return Supercity.mapa[this.koordinataX][this.koordinataY] == null;
    }

    public boolean getKriptonit(){
        return this.imamKriptonita;
    }

    public int getID(){
        return this.id;
    }

    public int getKoordinataX(){
        return this.koordinataX;
    }

    public int getKoordinataY(){
        return this.koordinataY;
    }

    @Override
    public String toString(){
        return "Zlikovac koji " + this.id + (this.getKriptonit() ? " ima " : " nema ") + " kriptonit.." + "\n";
    }
}