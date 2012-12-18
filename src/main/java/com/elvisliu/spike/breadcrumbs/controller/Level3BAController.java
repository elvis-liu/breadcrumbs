package com.elvisliu.spike.breadcrumbs.controller;

import com.elvisliu.spike.breadcrumbs.navigation.Navigation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created with IntelliJ IDEA.
 * User: yfliu
 * Date: 12/18/12
 * Time: 10:42 PM
 * To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping(value= "/level3ba")
@Navigation(url="level3ba", name="Level3BA", parent=Level2BController.class)
public class Level3BAController {
    @RequestMapping(method= RequestMethod.GET)
    public String view() {
        return "level3ba";
    }
}