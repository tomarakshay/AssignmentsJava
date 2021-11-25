package com.exception;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.*;

public class UserInput {
		
		
	/*	Map<String, Integer> dictionary=new LinkedHashMap<String, Integer>();
		dictionary.put("Amit" , 23);
		
		dictionary.put("Anuj", 22);
		dictionary.put("Clarke",28);
		dictionary.put("Edams",26);
		dictionary.put("Gorav",27);*/
		
		//Set<String> keys=dictionary.keySet();
	
	//Dictionary d = new Hashtable();
//	d.put( "anuj", 123);
	
	
	
	
	String[] sd = {"akshay", "vijy","nakul", "anuj"};
	
	
		

		private int age;
		private String name;

		

		public String getName() {
			return name;
		}

      List<String> list = Arrays.asList(sd);

		public void setName(String name) throws CustomException {
			if (list.contains(name)) {
				throw new CustomException ("user already in the list");
				
			
		
			
			}
			else {
	
				this.name = name;
			}
		}



		public int getAge() {
			return age;
		}
	



		public void setAge(int age) throws CustomException {
			if(age<18)
			
			{
				throw new CustomException("Age cannot be less then 18");
			}
			else if (age>60)
			{
				throw new CustomException("Age can not be more than 60");
			}
			else {
			this.age = age;
		}

		}
}
