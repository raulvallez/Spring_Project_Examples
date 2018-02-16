package com.privalia.functional.test;


import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.ClassRule;
import org.junit.Rule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.rules.SpringClassRule;
import org.springframework.test.context.junit4.rules.SpringMethodRule;

import com.privalia.functional.Belly;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


@ContextConfiguration(classes = {Belly.class} ) //La clase que quiero inyectar
public class StepDefinitions {
	
	
	@ClassRule
	public static final SpringClassRule SPRING_CLASS_RULE = new SpringClassRule();
	
	@Rule
	public final SpringMethodRule springMethodRule = new SpringMethodRule();
	
	@Autowired
	private Belly belly;
	private int waitingTime;
	
	@Given("Î have (\\d+) cuckes in my belly$")
	public void i_have_cuckes_in_my_belly(int cukes) throws Throwable {
		belly.eat(cukes);
	}
	
	
	@When("^I wait (\\d+) hour$")
	public void i_wait_hour(int waitingTime) throws Throwable {
		this.waitingTime = waitingTime;
	}
	
	@Then("^my belly should (.*)$")
	public void my_belly_should_growl(String expectedSound) throws Throwable {
		String actualSound = belly.getSound(waitingTime);
		assertThat(actualSound, is(expectedSound));
	}
	
}
