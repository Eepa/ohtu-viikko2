package com.mycompany.webkauppa.ohjaus;

import com.mycompany.webkauppa.sovelluslogiikka.Ostoskori;
import com.mycompany.webkauppa.sovelluslogiikka.Tuote;
import com.mycompany.webkauppa.sovelluslogiikka.Varasto;
import com.mycompany.webkauppa.ulkoiset_rajapinnat.PankkiFasaadi;

public class OstoksenLisaysKoriin implements Komento{

    private Ostoskori ostoskori;
    private long tuoteId;
    private Varasto varasto;

    OstoksenLisaysKoriin(Ostoskori ostoskori, long tuoteId, Varasto varasto) {
        this.ostoskori = ostoskori;
        this.tuoteId = tuoteId;
        this.varasto = varasto;
    }

    @Override
    public boolean suorita() {
        boolean saatiinTuote = varasto.otaVarastosta(tuoteId);
        
        if (!saatiinTuote) {
            return false;
        }
       
        Tuote tuote = varasto.etsiTuote(tuoteId);                      
        ostoskori.lisaaTuote(tuote);                
        return true;
    }

    @Override
    public void setPankki(PankkiFasaadi hylkaavaPankki) {
        
    }
}
