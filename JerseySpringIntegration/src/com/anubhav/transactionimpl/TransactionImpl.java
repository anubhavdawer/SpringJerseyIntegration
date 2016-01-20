package com.anubhav.transactionimpl;

import com.anubhav.transaction.Transaction;

public class TransactionImpl implements Transaction{

	@Override
	public String show(){
		return  "Inside Implementation Class";
	}
}
