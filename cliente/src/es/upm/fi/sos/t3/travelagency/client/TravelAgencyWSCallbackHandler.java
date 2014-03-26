
/**
 * TravelAgencyWSCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

    package es.upm.fi.sos.t3.travelagency.client;

    /**
     *  TravelAgencyWSCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class TravelAgencyWSCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public TravelAgencyWSCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public TravelAgencyWSCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for checkTrip method
            * override this method for handling normal response from checkTrip operation
            */
           public void receiveResultcheckTrip(
                    es.upm.fi.sos.t3.travelagency.client.TravelAgencyWSStub.CheckingTripResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from checkTrip operation
           */
            public void receiveErrorcheckTrip(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for cancelOnlyHotel method
            * override this method for handling normal response from cancelOnlyHotel operation
            */
           public void receiveResultcancelOnlyHotel(
                    es.upm.fi.sos.t3.travelagency.client.TravelAgencyWSStub.CancellingOnlyHotelResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from cancelOnlyHotel operation
           */
            public void receiveErrorcancelOnlyHotel(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for login method
            * override this method for handling normal response from login operation
            */
           public void receiveResultlogin(
                    es.upm.fi.sos.t3.travelagency.client.TravelAgencyWSStub.LoginResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from login operation
           */
            public void receiveErrorlogin(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getCityHotelList method
            * override this method for handling normal response from getCityHotelList operation
            */
           public void receiveResultgetCityHotelList(
                    es.upm.fi.sos.t3.travelagency.client.TravelAgencyWSStub.CityHotelList result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getCityHotelList operation
           */
            public void receiveErrorgetCityHotelList(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for bookTrip method
            * override this method for handling normal response from bookTrip operation
            */
           public void receiveResultbookTrip(
                    es.upm.fi.sos.t3.travelagency.client.TravelAgencyWSStub.BookingTripResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from bookTrip operation
           */
            public void receiveErrorbookTrip(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getBudget method
            * override this method for handling normal response from getBudget operation
            */
           public void receiveResultgetBudget(
                    es.upm.fi.sos.t3.travelagency.client.TravelAgencyWSStub.Budget result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getBudget operation
           */
            public void receiveErrorgetBudget(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getOriginFlightList method
            * override this method for handling normal response from getOriginFlightList operation
            */
           public void receiveResultgetOriginFlightList(
                    es.upm.fi.sos.t3.travelagency.client.TravelAgencyWSStub.OriginFlightList result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getOriginFlightList operation
           */
            public void receiveErrorgetOriginFlightList(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for checkOnlyHotel method
            * override this method for handling normal response from checkOnlyHotel operation
            */
           public void receiveResultcheckOnlyHotel(
                    es.upm.fi.sos.t3.travelagency.client.TravelAgencyWSStub.CheckingOnlyHotelResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from checkOnlyHotel operation
           */
            public void receiveErrorcheckOnlyHotel(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getDestinationFlightList method
            * override this method for handling normal response from getDestinationFlightList operation
            */
           public void receiveResultgetDestinationFlightList(
                    es.upm.fi.sos.t3.travelagency.client.TravelAgencyWSStub.DestinationFlightList result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getDestinationFlightList operation
           */
            public void receiveErrorgetDestinationFlightList(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getHotelHotelList method
            * override this method for handling normal response from getHotelHotelList operation
            */
           public void receiveResultgetHotelHotelList(
                    es.upm.fi.sos.t3.travelagency.client.TravelAgencyWSStub.HotelHotelList result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getHotelHotelList operation
           */
            public void receiveErrorgetHotelHotelList(java.lang.Exception e) {
            }
                
               // No methods generated for meps other than in-out
                
           /**
            * auto generated Axis2 call back method for bookOnlyHotel method
            * override this method for handling normal response from bookOnlyHotel operation
            */
           public void receiveResultbookOnlyHotel(
                    es.upm.fi.sos.t3.travelagency.client.TravelAgencyWSStub.BookingOnlyHotelResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from bookOnlyHotel operation
           */
            public void receiveErrorbookOnlyHotel(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for cancelOnlyFlight method
            * override this method for handling normal response from cancelOnlyFlight operation
            */
           public void receiveResultcancelOnlyFlight(
                    es.upm.fi.sos.t3.travelagency.client.TravelAgencyWSStub.CancellingOnlyFlightResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from cancelOnlyFlight operation
           */
            public void receiveErrorcancelOnlyFlight(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for bookOnlyFlight method
            * override this method for handling normal response from bookOnlyFlight operation
            */
           public void receiveResultbookOnlyFlight(
                    es.upm.fi.sos.t3.travelagency.client.TravelAgencyWSStub.BookingOnlyFlightResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from bookOnlyFlight operation
           */
            public void receiveErrorbookOnlyFlight(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for checkOnlyFlight method
            * override this method for handling normal response from checkOnlyFlight operation
            */
           public void receiveResultcheckOnlyFlight(
                    es.upm.fi.sos.t3.travelagency.client.TravelAgencyWSStub.CheckingOnlyFlightResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from checkOnlyFlight operation
           */
            public void receiveErrorcheckOnlyFlight(java.lang.Exception e) {
            }
                


    }
    