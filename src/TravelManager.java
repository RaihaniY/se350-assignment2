import airline.Airline;
import airport.Airport;
import exception.BadParameterException;
import exception.NullParameterException;
import flightManager.FlightManager;

import java.util.UUID;

public class TravelManager {

    public static void main(String[] args) throws Exception {
        try {
            Airline airline = new Airline("Spirit");
            Airport origin = new Airport("ORD");
            Airport destination = new Airport("DFW");
            UUID fNumber;
            fNumber=FlightManager.getInstance().createFlight("commercial", airline, origin, destination);
            System.out.println(FlightManager.getInstance().getFlightByNumber(fNumber));
        } catch (NullParameterException ex) {
            ex.printStackTrace();
        } catch (BadParameterException ex) {
            ex.printStackTrace();
        }
    }

}
