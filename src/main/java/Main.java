import Forme.Carre;
import Forme.Rond;
import Forme.Triangle;
import dessin.Dessin;

public class Main {
    public static void main(String[] args) {
        Dessin dessin = new Dessin();
        Carre carre = new Carre();
        Rond rond = new Rond();
        Triangle triangle = new Triangle();
        dessin.setFormList(carre);
        dessin.setFormList(rond);
        dessin.setFormList(triangle);
        dessin.dessiner();




    }
}
