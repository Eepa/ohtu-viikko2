

package com.mycompany.webkauppa.ohjaus;

import com.mycompany.webkauppa.sovelluslogiikka.Ostoskori;


public class Komentotehdas {
    
    public Komento ostoksenLisaysKoriin(Ostoskori ostoskori, long tuoteid){
        return new OstoksenLisaysKoriin(ostoskori, tuoteid);
    }
    
     public Komento ostoksenPoistoKorista(Ostoskori ostoskori, long tuoteid){
        return new OstoksenPoistoKorista(ostoskori,  tuoteid);
    }
     
     public Komento ostoksenSuoritus(String nimi, String osoite, String luottokorttinumero, Ostoskori kori){
         return new OstoksenSuoritus(nimi, osoite, luottokorttinumero, kori);
     }
    
    
}
