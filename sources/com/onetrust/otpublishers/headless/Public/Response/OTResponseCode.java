package com.onetrust.otpublishers.headless.Public.Response;

public final class OTResponseCode {
    public static final int CORRUPTED_DATA_RESPONSE = 7;
    public static final int EMPTY_NETWORK_RESPONSE = 2;
    public static final int EMPTY_PARAMETER_PASSED = 4;
    public static final int FAILED = -1;
    public static final int INVALID_LANGUAGE_CODE = 5;
    public static final int NETWORK_CALL_FAILURE = 3;
    public static final int NETWORK_NOT_AVAILABLE = 6;
    public static final int NOT_INITIALIZED = -2;
    public static final int OT_RESPONSE_CODE_101 = 101;
    public static final int OT_RESPONSE_CODE_103 = 103;
    public static final int OT_RESPONSE_CODE_104 = 104;
    public static final int OT_RESPONSE_CODE_IAB_NETWORK_CALL_FAILURE = 102;
    public static final int SUCCESS = 1;
    public static final int UNKNOWN_ERROR = -3;

    private OTResponseCode() {
        throw new IllegalStateException("Utility class");
    }
}
