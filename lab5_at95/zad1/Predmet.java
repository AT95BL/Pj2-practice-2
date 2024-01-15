public abstract class Predmet{
    public static int ID;
    protected int id;
    protected double specificnaTezina;

    public Predmet(double specificnaTezina){
        this.specificnaTezina = specificnaTezina;
        this.id = ++ID;
    }

    public abstract void print();

    @Override
    public String toString(){
        return this.id + "\n" 
        + "Specificna tezina: " + this.specificnaTezina + "\n";
    }

    public abstract void read();

    public abstract double zapremina();

    public abstract double tezina();

    public abstract int poredjenje(Predmet p);
}