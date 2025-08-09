package com.wipro.mockitodemo1;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;


public class Orderservicetest {
		
		@Test
		void test(){
			Orderservice order = mock(Orderservice.class);
			when(order.placeOrder("“ORD-01”")).thenReturn("Successfull");
			String str = order.placeOrder("“ORD-01”");
			assertEquals(str, "Successfull");
		}

	}