package com.google.api;

import com.google.protobuf.C34417m1;
import com.google.protobuf.Struct;
import java.util.Map;

/* renamed from: com.google.api.w0 */
public interface C32446w0 extends C34417m1 {
    boolean containsUserLabels(String str);

    Struct getSystemLabels();

    @Deprecated
    Map<String, String> getUserLabels();

    int getUserLabelsCount();

    Map<String, String> getUserLabelsMap();

    String getUserLabelsOrDefault(String str, String str2);

    String getUserLabelsOrThrow(String str);

    boolean hasSystemLabels();
}
