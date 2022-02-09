package flightManager;

import airline.Airline;
import airport.Airport;
import exception.BadParameterException;
import exception.NullParameterException;
import flight.CommercialFlight;
import flight.Flight;
import flightFactory.FlightFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public final class FlightManager {
    private static FlightManager ourInstance;
    public static FlightManager getInstance() throws Exception{
        if (ourInstance == null)
            ourInstance = new FlightManager();
        return ourInstance;

    }
    private FlightManager(){
    }

    private List<Flight> flights = new ArrayList();

    public UUID createFlight (String type, Airline line, Airport org, Airport dest) throws NullParameterException {
        Flight flight = FlightFactory.createFlight(type, line, org, dest);
        flights.add(flight);
        return flight.getFlightNumber();
    }
    public Flight getFlightByNumber(UUID flightNum) throws BadParameterException {
        for (int i = 0; i<flights.size(); i++) {
            if ((flights.get(i).getFlightNumber()).equals(flightNum))
                return flights.get(i);
        }
       throw new BadParameterException("no matching flightNumber found");
    }
}
