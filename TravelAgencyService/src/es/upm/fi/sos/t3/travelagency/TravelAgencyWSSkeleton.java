
/**
 * TravelAgencyWSSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
package es.upm.fi.sos.t3.travelagency;

import java.rmi.RemoteException;

import org.apache.axis2.AxisFault;

import es.upm.fi.sos.t3.flightbooking.client.FlightBookingWSStub;
import es.upm.fi.sos.t3.flightbooking.client.FlightBookingWSStub.BookingFlight;
import es.upm.fi.sos.t3.flightbooking.client.FlightBookingWSStub.BookingFlightResponse;
import es.upm.fi.sos.t3.flightbooking.client.FlightBookingWSStub.CancellingFlight;
import es.upm.fi.sos.t3.flightbooking.client.FlightBookingWSStub.CancellingFlightResponse;
import es.upm.fi.sos.t3.flightbooking.client.FlightBookingWSStub.CheckingFlight;
import es.upm.fi.sos.t3.flightbooking.client.FlightBookingWSStub.CheckingFlightResponse;
import es.upm.fi.sos.t3.flightbooking.client.FlightBookingWSStub.Origin;
import es.upm.fi.sos.t3.flightbooking.client.NotEnoughSeatsError;
import es.upm.fi.sos.t3.flightbooking.client.NotValidDestinationError;
import es.upm.fi.sos.t3.flightbooking.client.NotValidOriginError;
import es.upm.fi.sos.t3.flightbooking.client.NotValidSeatError;
import es.upm.fi.sos.t3.hotelbooking.client.HotelBookingWSStub;
import es.upm.fi.sos.t3.hotelbooking.client.HotelBookingWSStub.BookingHotel;
import es.upm.fi.sos.t3.hotelbooking.client.HotelBookingWSStub.BookingHotelResponse;
import es.upm.fi.sos.t3.hotelbooking.client.HotelBookingWSStub.CancellingHotel;
import es.upm.fi.sos.t3.hotelbooking.client.HotelBookingWSStub.CancellingHotelResponse;
import es.upm.fi.sos.t3.hotelbooking.client.HotelBookingWSStub.CheckingHotel;
import es.upm.fi.sos.t3.hotelbooking.client.HotelBookingWSStub.CheckingHotelResponse;
import es.upm.fi.sos.t3.hotelbooking.client.HotelBookingWSStub.City;
import es.upm.fi.sos.t3.hotelbooking.client.NotEnoughRoomsError;
import es.upm.fi.sos.t3.hotelbooking.client.NotValidCityError;
import es.upm.fi.sos.t3.hotelbooking.client.NotValidHotelError;
import es.upm.fi.sos.t3.hotelbooking.client.NotValidRoomError;
import es.upm.fi.sos.t3.loginservice.client.LoginError;
import es.upm.fi.sos.t3.loginservice.client.LoginServiceWSStub;
import es.upm.fi.sos.t3.loginservice.client.LoginServiceWSStub.LoginToken;
import es.upm.fi.sos.t3.loginservice.client.LoginServiceWSStub.LoginTokenResponse;
/**
 *  TravelAgencyWSSkeleton java skeleton for the axisService
 */
public class TravelAgencyWSSkeleton{
	private Budget presupuesto = new Budget();
	private boolean log = false;
	//private int n_reservas = 0;

