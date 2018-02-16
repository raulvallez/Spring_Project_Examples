package com.privalia.functional.test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class) //Si no pongo esta línea, no puedo ejecutarlo como junit
@CucumberOptions(features = "/src/test/resources")
public class RunCukesTest {

}
