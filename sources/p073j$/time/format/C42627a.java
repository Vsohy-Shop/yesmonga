package p073j$.time.format;

import p073j$.time.ZoneId;
import p073j$.time.ZoneOffset;
import p073j$.time.temporal.C42676o;
import p073j$.time.temporal.TemporalAccessor;
import p073j$.time.temporal.TemporalQuery;

/* renamed from: j$.time.format.a */
public final /* synthetic */ class C42627a implements TemporalQuery {
    public final Object queryFrom(TemporalAccessor temporalAccessor) {
        int i = DateTimeFormatterBuilder.f107832j;
        ZoneId zoneId = (ZoneId) temporalAccessor.mo137883c(C42676o.m172522g());
        if (zoneId == null || (zoneId instanceof ZoneOffset)) {
            return null;
        }
        return zoneId;
    }
}
