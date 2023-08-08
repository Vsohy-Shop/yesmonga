package com.google.type;

import com.google.protobuf.C34417m1;
import com.google.protobuf.Duration;
import com.google.type.DateTime;

/* renamed from: com.google.type.f */
public interface C34611f extends C34417m1 {
    int getDay();

    int getHours();

    int getMinutes();

    int getMonth();

    int getNanos();

    int getSeconds();

    DateTime.TimeOffsetCase getTimeOffsetCase();

    TimeZone getTimeZone();

    Duration getUtcOffset();

    int getYear();

    boolean hasTimeZone();

    boolean hasUtcOffset();
}
