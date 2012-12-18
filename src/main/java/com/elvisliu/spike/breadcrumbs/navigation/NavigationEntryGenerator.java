package com.elvisliu.spike.breadcrumbs.navigation;

import javax.servlet.http.HttpSession;

/**
 * Created with IntelliJ IDEA.
 * User: yfliu
 * Date: 12/18/12
 * Time: 8:38 PM
 * To change this template use File | Settings | File Templates.
 */
public interface NavigationEntryGenerator {
    public NavigationEntry generate(HttpSession currentSession);
}
