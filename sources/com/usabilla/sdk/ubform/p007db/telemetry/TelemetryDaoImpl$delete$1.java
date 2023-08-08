package com.usabilla.sdk.ubform.p007db.telemetry;

import android.database.sqlite.SQLiteDatabase;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, mo22516d2 = {"Landroid/database/sqlite/SQLiteDatabase;", "it", "", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
/* renamed from: com.usabilla.sdk.ubform.db.telemetry.TelemetryDaoImpl$delete$1 */
public final class TelemetryDaoImpl$delete$1 extends Lambda implements C11300l<SQLiteDatabase, Integer> {
    final /* synthetic */ int $id;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TelemetryDaoImpl$delete$1(int i) {
        super(1);
        this.$id = i;
    }

    /* renamed from: a */
    public final int mo20053a(@C12579k SQLiteDatabase sQLiteDatabase) {
        Intrinsics.checkNotNullParameter(sQLiteDatabase, "it");
        return sQLiteDatabase.delete(TelemetryTable.f26833e, "id=?", new String[]{String.valueOf(this.$id)});
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return Integer.valueOf(mo20053a((SQLiteDatabase) obj));
    }
}
