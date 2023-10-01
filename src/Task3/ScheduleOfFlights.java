package Task3;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class ScheduleOfFlights {
    private List<Flight> flightList = new ArrayList<>();

    public void addFlight(Flight flight) {
        flightList.add(flight);
    }

    public void profitPerDateFromTo(Airport airport, Calendar dateFrom, Calendar dateTo) {
        int profit = 0;
        for (Flight flight : flightList) {
            if (flight.getDepartureAirport().equals(airport) && flight.getDepartureTime().after(dateFrom) && flight.getDepartureTime().before(dateTo)) {
                profit += flight.getTicketPrice();
            }
        }
        System.out.println("Profit per date from " + dateFrom.getTime() + " to " + dateTo.getTime() + " is " + profit);
    }
}
