package com.elvisliu.spike.breadcrumbs.controller;

import com.elvisliu.spike.breadcrumbs.navigation.NavigationEntry;
import com.elvisliu.spike.breadcrumbs.navigation.NavigationEntryGenerator;

import javax.servlet.http.HttpSession;

/**
 * Created with IntelliJ IDEA.
 * User: yfliu
 * Date: 12/18/12
 * Time: 10:47 PM
 * To change this template use File | Settings | File Templates.
 */
public class Level2BEntryGenerator implements NavigationEntryGenerator {
    @Override
    public NavigationEntry generate(HttpSession currentSession) {
        Integer randomId = (Integer) currentSession.getAttribute("randomId");
        NavigationEntry navigationEntry = new NavigationEntry();
        navigationEntry.setName(randomId.toString());
        navigationEntry.setUrl("level2b");
        return navigationEntry;
    }
}
