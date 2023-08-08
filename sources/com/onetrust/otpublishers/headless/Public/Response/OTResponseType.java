package com.onetrust.otpublishers.headless.Public.Response;

public final class OTResponseType {
    public static final String OT_ERROR = "OTError";
    public static final String OT_SUCCESS = "OTSuccess";

    private OTResponseType() {
        throw new IllegalStateException("Utility class");
    }
}
