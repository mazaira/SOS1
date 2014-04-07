
/**
 * NotValidOriginError.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package es.upm.fi.sos.t3.flightbooking.client;

public class NotValidOriginError extends java.lang.Exception{

    private static final long serialVersionUID = 1395494051461L;
    
    private es.upm.fi.sos.t3.flightbooking.client.FlightBookingWSStub.NotValidOriginErrorMessage faultMessage;

    
        public NotValidOriginError() {
            super("NotValidOriginError");
        }

        public NotValidOriginError(java.lang.String s) {
           super(s);
        }

        public NotValidOriginError(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public NotValidOriginError(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(es.upm.fi.sos.t3.flightbooking.client.FlightBookingWSStub.NotValidOriginErrorMessage msg){
       faultMessage = msg;
    }
    
    public es.upm.fi.sos.t3.flightbooking.client.FlightBookingWSStub.NotValidOriginErrorMessage getFaultMessage(){
       return faultMessage;
    }
}
    