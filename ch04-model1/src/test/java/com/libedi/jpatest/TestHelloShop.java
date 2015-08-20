package com.libedi.jpatest;

import org.junit.Test;

import com.libedi.jpatest.model.entity.Item;
import com.libedi.jpatest.model.entity.Member;
import com.libedi.jpatest.model.entity.Order;
import com.libedi.jpatest.model.entity.OrderItem;

public class TestHelloShop {

	@Test
	public void createMember(){
		Member member = new Member();
	}
	
	@Test
	public void createOrder(){
		Order order = new Order();
	}
	
	@Test
	public void createOrderItem(){
		OrderItem orderItem = new OrderItem();
	}
	
	@Test
	public void createItem(){
		Item item = new Item();
	}
}
