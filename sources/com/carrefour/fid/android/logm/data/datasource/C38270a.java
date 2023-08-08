package com.carrefour.fid.android.logm.data.datasource;

import com.carrefour.fid.android.domain.models.logm.LogMEntry;
import com.carrefour.fid.android.logm.data.entities.LogRequest;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C10978t;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;

@C11363r0({"SMAP\nLogMDataSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LogMDataSource.kt\ncom/carrefour/fid/android/logm/data/datasource/LogMDataSourceKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,51:1\n1549#2:52\n1620#2,3:53\n*S KotlinDebug\n*F\n+ 1 LogMDataSource.kt\ncom/carrefour/fid/android/logm/data/datasource/LogMDataSourceKt\n*L\n28#1:52\n28#1:53,3\n*E\n"})
/* renamed from: com.carrefour.fid.android.logm.data.datasource.a */
public final class C38270a {
    /* renamed from: b */
    public static final LogRequest m158548b(LogMEntry logMEntry) {
        return new LogRequest(logMEntry.getTimestamp(), logMEntry.getResponseAt(), logMEntry.getResponseTime(), logMEntry.getSeverity().name(), logMEntry.getAction().mo117793q(), logMEntry.getValue(), logMEntry.getCorrelationId(), logMEntry.getSessionId(), logMEntry.getUserAgent(), logMEntry.getOs(), logMEntry.getVersion(), logMEntry.getHttpMethod(), logMEntry.getAppContext(), (String) null, logMEntry.getRequestBody(), logMEntry.getResponseBody(), logMEntry.getStatusCode(), logMEntry.getMessage(), 8192, (DefaultConstructorMarker) null);
    }

    /* renamed from: c */
    public static final List<LogRequest> m158549c(List<LogMEntry> list) {
        Iterable<LogMEntry> iterable = list;
        ArrayList arrayList = new ArrayList(C10978t.m41495Y(iterable, 10));
        for (LogMEntry b : iterable) {
            arrayList.add(m158548b(b));
        }
        return arrayList;
    }
}
