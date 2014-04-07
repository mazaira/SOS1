
/**
 * NotEnoughRoomsError.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package es.upm.fi.sos.t3.hotelbooking.client;

public class NotEnoughRoomsError extends java.lang.Exception{

    private static final long serialVersionUID = 1395494059656L;
    
    private es.upm.fi.sos.t3.hotelbooking.client.HotelBookingWSStub.NotEnoughRoomsErrorMessage faultMessage;

    
        public NotEnoughRoomsError() {
            super("NotEnoughRoomsError");
        }

        public NotEnoughRoomsError(java.lang.String s) {
           super(s);
        }

        public NotEnoughRoomsError(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public NotEnoughRoomsError(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(es.upm.fi.sos.t3.hotelbooking.client.HotelBookingWSStub.NotEnoughRoomsErrorMessage msg){
       faultMessage = msg;
    }
    
    public es.upm.fi.sos.t3.hotelbooking.client.HotelBookingWSStub.NotEnoughRoomsErrorMessage getFaultMessage(){
       return faultMessage;
    }
}
    