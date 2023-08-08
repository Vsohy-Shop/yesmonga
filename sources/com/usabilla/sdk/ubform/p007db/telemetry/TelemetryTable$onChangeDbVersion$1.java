package com.usabilla.sdk.ubform.p007db.telemetry;

import android.database.sqlite.SQLiteDatabase;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, mo22516d2 = {"Landroid/database/sqlite/SQLiteDatabase;", "it", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
/* renamed from: com.usabilla.sdk.ubform.db.telemetry.TelemetryTable$onChangeDbVersion$1 */
public final class TelemetryTable$onChangeDbVersion$1 extends Lambda implements C11300l<SQLiteDatabase, C11079d2> {
    final /* synthetic */ TelemetryTable this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TelemetryTable$onChangeDbVersion$1(TelemetryTable telemetryTable) {
        super(1);
        this.this$0 = telemetryTable;
    }

    /* renamed from: a */
    public final void mo20059a(@C12579k SQLiteDatabase sQLiteDatabase) {
        Intrinsics.checkNotNullParameter(sQLiteDatabase, "it");
        sQLiteDatabase.execSQL(this.this$0.mo20015d());
        sQLiteDatabase.execSQL(this.this$0.mo20012a());
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo20059a((SQLiteDatabase) obj);
        return C11079d2.f28267a;
    }
}
