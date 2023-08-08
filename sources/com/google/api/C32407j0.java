package com.google.api;

import com.google.api.JwtLocation;
import com.google.protobuf.ByteString;
import com.google.protobuf.C34417m1;

/* renamed from: com.google.api.j0 */
public interface C32407j0 extends C34417m1 {
    String getHeader();

    ByteString getHeaderBytes();

    JwtLocation.InCase getInCase();

    String getQuery();

    ByteString getQueryBytes();

    String getValuePrefix();

    ByteString getValuePrefixBytes();
}
