package com.google.cloud.audit;

import com.google.protobuf.ByteString;
import com.google.protobuf.C34417m1;

/* renamed from: com.google.cloud.audit.e */
public interface C32486e extends C34417m1 {
    String getCallerIp();

    ByteString getCallerIpBytes();

    String getCallerSuppliedUserAgent();

    ByteString getCallerSuppliedUserAgentBytes();
}
