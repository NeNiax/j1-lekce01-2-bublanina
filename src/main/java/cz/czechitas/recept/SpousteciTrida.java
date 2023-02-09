package cz.czechitas.recept;

import cz.czechitas.recept.naradi.*;
import cz.czechitas.recept.suroviny.*;

public class SpousteciTrida {

    public static void main(String[] args) {
        Miska cervenaMiska;
        Miska zlutaMiska;
        Mixer mixer;
        Vaha kuchynskaVaha;
        PlechNaPeceni plech;
        ElektrickaTrouba trouba;
        Vajicka vajicka;

        Ovoce ovoce;
        Maslo maslo125g;
        Mouka pytlikMouky;
        Cukr pytlikCukru;
        PrasekDoPeciva prasekDoPeciva;

        cervenaMiska = new Miska("cervenaMiska");
        zlutaMiska = new Miska("zlutaMiska");
        mixer = new Mixer("mixer");
        kuchynskaVaha = new Vaha("vaha");
        plech = new PlechNaPeceni("plech");
        trouba = new ElektrickaTrouba("trouba");

        vajicka = new Vajicka("vajicka");
        ovoce = new Ovoce("ovoce");
        maslo125g = new Maslo("maslo125g");
        pytlikMouky = new Mouka("pytlikMouky");
        pytlikCukru = new Cukr("pytlikCukru");
        prasekDoPeciva = new PrasekDoPeciva("prasekDoPeciva");

        //---------------------------------------------------------------------

        // TODO: Sem napiste recept na bublaninu
        // Pouzivejte napovidani v editoru.
        // Vyskakuje samo nebo pomoci Ctrl+Mezernik

        for (int i = 0; i < 4; i++) {
            cervenaMiska.nalozSiJedenKus(vajicka);      //1. Miska si 4x vloží vajíčko
        }
        cervenaMiska.nalozSiCelyObsah(pytlikCukru);     //2. Miska si přidá cukr
        mixer.zamichej(cervenaMiska);                   //3. Mixér to zamíchá
        cervenaMiska.nalozSiCelyObsah(maslo125g);       //4. Miska si přidá máslo
        mixer.zamichej(cervenaMiska);                   //5. Mixér to znovu zamíchá


        kuchynskaVaha.vynulujSeS(zlutaMiska);           //6. navážit 250g mouky, když máme 1kg pytlík
        while (kuchynskaVaha.zjistiHmotnost(zlutaMiska) != 250) {   // tzn. přisypat, odsypat....
            if (kuchynskaVaha.zjistiHmotnost(zlutaMiska) < 250) {
                zlutaMiska.nalozSiTrochu(pytlikMouky);
            } else {
                zlutaMiska.vylozSiTrochu();
            }
        }

        cervenaMiska.nalozSiObsahJineMisky(zlutaMiska);     //7. První miska si mouku přebere
        cervenaMiska.nalozSiCelyObsah(prasekDoPeciva);      //8. První miska si vezme prášek do pečiva
        mixer.zamichej(cervenaMiska);                       //9. Mixér to zamíchá
        plech.preberSiObsah(cervenaMiska);                  //10. Plech si přebere těsto z misky

        for (int i = 0; i < 50; i++) {                      //11. Plech se 50x opakovaně posype kousky ovoce
            plech.posypSeKusem(ovoce);
        }

        trouba.zapniSe(180);        //12. Trouba se zapne ...
        trouba.nechejPect(5);          //12. ... a třeba 5 minut bude péct naprázdno
        trouba.vlozSiDovnitr(plech);            //13. Trouba si vloží plech
        trouba.nechejPect(25);         //14. Trouba ho bude péct 25 minut
        trouba.vypniSe();                       //15. Trouba se zastaví
        trouba.vyndejObsahVen();                //16.  Trouba vyndá obsah ven a je hotovo :-)

    }

}



