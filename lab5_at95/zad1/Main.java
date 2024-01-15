public class Main{
    public static void main(String[] args){
        System.out.println("Testiranje funkcionalnosti klase Sfera: \n");
        Sfera sfera1 = new Sfera(3, 1.3);
        Sfera sfera2 = new Sfera(3, 1.3);
        Sfera sfera3  = new Sfera(4, 1.4);
        System.out.println(sfera1);
        System.out.println(sfera2);
        System.out.println(sfera3);
        System.out.println("Sfera1 vs Sfera 2: " + sfera1.poredjenje(sfera2));
        System.out.println("Sfera1 vs Sfera 3: " + sfera1.poredjenje(sfera3));
        sfera1.read();
        System.out.println(sfera1);

        System.out.println("Testiranje funkcionalnosti klase Kvadar: \n");
        Kvadar kvadar1 = new Kvadar(1, 2, 3);
        Kvadar kvadar2 = new Kvadar(2, 3, 4);
        Kvadar kvadar3 = new Kvada3(1, 2, 3);
        System.out.println(kvadar1);
        System.out.println(kvadar2);
        System.out.println(kvadar3);
        System.out.println("Kvadar1 vs Kvadar2: " + kvadar1.poredjenje(kvadar2));
        System.out.println("Kvadar1 vs Kvadar3: " + kvadar1.poredjenje(kvadar3));
        kvadar1.read();
        System.out.println(kvadar1);
    }
}