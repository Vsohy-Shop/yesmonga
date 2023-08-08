package com.google.api;

import com.google.protobuf.ByteString;
import com.google.protobuf.C34417m1;
import java.util.Map;

/* renamed from: com.google.api.u0 */
public interface C32440u0 extends C34417m1 {
    boolean containsMetricCosts(String str);

    @Deprecated
    Map<String, Long> getMetricCosts();

    int getMetricCostsCount();

    Map<String, Long> getMetricCostsMap();

    long getMetricCostsOrDefault(String str, long j);

    long getMetricCostsOrThrow(String str);

    String getSelector();

    ByteString getSelectorBytes();
}
