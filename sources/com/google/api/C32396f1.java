package com.google.api;

import com.google.protobuf.ByteString;
import com.google.protobuf.C34417m1;
import java.util.Map;

/* renamed from: com.google.api.f1 */
public interface C32396f1 extends C34417m1 {
    boolean containsValues(String str);

    long getDefaultLimit();

    String getDescription();

    ByteString getDescriptionBytes();

    String getDisplayName();

    ByteString getDisplayNameBytes();

    String getDuration();

    ByteString getDurationBytes();

    long getFreeTier();

    long getMaxLimit();

    String getMetric();

    ByteString getMetricBytes();

    String getName();

    ByteString getNameBytes();

    String getUnit();

    ByteString getUnitBytes();

    @Deprecated
    Map<String, Long> getValues();

    int getValuesCount();

    Map<String, Long> getValuesMap();

    long getValuesOrDefault(String str, long j);

    long getValuesOrThrow(String str);
}
