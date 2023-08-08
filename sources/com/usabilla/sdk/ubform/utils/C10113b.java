package com.usabilla.sdk.ubform.utils;

import androidx.constraintlayout.core.motion.utils.C16717v;
import kotlin.jvm.internal.Intrinsics;
import p073j$.time.Instant;
import p073j$.time.OffsetDateTime;
import p073j$.time.ZoneOffset;
import p073j$.time.format.DateTimeFormatter;

/* renamed from: com.usabilla.sdk.ubform.utils.b */
public final class C10113b {
    /* renamed from: a */
    public static final /* synthetic */ String m38275a(long j, ZoneOffset zoneOffset) {
        Intrinsics.checkNotNullParameter(zoneOffset, C16717v.C16720c.f42211R);
        String format = Instant.ofEpochMilli(j).atOffset(zoneOffset).format(DateTimeFormatter.ISO_OFFSET_DATE_TIME);
        Intrinsics.checkNotNullExpressionValue(format, "ofEpochMilli(milliseconds).atOffset(offset).format(DateTimeFormatter.ISO_OFFSET_DATE_TIME)");
        return format;
    }

    /* renamed from: b */
    public static /* synthetic */ String m38276b(long j, ZoneOffset zoneOffset, int i, Object obj) {
        if ((i & 2) != 0) {
            zoneOffset = OffsetDateTime.now().getOffset();
            Intrinsics.checkNotNullExpressionValue(zoneOffset, "now().offset");
        }
        return m38275a(j, zoneOffset);
    }
}
