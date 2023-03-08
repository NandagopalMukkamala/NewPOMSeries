package com.qa.portal.ecps.ca.enironments;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.Config.Sources;

@Sources({
	"classpath:${env}.properties"
})


public interface Environment extends Config{

	String url();
	
	String username();
	
	String password();

}
