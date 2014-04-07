
/**
 * FlightBookingWSCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

    package es.upm.fi.sos.t3.flightbooking.client;

    /**
     *  FlightBookingWSCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class FlightBookingWSCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public FlightBookingWSCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public FlightBookingWSCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for bookFlight method
            * override this method for handling normal response from bookFlight operation
            */
           public void receiveResultbookFlight(
                    es.upm.fi.sos.t3.flightbooking.client.FlightBookingWSStub.BookingFlightResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from bookFlight operation
           */
            public void receiveErrorbookFlight(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for checkFlight method
            * override this method for handling normal response from checkFlight operation
            */
           public void receiveResultcheckFlight(
                    es.upm.fi.sos.t3.flightbooking.client.FlightBookingWSStub.CheckingFlightResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from checkFlight operation
           */
            public void receiveErrorcheckFlight(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getDestinationList method
            * override this method for handling normal response from getDestinationList operation
            */
           public void receiveResultgetDestinationList(
                    es.upm.fi.sos.t3.flightbooking.client.FlightBookingWSStub.DestinationList result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getDestinationList operation
           */
            public void receiveErrorgetDestinationList(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for cancelFlight method
            * override this method for handling normal response from cancelFlight operation
            */
           public void receiveResultcancelFlight(
                    es.upm.fi.sos.t3.flightbooking.client.FlightBookingWSStub.CancellingFlightResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from cancelFlight operation
           */
            public void receiveErrorcancelFlight(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getOriginList method
            * override this method for handling normal response from getOriginList operation
            */
           public void receiveResultgetOriginList(
                    es.upm.fi.sos.t3.flightbooking.client.FlightBookingWSStub.OriginList result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getOriginList operation
           */
            public void receiveErrorgetOriginList(java.lang.Exception e) {
            }
                


    }
    