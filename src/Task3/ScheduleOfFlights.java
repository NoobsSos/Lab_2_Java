package Task3;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class ScheduleOfFlights {
    private List<Flight> flightList = new ArrayList<>();

    public void addFlight(Flight flight) {
        flightList.add(flight);
    }

    public void printSchedule() {
        for (Flight flight : this.flightList) {
            System.out.println("Flight " + flight.getId() + " from " + flight.getDepartureAirport().getId() + " to " + flight.getArrivalAirport().getId() + " at " + flight.getDepartureTime() + " with " + flight.getTicketPrice() + " price");
        }
    }

    public void profitPerDateFromTo(LocalDateTime dateFrom, LocalDateTime dateTo) {
        int profit = 0;
        for (Flight flight : this.flightList) {
            LocalDateTime departureTime = flight.getDepartureTime();
            if (departureTime.isAfter(dateFrom) && departureTime.isBefore(dateTo)) {
                profit += flight.getTotalTicketPrice();
            }
        }
        System.out.println("Profit per date from " + dateFrom + " to " + dateTo + " is " + profit);
    }
}
