import interfaces.*;

import java.util.Random;

public class WonderWoman extends Superheroj implements SuperSnaga, SuperBrzina, SuperLetenje{

    Random xRandom = new Random();
    Random yRandom = new Random();

    public WonderWoman(String pravoImeSuperheroja) {
        super(pravoImeSuperheroja);
        postaviKoordinate();
        Supercity.mapa[this.koordinataX][this.koordinataY] = this;
    }
    
    private void postaviKoordinate() {
        this.koordinataX = xRandom.nextInt(Supercity.BROJ_VRSTA);
        this.koordinataY = yRandom.nextInt(Supercity.GRANICE_VAZDUH);
    
        while (!validneKoordinate()) {
            this.koordinataX = xRandom.nextInt(Supercity.BROJ_VRSTA);
            this.koordinataY = yRandom.nextInt(Supercity.GRANICE_VAZDUH);
        }
    }
    
    private boolean validneKoordinate() {
        return Supercity.mapa[this.koordinataX][this.koordinataY] == null &&
               this.koordinataY < Supercity.GRANICE_VAZDUH &&
               this.koordinataY > Supercity.GRANICE_ZEMLJA;
    }   

}