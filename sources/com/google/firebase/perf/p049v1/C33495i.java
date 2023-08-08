package com.google.firebase.perf.p049v1;

import com.google.firebase.perf.p049v1.NetworkRequestMetric;
import com.google.protobuf.ByteString;
import com.google.protobuf.C34417m1;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.firebase.perf.v1.i */
public interface C33495i extends C34417m1 {
    boolean containsCustomAttributes(String str);

    long getClientStartTimeUs();

    @Deprecated
    Map<String, String> getCustomAttributes();

    int getCustomAttributesCount();

    Map<String, String> getCustomAttributesMap();

    String getCustomAttributesOrDefault(String str, String str2);

    String getCustomAttributesOrThrow(String str);

    NetworkRequestMetric.HttpMethod getHttpMethod();

    int getHttpResponseCode();

    NetworkRequestMetric.NetworkClientErrorReason getNetworkClientErrorReason();

    PerfSession getPerfSessions(int i);

    int getPerfSessionsCount();

    List<PerfSession> getPerfSessionsList();

    long getRequestPayloadBytes();

    String getResponseContentType();

    ByteString getResponseContentTypeBytes();

    long getResponsePayloadBytes();

    long getTimeToRequestCompletedUs();

    long getTimeToResponseCompletedUs();

    long getTimeToResponseInitiatedUs();

    String getUrl();

    ByteString getUrlBytes();

    boolean hasClientStartTimeUs();

    boolean hasHttpMethod();

    boolean hasHttpResponseCode();

    boolean hasNetworkClientErrorReason();

    boolean hasRequestPayloadBytes();

    boolean hasResponseContentType();

    boolean hasResponsePayloadBytes();

    boolean hasTimeToRequestCompletedUs();

    boolean hasTimeToResponseCompletedUs();

    boolean hasTimeToResponseInitiatedUs();

    boolean hasUrl();
}
