package Entities;

public class Booking {
    private String firstName;
    private String lastName;
    private float totalPrice;
    private boolean depositPaid;
    private BookingDates bookingDates;
    private String addtionalNeeds;


    public Booking(String firstName, String lastName, float totalPrice, boolean depositPaid, BookingDates bookingDates, String addtionalNeeds){
        this.firstName = firstName;
        this.lastName = lastName;
        this.totalPrice = totalPrice;
        this.depositPaid = depositPaid;
        this.bookingDates = bookingDates;
        this.addtionalNeeds = addtionalNeeds;

    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }

    public boolean isDepositPaid() {
        return depositPaid;
    }

    public void setDepositPaid(boolean depositPaid) {
        this.depositPaid = depositPaid;
    }

    public BookingDates getBookingDates() {
        return bookingDates;
    }

    public void setBookingDates(BookingDates bookingDates) {
        this.bookingDates = bookingDates;
    }

    public String getAddtionalNeeds() {
        return addtionalNeeds;
    }

    public void setAddtionalNeeds(String addtionalNeeds) {
        this.addtionalNeeds = addtionalNeeds;
    }
}
