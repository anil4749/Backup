
package com.qa.opencart.Utils;

import java.util.Collection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Constants
{
    public static final int DEFAULT_TIME_OUT = 5;
    public static final String LOGIN_PAGE_TITLE = "Account Login";
    public static final String LOGIN_PAGE_URL_VALUE = "account/login";
    public static final String ACC_PAGE_TITLE = "My Account";
    public static final List<String> EXP_ACCOUNTS_SECTIONS_LIST;
    
    static {
        EXP_ACCOUNTS_SECTIONS_LIST = new ArrayList<String>(Arrays.asList("My Account", "My Orders", "My Affiliate Account", "Newsletter"));
    }
}
