package rafieAmandioJSleepJS;
import java.util.Calendar;



public class Invoice extends Serializable
{
    public int buyerId;
    public int renterId;
    public Calendar time;
    public PaymentStatus status;
    public RoomRating rating;

    protected Invoice(int id, int buyerId, int renterId)
    {
        super(id);
        this.buyerId = buyerId;
        this.renterId = renterId;
        this.time = Calendar.getInstance();
        this.status = PaymentStatus.WAITING;
        this.rating = RoomRating.NONE;
    }

    public Invoice(int id,Account buyer, Renter renter)
    {
        super(id);
        this.buyerId = buyer.id;
        this.renterId = renter.id;
        this.time = Calendar.getInstance();
        this.status = PaymentStatus.WAITING;
        this.rating = RoomRating.NONE;
    }

    public String print()
    {
        return "Id :" + id + " BuyerId :" + buyerId + " RenterId : " + renterId +
        " Time : " + time ;

    }
    
    public enum RoomRating{
        NONE,BAD,NEUTRAL,GOOD
    }
    
    public enum PaymentStatus{
        FAILED,WAITING,SUCCESS
    }
    
    
}
