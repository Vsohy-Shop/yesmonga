package com.onetrust.otpublishers.headless.Public;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class OTBannerHeightRatio {
    public static final String FULL = "full";
    public static final String ONE_HALF = "one_half";
    public static final String ONE_THIRD = "one_third";
    public static final String TWO_THIRD = "two_third";

    @Retention(RetentionPolicy.SOURCE)
    public @interface BannerHeight {
    }
}
