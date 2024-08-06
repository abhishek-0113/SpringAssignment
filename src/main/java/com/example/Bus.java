package com.example;

public class Bus {
    private String busname;
    private String location;
    private double ticketPrice;

    // Getters and Setters
    public String getBusname() {
        return busname;
    }

    public void setBusname(String busname) {
        this.busname = busname;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

	@Override
	public String toString() {
		return "Bus [busname=" + busname + ", location=" + location + ", ticketPrice=" + ticketPrice + "]";
	}
    
}
