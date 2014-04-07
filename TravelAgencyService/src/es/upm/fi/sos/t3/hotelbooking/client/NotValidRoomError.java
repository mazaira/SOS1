
/**
 * NotValidRoomError.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package es.upm.fi.sos.t3.hotelbooking.client;

public class NotValidRoomError extends java.lang.Exception{

    private static final long serialVersionUID = 1395494059680L;
    
    private es.upm.fi.sos.t3.hotelbooking.client.HotelBookingWSStub.NotValidRoomErrorMessage faultMessage;

    
        public NotValidRoomError() {
            super("NotValidRoomError");
        }

        public NotValidRoomError(java.lang.String s) {
           super(s);
        }

        public NotValidRoomError(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public NotValidRoomError(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(es.upm.fi.sos.t3.hotelbooking.client.HotelBookingWSStub.NotValidRoomErrorMessage msg){
       faultMessage = msg;
    }
    
    public es.upm.fi.sos.t3.hotelbooking.client.HotelBookingWSStub.NotValidRoomErrorMessage getFaultMessage(){
       return faultMessage;
    }
}
    