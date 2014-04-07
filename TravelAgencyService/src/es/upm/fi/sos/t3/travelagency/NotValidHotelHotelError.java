
/**
 * NotValidHotelHotelError.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package es.upm.fi.sos.t3.travelagency;

public class NotValidHotelHotelError extends java.lang.Exception{

    private static final long serialVersionUID = 1395494037401L;
    
    private es.upm.fi.sos.t3.travelagency.NotValidHotelHotelErrorMessage faultMessage;

    
        public NotValidHotelHotelError() {
            super("NotValidHotelHotelError");
        }

        public NotValidHotelHotelError(java.lang.String s) {
           super(s);
        }

        public NotValidHotelHotelError(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public NotValidHotelHotelError(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(es.upm.fi.sos.t3.travelagency.NotValidHotelHotelErrorMessage msg){
       faultMessage = msg;
    }
    
    public es.upm.fi.sos.t3.travelagency.NotValidHotelHotelErrorMessage getFaultMessage(){
       return faultMessage;
    }
}
    