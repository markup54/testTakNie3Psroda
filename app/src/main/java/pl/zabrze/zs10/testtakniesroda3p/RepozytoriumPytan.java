package pl.zabrze.zs10.testtakniesroda3p;

import java.util.ArrayList;

public class RepozytoriumPytan {
    public static ArrayList<Pytanie> zwrocPytania(){
        ArrayList<Pytanie> pytania = new ArrayList<>();
        pytania.add(new Pytanie("Czy na Kasprowy Wierch można wjechać kolejką linową",
                true,
                R.drawable.kasprowy));
        pytania.add(new Pytanie("Czy w Bieszczadach jest szczyt o nazwie Świnica",
                false,
                R.drawable.swinica));
        pytania.add(new Pytanie("Czy w paśmie Orlej Perci jest Kozi Wierch",
                true,
                R.drawable.koziwierch));
        return pytania;
    }
}
