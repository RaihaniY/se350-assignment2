import airline.Airline;
import airline.AirlineFactory;
import airport.Airport;
import airport.AirportFactory;
import exception.BadParameterException;
import exception.NullParameterException;
import flightManager.FlightManager;

import java.util.UUID;

public class TravelManager {

    public static void main(String[] args) throws Exception {
        try {
            Airline line = AirlineFactory.getAirline("Spirit");
            Airport origin = AirportFactory.getAirport("ORD");
            Airport destination = AirportFactory.getAirport("DFW");
            UUID fNumber;
            fNumber=FlightManager.getInstance().createFlight("passenger", line , origin, destination, 100);

            System.out.println(FlightManager.getInstance().getFlightByNumber(fNumber));
        } catch (NullParameterException ex) {
            ex.printStackTrace();
        } catch (BadParameterException ex) {
            ex.printStackTrace();
        }
    }

}
