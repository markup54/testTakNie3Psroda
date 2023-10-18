package pl.zabrze.zs10.testtakniesroda3p;

import java.util.ArrayList;

public class RepozytoriumPytan {
    public static ArrayList<Pytanie> zwrocPytania(){
        ArrayList<Pytanie> pytania = new ArrayList<>();
        pytania.add(new Pytanie("Czy na Kasprowy Wierch można wjechać kolejką linową" ,
                true,
                R.drawable.kasprowy,
               "Na zdjęciu przedstawiono Kasprowy Wierch, widzisz tam kolejkę? Czy na Kasprowy Wierch można wjechać kolejką linową Czy na Kasprowy Wierch można wjechać kolejką linową Czy na Kasprowy Wierch można wjechać kolejką linową Czy na Kasprowy Wierch można wjechać kolejką linową Czy na Kasprowy Wierch można wjechać kolejką linową Czy na Kasprowy Wierch można wjechać kolejką linową Na zdjęciu przedstawiono Kasprowy Wierch, widzisz tam kolejkę? Na zdjęciu przedstawiono Kasprowy Wierch, widzisz tam kolejkę? Na zdjęciu przedstawiono Kasprowy Wierch, widzisz tam kolejkę? Na zdjęciu przedstawiono Kasprowy Wierch, widzisz tam kolejkę? Na zdjęciu przedstawiono Kasprowy Wierch, widzisz tam kolejkę? Na zdjęciu przedstawiono Kasprowy Wierch, widzisz tam kolejkę? Na zdjęciu przedstawiono Kasprowy Wierch, widzisz tam kolejkę?"));
        pytania.add(new Pytanie("Czy w Bieszczadach jest szczyt o nazwie Świnica",
                false,
                R.drawable.swinica,
        "Świnica jest szczytem niedaleko KAsprowego Wierchu"));
        pytania.add(new Pytanie("Czy w paśmie Orlej Perci jest Kozi Wierch",
                true,
                R.drawable.koziwierch));

        pytania.add(new Pytanie("Najwyższym szczytem Polski jest Giewont",
                false,
                R.drawable.rysy,
                "Najwyższy szczyt Polski znajduje się na Morskim Okiem"));

        return pytania;
    }
}
