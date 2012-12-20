package com.elvisliu.spike.breadcrumbs.controller;

import com.elvisliu.spike.breadcrumbs.navigation.NavigationInfoProvider;

import javax.servlet.http.HttpSession;

/**
 * Created with IntelliJ IDEA.
 * User: yfliu
 * Date: 12/18/12
 * Time: 10:47 PM
 * To change this template use File | Settings | File Templates.
 */
public class Level2BInfoProvider implements NavigationInfoProvider {
    @Override
    public String getUrl(HttpSession session) {
        return "level2b";
    }

    @Override
    public String getName(HttpSession session) {
        Integer randomId = (Integer) session.getAttribute("randomId");
        return randomId.toString();
    }
}
