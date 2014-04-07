
/**
 * NotValidSeatError.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package es.upm.fi.sos.t3.flightbooking.client;

public class NotValidSeatError extends java.lang.Exception{

    private static final long serialVersionUID = 1395494051424L;
    
    private es.upm.fi.sos.t3.flightbooking.client.FlightBookingWSStub.NotValidSeatErrorMessage faultMessage;

    
        public NotValidSeatError() {
            super("NotValidSeatError");
        }

        public NotValidSeatError(java.lang.String s) {
           super(s);
        }

        public NotValidSeatError(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public NotValidSeatError(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(es.upm.fi.sos.t3.flightbooking.client.FlightBookingWSStub.NotValidSeatErrorMessage msg){
       faultMessage = msg;
    }
    
    public es.upm.fi.sos.t3.flightbooking.client.FlightBookingWSStub.NotValidSeatErrorMessage getFaultMessage(){
       return faultMessage;
    }
}
    