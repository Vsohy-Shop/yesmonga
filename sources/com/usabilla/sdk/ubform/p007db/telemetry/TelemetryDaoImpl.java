package com.usabilla.sdk.ubform.p007db.telemetry;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import com.usabilla.sdk.ubform.telemetry.C10108c;
import com.usabilla.sdk.ubform.utils.ext.ExtensionDbKt;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.C11907e;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.usabilla.sdk.ubform.db.telemetry.TelemetryDaoImpl */
public final class TelemetryDaoImpl implements C9783a {
    @C12579k

    /* renamed from: a */
    public final SQLiteDatabase f26827a;

    /* renamed from: b */
    public final int f26828b = 10;

    public TelemetryDaoImpl(@C12579k SQLiteDatabase sQLiteDatabase) {
        Intrinsics.checkNotNullParameter(sQLiteDatabase, "db");
        this.f26827a = sQLiteDatabase;
    }

    @C12579k
    /* renamed from: a */
    public C11907e<Integer> mo20047a() {
        return ExtensionDbKt.m38298a(this.f26827a, TelemetryDaoImpl$deleteAll$1.f26829f);
    }

    @C12579k
    /* renamed from: b */
    public C11907e<List<String>> mo20048b() {
        return ExtensionDbKt.m38298a(this.f26827a, TelemetryDaoImpl$getAll$1.f26830f);
    }

    @C12579k
    /* renamed from: c */
    public C11907e<Integer> mo20049c(int i) {
        return ExtensionDbKt.m38298a(this.f26827a, new TelemetryDaoImpl$delete$1(i));
    }

    @C12579k
    /* renamed from: d */
    public C11907e<Integer> mo20050d(@C12579k List<String> list) {
        Intrinsics.checkNotNullParameter(list, C10108c.f27798a);
        return ExtensionDbKt.m38298a(this.f26827a, new TelemetryDaoImpl$insert$1(list, this));
    }

    /* renamed from: h */
    public final void mo20051h() {
        this.f26827a.delete(TelemetryTable.f26833e, "id IN (SELECT id FROM telemetry ORDER BY id ASC LIMIT 1);", (String[]) null);
    }

    /* renamed from: i */
    public final int mo20052i(String str) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(TelemetryTable.f26835g, str);
        return (int) this.f26827a.insert(TelemetryTable.f26833e, (String) null, contentValues);
    }
}
