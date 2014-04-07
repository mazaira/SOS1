
/**
 * NotValidDestinationFlightError.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package es.upm.fi.sos.t3.travelagency;

public class NotValidDestinationFlightError extends java.lang.Exception{

    private static final long serialVersionUID = 1395494037387L;
    
    private es.upm.fi.sos.t3.travelagency.NotValidDestinationFlightErrorMessage faultMessage;

    
        public NotValidDestinationFlightError() {
            super("NotValidDestinationFlightError");
        }

        public NotValidDestinationFlightError(java.lang.String s) {
           super(s);
        }

        public NotValidDestinationFlightError(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public NotValidDestinationFlightError(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(es.upm.fi.sos.t3.travelagency.NotValidDestinationFlightErrorMessage msg){
       faultMessage = msg;
    }
    
    public es.upm.fi.sos.t3.travelagency.NotValidDestinationFlightErrorMessage getFaultMessage(){
       return faultMessage;
    }
}
    