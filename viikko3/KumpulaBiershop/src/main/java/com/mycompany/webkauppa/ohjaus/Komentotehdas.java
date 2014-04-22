

package com.mycompany.webkauppa.ohjaus;

import com.mycompany.webkauppa.sovelluslogiikka.Ostoskori;
import com.mycompany.webkauppa.sovelluslogiikka.Varasto;


public class Komentotehdas {
    
    public Komento ostoksenLisaysKoriin(Ostoskori ostoskori, long tuoteid, Varasto varasto){
        return new OstoksenLisaysKoriin(ostoskori, tuoteid, varasto);
    }
    
     public Komento ostoksenPoistoKorista(Ostoskori ostoskori, long tuoteid, Varasto varasto){
        return new OstoksenPoistoKorista(ostoskori,  tuoteid, varasto);
    }
     
     public Komento ostoksenSuoritus(String nimi, String osoite, String luottokorttinumero, Ostoskori kori, Varasto varasto){
         return new OstoksenSuoritus(nimi, osoite, luottokorttinumero, kori, varasto);
     }
    
    
}
