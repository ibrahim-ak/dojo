package com.example.human;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Human {
//	@RequestMapping("/")
//	public String homePage() {
//		return "Welcom human!";
//	}
	@RequestMapping("/")
    public String nameValue(@RequestParam(value="name", required=false) String Name ,
    		@RequestParam(value="lname", required=false) String lName,
    		@RequestParam(value="times", required=false) Integer times) {
		
			
		
		 if (Name != null && lName == null ) {
			return "hello " + Name ;
		}
		else if(Name != null && lName !=null && times!= null) {
			String  result=new String ();
			for(int i = 0 ; i <times;i++) {
				result+=" hello "+ Name + " " + lName ;
			}
			return result;
		}
		else if(Name != null && lName !=null ){
			return " hello "+ Name + " " + lName+ " ";
		}
		else {
		 return "Welcome human" ;
	}
		 
    }}
//}

//@RequestMapping("/{firstName}")
//public String showLesson(@PathVariable("firstName") String firstName){
//	return "welcome " + firstName  ;
//}
