package reusables;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;


public class propertiesReusables

{

	public Properties properties;
	public FileInputStream fip;
	public String filePath;
	
	
	
	public propertiesReusables(String filePath) throws IOException
	
	{

		this.filePath = filePath;
		fip = new FileInputStream(filePath);
		
		properties=new Properties();
		properties.load(fip);	
	}
	
	
	public String getPropertyValue(String Key)
	
	{
		String value=null;
		
		if (properties!=null)
		{	
		value=properties.getProperty(Key);
		}
		return value;	
	}
		
	public String getPropertyValue(String key,String defaultValue)
	
	{
		String value=null;
		if (properties!=null)
		{	
		value=properties.getProperty(key);
		}
		
		if (value ==null)
			
		{
			value=defaultValue;
				
		}
		
		
		return value;
			
	}
	
	public void setPropertyEntry(String key,String value) throws IOException
	
	{
		if(properties!=null)
		{
			properties.setProperty(key, value);
			
			FileOutputStream fop=new FileOutputStream(filePath);
			
			properties.store(fop, "successfully logged");
			
		}

	}
	
	
	public Map<String,String>getAllPropertiesData()
	{
		
		Map<String,String>hm=new HashMap<>();
		
		if(properties!=null)
		{
			Set<Object> keys=properties.keySet();
			
			for(Object key : keys)
				
			{
				
				String actualKey=(String)key;
				
				String value=properties.getProperty(actualKey);
				hm.put(actualKey, value);	
			}
					
		}
		
		return hm;	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
