
/**
 * NotValidSessionError.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package es.upm.fi.sos.t3.travelagency;

public class NotValidSessionError extends java.lang.Exception{

    private static final long serialVersionUID = 1395494037335L;
    
    private es.upm.fi.sos.t3.travelagency.NotValidSessionErrorMessage faultMessage;

    
        public NotValidSessionError() {
            super("NotValidSessionError");
        }

        public NotValidSessionError(java.lang.String s) {
           super(s);
        }

        public NotValidSessionError(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public NotValidSessionError(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(es.upm.fi.sos.t3.travelagency.NotValidSessionErrorMessage msg){
       faultMessage = msg;
    }
    
    public es.upm.fi.sos.t3.travelagency.NotValidSessionErrorMessage getFaultMessage(){
       return faultMessage;
    }
}
    