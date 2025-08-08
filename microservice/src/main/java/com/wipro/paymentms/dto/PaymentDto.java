package com.wipro.paymentms.dto;

import lombok.Data;

@Data
public class PaymentDto {
	
	int id;
	int orderId;
	boolean paymentStatus;
	double paymentAmount;

}