package com.onetrust.otpublishers.headless.Public;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class OTBackButtonMode {
    public static final String DEFAULT_CONSENT_AND_CLOSE_BANNER = "DEFAULT_CONSENT_AND_CLOSE_BANNER";
    public static final String DISMISS_BANNER = "DISMISS_BANNER";

    @Retention(RetentionPolicy.SOURCE)
    public @interface BackButtonMode {
    }
}
