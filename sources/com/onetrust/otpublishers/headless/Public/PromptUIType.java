package com.onetrust.otpublishers.headless.Public;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class PromptUIType {
    public static final int AGE_GATE = 0;

    @Retention(RetentionPolicy.SOURCE)
    public @interface Type {
    }
}
