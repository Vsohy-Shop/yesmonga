package com.usabilla.sdk.ubform.utils;

import p073j$.time.Instant;
import p073j$.time.temporal.TemporalAccessor;
import p073j$.time.temporal.TemporalQuery;

/* renamed from: com.usabilla.sdk.ubform.utils.a */
public final /* synthetic */ class C10112a implements TemporalQuery {
    public final Object queryFrom(TemporalAccessor temporalAccessor) {
        return Instant.from(temporalAccessor);
    }
}
