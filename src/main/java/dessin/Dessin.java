package dessin;

import Forme.Carre;
import Forme.Rond;
import Forme.Triangle;
import interfaces.Dessiner;

import java.util.ArrayList;
import java.util.List;

public class Dessin implements Dessiner {
    public Dessin() {
    }
    public List getFormList() {
        return formList;
    }
    public void setFormList(Object object) {
        this.formList.add(object);
    }
    protected List<Object> formList = new ArrayList<Object>();
    @Override
    public void dessiner() {
        for (Object item: formList
             ) {
            if (item instanceof Carre) System.out.println("je suis un carre");
            else if (item instanceof Rond) System.out.println("je suis un rond");
            else if (item instanceof Triangle) System.out.println("je suis un triangle");
            else System.out.println("je ne suis pas une forme");
        }
    }
}
