package com.usabilla.sdk.ubform.p007db.telemetry;

import android.database.sqlite.SQLiteDatabase;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22515d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0005\u001a\u0010\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, mo22516d2 = {"Landroid/database/sqlite/SQLiteDatabase;", "database", "", "", "kotlin.jvm.PlatformType", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
/* renamed from: com.usabilla.sdk.ubform.db.telemetry.TelemetryDaoImpl$getAll$1 */
public final class TelemetryDaoImpl$getAll$1 extends Lambda implements C11300l<SQLiteDatabase, List<? extends String>> {

    /* renamed from: f */
    public static final TelemetryDaoImpl$getAll$1 f26830f = new TelemetryDaoImpl$getAll$1();

    public TelemetryDaoImpl$getAll$1() {
        super(1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0029, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0025, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0026, code lost:
        kotlin.p010io.C11133b.m42950a(r4, r0);
     */
    @org.jetbrains.annotations.C12579k
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<java.lang.String> invoke(@org.jetbrains.annotations.C12579k android.database.sqlite.SQLiteDatabase r4) {
        /*
            r3 = this;
            java.lang.String r0 = "database"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "SELECT log FROM telemetry;"
            r1 = 0
            android.database.Cursor r4 = r4.rawQuery(r0, r1)
            com.usabilla.sdk.ubform.db.telemetry.TelemetryDaoImpl$getAll$1$1$1 r0 = new com.usabilla.sdk.ubform.db.telemetry.TelemetryDaoImpl$getAll$1$1$1     // Catch:{ all -> 0x0023 }
            r0.<init>(r4)     // Catch:{ all -> 0x0023 }
            kotlin.sequences.m r0 = kotlin.sequences.SequencesKt__SequencesKt.m44596m(r0)     // Catch:{ all -> 0x0023 }
            com.usabilla.sdk.ubform.db.telemetry.TelemetryDaoImpl$getAll$1$1$2 r2 = com.usabilla.sdk.ubform.p007db.telemetry.TelemetryDaoImpl$getAll$1$1$2.f26831f     // Catch:{ all -> 0x0023 }
            kotlin.sequences.m r0 = kotlin.sequences.SequencesKt___SequencesKt.m44761k1(r0, r2)     // Catch:{ all -> 0x0023 }
            java.util.List r0 = kotlin.sequences.SequencesKt___SequencesKt.m44731c3(r0)     // Catch:{ all -> 0x0023 }
            kotlin.p010io.C11133b.m42950a(r4, r1)
            return r0
        L_0x0023:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0025 }
        L_0x0025:
            r1 = move-exception
            kotlin.p010io.C11133b.m42950a(r4, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.usabilla.sdk.ubform.p007db.telemetry.TelemetryDaoImpl$getAll$1.invoke(android.database.sqlite.SQLiteDatabase):java.util.List");
    }
}
