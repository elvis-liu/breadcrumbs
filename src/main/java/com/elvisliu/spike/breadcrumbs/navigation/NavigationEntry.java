package com.elvisliu.spike.breadcrumbs.navigation;

/**
 * Created with IntelliJ IDEA.
 * User: yfliu
 * Date: 12/18/12
 * Time: 8:55 PM
 * To change this template use File | Settings | File Templates.
 */
public class NavigationEntry {
    private String url;
    private String name;
    private Class<? extends Object> navigationClass;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Class<? extends Object> getNavigationClass() {
        return navigationClass;
    }

    public void setNavigationClass(Class<? extends Object> navigationClass) {
        this.navigationClass = navigationClass;
    }
}
