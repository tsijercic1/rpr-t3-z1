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
        Set<TelefonskiBroj> brojeviIzGrada = new HashSet<>();
        for(Map.Entry<String, TelefonskiBroj> element : brojKorisnik.entrySet()) {
            TelefonskiBroj broj = element.getValue();
            if (broj instanceof FiksniBroj){
                if(((FiksniBroj)broj).getGrad().equals(nazivGrada))brojeviIzGrada.add(element.getValue());
            }
        }
        return brojeviIzGrada;
    }

    public String naSlovo(char s) {
        int counter=1;
        String people = "";
        for(Map.Entry<String, TelefonskiBroj> element : brojKorisnik.entrySet()) {
            if( element.getKey().charAt(0)==s)people+=String.format("%d. %s - %s\n",counter,element.getKey(),element.getValue().ispisi());
        }
        return  people;
    }

    public String dajIme(TelefonskiBroj broj){
        return "";
    }
}
