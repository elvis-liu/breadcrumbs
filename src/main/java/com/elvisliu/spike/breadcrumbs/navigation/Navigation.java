package com.elvisliu.spike.breadcrumbs.navigation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created with IntelliJ IDEA.
 * User: yfliu
 * Date: 12/18/12
 * Time: 9:23 PM
 * To change this template use File | Settings | File Templates.
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface Navigation {
    Class<? extends Object>[] parent() default {};
    String[] url() default {};
    String[] name() default {};
    Class<? extends NavigationInfoProvider>[] infoProvider() default {};
}
