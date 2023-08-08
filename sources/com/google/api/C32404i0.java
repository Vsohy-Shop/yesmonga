package com.google.api;

import com.google.api.HttpRule;
import com.google.protobuf.ByteString;
import com.google.protobuf.C34417m1;
import java.util.List;

/* renamed from: com.google.api.i0 */
public interface C32404i0 extends C34417m1 {
    HttpRule getAdditionalBindings(int i);

    int getAdditionalBindingsCount();

    List<HttpRule> getAdditionalBindingsList();

    String getBody();

    ByteString getBodyBytes();

    CustomHttpPattern getCustom();

    String getDelete();

    ByteString getDeleteBytes();

    String getGet();

    ByteString getGetBytes();

    String getPatch();

    ByteString getPatchBytes();

    HttpRule.PatternCase getPatternCase();

    String getPost();

    ByteString getPostBytes();

    String getPut();

    ByteString getPutBytes();

    String getResponseBody();

    ByteString getResponseBodyBytes();

    String getSelector();

    ByteString getSelectorBytes();

    boolean hasCustom();
}
