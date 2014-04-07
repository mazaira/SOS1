
/**
 * NotValidHotelError.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package es.upm.fi.sos.t3.hotelbooking.client;

public class NotValidHotelError extends java.lang.Exception{

    private static final long serialVersionUID = 1395494059644L;
    
    private es.upm.fi.sos.t3.hotelbooking.client.HotelBookingWSStub.NotValidHotelErrorMessage faultMessage;

    
        public NotValidHotelError() {
            super("NotValidHotelError");
        }

        public NotValidHotelError(java.lang.String s) {
           super(s);
        }

        public NotValidHotelError(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public NotValidHotelError(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(es.upm.fi.sos.t3.hotelbooking.client.HotelBookingWSStub.NotValidHotelErrorMessage msg){
       faultMessage = msg;
    }
    
    public es.upm.fi.sos.t3.hotelbooking.client.HotelBookingWSStub.NotValidHotelErrorMessage getFaultMessage(){
       return faultMessage;
    }
}
    