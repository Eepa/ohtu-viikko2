

package com.mycompany.webkauppa.ohjaus;

import com.mycompany.webkauppa.ulkoiset_rajapinnat.PankkiFasaadi;

public interface Komento {
    
    public boolean suorita();

    public void setPankki(PankkiFasaadi hylkaavaPankki);

    
    
}
