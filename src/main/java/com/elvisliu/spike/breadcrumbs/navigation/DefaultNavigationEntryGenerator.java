package com.elvisliu.spike.breadcrumbs.navigation;

import javax.servlet.http.HttpSession;

/**
 * Created with IntelliJ IDEA.
 * User: yfliu
 * Date: 12/18/12
 * Time: 10:08 PM
 * To change this template use File | Settings | File Templates.
 */
public class DefaultNavigationEntryGenerator implements NavigationEntryGenerator {
    private String url;
    private String name;

    public DefaultNavigationEntryGenerator(String name, String url) {
        this.name = name;
        this.url = url;
    }

    @Override
    public NavigationEntry generate(HttpSession currentSession) {
        NavigationEntry navigationEntry = new NavigationEntry();
        navigationEntry.setName(name);
        navigationEntry.setUrl(url);
        return navigationEntry;
    }
}
