package com.google.cloud.audit;

import com.google.protobuf.ByteString;
import com.google.protobuf.C34417m1;

/* renamed from: com.google.cloud.audit.d */
public interface C32485d extends C34417m1 {
    boolean getGranted();

    String getPermission();

    ByteString getPermissionBytes();

    String getResource();

    ByteString getResourceBytes();
}
