package io.pivotal.hello;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class GreetingController {

	
	/* If using value of 'name' from application.yml
	 * 
	 * @Value("${name}")
    String name1;
	
    @RequestMapping("/greetings")
    public String greeting(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        name = name1;
    	model.addAttribute("name", name1);
        return "greetings";
    }*/
	
	 @RequestMapping("/greetings")
	    public String greeting(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
	    	model.addAttribute("name", name);
	    	model.addAttribute("date", getDate());
	        return "greetings";
	    }
	 
	 private String getDate(){
		 DateFormat df = new SimpleDateFormat("dd/MM/yy");
	       Date dateobj = new Date();
	      return (df.format(dateobj));
	 }

}
