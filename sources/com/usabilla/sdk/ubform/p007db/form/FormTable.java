package com.usabilla.sdk.ubform.p007db.form;

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

/* renamed from: com.usabilla.sdk.ubform.db.form.FormTable */
public final class FormTable implements C9773a {
    @C12579k

    /* renamed from: d */
    public static final C9780a f26820d = new C9780a((DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: e */
    public static final String f26821e = "forms";
    @C12579k

    /* renamed from: f */
    public static final String f26822f = "id";
    @C12579k

    /* renamed from: g */
    public static final String f26823g = "form";
    @C12579k

    /* renamed from: a */
    public final String f26824a = "forms";
    @C12579k

    /* renamed from: b */
    public final String f26825b = "DROP TABLE IF EXISTS %s";
    @C12579k

    /* renamed from: c */
    public final String f26826c = "CREATE TABLE IF NOT EXISTS %s (%s VARCHAR PRIMARY KEY, %s VARCHAR);";

    /* renamed from: com.usabilla.sdk.ubform.db.form.FormTable$a */
    public static final class C9780a {
        public /* synthetic */ C9780a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C9780a() {
        }
    }

    @C12579k
    /* renamed from: a */
    public String mo20012a() {
        C11368t0 t0Var = C11368t0.f28504a;
        String format = String.format(mo20013b(), Arrays.copyOf(new Object[]{mo20016e(), "id", "form"}, 3));
        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
        return format;
    }

    @C12579k
    /* renamed from: b */
    public String mo20013b() {
        return this.f26826c;
    }

    @C12579k
    /* renamed from: c */
    public C11907e<C11079d2> mo20014c(@C12579k SQLiteDatabase sQLiteDatabase) {
        Intrinsics.checkNotNullParameter(sQLiteDatabase, "sqLiteDatabase");
        return ExtensionDbKt.m38298a(sQLiteDatabase, new FormTable$onCreate$1(this));
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
        return this.f26824a;
    }

    @C12579k
    /* renamed from: f */
    public C11907e<C11079d2> mo20017f(@C12579k SQLiteDatabase sQLiteDatabase) {
        Intrinsics.checkNotNullParameter(sQLiteDatabase, "sqLiteDatabase");
        return ExtensionDbKt.m38298a(sQLiteDatabase, new FormTable$onChangeDbVersion$1(this));
    }

    @C12579k
    /* renamed from: g */
    public String mo20018g() {
        return this.f26825b;
    }
}
