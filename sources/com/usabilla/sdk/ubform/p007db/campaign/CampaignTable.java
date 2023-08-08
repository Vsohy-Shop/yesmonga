package com.usabilla.sdk.ubform.p007db.campaign;

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

/* renamed from: com.usabilla.sdk.ubform.db.campaign.CampaignTable */
public final class CampaignTable implements C9773a {
    @C12579k

    /* renamed from: d */
    public static final C9778a f26804d = new C9778a((DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: e */
    public static final String f26805e = "campaigns";
    @C12579k

    /* renamed from: f */
    public static final String f26806f = "id";
    @C12579k

    /* renamed from: g */
    public static final String f26807g = "status";
    @C12579k

    /* renamed from: h */
    public static final String f26808h = "timesShown";
    @C12579k

    /* renamed from: i */
    public static final String f26809i = "formId";
    @C12579k

    /* renamed from: j */
    public static final String f26810j = "targetingId";
    @C12579k

    /* renamed from: k */
    public static final String f26811k = "createdAt";
    @C12579k

    /* renamed from: l */
    public static final String f26812l = "lastModified";
    @C12579k

    /* renamed from: m */
    public static final String f26813m = "bannerPosition";
    @C12579k

    /* renamed from: n */
    public static final String f26814n = "targetingRuleByteArray";
    @C12579k

    /* renamed from: a */
    public final String f26815a = "campaigns";
    @C12579k

    /* renamed from: b */
    public final String f26816b = "DROP TABLE IF EXISTS %s";
    @C12579k

    /* renamed from: c */
    public final String f26817c = "CREATE TABLE IF NOT EXISTS %s (%s VARCHAR PRIMARY KEY, %s VARCHAR, %s INTEGER DEFAULT 0, %s VARCHAR, %s VARCHAR, %s VARCHAR, %s VARCHAR, %s VARCHAR, %s VARCHAR);";

    /* renamed from: com.usabilla.sdk.ubform.db.campaign.CampaignTable$a */
    public static final class C9778a {
        public /* synthetic */ C9778a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C9778a() {
        }
    }

    @C12579k
    /* renamed from: a */
    public String mo20012a() {
        C11368t0 t0Var = C11368t0.f28504a;
        String format = String.format(mo20013b(), Arrays.copyOf(new Object[]{mo20016e(), "id", "status", f26808h, "formId", f26810j, f26811k, f26812l, f26813m, f26814n}, 10));
        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
        return format;
    }

    @C12579k
    /* renamed from: b */
    public String mo20013b() {
        return this.f26817c;
    }

    @C12579k
    /* renamed from: c */
    public C11907e<C11079d2> mo20014c(@C12579k SQLiteDatabase sQLiteDatabase) {
        Intrinsics.checkNotNullParameter(sQLiteDatabase, "sqLiteDatabase");
        return ExtensionDbKt.m38298a(sQLiteDatabase, new CampaignTable$onCreate$1(this));
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
        return this.f26815a;
    }

    @C12579k
    /* renamed from: f */
    public C11907e<C11079d2> mo20017f(@C12579k SQLiteDatabase sQLiteDatabase) {
        Intrinsics.checkNotNullParameter(sQLiteDatabase, "sqLiteDatabase");
        return ExtensionDbKt.m38298a(sQLiteDatabase, new CampaignTable$onChangeDbVersion$1(this));
    }

    @C12579k
    /* renamed from: g */
    public String mo20018g() {
        return this.f26816b;
    }
}
