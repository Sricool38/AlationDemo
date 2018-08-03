package Alation.com.Pages.Factory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.Map;

import org.yaml.snakeyaml.Yaml;

public class ObjectFactory {
	private static Map<String, Object> environment;
	private static Map<String, Object> properties = new LinkedHashMap<String, Object>();
	/*This block will read the selectors from locator.yml file*/
	  public String getLocator(String key)  {
		try { 
			InputStream inputStream = new FileInputStream("src/test/resources/locators.yml");
		       Yaml yaml = new Yaml();
		       @SuppressWarnings("unchecked")
			Map<String, Map<String, Object>> data = ((Map<String, Map<String, Object>>) yaml
		               .load(inputStream));
		       environment = (Map<String, Object>) data.get("locator");
		       for (Map.Entry<?, ?> entry : ((Map<?, ?>) environment).entrySet()) {
		                properties.put(entry.getKey().toString(), entry.getValue());
		       }
		       return (String) properties.get(key) ;
		    }   
	 catch(FileNotFoundException e) {
		 return "File is not available" ;
	 }
	  
		
	  }
}

	