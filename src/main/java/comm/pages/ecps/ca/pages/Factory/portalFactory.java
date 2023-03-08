package comm.pages.ecps.ca.pages.Factory;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

import org.openqa.selenium.WebDriver;

public class portalFactory {
	
	private static final Function<WebDriver,Commoncomponents> ENG = (d) -> new memberloginenglish(d);
	private static final Function<WebDriver,Commoncomponents> FRE = (d) -> new memberloginfrench(d);
    private static final Map<String, Function<WebDriver,Commoncomponents>> MAP = new HashMap<>();

    static {
    	MAP.put("ENG", ENG);
    	MAP.put("FRE", FRE);
    }

  public static Commoncomponents get(String language , WebDriver driver) {
	  return MAP.get(language).apply(driver);
  }
   
    }









