package flightFactory;

import airline.Airline;
import flight.CommercialFlight;
import airport.Airport;
import exception.*;
import flight.Flight;
import flight.PassengerFlight;

public class FlightFactory {
    private FlightFactory(){
    }

    public static Flight createFlight(String type, Airline airline, Airport origin, Airport destination, int capacity) throws NullParameterException, BadParameterException {
        if (type.equals("commercial")){
            return new CommercialFlight(airline, origin, destination);
        }
        if (type.equals("passenger")){
            return new PassengerFlight(airline, origin, destination, capacity);
        }
        else return null;

    }
}
