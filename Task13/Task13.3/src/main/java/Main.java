import com.skillbox.airport.Airport;
import com.skillbox.airport.Flight;
import com.skillbox.airport.Terminal;


import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.*;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        Airport airport = Airport.getInstance();
        findPlanesLeavingInTheNextTwoHours(airport);
        System.out.println(findPlanesLeavingInTheNextTwoHours(airport));


    }

    public static List<Flight> findPlanesLeavingInTheNextTwoHours(Airport airport) {
        //TODO Метод должден вернуть список рейсов вылетающих в ближайшие два часа.
        LocalDateTime dateNow = LocalDateTime.now();
        LocalDateTime dateTwoHourPlus = dateNow.plusHours(2);

        return airport.getTerminals()
                .stream()
                .map(Terminal::getFlights)
                .flatMap(List::stream)
                .filter(flight -> {
                            LocalDateTime dateTime = convertToLocalDate(flight.getDate());
                            return flight.getType().equals(Flight.Type.DEPARTURE)
                                    && dateTime.isAfter(dateNow)
                                    && dateTime.isBefore(dateTwoHourPlus);
                        }
                )
                .collect(Collectors.toList());
    }

    public static LocalDateTime convertToLocalDate(Date date) {
        return date.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDateTime();
    }
}