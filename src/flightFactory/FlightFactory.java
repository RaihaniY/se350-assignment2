package flightFactory;

import airline.Airline;
import flight.CommercialFlight;
import airport.Airport;
import exception.*;
import flight.Flight;

public class FlightFactory {
    private FlightFactory(){

    }
    public static Flight createFlight(String type, Airline airline, Airport origin, Airport destination) throws NullParameterException {
        if (type.equals("commercial")){
            return new CommercialFlight(airline, origin, destination);
        }
        else return null;

    }
}
