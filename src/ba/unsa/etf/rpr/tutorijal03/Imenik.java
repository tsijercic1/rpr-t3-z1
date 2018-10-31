package ba.unsa.etf.rpr.tutorijal03;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.HashMap;

public class Imenik {

    private HashMap<TelefonskiBroj,String> brojKorisnik=new HashMap<>();

    public String dajBroj(String imePrezime) {

        for(TelefonskiBroj o:brojKorisnik.keySet()){
            if(brojKorisnik.get(o).equals(imePrezime))return o.ispisi();
        }
        return "Not found";
    }

    public void dodaj(String imePrezime, TelefonskiBroj broj) {
            brojKorisnik.put(broj,imePrezime);
    }

    public Set<String> izGrada(FiksniBroj.Grad nazivGrada) {
        Set<String> hash_Set = new HashSet<String>();
        return hash_Set;
    }

    public Set<TelefonskiBroj> izGradaBrojevi(FiksniBroj.Grad nazivGrada) {
        Set<TelefonskiBroj> hash_Set = new HashSet<TelefonskiBroj>();

        return hash_Set;
    }

    public String naSlovo(char s) {
        int brojac = 1;
        String formOutput = "";
        Iterator it = brojKorisnik.entrySet().iterator();

        while(it.hasNext()) {
            HashMap.Entry<TelefonskiBroj, String> pair = (HashMap.Entry<TelefonskiBroj, String>) it.next();
            if (pair.getValue().charAt(0) == s) {
                formOutput += brojac + ". " + pair.getValue() + " - " + pair.getKey().ispisi() + "\n";
                brojac++;
            }
        }

        return formOutput;

    }

    public String dajIme(TelefonskiBroj broj){
        return brojKorisnik.getOrDefault(broj, "Not found!");
    }
}
