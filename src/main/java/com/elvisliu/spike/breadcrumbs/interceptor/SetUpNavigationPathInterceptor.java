package com.elvisliu.spike.breadcrumbs.interceptor;

import com.elvisliu.spike.breadcrumbs.navigation.*;
import com.elvisliu.spike.breadcrumbs.navigation.DefaultNavigationEntryGenerator;
import com.elvisliu.spike.breadcrumbs.navigation.NavigationEntryGenerator;
import com.google.common.collect.Lists;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: yfliu
 * Date: 12/18/12
 * Time: 9:41 PM
 * To change this template use File | Settings | File Templates.
 */
public class SetUpNavigationPathInterceptor extends HandlerInterceptorAdapter {
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        if (handler.getClass().isAnnotationPresent(Navigation.class)) {
            List<NavigationEntry> navigationPath = buildNavigationPath(handler.getClass(), request.getSession());
            if (navigationPath.size() > 1) {
                modelAndView.addObject("navigatePath", navigationPath);
            }
        }
    }

    private List<NavigationEntry> buildNavigationPath(Class<? extends Object> endPoint, HttpSession session) throws IllegalAccessException, InstantiationException {
        List<NavigationEntry> navigationPath = new ArrayList<NavigationEntry>();

        while (endPoint != null) {
            Navigation navigation = endPoint.getAnnotation(Navigation.class);
            if (navigation == null) {
                throw new RuntimeException("Broken chain!");
            }

            NavigationEntryGenerator entryGenerator;
            if (navigation.pageGenerator().length > 0) {
                entryGenerator = navigation.pageGenerator()[0].newInstance();
            } else if (navigation.name().length > 0 && navigation.url().length > 0) {
                entryGenerator = new DefaultNavigationEntryGenerator(navigation.name()[0], navigation.url()[0]);
            } else {
                throw new RuntimeException("Wrong navigation controller!");
            }

            navigationPath.add(entryGenerator.generate(session));

            if (navigation.parent().length > 0) {
                endPoint = navigation.parent()[0];
            } else {
                endPoint = null;
            }
        }

        return Lists.reverse(navigationPath);
    }
}
