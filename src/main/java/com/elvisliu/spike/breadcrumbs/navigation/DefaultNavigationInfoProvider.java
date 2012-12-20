package com.elvisliu.spike.breadcrumbs.navigation;

import javax.servlet.http.HttpSession;

/**
 * Created with IntelliJ IDEA.
 * User: yfliu
 * Date: 12/18/12
 * Time: 10:08 PM
 * To change this template use File | Settings | File Templates.
 */
public class DefaultNavigationInfoProvider implements NavigationInfoProvider {
    private String url;
    private String name;

    public DefaultNavigationInfoProvider(String name, String url) {
        this.name = name;
        this.url = url;
    }

    @Override
    public String getUrl(HttpSession session) {
        return url;
    }

    @Override
    public String getName(HttpSession session) {
        return name;
    }
}
