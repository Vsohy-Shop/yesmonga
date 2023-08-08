package com.onetrust.otpublishers.headless.Public;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class OTThemeConstants {
    public static final String NO_SDK_THEME_OVERRIDE = "NO_SDK_THEME_OVERRIDE";
    public static final String OT_THEME_APP_COMPACT_LIGHT_NO_ACTION_BAR = "OT_THEME_APP_COMPACT_LIGHT_NO_ACTION_BAR";

    @Retention(RetentionPolicy.SOURCE)
    public @interface ThemeConstants {
    }
}
