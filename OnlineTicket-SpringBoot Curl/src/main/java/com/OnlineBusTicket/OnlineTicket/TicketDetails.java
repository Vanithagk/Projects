package com.OnlineBusTicket.OnlineTicket;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class TicketDetails {
    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
    private String name;
   // @Size( max = 10,message="Mobile Number must be 10 digits")
    private long mobileNo;
   // @Size(min = 1, max = 30,message="seta Number within 30")
    private int seatNo;
   // @NotEmpty(message="Should not empty")
    private String source;
  //  @NotEmpty(message="Should not empty")
    private String destination;

    // Default constructor
    public TicketDetails() {
    	
    }

    // Parameterized constructor
    public TicketDetails(String name, long mobileNo, int seatNo, String source, String destination) {
        this.name = name;
        this.mobileNo = mobileNo;
        this.seatNo = seatNo;
        this.source = source;
        this.destination = destination;
    }

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public int getSeatNo() {
		return seatNo;
	}

	public void setSeatNo(int seatNo) {
		this.seatNo = seatNo;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	@Override
	public String toString() {
		return "TicketDetails [name=" + name + ", mobileNo=" + mobileNo + ", seatNo=" + seatNo + ", source=" + source + ", destination=" + destination + ", id=" + id + "]";
	}
    

}