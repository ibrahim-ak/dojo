package com.example.DaikichiRoutes;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/daikichi")
public class ExcellentLuck {
	@RequestMapping("")
	public String hello() {
	                return "Welcome!";
	        }
	
	@RequestMapping("/today")
	public String daikichitoday() {
	                return "Today you will find luck in all your endeavors!";
	        }
	@RequestMapping("/tomorrow")
	public String daikichitmw() {
	                return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
	        }
	
@RequestMapping("/travil/{cityName}")
public String city(@PathVariable("cityName") String cityName){
	return "Congratulations! You will soon travel to  " + cityName;
}

@RequestMapping("/lotto/{num}")
public String lotto(@PathVariable("num") int num){
	if (num%2 ==0) {
		
		return "You will take a grand journey in the near future, but be weary of tempting offers" ;
	}
	else {
		return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends.";
	}
}

}
