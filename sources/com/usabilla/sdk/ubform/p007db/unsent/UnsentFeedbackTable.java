package com.usabilla.sdk.ubform.p007db.unsent;

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

/* renamed from: com.usabilla.sdk.ubform.db.unsent.UnsentFeedbackTable */
public final class UnsentFeedbackTable implements C9773a {
    @C12579k

    /* renamed from: d */
    public static final C9784a f26842d = new C9784a((DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: e */
    public static final String f26843e = "queue";
    @C12579k

    /* renamed from: f */
    public static final String f26844f = "id";
    @C12579k

    /* renamed from: g */
    public static final String f26845g = "feedback";
    @C12579k

    /* renamed from: a */
    public final String f26846a = f26843e;
    @C12579k

    /* renamed from: b */
    public final String f26847b = "DROP TABLE IF EXISTS %s";
    @C12579k

    /* renamed from: c */
    public final String f26848c = "CREATE TABLE IF NOT EXISTS %s (%s INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, %s VARCHAR);";

    /* renamed from: com.usabilla.sdk.ubform.db.unsent.UnsentFeedbackTable$a */
    public static final class C9784a {
        public /* synthetic */ C9784a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C9784a() {
        }
    }

    @C12579k
    /* renamed from: a */
    public String mo20012a() {
        C11368t0 t0Var = C11368t0.f28504a;
        String format = String.format(mo20013b(), Arrays.copyOf(new Object[]{mo20016e(), "id", f26845g}, 3));
        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
        return format;
    }

    @C12579k
    /* renamed from: b */
    public String mo20013b() {
        return this.f26848c;
    }

    @C12579k
    /* renamed from: c */
    public C11907e<C11079d2> mo20014c(@C12579k SQLiteDatabase sQLiteDatabase) {
        Intrinsics.checkNotNullParameter(sQLiteDatabase, "sqLiteDatabase");
        return ExtensionDbKt.m38298a(sQLiteDatabase, new UnsentFeedbackTable$onCreate$1(this));
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
        return this.f26846a;
    }

    @C12579k
    /* renamed from: f */
    public C11907e<C11079d2> mo20017f(@C12579k SQLiteDatabase sQLiteDatabase) {
        Intrinsics.checkNotNullParameter(sQLiteDatabase, "sqLiteDatabase");
        return ExtensionDbKt.m38298a(sQLiteDatabase, new UnsentFeedbackTable$onChangeDbVersion$1(this));
    }

    @C12579k
    /* renamed from: g */
    public String mo20018g() {
        return this.f26847b;
    }
}