	public TravelAgencyWSSkeleton(){
		this.presupuesto.setBudget(10000.0);
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param login 
	 * @return loginResponse 
	 * @throws RemoteServiceError 
	 */

	public es.upm.fi.sos.t3.travelagency.LoginResponse login
	(
			es.upm.fi.sos.t3.travelagency.Login login
			)
					throws RemoteServiceError{

		boolean response = false;
		LoginTokenResponse authCall = null;
		LoginResponse result = new LoginResponse();
		String password = login.getPassword();
		String username = login.getUsername();
		LoginServiceWSStub stub = null;
		try {
			stub = new LoginServiceWSStub();
		} catch (AxisFault e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		LoginToken loginToken = new LoginToken();
		loginToken.setUsername(username);
		loginToken.setPassword(password);
		try {
			authCall = stub.authenticateUser(loginToken);
		} catch (RemoteException e) {
			throw new RemoteServiceError();
		} catch (LoginError e) {
			throw new RemoteServiceError();
		}
		response = authCall.getLoginTokenResponse();
		if(response){ 
			result.setLoginResponse(true);
			this.log = true;
		}
		else {
			result.setLoginResponse(false);
		}
		return result;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @return  
	 */

	public void logout
	(

			)
	{
		this.log = false;

	}

	/**
	 * Auto generated method signature
	 * 
	 * @return budget 
	 * @throws NotValidSessionError 
	 */

	public es.upm.fi.sos.t3.travelagency.Budget getBudget
	(

			)
					throws NotValidSessionError{


		if(this.log = false) throw new NotValidSessionError();
		return this.presupuesto;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param checkingTrip 
	 * @return checkingTripResponse 
	 * @throws NotValidOriginFlightError 
	 * @throws NotValidDestinationFlightError 
	 * @throws NotValidCityHotelError 
	 * @throws NotValidHotelHotelError 
	 * @throws RemoteServiceError 
	 * @throws NotValidSessionError 
	 */

	public es.upm.fi.sos.t3.travelagency.CheckingTripResponse checkTrip
	(
			es.upm.fi.sos.t3.travelagency.CheckingTrip checkingTrip
			)
					throws NotValidOriginFlightError,NotValidDestinationFlightError,NotValidCityHotelError,NotValidHotelHotelError,RemoteServiceError,NotValidSessionError{

		/* Tomar datos del objeto checkingTrip de entrada */
		String origen = checkingTrip.getOrigin();
		String destino = checkingTrip.getDestination();
		String hotel = checkingTrip.getHotel();

		/* Datos para la salida */
		double precioAsientos;
		int numeroAsientos;
		double precioHotel;
		int habitacionesHotel;
		CheckingTripResponse ctresponse = new CheckingTripResponse();

		/* Uso del servicio FlightBooking para obtener los datos */
		CheckingOnlyFlight checkingOnlyFlight = new CheckingOnlyFlight();
		checkingOnlyFlight.setOrigin(origen);
		checkingOnlyFlight.setDestination(destino);
		CheckingOnlyFlightResponse cfresponse = checkOnlyFlight(checkingOnlyFlight);
		precioAsientos = cfresponse.getPrice();
		numeroAsientos = cfresponse.getSeatAvailability();

		/* Uso del servicio HotelBooking para obtener los datos */
		CheckingOnlyHotel checkingOnlyHotel = new CheckingOnlyHotel();
		checkingOnlyHotel.setCity(destino);
		checkingOnlyHotel.setHotel(hotel);
		CheckingOnlyHotelResponse chresponse = checkOnlyHotel(checkingOnlyHotel);
		precioHotel= chresponse.getPrice();
		habitacionesHotel= chresponse.getRoomAvailability();

		/* Establecer datos en objeto CheckingTripResponse */
		ctresponse.setRoomAvailability(habitacionesHotel);
		ctresponse.setRoomPrice(precioHotel);
		ctresponse.setSeatAvailability(numeroAsientos);
		ctresponse.setSeatPrice(precioAsientos);

		return ctresponse;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param bookingTrip 
	 * @return bookingTripResponse 
	 * @throws NotValidOriginFlightError 
	 * @throws NotValidDestinationFlightError 
	 * @throws NotEnoughSeatsFlightError 
	 * @throws NotValidSeatFlightError 
	 * @throws NotValidCityHotelError 
	 * @throws NotValidHotelHotelError 
	 * @throws NotEnoughRoomsHotelError 
	 * @throws NotValidRoomHotelError 
	 * @throws RemoteServiceError 
	 * @throws NotValidSessionError 
	 * @throws NotEnoughBudgetError 
	 */

	public es.upm.fi.sos.t3.travelagency.BookingTripResponse bookTrip
	(
			es.upm.fi.sos.t3.travelagency.BookingTrip bookingTrip
			)
					throws NotValidOriginFlightError,NotValidDestinationFlightError,NotEnoughSeatsFlightError,NotValidSeatFlightError,NotValidCityHotelError,NotValidHotelHotelError,NotEnoughRoomsHotelError,NotValidRoomHotelError,RemoteServiceError,NotValidSessionError,NotEnoughBudgetError{

		// este metodo debe hacer la reserva de un viaje completo, haciendo la reserva 
		// del vuelo y del hotel


		/* Tomar datos del objeto de entrada bookingTrip */

		String origen = bookingTrip.getOrigin();
		String ciudad = bookingTrip.getDestination();
		String hotel = bookingTrip.getHotel();
		int n_asientos = bookingTrip.getSeat();
		int n_habitaciones = bookingTrip.getRoom();

		/* Crear objetos tipo BookingOnlyFlight y BookingOnlyHotel*/

		BookingOnlyFlight bookingOnlyFlight = new BookingOnlyFlight();
		BookingOnlyHotel bookingOnlyHotel = new BookingOnlyHotel();

		/* Establecer parametros de las llamadas */

		bookingOnlyFlight.setOrigin(origen);
		bookingOnlyFlight.setDestination(ciudad);
		bookingOnlyFlight.setSeat(n_asientos);

		bookingOnlyHotel.setCity(ciudad);
		bookingOnlyHotel.setHotel(hotel);
		bookingOnlyHotel.setRoom(n_habitaciones);

		/* Uso de las operaciones de la interfaz de TravelAgency*/
		BookingOnlyFlightResponse BFresponse = bookOnlyFlight(bookingOnlyFlight);
		BookingOnlyHotelResponse BHresponse = bookOnlyHotel(bookingOnlyHotel);

		/* Obtener resultados */
		boolean flight_success = BFresponse.getBookingResult();
		double flight_price = BFresponse.getPrice();

		boolean hotel_success = BHresponse.getBookingResult();
		double hotel_price = BHresponse.getPrice();
		
		/* En caso de fallo en alguna de las reservas, se revierten los cambios del presupuesto
		 * cancelando las reservas */
		if(!flight_success){
			CancellingOnlyFlight cancelFB = new CancellingOnlyFlight();
			cancelFB.setOrigin(origen);
			cancelFB.setDestination(ciudad);
			cancelFB.setSeat(n_asientos);
			cancelOnlyFlight(cancelFB);
		}
		if(!hotel_success){
			CancellingOnlyHotel cancelHB = new CancellingOnlyHotel();
			cancelHB.setCity(ciudad);
			cancelHB.setHotel(hotel);
			cancelHB.setRoom(n_habitaciones);
			cancelOnlyHotel(cancelHB);
			}

		/* Preparar respuesta */
		BookingTripResponse result = new BookingTripResponse();
		result.setBookingResult(flight_success && hotel_success);
		result.setPrice(flight_price + hotel_price);
		
		return result;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @return originFlightList 
	 * @throws RemoteServiceError 
	 * @throws NotValidSessionError 
	 */

	public es.upm.fi.sos.t3.travelagency.OriginFlightList getOriginFlightList
	(

			)
					throws RemoteServiceError,NotValidSessionError{
		// este metodo debe devolver un objeto de tipo OriginFlightList con una
		// lista de los origenes de vuelos

		// Se comprueba la validez de un login previo
		if(this.log == true){

			OriginFlightList result = new OriginFlightList();
			String[] listaOrigenes;
			try {
				FlightBookingWSStub FBstub = new FlightBookingWSStub();
				listaOrigenes = FBstub.getOriginList().getOrigin();
				result.setOrigin(listaOrigenes);
			} catch (RemoteException e) {
				throw new RemoteServiceError();
			}
			return result;
		}
		else{
			throw new NotValidSessionError();
		}
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param originFlight 
	 * @return destinationFlightList 
	 * @throws NotValidOriginFlightError 
	 * @throws RemoteServiceError 
	 * @throws NotValidSessionError 
	 */

	public es.upm.fi.sos.t3.travelagency.DestinationFlightList getDestinationFlightList
	(
			es.upm.fi.sos.t3.travelagency.OriginFlight originFlight
			)
					throws NotValidOriginFlightError,RemoteServiceError,NotValidSessionError{
		// este metodo debe devolver un objeto de tipo DestinationFlightList con una
		// lista de los destinos de vuelos correspondientes al origen del objeto
		// originFlight

		// Se comprueba la validez de un login previo

		if(this.log == true){
			DestinationFlightList result = new DestinationFlightList();
			FlightBookingWSStub FBstub;
			try {
				FBstub = new FlightBookingWSStub();
				String origen = originFlight.getOriginFlight();
				Origin origin = new Origin();
				origin.setOrigin(origen);

				String[] listaDestinos = FBstub.getDestinationList(origin).getDestination();
				result.setDestination(listaDestinos);
			} catch (AxisFault e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (RemoteException e) {
				throw new RemoteServiceError();
			} catch (NotValidOriginError e) {
				throw new NotValidOriginFlightError();
			}
			return result;
		}
		else{
			throw new NotValidSessionError();
		}
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param checkingOnlyFlight 
	 * @return checkingOnlyFlightResponse 
	 * @throws NotValidOriginFlightError 
	 * @throws NotValidDestinationFlightError 
	 * @throws RemoteServiceError 
	 * @throws NotValidSessionError 
	 */

	public es.upm.fi.sos.t3.travelagency.CheckingOnlyFlightResponse checkOnlyFlight
	(
			es.upm.fi.sos.t3.travelagency.CheckingOnlyFlight checkingOnlyFlight
			)
					throws NotValidOriginFlightError,NotValidDestinationFlightError,RemoteServiceError,NotValidSessionError{
		// este metodo debe devolver un objeto de tipo CheckingOnlyFlightResponse con datos
		// sobre el numero de asientos disponibles en el vuelo y sus precios. A traves del
		// objeto checkingOnlyFlight que se pasa como parámetro se obtienen los datos
		// las ciudades origen y destino sobre las que se consulta.

		// Se comprueba la validez de un login previo
		// Se comprueba

		if(this.log == true){
			CheckingOnlyFlightResponse result = new CheckingOnlyFlightResponse();
			String origen = checkingOnlyFlight.getOrigin();
			String destino = checkingOnlyFlight.getDestination();

			FlightBookingWSStub FBstub;
			try {
				FBstub = new FlightBookingWSStub();
				CheckingFlight checkingFlight = new CheckingFlight();
				checkingFlight.setOrigin(origen);
				checkingFlight.setDestination(destino);
				CheckingFlightResponse cfresponse = FBstub.checkFlight(checkingFlight);

				double precioAsientos = cfresponse.getPrice();
				int numeroAsientos = cfresponse.getSeatAvailability();
				result.setPrice(precioAsientos);
				result.setSeatAvailability(numeroAsientos);

			} catch (AxisFault e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (RemoteException e) {
				throw new RemoteServiceError();
			} catch (NotValidOriginError e) {
				throw new NotValidOriginFlightError();
			} catch (NotValidDestinationError e) {
				throw new NotValidDestinationFlightError();
			}
			return result;
		}
		else{
			throw new NotValidSessionError();
		}

	}

	/**
	 * Auto generated method signature
	 * 
	 * @param bookingOnlyFlight 
	 * @return bookingOnlyFlightResponse 
	 * @throws NotValidOriginFlightError 
	 * @throws NotValidDestinationFlightError 
	 * @throws NotEnoughSeatsFlightError 
	 * @throws NotValidSeatFlightError 
	 * @throws RemoteServiceError 
	 * @throws NotValidSessionError 
	 * @throws NotEnoughBudgetError 
	 */

	public es.upm.fi.sos.t3.travelagency.BookingOnlyFlightResponse bookOnlyFlight
	(
			es.upm.fi.sos.t3.travelagency.BookingOnlyFlight bookingOnlyFlight
			)
					throws NotValidOriginFlightError,NotValidDestinationFlightError,NotEnoughSeatsFlightError,NotValidSeatFlightError,RemoteServiceError,NotValidSessionError,NotEnoughBudgetError{

		//este metodo debe realizar la reserva de un vuelo dado el numero de asientos a reservar
		//la ciudad origen y la ciudad destino. Devolverá un boolean indicando el éxito de la
		//reserva y el precio de la reserva.


		if(this.log==true){
			/* Datos para la peticion al servicio FlightBookingService */
			BookingOnlyFlightResponse result = new BookingOnlyFlightResponse();

			String origen = bookingOnlyFlight.getOrigin();
			String destino = bookingOnlyFlight.getDestination();
			int n_asientos = bookingOnlyFlight.getSeat();
			
			BookingFlight bookingFlight = new BookingFlight();

			bookingFlight.setOrigin(origen);
			bookingFlight.setDestination(destino);
			bookingFlight.setSeat(n_asientos);

			try {
				/* Peticion */
				FlightBookingWSStub FBstub = new FlightBookingWSStub();
				BookingFlightResponse bookingFlightResponse = new BookingFlightResponse();
				bookingFlightResponse = FBstub.bookFlight(bookingFlight);

				/* Respuesta a la peticion*/
				boolean success = bookingFlightResponse.getBookingResult();
				double price = bookingFlightResponse.getPrice();
				
				result.setBookingResult(success);
				result.setPrice(price);
				
				// Si la reserva tiene exito y el presupuesto lo permite, se actualiza el
				// presupuesto
				if(success && this.presupuesto.getBudget() >= price){
					this.presupuesto.setBudget(this.presupuesto.getBudget() - price);
				}
				

			} catch (AxisFault e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (RemoteException e) {
				throw new RemoteServiceError();
			} catch (NotValidOriginError e) {
				throw new NotValidOriginFlightError();
			} catch (NotValidDestinationError e) {
				throw new NotValidDestinationFlightError();
			} catch (NotEnoughSeatsError e) {
				throw new NotEnoughSeatsFlightError();
			} catch (NotValidSeatError e) {
				throw new NotValidSeatFlightError();
			}

			return result;
		}
		else{
			throw new NotValidSessionError();
		}
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param cancellingOnlyFlight 
	 * @return cancellingOnlyFlightResponse 
	 * @throws NotValidOriginFlightError 
	 * @throws NotValidDestinationFlightError 
	 * @throws NotEnoughSeatsFlightError 
	 * @throws NotValidSeatFlightError 
	 * @throws RemoteServiceError 
	 * @throws NotValidSessionError 
	 */

	public es.upm.fi.sos.t3.travelagency.CancellingOnlyFlightResponse cancelOnlyFlight
	(
			es.upm.fi.sos.t3.travelagency.CancellingOnlyFlight cancellingOnlyFlight
			)
					throws NotValidOriginFlightError,NotValidDestinationFlightError,NotEnoughSeatsFlightError,NotValidSeatFlightError,RemoteServiceError,NotValidSessionError{

		//este metodo debe cancelar la reserva de un vuelo dado el numero de asientos a cancelar,
		//la ciudad origen y la ciudad destino. Devolverá un boolean indicando el éxito de la
		//cancelacion y el precio a devolver. 
		
		if(this.log == true){
			// Datos para la peticion al servicio FlightBookingService
			CancellingOnlyFlightResponse result = new CancellingOnlyFlightResponse();
			
			int n_asientos = cancellingOnlyFlight.getSeat();
			String origen = cancellingOnlyFlight.getOrigin();
			String destino = cancellingOnlyFlight.getDestination();
			
			CancellingFlight request = new CancellingFlight();
			request.setOrigin(origen);
			request.setDestination(destino);
			request.setSeat(n_asientos);
			
			// Peticion
			FlightBookingWSStub FBstub;
			try {
				CancellingFlightResponse response = new CancellingFlightResponse();
				FBstub = new FlightBookingWSStub();
				response = FBstub.cancelFlight(request);
				
				// Respuesta a la peticion
				boolean success = response.getCancellingResult();
				double price = response.getReturnedMoney();
				
				result.setCancellingOnlyFlightResponse(success);
				
				// Si la cancelacion tiene exito, se actualiza el presupuesto
				if(success){
					this.presupuesto.setBudget(this.presupuesto.getBudget() + price);
				}
				
			} catch (AxisFault e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (RemoteException e) {
				throw new RemoteServiceError();
			} catch (NotValidOriginError e) {
				throw new NotValidOriginFlightError();
			} catch (NotValidDestinationError e) {
				throw new NotValidDestinationFlightError();
			} catch (NotEnoughSeatsError e) {
				throw new NotEnoughSeatsFlightError();
			} catch (NotValidSeatError e) {
				throw new NotValidSeatFlightError();
			}
			return result;
		}
		else
			throw new NotValidSessionError();
	}

	/**
	 * Auto generated method signature
	 * 
	 * @return cityHotelList 
	 * @throws RemoteServiceError 
	 * @throws NotValidSessionError 
	 */

	public es.upm.fi.sos.t3.travelagency.CityHotelList getCityHotelList
	(

			)
					throws RemoteServiceError,NotValidSessionError{
		// este metodo debe devolver un objeto de tipo CityHotelList con una
		// lista de las ciudades con hoteles

		// Se comprueba la validez de un login previo

		if(this.log == true){
			CityHotelList result = new CityHotelList();

			HotelBookingWSStub HBstub;
			try {
				HBstub = new HotelBookingWSStub();
				String[] listaCiudades = HBstub.getCityList().getCity();
				result.setCity(listaCiudades);
			} catch (AxisFault e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (RemoteException e) {
				throw new RemoteServiceError();
			}
			return result;
		}
		else{
			throw new NotValidSessionError();
		}
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param cityHotel 
	 * @return hotelHotelList 
	 * @throws NotValidCityHotelError 
	 * @throws RemoteServiceError 
	 * @throws NotValidSessionError 
	 */

	public es.upm.fi.sos.t3.travelagency.HotelHotelList getHotelHotelList
	(
			es.upm.fi.sos.t3.travelagency.CityHotel cityHotel
			)
					throws NotValidCityHotelError,RemoteServiceError,NotValidSessionError{
		// este metodo debe devolver un objeto de tipo HotelHotelList con una
		// lista de los hoteles que hay en la ciudad cityHotel

		// Se comprueba la validez de un login previo

		if(this.log == true ){
			HotelHotelList result = new HotelHotelList();
			HotelBookingWSStub HBstub;

			try {
				HBstub = new HotelBookingWSStub();
				City city = new City();
				city.setCity(cityHotel.getCityHotel());
				String[] listaHoteles = HBstub.getHotelList(city).getHotel();
				result.setHotel(listaHoteles);
			} catch (AxisFault e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (RemoteException e) {
				throw new RemoteServiceError();
			} catch (NotValidCityError e) {
				throw new NotValidCityHotelError();
			}
			return result;
		}
		else{
			throw new NotValidSessionError();
		}
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param checkingOnlyHotel 
	 * @return checkingOnlyHotelResponse 
	 * @throws NotValidCityHotelError 
	 * @throws NotValidHotelHotelError 
	 * @throws RemoteServiceError 
	 * @throws NotValidSessionError 
	 */

	public es.upm.fi.sos.t3.travelagency.CheckingOnlyHotelResponse checkOnlyHotel
	(
			es.upm.fi.sos.t3.travelagency.CheckingOnlyHotel checkingOnlyHotel
			)
					throws NotValidCityHotelError,NotValidHotelHotelError,RemoteServiceError,NotValidSessionError{
		// este metodo debe devolver un objeto de tipo CheckingOnlyHotelResponse con datos
		// sobre el numero de habitaciones disponibles en el hotel y sus precios. A traves del
		// objeto checkingOnlyHotel que se pasa como parámetro se obtienen los datos
		// sobre la ciudad y el hotel sobre la que se consulta.

		// Se comprueba la validez de un login previo
		if(this.log = true){
		CheckingOnlyHotelResponse result = new CheckingOnlyHotelResponse();
		String ciudad = checkingOnlyHotel.getCity();
		String hotel = checkingOnlyHotel.getHotel();

		HotelBookingWSStub HBstub;
		try {
			HBstub = new HotelBookingWSStub();
			CheckingHotel checkingHotel = new CheckingHotel();
			checkingHotel.setCity(ciudad);
			checkingHotel.setHotel(hotel);
			CheckingHotelResponse chresponse = HBstub.checkHotel(checkingHotel);

			double precioHotel= chresponse.getPrice();
			int habitacionesHotel= chresponse.getRoomAvailability();

			result.setPrice(precioHotel);
			result.setRoomAvailability(habitacionesHotel);

		} catch (AxisFault e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			throw new RemoteServiceError();
		} catch (NotValidCityError e) {
			throw new NotValidCityHotelError();
		} catch (NotValidHotelError e) {
			throw new NotValidHotelHotelError();
		}
		return result;
		}
		else{
			throw new NotValidSessionError();
		}
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param bookingOnlyHotel 
	 * @return bookingOnlyHotelResponse 
	 * @throws NotValidCityHotelError 
	 * @throws NotValidHotelHotelError 
	 * @throws NotEnoughRoomsHotelError 
	 * @throws NotValidRoomHotelError 
	 * @throws RemoteServiceError 
	 * @throws NotValidSessionError 
	 * @throws NotEnoughBudgetError 
	 */

	public es.upm.fi.sos.t3.travelagency.BookingOnlyHotelResponse bookOnlyHotel
	(
			es.upm.fi.sos.t3.travelagency.BookingOnlyHotel bookingOnlyHotel
			)
					throws NotValidCityHotelError,NotValidHotelHotelError,NotEnoughRoomsHotelError,NotValidRoomHotelError,RemoteServiceError,NotValidSessionError,NotEnoughBudgetError{
		//este metodo debe realizar la reserva de una/varias habitaciones de un hotel dado el
		//el numero de habitaciones, la ciudad y el hotel. Devolverá un boolean indicando el éxito de la
		//reserva y el precio de la reserva.


		if(this.log==true){
			/* Datos para la peticion */
			BookingOnlyHotelResponse result = new BookingOnlyHotelResponse();

			String ciudad = bookingOnlyHotel.getCity();
			String hotel = bookingOnlyHotel.getHotel();
			int n_habitaciones = bookingOnlyHotel.getRoom();

			BookingHotel bookingHotel = new BookingHotel();

			bookingHotel.setCity(ciudad);
			bookingHotel.setHotel(hotel);
			bookingHotel.setRoom(n_habitaciones);

			try {
				/* Peticion */
				HotelBookingWSStub HBstub = new HotelBookingWSStub();
				BookingHotelResponse bookingHotelResponse = new BookingHotelResponse();
				bookingHotelResponse = HBstub.bookHotel(bookingHotel);
				
				/* Respuesta a la peticion*/
				boolean success = bookingHotelResponse.getBookingResult();
				double price = bookingHotelResponse.getPrice();
				
				result.setBookingResult(success);
				result.setPrice(price);
				
				// Si la reserva tiene exito y el presupuesto lo permite, se actualiza el
				// presupuesto
				if(success && this.presupuesto.getBudget() >= price){
					this.presupuesto.setBudget(this.presupuesto.getBudget() - price);
				}

			} catch (AxisFault e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (RemoteException e) {
				throw new RemoteServiceError();
			} catch (NotValidCityError e) {
				throw new NotValidCityHotelError();
			} catch (NotValidHotelError e) {
				throw new NotValidHotelHotelError();
			} catch (NotEnoughRoomsError e) {
				throw new NotEnoughRoomsHotelError();
			} catch (NotValidRoomError e) {
				throw new NotValidRoomHotelError();
			}

			return result;
		}
		else{
			throw new NotValidSessionError();
		}
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param cancellingOnlyHotel 
	 * @return cancellingOnlyHotelResponse 
	 * @throws NotValidCityHotelError 
	 * @throws NotValidHotelHotelError 
	 * @throws NotEnoughRoomsHotelError 
	 * @throws NotValidRoomHotelError 
	 * @throws RemoteServiceError 
	 * @throws NotValidSessionError 
	 */

	public es.upm.fi.sos.t3.travelagency.CancellingOnlyHotelResponse cancelOnlyHotel
	(
			es.upm.fi.sos.t3.travelagency.CancellingOnlyHotel cancellingOnlyHotel
			)
					throws NotValidCityHotelError,NotValidHotelHotelError,NotEnoughRoomsHotelError,NotValidRoomHotelError,RemoteServiceError,NotValidSessionError{
		//este metodo debe cancelar la reserva de un hotel dado el numero de habitaciones a cancelar,
		//la ciudad y el hotel. Devolverá un boolean indicando el éxito de la
		//cancelacion y el precio a devolver. 
		
		if(this.log == true){
			// Datos para la peticion al servicio FlightBookingService
			CancellingOnlyHotelResponse result = new CancellingOnlyHotelResponse();
			
			String ciudad = cancellingOnlyHotel.getCity();
			String hotel = cancellingOnlyHotel.getHotel();
			int n_habitaciones = cancellingOnlyHotel.getRoom();
			
			CancellingHotel request = new CancellingHotel();
			request.setCity(ciudad);
			request.setHotel(hotel);
			request.setRoom(n_habitaciones);

			
			// Peticion
			HotelBookingWSStub HBstub;
			try {
				CancellingHotelResponse response = new CancellingHotelResponse();
				HBstub = new HotelBookingWSStub();
				response = HBstub.cancelHotel(request);
				
				// Respuesta a la peticion
				boolean success = response.getCancellingResult();
				double price = response.getReturnedMoney();
				
				result.setCancellingOnlyHotelResponse(success);
				
				// Si la cancelacion tiene exito, se actualiza el presupuesto
				if(success){
					this.presupuesto.setBudget(this.presupuesto.getBudget() + price);
				}
				
			} catch (AxisFault e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (RemoteException e) {
				throw new RemoteServiceError();
			} catch (NotValidCityError e) {
				throw new NotValidCityHotelError();
			} catch (NotValidHotelError e) {
				throw new NotValidHotelHotelError();
			} catch (NotEnoughRoomsError e) {
				throw new NotEnoughRoomsHotelError();
			} catch (NotValidRoomError e) {
				throw new NotValidRoomHotelError();
			}
			return result;
		}
		else
			throw new NotValidSessionError();
	}

}
