
/**
 * NotValidCityHotelError.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package es.upm.fi.sos.t3.travelagency.client;

public class NotValidCityHotelError extends java.lang.Exception{

    private static final long serialVersionUID = 1395494091391L;
    
    private es.upm.fi.sos.t3.travelagency.client.TravelAgencyWSStub.NotValidCityHotelErrorMessage faultMessage;

    
        public NotValidCityHotelError() {
            super("NotValidCityHotelError");
        }

        public NotValidCityHotelError(java.lang.String s) {
           super(s);
        }

        public NotValidCityHotelError(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public NotValidCityHotelError(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(es.upm.fi.sos.t3.travelagency.client.TravelAgencyWSStub.NotValidCityHotelErrorMessage msg){
       faultMessage = msg;
    }
    
    public es.upm.fi.sos.t3.travelagency.client.TravelAgencyWSStub.NotValidCityHotelErrorMessage getFaultMessage(){
       return faultMessage;
    }
}
    