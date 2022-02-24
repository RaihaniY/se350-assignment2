package airline;

import exception.BadParameterException;
import exception.NullParameterException;

import java.util.HashMap;
import java.util.Map;

public class AirlineFactory {
    private static Map<String, Airline> airlineCache = new HashMap<>();

    private AirlineFactory(){}

    public static Airline getAirline(String name){
        return airlineCache.computeIfAbsent(name, newName -> {
            try {
                return new Airline(name);
            } catch (NullParameterException e) {
                e.printStackTrace();
            } catch (BadParameterException e) {
                e.printStackTrace();
            }
            return null;
        });
    }
}
