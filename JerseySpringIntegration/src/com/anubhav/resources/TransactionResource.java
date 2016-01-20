package com.anubhav.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.stereotype.Component;

import com.anubhav.transactionimpl.TransactionImpl;

@Component
@Path("/transaction")
public class TransactionResource {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response  show() {
		TransactionImpl impl = new TransactionImpl();
		String result=impl.show();
		return Response.status(200).entity(result).build();
	}
}
