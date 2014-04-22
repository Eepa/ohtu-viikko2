

package com.mycompany.webkauppa.ohjaus;

import com.mycompany.webkauppa.sovelluslogiikka.Ostoskori;
import com.mycompany.webkauppa.sovelluslogiikka.Varasto;
import com.mycompany.webkauppa.ulkoiset_rajapinnat.PankkiFasaadi;


public class Komentotehdas {
    
    public Komento ostoksenLisaysKoriin(Ostoskori ostoskori, long tuoteid, Varasto varasto){
        return new OstoksenLisaysKoriin(ostoskori, tuoteid, varasto);
    }
    
     public Komento ostoksenPoistoKorista(Ostoskori ostoskori, long tuoteid, Varasto varasto){
        return new OstoksenPoistoKorista(ostoskori,  tuoteid, varasto);
    }
     
     public Komento ostoksenSuoritus(String nimi, String osoite, String luottokorttinumero, Ostoskori kori, Varasto varasto, PankkiFasaadi pankki){
         return new OstoksenSuoritus(nimi, osoite, luottokorttinumero, kori, varasto, pankki);
     }
    
    
}
