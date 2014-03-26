
/**
 * NotEnoughSeatsFlightError.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package es.upm.fi.sos.t3.travelagency.client;

public class NotEnoughSeatsFlightError extends java.lang.Exception{

    private static final long serialVersionUID = 1395494091215L;
    
    private es.upm.fi.sos.t3.travelagency.client.TravelAgencyWSStub.NotEnoughSeatsFlightErrorMessage faultMessage;

    
        public NotEnoughSeatsFlightError() {
            super("NotEnoughSeatsFlightError");
        }

        public NotEnoughSeatsFlightError(java.lang.String s) {
           super(s);
        }

        public NotEnoughSeatsFlightError(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public NotEnoughSeatsFlightError(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(es.upm.fi.sos.t3.travelagency.client.TravelAgencyWSStub.NotEnoughSeatsFlightErrorMessage msg){
       faultMessage = msg;
    }
    
    public es.upm.fi.sos.t3.travelagency.client.TravelAgencyWSStub.NotEnoughSeatsFlightErrorMessage getFaultMessage(){
       return faultMessage;
    }
}
    