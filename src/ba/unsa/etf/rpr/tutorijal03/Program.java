package ba.unsa.etf.rpr.tutorijal03;

import java.util.Scanner;
import java.util.Set;

public class Program {
     private  Imenik imenik = new Imenik() ;
     private void naslovo(){
         Scanner citac = new Scanner(System.in);
         char slovo = (citac.next()).charAt(0);
         System.out.println( imenik.naSlovo(slovo));
     }
     private void izgradabrojevi(){
         System.out.println("Unesite grad:\n"+
                 "TRAVNIK\n"+ "ORASJE\n"+ "ZENICA\n"+ "SARAJEVO\n"+ "LIVNO\n"+
                 "TUZLA\n"+ "MOSTAR\n"+ "BIHAC\n"+ "GORAZDE\n"+ "SIROKIBRIJEG\n"+
                 "MRKONJICGRAD\n"+ "BANJALUKA\n"+ "PRIJEDOR\n"+ "DOBOJ\n"+
                 "SAMAC\n"+ "BIJELJINA\n"+ "ZVORNIK\n"+ "PALE\n"+"FOCA\n"+"TREBINJE\n");
         Scanner citac = new Scanner(System.in);
         String grad = citac.next();
         FiksniBroj.Grad grad1 = FiksniBroj.Grad.valueOf(grad);
         Set<TelefonskiBroj> brojevi = imenik.izGradaBrojevi(grad1);
         for(TelefonskiBroj element : brojevi){
             System.out.println(element.ispisi());
         }
     }
     private void izgrada(){
         System.out.println("Unesite grad:\n"+
                 "TRAVNIK\n"+ "ORASJE\n"+ "ZENICA\n"+ "SARAJEVO\n"+ "LIVNO\n"+
                 "TUZLA\n"+ "MOSTAR\n"+ "BIHAC\n"+ "GORAZDE\n"+ "SIROKIBRIJEG\n"+
                 "MRKONJICGRAD\n"+ "BANJALUKA\n"+ "PRIJEDOR\n"+ "DOBOJ\n"+
                 "SAMAC\n"+ "BIJELJINA\n"+ "ZVORNIK\n"+ "PALE\n"+"FOCA\n"+"TREBINJE\n");
         Scanner citac = new Scanner(System.in);
         String grad = citac.next();
         FiksniBroj.Grad grad1 = FiksniBroj.Grad.valueOf(grad);
         Set<String> names = imenik.izGrada(grad1);
         for(String element : names){
             System.out.println("--"+element);
         }
     }
    private void dodajfiks(){
        Scanner citac = new Scanner(System.in);
        System.out.println("Ime i prezime korisnika: ");

        String ime=citac.next();
        String prezime=citac.next();

        System.out.println("Unesite grad:\n"+
                "TRAVNIK\n"+ "ORASJE\n"+ "ZENICA\n"+ "SARAJEVO\n"+ "LIVNO\n"+
                "TUZLA\n"+ "MOSTAR\n"+ "BIHAC\n"+ "GORAZDE\n"+ "SIROKIBRIJEG\n"+
                "MRKONJICGRAD\n"+ "BANJALUKA\n"+ "PRIJEDOR\n"+ "DOBOJ\n"+
                "SAMAC\n"+ "BIJELJINA\n"+ "ZVORNIK\n"+ "PALE\n"+"FOCA\n"+"TREBINJE\n");

        String grad=citac.next();
        FiksniBroj.Grad grad1 = FiksniBroj.Grad.valueOf(grad);
        System.out.print("Unesite broj koji dolazi poslije pozivnog(123-456): ");
        String broj=citac.next();
        try {
            imenik.dodaj(ime + " " + prezime, new FiksniBroj(grad1, broj));
        }catch(IllegalArgumentException izuzetak) {
            System.out.println(izuzetak.getMessage());
        }
    }
    private void dodajmob(){
        Scanner citac = new Scanner(System.in);
        System.out.println("Ime i prezime korisnika: ");

        String ime=citac.next();
        String prezime=citac.next();

        System.out.println("Mreže:\n"+
                            "BH Mobile : 060, 061, 062\n"+
                            "ERONET : 063\n"+
                            "Haloo : 064\n"+
                            "mtel : 065, 066, 067(Izi mobil)\n");
        System.out.print("Unesite pozivni broj bez 0(primjer 61 za 061): ");
        int pozivni;
        pozivni = citac.nextInt();
        System.out.print("Unesite broj koji dolazi poslije pozivnog(123-456): ");
        String broj=citac.next();
        try {
            imenik.dodaj(ime + " " + prezime, new MobilniBroj(pozivni, broj));
        }catch(IllegalArgumentException izuzetak) {
            System.out.println(izuzetak.getMessage());
        }
    }

    public static void main(String[] args) {
       //imenik = new Imenik();
       Program aplikacija = new Program();
	   String commands="";
	   commands += "Sljedeće komande možete koristiti pri radu sa ETF imenikom:\n";
	   commands +="**dodajmob --> za dodavanje mobilnog broja u imenik\n";
	   commands +="**dodajfiks --> za dodavanje fiksnog broja u imenik\n";
	   commands +="**dodajmed --> za dodavanje međunarodnog broja u imenik\n";
	   commands +="**dajbroj --> za dohvaćanje broja nekog korisnika\n";
	   commands +="**izgrada --> za dohvaćanje korisnika jednog grada\n";
	   commands +="**izgradabrojevi --> za dohvaćanje brojeva korisnika iz jednog grada\n";
	   commands +="**naslovo --> za dohvaćanje korisnika čije ime počinje na slovo, i njihovih brojeva\n";
	   commands +="**dajime --> za dohvaćanje imena korisnika na osnovu broja\n";
	   commands +="**kraj --> izlaz iz programa\n";
	   String myCommand;
	   Scanner citac = new Scanner(System.in);
	   Vanjska:for(;;){
	       System.out.println(commands);
	       System.out.print("komanda: ");
	       myCommand = citac.next();
	       switch (myCommand){
               case "dodajmob":
                   aplikacija.dodajmob();
                   break;
               case "dodajfiks":
                   aplikacija.dodajfiks();
                   break;
               case "izgrada":
                   aplikacija.izgrada();
                   break;
               case "izgradabrojevi":
                   aplikacija.izgradabrojevi();
                   break;
               case "naslovo":
                   aplikacija.naslovo();
                   break;
               case "kraj":
                   break Vanjska;
               default:
                   break ;
           }

       }


    }
}
