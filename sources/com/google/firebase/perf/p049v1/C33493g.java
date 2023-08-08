package com.google.firebase.perf.p049v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.C34417m1;
import java.util.List;

/* renamed from: com.google.firebase.perf.v1.g */
public interface C33493g extends C34417m1 {
    AndroidMemoryReading getAndroidMemoryReadings(int i);

    int getAndroidMemoryReadingsCount();

    List<AndroidMemoryReading> getAndroidMemoryReadingsList();

    CpuMetricReading getCpuMetricReadings(int i);

    int getCpuMetricReadingsCount();

    List<CpuMetricReading> getCpuMetricReadingsList();

    GaugeMetadata getGaugeMetadata();

    String getSessionId();

    ByteString getSessionIdBytes();

    boolean hasGaugeMetadata();

    boolean hasSessionId();
}
