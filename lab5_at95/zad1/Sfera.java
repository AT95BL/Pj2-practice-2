import java.util.Scanner;

public class Sfera extends Predmet{
    protected double r;
    Scanner scanner = new Scanner(System.in);

    public Sfera(double r, double specificnaTezina){
        super(specificnaTezina);
        this.r = r;
    }

    @Override
    public void print(){
        System.out.println(this);
    }

    @Override
    public String toString(){
        return "Sfera " + super.toString() + "\n"
        + "r=" + this.r + "\n"
        + "Zapremina: " + this.zapremina() 
        + "\n";
    }

    @Override
    public void read(){
        System.out.println("r= ");
        try{
            this.r = scanner.nextDouble();
            if(r < 0 || r > 100){
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
        return (4.0/3)*Math.PI*Math.pow(this.r, 3);
    }

    @Override
    public double tezina(){
        return this.specificnaTezina * this.zapremina();
    }

    @Override 
    public int poredjenje(Predmet p){
        Sfera sfera = (Sfera)p;

        if(this.zapremina() == sfera.zapremina()){
            return 0;
        }
        else if(this.zapremina() < sfera.zapremina()){
            return -1;
        }
        else{
            return 1;
        }
    }
}