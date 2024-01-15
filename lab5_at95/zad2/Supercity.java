import java.util.ArrayList;
import java.util.Random;

public class Supercity{

    public static int BROJ_VRSTA=30;
    public static int BROJ_KOLONA=90;
    public static int GRANICE_VODA=29;
    public static int GRANICE_ZEMLJA=59;
    public static int GRANICE_VAZDUH=89;

    public static Object[][] mapa = new Object[BROJ_VRSTA][BROJ_KOLONA];

    public static void main(String[] args){

        ArrayList<Superheroj> superHeroji = new ArrayList<>();
        ArrayList<SuperZlikovac> superZlikovci = new ArrayList<>();
        Random random = new Random();
        int temporaryInt;
        boolean justiceLeaguesHasSavedTheWorld=true;
        

        // adding superheroes to the game ..
        System.out.println("Aquaman je u igri.. \n");
        superHeroji.add(new Aquaman("Arthur Curry"));

        temporaryInt = random.nextInt(2);
        if(temporaryInt == 0){
            System.out.println("Batman je u igri.. \n");
            superHeroji.add(new Batman("Bruce Wayne"));
        }
        else{
            System.out.println("Green Arrow je u igri..\n");
            superHeroji.add(new GreenArrow("Oliver Queen"));
        }

        temporaryInt = random.nextInt(3);
        if(temporaryInt == 0){
            System.out.println("Superman je u igri.. \n");
            superHeroji.add(new Superman("Clark Kent"));
        }
        else if(temporaryInt == 1){
            System.out.println("Supergirl je u igri.. \n");
            superHeroji.add(new Supergirl("Kara-Zor-EL"));
        }
        else{
            System.out.println("Wonder Woman je u igri.. \n");
            superHeroji.add(new Supergirl("Princess Diana of Themyscira"));
        }

        for(int i=0; i < 6; i++){
            superZlikovci.add(new SuperZlikovac());
            System.out.println(superZlikovci.get(i));
        }

        while(!superZlikovci.isEmpty()){

            SuperZlikovac zlikovac = superZlikovci.removeLast();

            if(zlikovac.getKoordinataY() <= GRANICE_VODA){
                System.out.println(zlikovac.getID() + " se nalazi u vodi, unistice ga Aquaman!!" + "\n");
                mapa[zlikovac.getKoordinataX()][zlikovac.getKoordinataY()]=null;
                for(var s:superHeroji){
                    if("Arthur Curry".equals(s.getPravoImeSuperheroja())){
                        s.setKoordinataX(zlikovac.getKoordinataX());
                        s.setKoordinataY(zlikovac.getKoordinataY());
                        break;
                    }
                }
            }
            else if(GRANICE_VODA < zlikovac.getKoordinataY() && zlikovac.getKoordinataY() <= GRANICE_ZEMLJA){
                for(var s:superHeroji){
                    if("Bruce Wayne".equals(s.getPravoImeSuperheroja())){
                        System.out.println(zlikovac.getID() + " se nalazi na zemlji, unistice ga Batman!!" + "\n");
                        mapa[zlikovac.getKoordinataX()][zlikovac.getKoordinataY()]=null;
                        s.setKoordinataX(zlikovac.getKoordinataX());
                        s.setKoordinataY(zlikovac.getKoordinataY());
                        break;
                    }
                    else if("Oliver Queen".equals(s.getPravoImeSuperheroja())){
                        System.out.println(zlikovac.getID() + " se nalazi na zemlji, unistice ga Green Arrow!!" + "\n");
                        mapa[zlikovac.getKoordinataX()][zlikovac.getKoordinataY()]=null;
                        s.setKoordinataX(zlikovac.getKoordinataX());
                        s.setKoordinataY(zlikovac.getKoordinataY());
                        break;
                    }
                }
            }
            else if(GRANICE_ZEMLJA < zlikovac.getKoordinataY() && zlikovac.getKoordinataY() <= GRANICE_VAZDUH){
                for(var s:superHeroji){
                    if("Clark Kent".equals(s.getPravoImeSuperheroja())){
                        if(zlikovac.getKriptonit()){
                            System.out.println("Superman je zavrsio u bolnici.." + "\n");
                            justiceLeaguesHasSavedTheWorld=false;
                            superHeroji.remove(s);
                            break;
                        }
                        else{
                            System.out.println(zlikovac.getID() + " se nalazi u vazduhu, unistice ga Superman!!" + "\n");
                            mapa[zlikovac.getKoordinataX()][zlikovac.getKoordinataY()]=null;
                            s.setKoordinataX(zlikovac.getKoordinataX());
                            s.setKoordinataY(zlikovac.getKoordinataY());
                            break;
                        }
                    }
                    else if("Kara-Zor-EL".equals(s.getPravoImeSuperheroja())){
                        if(zlikovac.getKriptonit()){
                            System.out.println("Supergirl je zavrsila u bolnici.." + "\n");
                            justiceLeaguesHasSavedTheWorld=false;
                            superHeroji.remove(s);
                            break;
                        }
                        else{
                            System.out.println(zlikovac.getID() + " se nalazi u vazduhu, unistice ga Supegirl!!" + "\n");
                            mapa[zlikovac.getKoordinataX()][zlikovac.getKoordinataY()]=null;
                            s.setKoordinataX(zlikovac.getKoordinataX());
                            s.setKoordinataY(zlikovac.getKoordinataY());
                            break;
                        }
                    }
                    else if("Princess Diana of Themyscira".equals(s.getPravoImeSuperheroja())){
                        System.out.println(zlikovac.getID() + " se nalazi u vazduhu, unistice ga WonderWoman!!" + "\n");
                            mapa[zlikovac.getKoordinataX()][zlikovac.getKoordinataY()]=null;
                            s.setKoordinataX(zlikovac.getKoordinataX());
                            s.setKoordinataY(zlikovac.getKoordinataY());
                            break;
                    }
                }
            }   
        }

        if(justiceLeaguesHasSavedTheWorld){
            System.out.println("Justice League has saved the world.. \n");
            superHeroji.clear();
            superZlikovci.clear();
        }
        else{
            System.out.println("Zlikovci su pobjedili ovoga puta.. \n");
            superHeroji.clear();
            superZlikovci.clear();
        }
    }
}