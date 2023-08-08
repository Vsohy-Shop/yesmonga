package com.usabilla.sdk.ubform.p007db.telemetry;

import android.database.sqlite.SQLiteDatabase;
import com.usabilla.sdk.ubform.p007db.C9773a;
import com.usabilla.sdk.ubform.utils.ext.ExtensionDbKt;
import java.util.Arrays;
import kotlin.C11079d2;
import kotlin.jvm.internal.C11368t0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.C11907e;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.usabilla.sdk.ubform.db.telemetry.TelemetryTable */
public final class TelemetryTable implements C9773a {
    @C12579k

    /* renamed from: d */
    public static final C9782a f26832d = new C9782a((DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: e */
    public static final String f26833e = "telemetry";
    @C12579k

    /* renamed from: f */
    public static final String f26834f = "id";
    @C12579k

    /* renamed from: g */
    public static final String f26835g = "log";
    @C12579k

    /* renamed from: a */
    public final String f26836a = f26833e;
    @C12579k

    /* renamed from: b */
    public final String f26837b = "DROP TABLE IF EXISTS %s";
    @C12579k

    /* renamed from: c */
    public final String f26838c = "CREATE TABLE IF NOT EXISTS %s (%s INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, %s VARCHAR);";

    /* renamed from: com.usabilla.sdk.ubform.db.telemetry.TelemetryTable$a */
    public static final class C9782a {
        public /* synthetic */ C9782a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C9782a() {
        }
    }

    @C12579k
    /* renamed from: a */
    public String mo20012a() {
        C11368t0 t0Var = C11368t0.f28504a;
        String format = String.format(mo20013b(), Arrays.copyOf(new Object[]{mo20016e(), "id", f26835g}, 3));
        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
        return format;
    }

    @C12579k
    /* renamed from: b */
    public String mo20013b() {
        return this.f26838c;
    }

    @C12579k
    /* renamed from: c */
    public C11907e<C11079d2> mo20014c(@C12579k SQLiteDatabase sQLiteDatabase) {
        Intrinsics.checkNotNullParameter(sQLiteDatabase, "sqLiteDatabase");
        return ExtensionDbKt.m38298a(sQLiteDatabase, new TelemetryTable$onCreate$1(this));
    }

    @C12579k
    /* renamed from: d */
    public String mo20015d() {
        C11368t0 t0Var = C11368t0.f28504a;
        String format = String.format(mo20018g(), Arrays.copyOf(new Object[]{mo20016e()}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
        return format;
    }

    @C12579k
    /* renamed from: e */
    public String mo20016e() {
        return this.f26836a;
    }

    @C12579k
    /* renamed from: f */
    public C11907e<C11079d2> mo20017f(@C12579k SQLiteDatabase sQLiteDatabase) {
        Intrinsics.checkNotNullParameter(sQLiteDatabase, "sqLiteDatabase");
        return ExtensionDbKt.m38298a(sQLiteDatabase, new TelemetryTable$onChangeDbVersion$1(this));
    }

    @C12579k
    /* renamed from: g */
    public String mo20018g() {
        return this.f26837b;
    }
}
