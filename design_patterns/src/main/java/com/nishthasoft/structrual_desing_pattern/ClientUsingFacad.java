package com.nishthasoft.structrual_desing_pattern;

class TravelFacade {

    FlightBooking flightBooking;
    TrainBooking trainBooking;
    HotelBooking hotelBooking;

    enum BookingType{
        Flight,Train,Hotel, Flight_And_Hotel,Train_And_Httel
    }

    public TravelFacade() {
        this.flightBooking = new FlightBooking();
        this.trainBooking = new TrainBooking();
        this.hotelBooking = new HotelBooking();
    }

    public void book(BookingType type,String name){
        switch (type){
            case Flight:
                flightBooking.bookFlight(name);
                return;
            case Hotel:
                hotelBooking.bookFlight(name);
                return;
            case Train:
                trainBooking.bookFlight(name);
                return;
            case Flight_And_Hotel:
                flightBooking.bookFlight(name);
                hotelBooking.bookFlight(name);
                return;
            case Train_And_Httel:
                trainBooking.bookFlight(name);
                hotelBooking.bookFlight(name);
                return;


        }

    }
}

class FlightBooking{

    public void bookFlight(String name){
        System.out.println("Flight booked for " + name);
    }

}
class TrainBooking{
    public void bookFlight(String name){
        System.out.println("Train booked for " + name);
    }

}
class HotelBooking{
    public void bookFlight(String name){
        System.out.println("Hotel booked for " + name);
    }

}

public class ClientUsingFacad{

    public static void main(String[] args) {
        TravelFacade travelFacade = new TravelFacade();
        travelFacade.book(TravelFacade.BookingType.Train,"Meerut");
        travelFacade.book(TravelFacade.BookingType.Flight_And_Hotel,"Shimla");

    }
}