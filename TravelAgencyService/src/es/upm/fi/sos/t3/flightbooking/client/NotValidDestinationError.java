
/**
 * NotValidDestinationError.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package es.upm.fi.sos.t3.flightbooking.client;

public class NotValidDestinationError extends java.lang.Exception{

    private static final long serialVersionUID = 1395494051450L;
    
    private es.upm.fi.sos.t3.flightbooking.client.FlightBookingWSStub.NotValidDestinationErrorMessage faultMessage;

    
        public NotValidDestinationError() {
            super("NotValidDestinationError");
        }

        public NotValidDestinationError(java.lang.String s) {
           super(s);
        }

        public NotValidDestinationError(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public NotValidDestinationError(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(es.upm.fi.sos.t3.flightbooking.client.FlightBookingWSStub.NotValidDestinationErrorMessage msg){
       faultMessage = msg;
    }
    
    public es.upm.fi.sos.t3.flightbooking.client.FlightBookingWSStub.NotValidDestinationErrorMessage getFaultMessage(){
       return faultMessage;
    }
}
    