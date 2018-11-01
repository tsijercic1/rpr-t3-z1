package ba.unsa.etf.rpr.tutorijal03;

import java.util.*;

public class Imenik {

    private HashMap<String,TelefonskiBroj> brojKorisnik=new HashMap<>();

    public String dajBroj(String imePrezime) {
        return brojKorisnik.get(imePrezime).ispisi();
    }

    public void dodaj(String imePrezime, TelefonskiBroj broj) {
            brojKorisnik.putIfAbsent(imePrezime,broj);
    }

    public Set<String> izGrada(FiksniBroj.Grad nazivGrada) {
       Set<String> townPeople = new TreeSet<>();
       for(Map.Entry<String, TelefonskiBroj> element : brojKorisnik.entrySet()) {
           TelefonskiBroj broj = element.getValue();
           if (broj instanceof FiksniBroj){
               if(((FiksniBroj)broj).getGrad().equals(nazivGrada))townPeople.add(element.getKey());
           }
       }
       return townPeople;
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
