
package com.mycompany.webkauppa;

import com.mycompany.webkauppa.ohjaus.Komento;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LisaaOstoskoriinServlet extends WebKauppaServlet {

    @Override
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                
        long tuoteId = Long.parseLong( request.getParameter("tuoteId") );
                
        Komento lisays = this.komentotehdas.ostoksenLisaysKoriin(haeSessionOstoskori(request), tuoteId, this.varasto);
        lisays.suorita();
        
        naytaSivu("/Tuotelista", request, response);   
    }
}
