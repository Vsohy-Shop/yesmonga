package com.usabilla.sdk.ubform.p007db.telemetry;

import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, mo22516d2 = {"Landroid/database/sqlite/SQLiteDatabase;", "it", "", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
/* renamed from: com.usabilla.sdk.ubform.db.telemetry.TelemetryDaoImpl$insert$1 */
public final class TelemetryDaoImpl$insert$1 extends Lambda implements C11300l<SQLiteDatabase, Integer> {
    final /* synthetic */ List<String> $logs;
    final /* synthetic */ TelemetryDaoImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TelemetryDaoImpl$insert$1(List<String> list, TelemetryDaoImpl telemetryDaoImpl) {
        super(1);
        this.$logs = list;
        this.this$0 = telemetryDaoImpl;
    }

    /* renamed from: a */
    public final int mo20058a(@C12579k SQLiteDatabase sQLiteDatabase) {
        Intrinsics.checkNotNullParameter(sQLiteDatabase, "it");
        List<String> list = this.$logs;
        List<String> subList = list.subList(Math.max(0, list.size() - this.this$0.f26828b), this.$logs.size());
        int max = Math.max(0, subList.size() - (this.this$0.f26828b - ((int) DatabaseUtils.queryNumEntries(sQLiteDatabase, TelemetryTable.f26833e))));
        TelemetryDaoImpl telemetryDaoImpl = this.this$0;
        for (int i = 0; i < max; i++) {
            telemetryDaoImpl.mo20051h();
        }
        int size = subList.size();
        TelemetryDaoImpl telemetryDaoImpl2 = this.this$0;
        for (int i2 = 0; i2 < size; i2++) {
            int unused = telemetryDaoImpl2.mo20052i(subList.get(i2));
        }
        return subList.size();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return Integer.valueOf(mo20058a((SQLiteDatabase) obj));
    }
}
