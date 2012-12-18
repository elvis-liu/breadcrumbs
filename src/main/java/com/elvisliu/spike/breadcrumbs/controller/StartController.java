package com.elvisliu.spike.breadcrumbs.controller;

import com.elvisliu.spike.breadcrumbs.navigation.Navigation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.Random;

@Controller
@RequestMapping(value= "/start")
@Navigation(url="start", name="StartPage")
@SessionAttributes("randomId")
public class StartController {
    @ModelAttribute("randomId")
    public int genRandomId() {
        Random r = new Random();
        return Math.abs(r.nextInt());
    }

	@RequestMapping(method=RequestMethod.GET)
	public String view() {
		return "start";
	}
}
