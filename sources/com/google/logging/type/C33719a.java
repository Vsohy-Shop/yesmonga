package com.google.logging.type;

import com.google.protobuf.ByteString;
import com.google.protobuf.C34417m1;
import com.google.protobuf.Duration;

/* renamed from: com.google.logging.type.a */
public interface C33719a extends C34417m1 {
    long getCacheFillBytes();

    boolean getCacheHit();

    boolean getCacheLookup();

    boolean getCacheValidatedWithOriginServer();

    Duration getLatency();

    String getProtocol();

    ByteString getProtocolBytes();

    String getReferer();

    ByteString getRefererBytes();

    String getRemoteIp();

    ByteString getRemoteIpBytes();

    String getRequestMethod();

    ByteString getRequestMethodBytes();

    long getRequestSize();

    String getRequestUrl();

    ByteString getRequestUrlBytes();

    long getResponseSize();

    String getServerIp();

    ByteString getServerIpBytes();

    int getStatus();

    String getUserAgent();

    ByteString getUserAgentBytes();

    boolean hasLatency();
}
