
/**
 * NotValidSeatFlightError.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package es.upm.fi.sos.t3.travelagency.client;

public class NotValidSeatFlightError extends java.lang.Exception{

    private static final long serialVersionUID = 1395494091259L;
    
    private es.upm.fi.sos.t3.travelagency.client.TravelAgencyWSStub.NotValidSeatFlightErrorMessage faultMessage;

    
        public NotValidSeatFlightError() {
            super("NotValidSeatFlightError");
        }

        public NotValidSeatFlightError(java.lang.String s) {
           super(s);
        }

        public NotValidSeatFlightError(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public NotValidSeatFlightError(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(es.upm.fi.sos.t3.travelagency.client.TravelAgencyWSStub.NotValidSeatFlightErrorMessage msg){
       faultMessage = msg;
    }
    
    public es.upm.fi.sos.t3.travelagency.client.TravelAgencyWSStub.NotValidSeatFlightErrorMessage getFaultMessage(){
       return faultMessage;
    }
}
    