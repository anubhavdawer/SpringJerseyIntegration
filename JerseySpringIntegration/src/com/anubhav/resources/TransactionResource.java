package com.anubhav.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.anubhav.transaction.Transaction;
import com.anubhav.transactionimpl.TransactionImpl;

@Component
@Path("/transaction")
public class TransactionResource {

	@Autowired
	Transaction transaction;
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response  show() {
		
		String result=transaction.show();
		return Response.status(200).entity(result).build();
	}
}
