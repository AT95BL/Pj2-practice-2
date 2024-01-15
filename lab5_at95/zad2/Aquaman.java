import interfaces.*;

import java.util.Random;

public class Aquaman extends Superheroj implements SuperSnaga, SuperBrzina, SuperKrozVodu{

    Random xRandom = new Random();
    Random yRandom = new Random();

    public Aquaman(String pravoImeSuperheroja) {
        super(pravoImeSuperheroja);
        postaviKoordinate();
        Supercity.mapa[this.koordinataX][this.koordinataY] = this;
    }
    
    private void postaviKoordinate() {
        this.koordinataX = xRandom.nextInt(Supercity.BROJ_VRSTA);
        this.koordinataY = yRandom.nextInt(Supercity.GRANICE_VODA);
    
        while (!validneKoordinate()) {
            this.koordinataX = xRandom.nextInt(Supercity.BROJ_VRSTA);
            this.koordinataY = yRandom.nextInt(Supercity.GRANICE_VODA);
        }
    }
    
    private boolean validneKoordinate() {
        return Supercity.mapa[this.koordinataX][this.koordinataY] == null &&
               this.koordinataY < Supercity.GRANICE_VODA;
    }
}