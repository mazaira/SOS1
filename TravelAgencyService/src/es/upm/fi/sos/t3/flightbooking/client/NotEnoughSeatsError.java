
/**
 * NotEnoughSeatsError.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package es.upm.fi.sos.t3.flightbooking.client;

public class NotEnoughSeatsError extends java.lang.Exception{

    private static final long serialVersionUID = 1395494051436L;
    
    private es.upm.fi.sos.t3.flightbooking.client.FlightBookingWSStub.NotEnoughSeatsErrorMessage faultMessage;

    
        public NotEnoughSeatsError() {
            super("NotEnoughSeatsError");
        }

        public NotEnoughSeatsError(java.lang.String s) {
           super(s);
        }

        public NotEnoughSeatsError(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public NotEnoughSeatsError(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(es.upm.fi.sos.t3.flightbooking.client.FlightBookingWSStub.NotEnoughSeatsErrorMessage msg){
       faultMessage = msg;
    }
    
    public es.upm.fi.sos.t3.flightbooking.client.FlightBookingWSStub.NotEnoughSeatsErrorMessage getFaultMessage(){
       return faultMessage;
    }
}
    