import gadgets.Arrows;

import java.util.Random;

public class GreenArrow extends Superheroj implements Arrows{

    Random xRandom = new Random();
    Random yRandom = new Random();

    public GreenArrow(String pravoImeSuperheroja) {
        super(pravoImeSuperheroja);
        postaviKoordinate();
        Supercity.mapa[this.koordinataX][this.koordinataY] = this;
    }
    
    private void postaviKoordinate() {
        this.koordinataX = xRandom.nextInt(Supercity.BROJ_VRSTA);
        this.koordinataY = yRandom.nextInt(Supercity.GRANICE_ZEMLJA);
    
        while (!validneKoordinate()) {
            this.koordinataX = xRandom.nextInt(Supercity.BROJ_VRSTA);
            this.koordinataY = yRandom.nextInt(Supercity.GRANICE_ZEMLJA);
        }
    }
    
    private boolean validneKoordinate() {
        return Supercity.mapa[this.koordinataX][this.koordinataY] == null &&
               this.koordinataY < Supercity.GRANICE_VAZDUH &&
               this.koordinataY > Supercity.GRANICE_VODA;
    }

}