package es.upm.fi.sos.t3.travelagency.client;
import es.upm.fi.sos.t3.travelagency.client.*;

public class TravelAgencyClient {
	
	public static void main(String[] args) throws Exception {
		TravelAgencyWSStub gs = new TravelAgencyWSStub();
		CircleArea circleArea = new CircleArea();
		double radius = 1.0;circleArea.setArgs0(radius);
		CircleAreaResponse response = gs.circleArea(circleArea);
		double area = response.get_return();
		System.out.println("Radius: " + radius + ", Area: " + area);
		 }

}
