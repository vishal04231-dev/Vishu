class HotelBooking {
    String guest;
    String room;
    int nights;

    HotelBooking() {
        guest = "guest";
        room = "standard";
        nights = 1;
    }

    HotelBooking(String g, String r, int n) {
        guest = g;
        room = r;
        nights = n;
    }

    HotelBooking(HotelBooking h) {
        guest = h.guest;
        room = h.room;
        nights = h.nights;
    }

    void show() {
        System.out.println("Guest: " + guest);
        System.out.println("Room: " + room);
        System.out.println("Nights: " + nights);
    }

    public static void main(String[] args) {
        HotelBooking b1 = new HotelBooking();
        HotelBooking b2 = new HotelBooking("Amit", "Deluxe", 3);
        HotelBooking b3 = new HotelBooking(b2);
        b1.show();
        b2.show();
        b3.show();
    }
}
