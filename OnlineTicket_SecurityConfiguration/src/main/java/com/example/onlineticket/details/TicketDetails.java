package com.example.onlineticket.details;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

@Entity
public class TicketDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@NotBlank(message="Name is Mandatory")
    private String name;
    @Pattern(regexp = "[6-9]\\d{9}", message = "Mobile number must be 10 digits and start with 6, 7, 8, or 9")
    private String mobileNo;
    @NotNull(message = "Number of seats is mandatory")
    @Min(value = 1, message = "At least 1 seat must be booked")    
    private int seatNo;
	@NotBlank(message="Start location is Mandatory")
    private String source;
	@NotBlank(message="Destination is Mandatory")
    private String destination;

    // Default constructor
    public TicketDetails() {
    	
    }

    // Parameterized constructor
    public TicketDetails(String name, String mobileNo, int seatNo, String source, String destination) {
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

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
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
