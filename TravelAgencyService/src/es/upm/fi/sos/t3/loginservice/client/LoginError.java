
/**
 * LoginError.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package es.upm.fi.sos.t3.loginservice.client;

public class LoginError extends java.lang.Exception{

    private static final long serialVersionUID = 1395494068679L;
    
    private es.upm.fi.sos.t3.loginservice.client.LoginServiceWSStub.LoginErrorMessage faultMessage;

    
        public LoginError() {
            super("LoginError");
        }

        public LoginError(java.lang.String s) {
           super(s);
        }

        public LoginError(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public LoginError(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(es.upm.fi.sos.t3.loginservice.client.LoginServiceWSStub.LoginErrorMessage msg){
       faultMessage = msg;
    }
    
    public es.upm.fi.sos.t3.loginservice.client.LoginServiceWSStub.LoginErrorMessage getFaultMessage(){
       return faultMessage;
    }
}
    