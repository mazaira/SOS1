package es.upm.fi.sos.t3.travelagency.client;
import es.upm.fi.sos.t3.travelagency.client.TravelAgencyWSStub.*;

import java.rmi.RemoteException;

import org.apache.axis2.*;

public class TravelAgencyClient {
	
	public static void main(String[] args)  {
		
		TravelAgencyWSStub ts=null;
		try {
			ts = new TravelAgencyWSStub();
			ts._getServiceClient().getOptions().setManageSession(true);
			ts._getServiceClient().engageModule("addressing");
		} catch (AxisFault e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//Test1
		
		Login Test1= new Login();
		Test1.setUsername("111");
		Test1.setPassword("333");
		
		try {
			if(ts.login(Test1).getLoginResponse())
				System.out.println("Successful Login, fail Test1");
			else
				System.out.println("Login Failure, success Test1");
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteServiceError e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Test2
		
		try {
			ts.getBudget();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NotValidSessionError e) {
			// TODO Auto-generated catch block
			System.out.println("Test2: Success");
			e.printStackTrace();
		}
		
		//Test3
		
		Login Test3= new Login();
		Test3.setUsername("44084511");
		Test3.setPassword("11548044");
		try {
			if(ts.login(Test3).getLoginResponse())
				System.out.println("Successful Login, success Test3");
			else
				System.out.println("Login Failure, fail Test3");
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteServiceError e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Test4
		try {
			String originFlightList[] = ts.getOriginFlightList().getOrigin();
			System.out.println("Test4: Success");
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteServiceError e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NotValidSessionError e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Test5
		
		try {
			double budget =ts.getBudget().getBudget();
			System.out.println("Test5: Success");
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NotValidSessionError e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		//Test6
		OriginFlight origin=new OriginFlight();
		String originFlightList[];
		try {
			originFlightList = ts.getOriginFlightList().getOrigin();
			
			for(int i=0;i<3;i++){
				origin.setOriginFlight(originFlightList[i]);
				try {
					String destination[]=ts.getDestinationFlightList(origin).getDestination();
				} catch (NotValidOriginFlightError e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			System.out.println("Test6: Success");
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteServiceError e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NotValidSessionError e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Test7
		BookingOnlyHotel booking= new BookingOnlyHotel();
		try {
			booking.setCity(ts.getCityHotelList().getCity()[0]);
			
			CityHotel city= new CityHotel();
			city.setCityHotel(ts.getCityHotelList().getCity()[0]);
			String hotel=null;
			try {
				hotel = ts.getHotelHotelList(city).getHotel()[0];
				booking.setHotel(hotel);
			} catch (NotValidCityHotelError e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			booking.setRoom(3);
			try {
				BookingOnlyHotelResponse response=ts.bookOnlyHotel(booking);
				if(response.getBookingResult())
					System.out.println("Test7:Success");
				else
					System.out.println("Test7: Failure");
					
			} catch (NotValidCityHotelError e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (NotValidHotelHotelError e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (NotEnoughRoomsHotelError e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (NotValidRoomHotelError e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (NotEnoughBudgetError e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteServiceError e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NotValidSessionError e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//Test 8
		//reciclying booking var from last test
		try {
			booking.setCity(ts.getCityHotelList().getCity()[0]);
			
			CityHotel city= new CityHotel();
			city.setCityHotel(ts.getCityHotelList().getCity()[0]);
			String hotel=null;
			try {
				hotel = ts.getHotelHotelList(city).getHotel()[0];
				booking.setHotel(hotel);
			} catch (NotValidCityHotelError e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			booking.setRoom(3);
			try {
				BookingOnlyHotelResponse response=ts.bookOnlyHotel(booking);
				if(10000-response.getPrice()==ts.getBudget().getBudget())
					System.out.println("Test8:Success");
				else
					System.out.println("Test8: Failure");
					
			} catch (NotValidCityHotelError e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (NotValidHotelHotelError e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (NotEnoughRoomsHotelError e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (NotValidRoomHotelError e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (NotEnoughBudgetError e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteServiceError e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NotValidSessionError e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Test 9
		
		BookingTrip bookingTrip=new BookingTrip();
		try {
			bookingTrip.setOrigin(ts.getCityHotelList().getCity()[1]);
			bookingTrip.setDestination(ts.getCityHotelList().getCity()[0]);
			bookingTrip.setSeat(3);
			bookingTrip.setRoom(3);
			
			CityHotel city= new CityHotel();
			city.setCityHotel(ts.getCityHotelList().getCity()[0]);
			String hotel=null;
			try {
				hotel = ts.getHotelHotelList(city).getHotel()[0];
				bookingTrip.setHotel(hotel);
			} catch (NotValidCityHotelError e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		
				BookingTripResponse response;
				try {
					response = ts.bookTrip(bookingTrip);
					if(response.getBookingResult())
						System.out.println("Test9:Success");
					else
						System.out.println("Test9: Failure");
				} catch (NotValidOriginFlightError e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (NotValidDestinationFlightError e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (NotEnoughSeatsFlightError e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (NotValidSeatFlightError e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (NotValidCityHotelError e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (NotValidHotelHotelError e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (NotEnoughRoomsHotelError e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (NotValidRoomHotelError e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (NotEnoughBudgetError e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
			
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteServiceError e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NotValidSessionError e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		//Test10
		
		
		//Test11
		try {
			ts.logout();
			System.out.println("Test11:Success");
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Test12
		
		try {
			double budget=ts.getBudget().getBudget();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NotValidSessionError e) {
			// TODO Auto-generated catch block
			System.out.println("Test12:Success");
			e.printStackTrace();
		}
		
		//Test13
		try {
			ts.login(Test3);
			try {
				ts.getBudget().getBudget();
			} catch (NotValidSessionError e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteServiceError e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Test14
		Login login1= new Login();
		Login login2= new Login();
		login1.setUsername("44084511");
		login1.setPassword("11548044");
		login2.setUsername("49139053");
		login2.setPassword("35093194");
		
		TravelAgencyWSStub ts2=null;
		try {
			ts2 = new TravelAgencyWSStub();
			ts2._getServiceClient().getOptions().setManageSession(true);
			ts2._getServiceClient().engageModule("addressing");
		} catch (AxisFault e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			ts.login(login1);
			
			ts2.login(login2);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteServiceError e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	 }
	
	
	
	
	
}
