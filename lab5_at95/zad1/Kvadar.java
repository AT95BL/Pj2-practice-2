import java.util.Scanner;

public class Kvadar extends Predmet{
    protected double a;
    protected double b;
    protected double c;
    Scanner scanner = new Scanner(System.in);

    public Kvadar(double a, double b, double c, double specificnaTezina){
        super(specificnaTezina);
        this.a=a;
        this.b=b;
        this.c=c;
    }

    @Override
    public void print(){
        System.out.println(this);
    }

    @Override
    public String toString(){
        return "Kvadar " + super.toString() + "\n"
        + "a=" + this.a + "\n"
        + "b=" + this.b + "\n"
        + "c=" + this.c + "\n"
        + "Zapremina: " + this.zapremina() 
        + "\n";
    }

    @Override
    public void read(){
        System.out.println("a= ");
        try{
            this.a = scanner.nextDouble();
            if(a < 0 || a > 100){
                throw new IllegalArgumentException();
            }
        }catch(IllegalArgumentException ex){
            ex.printStackTrace();
        }
        System.out.println("b= ");
        try{
            this.b = scanner.nextDouble();
            if(b < 0 || b > 100){
                throw new IllegalArgumentException();
            }
        }catch(IllegalArgumentException ex){
            ex.printStackTrace();
        }
        System.out.println("c= ");
        try{
            this.c = scanner.nextDouble();
            if(c < 0 || c > 100){
                throw new IllegalArgumentException();
            }
        }catch(IllegalArgumentException ex){
            ex.printStackTrace();
        }
        System.out.println("specificna tezina= ");
        try{
            this.specificnaTezina = scanner.nextDouble();
            if(specificnaTezina < 0 || specificnaTezina > 100){
                throw new IllegalArgumentException();
            }
        }catch(IllegalArgumentException ex){
            ex.printStackTrace();
        }
    }

    @Override
    public double zapremina(){
        return a*b*c;
    }

    @Override
    public double tezina(){
        return this.specificnaTezina * this.zapremina();
    }

    @Override 
    public int poredjenje(Predmet p){
        Kvadar kvadar = (Kvadar)p;

        if(this.zapremina() == kvadar.zapremina()){
            return 0;
        }
        else if(this.zapremina() < kvadar.zapremina()){
            return -1;
        }
        else{
            return 1;
        }
    }
}