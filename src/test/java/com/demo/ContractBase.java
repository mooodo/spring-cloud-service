/*
 * Created by 2020-05-03 20:35:13 
 */
package com.demo;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import com.demo.service.HelloController;

import io.restassured.module.mockmvc.RestAssuredMockMvc;

/**
 * @author fangang
 */
@RunWith(SpringRunner.class)
public class ContractBase {
	@Before
	public void setup() {
		RestAssuredMockMvc.standaloneSetup(new HelloController());
	}
}
