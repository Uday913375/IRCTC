package com.uday.service;

import java.util.Collection;

import com.uday.bindings.Passenger;
import com.uday.bindings.Ticket;

public interface TicketService {

	public Ticket bookTicket(Passenger p);
	public Collection<Ticket> getAllTickets();
	
}
