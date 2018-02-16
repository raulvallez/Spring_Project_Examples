package com.privalia.perfiles.test;

import static org.junit.Assert.assertEquals;

import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.rules.SpringClassRule;
import org.springframework.test.context.junit4.rules.SpringMethodRule;

import com.privalia.perfiles.DevEnvConfig;
import com.privalia.perfiles.ProdEnvConfig;
import com.privalia.perfiles.User;


@ActiveProfiles(profiles = "prod")
@ContextConfiguration(classes = { ProdEnvConfig.class })   //Si no pongo Active, el DevEnvConfig luego no la encuentra
public class ProfileProdEnvConfigTest {

	@ClassRule
	public static final SpringClassRule SPRING_CLASS_RULE = new SpringClassRule();
	
	@Rule
	public final SpringMethodRule springMethodRule = new SpringMethodRule();
	
	@Autowired //
	private ProdEnvConfig subject;
	
	@Test
	public void testUser() {
		User user = subject.user();
		assertEquals("Prod User", user.name);
	}	
}
