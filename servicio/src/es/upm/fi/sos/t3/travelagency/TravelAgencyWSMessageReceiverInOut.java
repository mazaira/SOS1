
/**
 * TravelAgencyWSMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
        package es.upm.fi.sos.t3.travelagency;

        /**
        *  TravelAgencyWSMessageReceiverInOut message receiver
        */

        public class TravelAgencyWSMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        TravelAgencyWSSkeleton skel = (TravelAgencyWSSkeleton)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)){


        

            if("checkTrip".equals(methodName)){
                
                es.upm.fi.sos.t3.travelagency.CheckingTripResponse checkingTripResponse5 = null;
	                        es.upm.fi.sos.t3.travelagency.CheckingTrip wrappedParam =
                                                             (es.upm.fi.sos.t3.travelagency.CheckingTrip)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    es.upm.fi.sos.t3.travelagency.CheckingTrip.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               checkingTripResponse5 =
                                                   
                                                   
                                                         skel.checkTrip(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), checkingTripResponse5, false, new javax.xml.namespace.QName("http://travelagency.t3.sos.fi.upm.es",
                                                    "checkTrip"));
                                    } else 

            if("cancelOnlyHotel".equals(methodName)){
                
                es.upm.fi.sos.t3.travelagency.CancellingOnlyHotelResponse cancellingOnlyHotelResponse7 = null;
	                        es.upm.fi.sos.t3.travelagency.CancellingOnlyHotel wrappedParam =
                                                             (es.upm.fi.sos.t3.travelagency.CancellingOnlyHotel)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    es.upm.fi.sos.t3.travelagency.CancellingOnlyHotel.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               cancellingOnlyHotelResponse7 =
                                                   
                                                   
                                                         skel.cancelOnlyHotel(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), cancellingOnlyHotelResponse7, false, new javax.xml.namespace.QName("http://travelagency.t3.sos.fi.upm.es",
                                                    "cancelOnlyHotel"));
                                    } else 

            if("login".equals(methodName)){
                
                es.upm.fi.sos.t3.travelagency.LoginResponse loginResponse9 = null;
	                        es.upm.fi.sos.t3.travelagency.Login wrappedParam =
                                                             (es.upm.fi.sos.t3.travelagency.Login)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    es.upm.fi.sos.t3.travelagency.Login.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               loginResponse9 =
                                                   
                                                   
                                                         skel.login(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), loginResponse9, false, new javax.xml.namespace.QName("http://travelagency.t3.sos.fi.upm.es",
                                                    "login"));
                                    } else 

            if("getCityHotelList".equals(methodName)){
                
                es.upm.fi.sos.t3.travelagency.CityHotelList cityHotelList11 = null;
	                        cityHotelList11 =
                                                     
                                                 skel.getCityHotelList()
                                                ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), cityHotelList11, false, new javax.xml.namespace.QName("http://travelagency.t3.sos.fi.upm.es",
                                                    "getCityHotelList"));
                                    } else 

            if("bookTrip".equals(methodName)){
                
                es.upm.fi.sos.t3.travelagency.BookingTripResponse bookingTripResponse13 = null;
	                        es.upm.fi.sos.t3.travelagency.BookingTrip wrappedParam =
                                                             (es.upm.fi.sos.t3.travelagency.BookingTrip)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    es.upm.fi.sos.t3.travelagency.BookingTrip.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               bookingTripResponse13 =
                                                   
                                                   
                                                         skel.bookTrip(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), bookingTripResponse13, false, new javax.xml.namespace.QName("http://travelagency.t3.sos.fi.upm.es",
                                                    "bookTrip"));
                                    } else 

            if("getBudget".equals(methodName)){
                
                es.upm.fi.sos.t3.travelagency.Budget budget15 = null;
	                        budget15 =
                                                     
                                                 skel.getBudget()
                                                ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), budget15, false, new javax.xml.namespace.QName("http://travelagency.t3.sos.fi.upm.es",
                                                    "getBudget"));
                                    } else 

            if("getOriginFlightList".equals(methodName)){
                
                es.upm.fi.sos.t3.travelagency.OriginFlightList originFlightList17 = null;
	                        originFlightList17 =
                                                     
                                                 skel.getOriginFlightList()
                                                ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), originFlightList17, false, new javax.xml.namespace.QName("http://travelagency.t3.sos.fi.upm.es",
                                                    "getOriginFlightList"));
                                    } else 

            if("checkOnlyHotel".equals(methodName)){
                
                es.upm.fi.sos.t3.travelagency.CheckingOnlyHotelResponse checkingOnlyHotelResponse19 = null;
	                        es.upm.fi.sos.t3.travelagency.CheckingOnlyHotel wrappedParam =
                                                             (es.upm.fi.sos.t3.travelagency.CheckingOnlyHotel)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    es.upm.fi.sos.t3.travelagency.CheckingOnlyHotel.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               checkingOnlyHotelResponse19 =
                                                   
                                                   
                                                         skel.checkOnlyHotel(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), checkingOnlyHotelResponse19, false, new javax.xml.namespace.QName("http://travelagency.t3.sos.fi.upm.es",
                                                    "checkOnlyHotel"));
                                    } else 

            if("getDestinationFlightList".equals(methodName)){
                
                es.upm.fi.sos.t3.travelagency.DestinationFlightList destinationFlightList21 = null;
	                        es.upm.fi.sos.t3.travelagency.OriginFlight wrappedParam =
                                                             (es.upm.fi.sos.t3.travelagency.OriginFlight)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    es.upm.fi.sos.t3.travelagency.OriginFlight.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               destinationFlightList21 =
                                                   
                                                   
                                                         skel.getDestinationFlightList(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), destinationFlightList21, false, new javax.xml.namespace.QName("http://travelagency.t3.sos.fi.upm.es",
                                                    "getDestinationFlightList"));
                                    } else 

            if("getHotelHotelList".equals(methodName)){
                
                es.upm.fi.sos.t3.travelagency.HotelHotelList hotelHotelList23 = null;
	                        es.upm.fi.sos.t3.travelagency.CityHotel wrappedParam =
                                                             (es.upm.fi.sos.t3.travelagency.CityHotel)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    es.upm.fi.sos.t3.travelagency.CityHotel.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               hotelHotelList23 =
                                                   
                                                   
                                                         skel.getHotelHotelList(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), hotelHotelList23, false, new javax.xml.namespace.QName("http://travelagency.t3.sos.fi.upm.es",
                                                    "getHotelHotelList"));
                                    } else 

            if("bookOnlyHotel".equals(methodName)){
                
                es.upm.fi.sos.t3.travelagency.BookingOnlyHotelResponse bookingOnlyHotelResponse25 = null;
	                        es.upm.fi.sos.t3.travelagency.BookingOnlyHotel wrappedParam =
                                                             (es.upm.fi.sos.t3.travelagency.BookingOnlyHotel)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    es.upm.fi.sos.t3.travelagency.BookingOnlyHotel.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               bookingOnlyHotelResponse25 =
                                                   
                                                   
                                                         skel.bookOnlyHotel(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), bookingOnlyHotelResponse25, false, new javax.xml.namespace.QName("http://travelagency.t3.sos.fi.upm.es",
                                                    "bookOnlyHotel"));
                                    } else 

            if("cancelOnlyFlight".equals(methodName)){
                
                es.upm.fi.sos.t3.travelagency.CancellingOnlyFlightResponse cancellingOnlyFlightResponse27 = null;
	                        es.upm.fi.sos.t3.travelagency.CancellingOnlyFlight wrappedParam =
                                                             (es.upm.fi.sos.t3.travelagency.CancellingOnlyFlight)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    es.upm.fi.sos.t3.travelagency.CancellingOnlyFlight.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               cancellingOnlyFlightResponse27 =
                                                   
                                                   
                                                         skel.cancelOnlyFlight(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), cancellingOnlyFlightResponse27, false, new javax.xml.namespace.QName("http://travelagency.t3.sos.fi.upm.es",
                                                    "cancelOnlyFlight"));
                                    } else 

            if("bookOnlyFlight".equals(methodName)){
                
                es.upm.fi.sos.t3.travelagency.BookingOnlyFlightResponse bookingOnlyFlightResponse29 = null;
	                        es.upm.fi.sos.t3.travelagency.BookingOnlyFlight wrappedParam =
                                                             (es.upm.fi.sos.t3.travelagency.BookingOnlyFlight)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    es.upm.fi.sos.t3.travelagency.BookingOnlyFlight.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               bookingOnlyFlightResponse29 =
                                                   
                                                   
                                                         skel.bookOnlyFlight(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), bookingOnlyFlightResponse29, false, new javax.xml.namespace.QName("http://travelagency.t3.sos.fi.upm.es",
                                                    "bookOnlyFlight"));
                                    } else 

            if("checkOnlyFlight".equals(methodName)){
                
                es.upm.fi.sos.t3.travelagency.CheckingOnlyFlightResponse checkingOnlyFlightResponse31 = null;
	                        es.upm.fi.sos.t3.travelagency.CheckingOnlyFlight wrappedParam =
                                                             (es.upm.fi.sos.t3.travelagency.CheckingOnlyFlight)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    es.upm.fi.sos.t3.travelagency.CheckingOnlyFlight.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               checkingOnlyFlightResponse31 =
                                                   
                                                   
                                                         skel.checkOnlyFlight(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), checkingOnlyFlightResponse31, false, new javax.xml.namespace.QName("http://travelagency.t3.sos.fi.upm.es",
                                                    "checkOnlyFlight"));
                                    
            } else {
              throw new java.lang.RuntimeException("method not found");
            }
        

        newMsgContext.setEnvelope(envelope);
        }
        } catch (NotEnoughBudgetError e) {

            msgContext.setProperty(org.apache.axis2.Constants.FAULT_NAME,"notEnoughBudgetErrorMessage");
            org.apache.axis2.AxisFault f = createAxisFault(e);
            if (e.getFaultMessage() != null){
                f.setDetail(toOM(e.getFaultMessage(),false));
            }
            throw f;
            }
         catch (NotEnoughSeatsFlightError e) {

            msgContext.setProperty(org.apache.axis2.Constants.FAULT_NAME,"notEnoughSeatsFlightErrorMessage");
            org.apache.axis2.AxisFault f = createAxisFault(e);
            if (e.getFaultMessage() != null){
                f.setDetail(toOM(e.getFaultMessage(),false));
            }
            throw f;
            }
         catch (NotValidSessionError e) {

            msgContext.setProperty(org.apache.axis2.Constants.FAULT_NAME,"notValidSessionErrorMessage");
            org.apache.axis2.AxisFault f = createAxisFault(e);
            if (e.getFaultMessage() != null){
                f.setDetail(toOM(e.getFaultMessage(),false));
            }
            throw f;
            }
         catch (NotValidSeatFlightError e) {

            msgContext.setProperty(org.apache.axis2.Constants.FAULT_NAME,"notValidSeatFlightErrorMessage");
            org.apache.axis2.AxisFault f = createAxisFault(e);
            if (e.getFaultMessage() != null){
                f.setDetail(toOM(e.getFaultMessage(),false));
            }
            throw f;
            }
         catch (NotEnoughRoomsHotelError e) {

            msgContext.setProperty(org.apache.axis2.Constants.FAULT_NAME,"notEnoughRoomsHotelErrorMessage");
            org.apache.axis2.AxisFault f = createAxisFault(e);
            if (e.getFaultMessage() != null){
                f.setDetail(toOM(e.getFaultMessage(),false));
            }
            throw f;
            }
         catch (NotValidRoomHotelError e) {

            msgContext.setProperty(org.apache.axis2.Constants.FAULT_NAME,"notValidRoomHotelErrorMessage");
            org.apache.axis2.AxisFault f = createAxisFault(e);
            if (e.getFaultMessage() != null){
                f.setDetail(toOM(e.getFaultMessage(),false));
            }
            throw f;
            }
         catch (NotValidDestinationFlightError e) {

            msgContext.setProperty(org.apache.axis2.Constants.FAULT_NAME,"notValidDestinationFlightErrorMessage");
            org.apache.axis2.AxisFault f = createAxisFault(e);
            if (e.getFaultMessage() != null){
                f.setDetail(toOM(e.getFaultMessage(),false));
            }
            throw f;
            }
         catch (NotValidHotelHotelError e) {

            msgContext.setProperty(org.apache.axis2.Constants.FAULT_NAME,"notValidHotelHotelErrorMessage");
            org.apache.axis2.AxisFault f = createAxisFault(e);
            if (e.getFaultMessage() != null){
                f.setDetail(toOM(e.getFaultMessage(),false));
            }
            throw f;
            }
         catch (NotValidOriginFlightError e) {

            msgContext.setProperty(org.apache.axis2.Constants.FAULT_NAME,"notValidOriginFlightErrorMessage");
            org.apache.axis2.AxisFault f = createAxisFault(e);
            if (e.getFaultMessage() != null){
                f.setDetail(toOM(e.getFaultMessage(),false));
            }
            throw f;
            }
         catch (NotValidCityHotelError e) {

            msgContext.setProperty(org.apache.axis2.Constants.FAULT_NAME,"notValidCityHotelErrorMessage");
            org.apache.axis2.AxisFault f = createAxisFault(e);
            if (e.getFaultMessage() != null){
                f.setDetail(toOM(e.getFaultMessage(),false));
            }
            throw f;
            }
         catch (RemoteServiceError e) {

            msgContext.setProperty(org.apache.axis2.Constants.FAULT_NAME,"remoteServiceErrorMessage");
            org.apache.axis2.AxisFault f = createAxisFault(e);
            if (e.getFaultMessage() != null){
                f.setDetail(toOM(e.getFaultMessage(),false));
            }
            throw f;
            }
        
        catch (java.lang.Exception e) {
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
        }
        
        //
            private  org.apache.axiom.om.OMElement  toOM(es.upm.fi.sos.t3.travelagency.CheckingTrip param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(es.upm.fi.sos.t3.travelagency.CheckingTrip.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(es.upm.fi.sos.t3.travelagency.CheckingTripResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(es.upm.fi.sos.t3.travelagency.CheckingTripResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(es.upm.fi.sos.t3.travelagency.NotValidOriginFlightErrorMessage param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(es.upm.fi.sos.t3.travelagency.NotValidOriginFlightErrorMessage.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(es.upm.fi.sos.t3.travelagency.NotValidDestinationFlightErrorMessage param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(es.upm.fi.sos.t3.travelagency.NotValidDestinationFlightErrorMessage.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(es.upm.fi.sos.t3.travelagency.NotValidCityHotelErrorMessage param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(es.upm.fi.sos.t3.travelagency.NotValidCityHotelErrorMessage.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(es.upm.fi.sos.t3.travelagency.NotValidHotelHotelErrorMessage param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(es.upm.fi.sos.t3.travelagency.NotValidHotelHotelErrorMessage.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(es.upm.fi.sos.t3.travelagency.RemoteServiceErrorMessage param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(es.upm.fi.sos.t3.travelagency.RemoteServiceErrorMessage.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(es.upm.fi.sos.t3.travelagency.NotValidSessionErrorMessage param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(es.upm.fi.sos.t3.travelagency.NotValidSessionErrorMessage.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(es.upm.fi.sos.t3.travelagency.CancellingOnlyHotel param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(es.upm.fi.sos.t3.travelagency.CancellingOnlyHotel.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(es.upm.fi.sos.t3.travelagency.CancellingOnlyHotelResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(es.upm.fi.sos.t3.travelagency.CancellingOnlyHotelResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(es.upm.fi.sos.t3.travelagency.NotEnoughRoomsHotelErrorMessage param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(es.upm.fi.sos.t3.travelagency.NotEnoughRoomsHotelErrorMessage.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(es.upm.fi.sos.t3.travelagency.NotValidRoomHotelErrorMessage param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(es.upm.fi.sos.t3.travelagency.NotValidRoomHotelErrorMessage.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(es.upm.fi.sos.t3.travelagency.Login param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(es.upm.fi.sos.t3.travelagency.Login.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(es.upm.fi.sos.t3.travelagency.LoginResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(es.upm.fi.sos.t3.travelagency.LoginResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(es.upm.fi.sos.t3.travelagency.CityHotelList param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(es.upm.fi.sos.t3.travelagency.CityHotelList.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(es.upm.fi.sos.t3.travelagency.BookingTrip param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(es.upm.fi.sos.t3.travelagency.BookingTrip.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(es.upm.fi.sos.t3.travelagency.BookingTripResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(es.upm.fi.sos.t3.travelagency.BookingTripResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(es.upm.fi.sos.t3.travelagency.NotEnoughSeatsFlightErrorMessage param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(es.upm.fi.sos.t3.travelagency.NotEnoughSeatsFlightErrorMessage.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(es.upm.fi.sos.t3.travelagency.NotValidSeatFlightErrorMessage param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(es.upm.fi.sos.t3.travelagency.NotValidSeatFlightErrorMessage.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(es.upm.fi.sos.t3.travelagency.NotEnoughBudgetErrorMessage param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(es.upm.fi.sos.t3.travelagency.NotEnoughBudgetErrorMessage.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(es.upm.fi.sos.t3.travelagency.Budget param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(es.upm.fi.sos.t3.travelagency.Budget.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(es.upm.fi.sos.t3.travelagency.OriginFlightList param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(es.upm.fi.sos.t3.travelagency.OriginFlightList.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(es.upm.fi.sos.t3.travelagency.CheckingOnlyHotel param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(es.upm.fi.sos.t3.travelagency.CheckingOnlyHotel.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(es.upm.fi.sos.t3.travelagency.CheckingOnlyHotelResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(es.upm.fi.sos.t3.travelagency.CheckingOnlyHotelResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(es.upm.fi.sos.t3.travelagency.OriginFlight param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(es.upm.fi.sos.t3.travelagency.OriginFlight.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(es.upm.fi.sos.t3.travelagency.DestinationFlightList param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(es.upm.fi.sos.t3.travelagency.DestinationFlightList.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(es.upm.fi.sos.t3.travelagency.CityHotel param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(es.upm.fi.sos.t3.travelagency.CityHotel.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(es.upm.fi.sos.t3.travelagency.HotelHotelList param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(es.upm.fi.sos.t3.travelagency.HotelHotelList.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(es.upm.fi.sos.t3.travelagency.BookingOnlyHotel param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(es.upm.fi.sos.t3.travelagency.BookingOnlyHotel.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(es.upm.fi.sos.t3.travelagency.BookingOnlyHotelResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(es.upm.fi.sos.t3.travelagency.BookingOnlyHotelResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(es.upm.fi.sos.t3.travelagency.CancellingOnlyFlight param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(es.upm.fi.sos.t3.travelagency.CancellingOnlyFlight.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(es.upm.fi.sos.t3.travelagency.CancellingOnlyFlightResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(es.upm.fi.sos.t3.travelagency.CancellingOnlyFlightResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(es.upm.fi.sos.t3.travelagency.BookingOnlyFlight param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(es.upm.fi.sos.t3.travelagency.BookingOnlyFlight.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(es.upm.fi.sos.t3.travelagency.BookingOnlyFlightResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(es.upm.fi.sos.t3.travelagency.BookingOnlyFlightResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(es.upm.fi.sos.t3.travelagency.CheckingOnlyFlight param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(es.upm.fi.sos.t3.travelagency.CheckingOnlyFlight.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(es.upm.fi.sos.t3.travelagency.CheckingOnlyFlightResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(es.upm.fi.sos.t3.travelagency.CheckingOnlyFlightResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, es.upm.fi.sos.t3.travelagency.CheckingTripResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(es.upm.fi.sos.t3.travelagency.CheckingTripResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private es.upm.fi.sos.t3.travelagency.CheckingTripResponse wrapcheckTrip(){
                                es.upm.fi.sos.t3.travelagency.CheckingTripResponse wrappedElement = new es.upm.fi.sos.t3.travelagency.CheckingTripResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, es.upm.fi.sos.t3.travelagency.CancellingOnlyHotelResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(es.upm.fi.sos.t3.travelagency.CancellingOnlyHotelResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private es.upm.fi.sos.t3.travelagency.CancellingOnlyHotelResponse wrapcancelOnlyHotel(){
                                es.upm.fi.sos.t3.travelagency.CancellingOnlyHotelResponse wrappedElement = new es.upm.fi.sos.t3.travelagency.CancellingOnlyHotelResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, es.upm.fi.sos.t3.travelagency.LoginResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(es.upm.fi.sos.t3.travelagency.LoginResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private es.upm.fi.sos.t3.travelagency.LoginResponse wraplogin(){
                                es.upm.fi.sos.t3.travelagency.LoginResponse wrappedElement = new es.upm.fi.sos.t3.travelagency.LoginResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, es.upm.fi.sos.t3.travelagency.CityHotelList param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(es.upm.fi.sos.t3.travelagency.CityHotelList.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private es.upm.fi.sos.t3.travelagency.CityHotelList wrapgetCityHotelList(){
                                es.upm.fi.sos.t3.travelagency.CityHotelList wrappedElement = new es.upm.fi.sos.t3.travelagency.CityHotelList();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, es.upm.fi.sos.t3.travelagency.BookingTripResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(es.upm.fi.sos.t3.travelagency.BookingTripResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private es.upm.fi.sos.t3.travelagency.BookingTripResponse wrapbookTrip(){
                                es.upm.fi.sos.t3.travelagency.BookingTripResponse wrappedElement = new es.upm.fi.sos.t3.travelagency.BookingTripResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, es.upm.fi.sos.t3.travelagency.Budget param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(es.upm.fi.sos.t3.travelagency.Budget.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private es.upm.fi.sos.t3.travelagency.Budget wrapgetBudget(){
                                es.upm.fi.sos.t3.travelagency.Budget wrappedElement = new es.upm.fi.sos.t3.travelagency.Budget();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, es.upm.fi.sos.t3.travelagency.OriginFlightList param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(es.upm.fi.sos.t3.travelagency.OriginFlightList.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private es.upm.fi.sos.t3.travelagency.OriginFlightList wrapgetOriginFlightList(){
                                es.upm.fi.sos.t3.travelagency.OriginFlightList wrappedElement = new es.upm.fi.sos.t3.travelagency.OriginFlightList();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, es.upm.fi.sos.t3.travelagency.CheckingOnlyHotelResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(es.upm.fi.sos.t3.travelagency.CheckingOnlyHotelResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private es.upm.fi.sos.t3.travelagency.CheckingOnlyHotelResponse wrapcheckOnlyHotel(){
                                es.upm.fi.sos.t3.travelagency.CheckingOnlyHotelResponse wrappedElement = new es.upm.fi.sos.t3.travelagency.CheckingOnlyHotelResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, es.upm.fi.sos.t3.travelagency.DestinationFlightList param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(es.upm.fi.sos.t3.travelagency.DestinationFlightList.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private es.upm.fi.sos.t3.travelagency.DestinationFlightList wrapgetDestinationFlightList(){
                                es.upm.fi.sos.t3.travelagency.DestinationFlightList wrappedElement = new es.upm.fi.sos.t3.travelagency.DestinationFlightList();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, es.upm.fi.sos.t3.travelagency.HotelHotelList param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(es.upm.fi.sos.t3.travelagency.HotelHotelList.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private es.upm.fi.sos.t3.travelagency.HotelHotelList wrapgetHotelHotelList(){
                                es.upm.fi.sos.t3.travelagency.HotelHotelList wrappedElement = new es.upm.fi.sos.t3.travelagency.HotelHotelList();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, es.upm.fi.sos.t3.travelagency.BookingOnlyHotelResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(es.upm.fi.sos.t3.travelagency.BookingOnlyHotelResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private es.upm.fi.sos.t3.travelagency.BookingOnlyHotelResponse wrapbookOnlyHotel(){
                                es.upm.fi.sos.t3.travelagency.BookingOnlyHotelResponse wrappedElement = new es.upm.fi.sos.t3.travelagency.BookingOnlyHotelResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, es.upm.fi.sos.t3.travelagency.CancellingOnlyFlightResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(es.upm.fi.sos.t3.travelagency.CancellingOnlyFlightResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private es.upm.fi.sos.t3.travelagency.CancellingOnlyFlightResponse wrapcancelOnlyFlight(){
                                es.upm.fi.sos.t3.travelagency.CancellingOnlyFlightResponse wrappedElement = new es.upm.fi.sos.t3.travelagency.CancellingOnlyFlightResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, es.upm.fi.sos.t3.travelagency.BookingOnlyFlightResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(es.upm.fi.sos.t3.travelagency.BookingOnlyFlightResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private es.upm.fi.sos.t3.travelagency.BookingOnlyFlightResponse wrapbookOnlyFlight(){
                                es.upm.fi.sos.t3.travelagency.BookingOnlyFlightResponse wrappedElement = new es.upm.fi.sos.t3.travelagency.BookingOnlyFlightResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, es.upm.fi.sos.t3.travelagency.CheckingOnlyFlightResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(es.upm.fi.sos.t3.travelagency.CheckingOnlyFlightResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private es.upm.fi.sos.t3.travelagency.CheckingOnlyFlightResponse wrapcheckOnlyFlight(){
                                es.upm.fi.sos.t3.travelagency.CheckingOnlyFlightResponse wrappedElement = new es.upm.fi.sos.t3.travelagency.CheckingOnlyFlightResponse();
                                return wrappedElement;
                         }
                    


        /**
        *  get the default envelope
        */
        private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory){
        return factory.getDefaultEnvelope();
        }


        private  java.lang.Object fromOM(
        org.apache.axiom.om.OMElement param,
        java.lang.Class type,
        java.util.Map extraNamespaces) throws org.apache.axis2.AxisFault{

        try {
        
                if (es.upm.fi.sos.t3.travelagency.CheckingTrip.class.equals(type)){
                
                           return es.upm.fi.sos.t3.travelagency.CheckingTrip.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (es.upm.fi.sos.t3.travelagency.CheckingTripResponse.class.equals(type)){
                
                           return es.upm.fi.sos.t3.travelagency.CheckingTripResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (es.upm.fi.sos.t3.travelagency.NotValidOriginFlightErrorMessage.class.equals(type)){
                
                           return es.upm.fi.sos.t3.travelagency.NotValidOriginFlightErrorMessage.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (es.upm.fi.sos.t3.travelagency.NotValidDestinationFlightErrorMessage.class.equals(type)){
                
                           return es.upm.fi.sos.t3.travelagency.NotValidDestinationFlightErrorMessage.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (es.upm.fi.sos.t3.travelagency.NotValidCityHotelErrorMessage.class.equals(type)){
                
                           return es.upm.fi.sos.t3.travelagency.NotValidCityHotelErrorMessage.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (es.upm.fi.sos.t3.travelagency.NotValidHotelHotelErrorMessage.class.equals(type)){
                
                           return es.upm.fi.sos.t3.travelagency.NotValidHotelHotelErrorMessage.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (es.upm.fi.sos.t3.travelagency.RemoteServiceErrorMessage.class.equals(type)){
                
                           return es.upm.fi.sos.t3.travelagency.RemoteServiceErrorMessage.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (es.upm.fi.sos.t3.travelagency.NotValidSessionErrorMessage.class.equals(type)){
                
                           return es.upm.fi.sos.t3.travelagency.NotValidSessionErrorMessage.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (es.upm.fi.sos.t3.travelagency.CancellingOnlyHotel.class.equals(type)){
                
                           return es.upm.fi.sos.t3.travelagency.CancellingOnlyHotel.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (es.upm.fi.sos.t3.travelagency.CancellingOnlyHotelResponse.class.equals(type)){
                
                           return es.upm.fi.sos.t3.travelagency.CancellingOnlyHotelResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (es.upm.fi.sos.t3.travelagency.NotValidCityHotelErrorMessage.class.equals(type)){
                
                           return es.upm.fi.sos.t3.travelagency.NotValidCityHotelErrorMessage.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (es.upm.fi.sos.t3.travelagency.NotValidHotelHotelErrorMessage.class.equals(type)){
                
                           return es.upm.fi.sos.t3.travelagency.NotValidHotelHotelErrorMessage.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (es.upm.fi.sos.t3.travelagency.NotEnoughRoomsHotelErrorMessage.class.equals(type)){
                
                           return es.upm.fi.sos.t3.travelagency.NotEnoughRoomsHotelErrorMessage.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (es.upm.fi.sos.t3.travelagency.NotValidRoomHotelErrorMessage.class.equals(type)){
                
                           return es.upm.fi.sos.t3.travelagency.NotValidRoomHotelErrorMessage.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (es.upm.fi.sos.t3.travelagency.RemoteServiceErrorMessage.class.equals(type)){
                
                           return es.upm.fi.sos.t3.travelagency.RemoteServiceErrorMessage.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (es.upm.fi.sos.t3.travelagency.NotValidSessionErrorMessage.class.equals(type)){
                
                           return es.upm.fi.sos.t3.travelagency.NotValidSessionErrorMessage.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (es.upm.fi.sos.t3.travelagency.Login.class.equals(type)){
                
                           return es.upm.fi.sos.t3.travelagency.Login.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (es.upm.fi.sos.t3.travelagency.LoginResponse.class.equals(type)){
                
                           return es.upm.fi.sos.t3.travelagency.LoginResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (es.upm.fi.sos.t3.travelagency.RemoteServiceErrorMessage.class.equals(type)){
                
                           return es.upm.fi.sos.t3.travelagency.RemoteServiceErrorMessage.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (es.upm.fi.sos.t3.travelagency.CityHotelList.class.equals(type)){
                
                           return es.upm.fi.sos.t3.travelagency.CityHotelList.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (es.upm.fi.sos.t3.travelagency.RemoteServiceErrorMessage.class.equals(type)){
                
                           return es.upm.fi.sos.t3.travelagency.RemoteServiceErrorMessage.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (es.upm.fi.sos.t3.travelagency.NotValidSessionErrorMessage.class.equals(type)){
                
                           return es.upm.fi.sos.t3.travelagency.NotValidSessionErrorMessage.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (es.upm.fi.sos.t3.travelagency.BookingTrip.class.equals(type)){
                
                           return es.upm.fi.sos.t3.travelagency.BookingTrip.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (es.upm.fi.sos.t3.travelagency.BookingTripResponse.class.equals(type)){
                
                           return es.upm.fi.sos.t3.travelagency.BookingTripResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (es.upm.fi.sos.t3.travelagency.NotValidOriginFlightErrorMessage.class.equals(type)){
                
                           return es.upm.fi.sos.t3.travelagency.NotValidOriginFlightErrorMessage.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (es.upm.fi.sos.t3.travelagency.NotValidDestinationFlightErrorMessage.class.equals(type)){
                
                           return es.upm.fi.sos.t3.travelagency.NotValidDestinationFlightErrorMessage.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (es.upm.fi.sos.t3.travelagency.NotEnoughSeatsFlightErrorMessage.class.equals(type)){
                
                           return es.upm.fi.sos.t3.travelagency.NotEnoughSeatsFlightErrorMessage.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (es.upm.fi.sos.t3.travelagency.NotValidSeatFlightErrorMessage.class.equals(type)){
                
                           return es.upm.fi.sos.t3.travelagency.NotValidSeatFlightErrorMessage.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (es.upm.fi.sos.t3.travelagency.NotValidCityHotelErrorMessage.class.equals(type)){
                
                           return es.upm.fi.sos.t3.travelagency.NotValidCityHotelErrorMessage.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (es.upm.fi.sos.t3.travelagency.NotValidHotelHotelErrorMessage.class.equals(type)){
                
                           return es.upm.fi.sos.t3.travelagency.NotValidHotelHotelErrorMessage.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (es.upm.fi.sos.t3.travelagency.NotEnoughRoomsHotelErrorMessage.class.equals(type)){
                
                           return es.upm.fi.sos.t3.travelagency.NotEnoughRoomsHotelErrorMessage.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (es.upm.fi.sos.t3.travelagency.NotValidRoomHotelErrorMessage.class.equals(type)){
                
                           return es.upm.fi.sos.t3.travelagency.NotValidRoomHotelErrorMessage.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (es.upm.fi.sos.t3.travelagency.RemoteServiceErrorMessage.class.equals(type)){
                
                           return es.upm.fi.sos.t3.travelagency.RemoteServiceErrorMessage.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (es.upm.fi.sos.t3.travelagency.NotValidSessionErrorMessage.class.equals(type)){
                
                           return es.upm.fi.sos.t3.travelagency.NotValidSessionErrorMessage.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (es.upm.fi.sos.t3.travelagency.NotEnoughBudgetErrorMessage.class.equals(type)){
                
                           return es.upm.fi.sos.t3.travelagency.NotEnoughBudgetErrorMessage.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (es.upm.fi.sos.t3.travelagency.Budget.class.equals(type)){
                
                           return es.upm.fi.sos.t3.travelagency.Budget.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (es.upm.fi.sos.t3.travelagency.NotValidSessionErrorMessage.class.equals(type)){
                
                           return es.upm.fi.sos.t3.travelagency.NotValidSessionErrorMessage.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (es.upm.fi.sos.t3.travelagency.OriginFlightList.class.equals(type)){
                
                           return es.upm.fi.sos.t3.travelagency.OriginFlightList.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (es.upm.fi.sos.t3.travelagency.RemoteServiceErrorMessage.class.equals(type)){
                
                           return es.upm.fi.sos.t3.travelagency.RemoteServiceErrorMessage.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (es.upm.fi.sos.t3.travelagency.NotValidSessionErrorMessage.class.equals(type)){
                
                           return es.upm.fi.sos.t3.travelagency.NotValidSessionErrorMessage.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (es.upm.fi.sos.t3.travelagency.CheckingOnlyHotel.class.equals(type)){
                
                           return es.upm.fi.sos.t3.travelagency.CheckingOnlyHotel.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (es.upm.fi.sos.t3.travelagency.CheckingOnlyHotelResponse.class.equals(type)){
                
                           return es.upm.fi.sos.t3.travelagency.CheckingOnlyHotelResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (es.upm.fi.sos.t3.travelagency.NotValidCityHotelErrorMessage.class.equals(type)){
                
                           return es.upm.fi.sos.t3.travelagency.NotValidCityHotelErrorMessage.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (es.upm.fi.sos.t3.travelagency.NotValidHotelHotelErrorMessage.class.equals(type)){
                
                           return es.upm.fi.sos.t3.travelagency.NotValidHotelHotelErrorMessage.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (es.upm.fi.sos.t3.travelagency.RemoteServiceErrorMessage.class.equals(type)){
                
                           return es.upm.fi.sos.t3.travelagency.RemoteServiceErrorMessage.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (es.upm.fi.sos.t3.travelagency.NotValidSessionErrorMessage.class.equals(type)){
                
                           return es.upm.fi.sos.t3.travelagency.NotValidSessionErrorMessage.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (es.upm.fi.sos.t3.travelagency.OriginFlight.class.equals(type)){
                
                           return es.upm.fi.sos.t3.travelagency.OriginFlight.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (es.upm.fi.sos.t3.travelagency.DestinationFlightList.class.equals(type)){
                
                           return es.upm.fi.sos.t3.travelagency.DestinationFlightList.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (es.upm.fi.sos.t3.travelagency.NotValidOriginFlightErrorMessage.class.equals(type)){
                
                           return es.upm.fi.sos.t3.travelagency.NotValidOriginFlightErrorMessage.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (es.upm.fi.sos.t3.travelagency.RemoteServiceErrorMessage.class.equals(type)){
                
                           return es.upm.fi.sos.t3.travelagency.RemoteServiceErrorMessage.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (es.upm.fi.sos.t3.travelagency.NotValidSessionErrorMessage.class.equals(type)){
                
                           return es.upm.fi.sos.t3.travelagency.NotValidSessionErrorMessage.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (es.upm.fi.sos.t3.travelagency.CityHotel.class.equals(type)){
                
                           return es.upm.fi.sos.t3.travelagency.CityHotel.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (es.upm.fi.sos.t3.travelagency.HotelHotelList.class.equals(type)){
                
                           return es.upm.fi.sos.t3.travelagency.HotelHotelList.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (es.upm.fi.sos.t3.travelagency.NotValidCityHotelErrorMessage.class.equals(type)){
                
                           return es.upm.fi.sos.t3.travelagency.NotValidCityHotelErrorMessage.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (es.upm.fi.sos.t3.travelagency.RemoteServiceErrorMessage.class.equals(type)){
                
                           return es.upm.fi.sos.t3.travelagency.RemoteServiceErrorMessage.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (es.upm.fi.sos.t3.travelagency.NotValidSessionErrorMessage.class.equals(type)){
                
                           return es.upm.fi.sos.t3.travelagency.NotValidSessionErrorMessage.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (es.upm.fi.sos.t3.travelagency.BookingOnlyHotel.class.equals(type)){
                
                           return es.upm.fi.sos.t3.travelagency.BookingOnlyHotel.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (es.upm.fi.sos.t3.travelagency.BookingOnlyHotelResponse.class.equals(type)){
                
                           return es.upm.fi.sos.t3.travelagency.BookingOnlyHotelResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (es.upm.fi.sos.t3.travelagency.NotValidCityHotelErrorMessage.class.equals(type)){
                
                           return es.upm.fi.sos.t3.travelagency.NotValidCityHotelErrorMessage.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (es.upm.fi.sos.t3.travelagency.NotValidHotelHotelErrorMessage.class.equals(type)){
                
                           return es.upm.fi.sos.t3.travelagency.NotValidHotelHotelErrorMessage.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (es.upm.fi.sos.t3.travelagency.NotEnoughRoomsHotelErrorMessage.class.equals(type)){
                
                           return es.upm.fi.sos.t3.travelagency.NotEnoughRoomsHotelErrorMessage.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (es.upm.fi.sos.t3.travelagency.NotValidRoomHotelErrorMessage.class.equals(type)){
                
                           return es.upm.fi.sos.t3.travelagency.NotValidRoomHotelErrorMessage.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (es.upm.fi.sos.t3.travelagency.RemoteServiceErrorMessage.class.equals(type)){
                
                           return es.upm.fi.sos.t3.travelagency.RemoteServiceErrorMessage.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (es.upm.fi.sos.t3.travelagency.NotValidSessionErrorMessage.class.equals(type)){
                
                           return es.upm.fi.sos.t3.travelagency.NotValidSessionErrorMessage.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (es.upm.fi.sos.t3.travelagency.NotEnoughBudgetErrorMessage.class.equals(type)){
                
                           return es.upm.fi.sos.t3.travelagency.NotEnoughBudgetErrorMessage.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (es.upm.fi.sos.t3.travelagency.CancellingOnlyFlight.class.equals(type)){
                
                           return es.upm.fi.sos.t3.travelagency.CancellingOnlyFlight.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (es.upm.fi.sos.t3.travelagency.CancellingOnlyFlightResponse.class.equals(type)){
                
                           return es.upm.fi.sos.t3.travelagency.CancellingOnlyFlightResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (es.upm.fi.sos.t3.travelagency.NotValidOriginFlightErrorMessage.class.equals(type)){
                
                           return es.upm.fi.sos.t3.travelagency.NotValidOriginFlightErrorMessage.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (es.upm.fi.sos.t3.travelagency.NotValidDestinationFlightErrorMessage.class.equals(type)){
                
                           return es.upm.fi.sos.t3.travelagency.NotValidDestinationFlightErrorMessage.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (es.upm.fi.sos.t3.travelagency.NotEnoughSeatsFlightErrorMessage.class.equals(type)){
                
                           return es.upm.fi.sos.t3.travelagency.NotEnoughSeatsFlightErrorMessage.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (es.upm.fi.sos.t3.travelagency.NotValidSeatFlightErrorMessage.class.equals(type)){
                
                           return es.upm.fi.sos.t3.travelagency.NotValidSeatFlightErrorMessage.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (es.upm.fi.sos.t3.travelagency.RemoteServiceErrorMessage.class.equals(type)){
                
                           return es.upm.fi.sos.t3.travelagency.RemoteServiceErrorMessage.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (es.upm.fi.sos.t3.travelagency.NotValidSessionErrorMessage.class.equals(type)){
                
                           return es.upm.fi.sos.t3.travelagency.NotValidSessionErrorMessage.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (es.upm.fi.sos.t3.travelagency.BookingOnlyFlight.class.equals(type)){
                
                           return es.upm.fi.sos.t3.travelagency.BookingOnlyFlight.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (es.upm.fi.sos.t3.travelagency.BookingOnlyFlightResponse.class.equals(type)){
                
                           return es.upm.fi.sos.t3.travelagency.BookingOnlyFlightResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (es.upm.fi.sos.t3.travelagency.NotValidOriginFlightErrorMessage.class.equals(type)){
                
                           return es.upm.fi.sos.t3.travelagency.NotValidOriginFlightErrorMessage.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (es.upm.fi.sos.t3.travelagency.NotValidDestinationFlightErrorMessage.class.equals(type)){
                
                           return es.upm.fi.sos.t3.travelagency.NotValidDestinationFlightErrorMessage.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (es.upm.fi.sos.t3.travelagency.NotEnoughSeatsFlightErrorMessage.class.equals(type)){
                
                           return es.upm.fi.sos.t3.travelagency.NotEnoughSeatsFlightErrorMessage.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (es.upm.fi.sos.t3.travelagency.NotValidSeatFlightErrorMessage.class.equals(type)){
                
                           return es.upm.fi.sos.t3.travelagency.NotValidSeatFlightErrorMessage.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (es.upm.fi.sos.t3.travelagency.RemoteServiceErrorMessage.class.equals(type)){
                
                           return es.upm.fi.sos.t3.travelagency.RemoteServiceErrorMessage.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (es.upm.fi.sos.t3.travelagency.NotValidSessionErrorMessage.class.equals(type)){
                
                           return es.upm.fi.sos.t3.travelagency.NotValidSessionErrorMessage.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (es.upm.fi.sos.t3.travelagency.NotEnoughBudgetErrorMessage.class.equals(type)){
                
                           return es.upm.fi.sos.t3.travelagency.NotEnoughBudgetErrorMessage.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (es.upm.fi.sos.t3.travelagency.CheckingOnlyFlight.class.equals(type)){
                
                           return es.upm.fi.sos.t3.travelagency.CheckingOnlyFlight.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (es.upm.fi.sos.t3.travelagency.CheckingOnlyFlightResponse.class.equals(type)){
                
                           return es.upm.fi.sos.t3.travelagency.CheckingOnlyFlightResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (es.upm.fi.sos.t3.travelagency.NotValidOriginFlightErrorMessage.class.equals(type)){
                
                           return es.upm.fi.sos.t3.travelagency.NotValidOriginFlightErrorMessage.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (es.upm.fi.sos.t3.travelagency.NotValidDestinationFlightErrorMessage.class.equals(type)){
                
                           return es.upm.fi.sos.t3.travelagency.NotValidDestinationFlightErrorMessage.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (es.upm.fi.sos.t3.travelagency.RemoteServiceErrorMessage.class.equals(type)){
                
                           return es.upm.fi.sos.t3.travelagency.RemoteServiceErrorMessage.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (es.upm.fi.sos.t3.travelagency.NotValidSessionErrorMessage.class.equals(type)){
                
                           return es.upm.fi.sos.t3.travelagency.NotValidSessionErrorMessage.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
        } catch (java.lang.Exception e) {
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
           return null;
        }



    

        /**
        *  A utility method that copies the namepaces from the SOAPEnvelope
        */
        private java.util.Map getEnvelopeNamespaces(org.apache.axiom.soap.SOAPEnvelope env){
        java.util.Map returnMap = new java.util.HashMap();
        java.util.Iterator namespaceIterator = env.getAllDeclaredNamespaces();
        while (namespaceIterator.hasNext()) {
        org.apache.axiom.om.OMNamespace ns = (org.apache.axiom.om.OMNamespace) namespaceIterator.next();
        returnMap.put(ns.getPrefix(),ns.getNamespaceURI());
        }
        return returnMap;
        }

        private org.apache.axis2.AxisFault createAxisFault(java.lang.Exception e) {
        org.apache.axis2.AxisFault f;
        Throwable cause = e.getCause();
        if (cause != null) {
            f = new org.apache.axis2.AxisFault(e.getMessage(), cause);
        } else {
            f = new org.apache.axis2.AxisFault(e.getMessage());
        }

        return f;
    }

        }//end of class
    