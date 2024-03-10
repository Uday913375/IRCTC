package com.uday.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.uday.bindings.Passenger;
import com.uday.bindings.Ticket;
@Service
public class TicketServiceImpl implements TicketService {
	Map<Integer, Ticket> db = new HashMap<>();

	@Override
	public Ticket bookTicket(Passenger p) {
		
		Ticket t = new Ticket();
		
		Random r= new Random();
		int id = r.nextInt(500);
		t.setTicketNum(id);
		
		BeanUtils.copyProperties(p, t);
		/*
		 * if (status == true) { System.out.println("status confirmed");
		 * 
		 * } else { System.out.println("failed"); }
		 */
		t.setStatus("Confirmed");
	db.put(id, t);
	return t;
		
	}

	@Override
	public Collection<Ticket> getAllTickets() {
		return db.values();
	}

}
