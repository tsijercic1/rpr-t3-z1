package ba.unsa.etf.rpr.tutorijal03;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.HashMap;

public class Imenik {

    private HashMap<String,TelefonskiBroj> brojKorisnik=new HashMap<>();

    public String dajBroj(String imePrezime) {
        return brojKorisnik.get(imePrezime).ispisi();
    }

    public void dodaj(String imePrezime, TelefonskiBroj broj) {
            brojKorisnik.put(imePrezime,broj);
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
        return  "";

    }

    public String dajIme(TelefonskiBroj broj){
        return "";
    }
}
