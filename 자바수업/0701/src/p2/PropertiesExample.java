package p2;

import java.net.URLDecoder;
import java.util.*;

public class PropertiesExample {

	public static void main(String[] args) throws Exception{
		Properties properties = new Properties();
		String path = PropertiesExample.class.getResource("databae.properties").getPath();
		path = URLDecoder.decode(path, "utf-8");
		properties.load(new FileReader(path));
		
		String driver = properties.getProperty("dirver");
		String url = properties.getProperty("url");
		String username = properties.getProperty("username");
		String password = properties.getProperty("password");
		
		System.out.println(driver);
		System.out.println(url);
		System.out.println(username);
		System.out.println(password);
	}

}
