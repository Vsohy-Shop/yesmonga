package com.onetrust.otpublishers.headless.Public;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class OTVendorListDismissMode {
    public static final String HIDE_CONFIRM_MY_CHOICE = "HIDE_CONFIRM_MY_CHOICE";
    public static final String SHOW_CONFIRM_MY_CHOICE = "SHOW_CONFIRM_MY_CHOICE";

    @Retention(RetentionPolicy.SOURCE)
    public @interface VendorListDismissMode {
    }
}
