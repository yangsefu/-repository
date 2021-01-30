package com.clive.controller;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.clive.service.BankService;

@RunWith(SpringJUnit4ClassRunner.class)   
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class BankController {
	@Autowired
	private BankService bankService;
	
	@Test	
	public void dome1() {
          bankService.transfer("李磊","韩梅梅",100);
          
	}
}
