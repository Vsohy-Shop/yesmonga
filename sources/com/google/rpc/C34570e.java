package com.google.rpc;

import com.google.protobuf.ByteString;
import com.google.protobuf.C34417m1;
import java.util.Map;

/* renamed from: com.google.rpc.e */
public interface C34570e extends C34417m1 {
    boolean containsMetadata(String str);

    String getDomain();

    ByteString getDomainBytes();

    @Deprecated
    Map<String, String> getMetadata();

    int getMetadataCount();

    Map<String, String> getMetadataMap();

    String getMetadataOrDefault(String str, String str2);

    String getMetadataOrThrow(String str);

    String getReason();

    ByteString getReasonBytes();
}
