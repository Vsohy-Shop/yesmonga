package com.usabilla.sdk.ubform.net;

import com.usabilla.sdk.ubform.C9742a;
import com.usabilla.sdk.ubform.C9743b;
import com.usabilla.sdk.ubform.net.http.C9855a;
import com.usabilla.sdk.ubform.net.http.C9872i;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.C11368t0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.json.JSONObject;

/* renamed from: com.usabilla.sdk.ubform.net.e */
public final class C9854e implements C9853d {
    @C12579k

    /* renamed from: a */
    public final C9743b f26948a;
    @C12579k

    /* renamed from: b */
    public final C9855a f26949b;
    @C12579k

    /* renamed from: c */
    public final String f26950c = C9742a.f26715f;
    @C12579k

    /* renamed from: d */
    public final String f26951d = C9742a.f26718i;
    @C12579k

    /* renamed from: e */
    public final String f26952e = "https://api.usabilla.com/v2/sdk";
    @C12579k

    /* renamed from: f */
    public final String f26953f = C9742a.f26716g;
    @C12579k

    /* renamed from: g */
    public final String f26954g = "/app/forms/";
    @C12579k

    /* renamed from: h */
    public final String f26955h = "/forms/%s";
    @C12579k

    /* renamed from: i */
    public final String f26956i = "/campaigns?app_id=%s";
    @C12579k

    /* renamed from: j */
    public final String f26957j = "/campaigns/%s";
    @C12579k

    /* renamed from: k */
    public final String f26958k = "/targeting-options";
    @C12579k

    /* renamed from: l */
    public final String f26959l = "/campaigns/%s/feedback";
    @C12579k

    /* renamed from: m */
    public final String f26960m = "/campaigns/%s/feedback/%s";
    @C12579k

    /* renamed from: n */
    public final String f26961n = "/campaigns/%s/views";
    @C12579k

    /* renamed from: o */
    public final String f26962o = "/v1/featurebilla/config.json";
    @C12579k

    /* renamed from: p */
    public final String f26963p = "m=a&i=%s&telemetry=%s";

    public C9854e(@C12579k C9743b bVar, @C12579k C9855a aVar) {
        Intrinsics.checkNotNullParameter(bVar, "buildVersionAccessor");
        Intrinsics.checkNotNullParameter(aVar, "httpHelper");
        this.f26948a = bVar;
        this.f26949b = aVar;
    }

    @C12579k
    /* renamed from: a */
    public C9872i mo20274a(@C12579k String str, @C12579k JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(str, "campaignId");
        Intrinsics.checkNotNullParameter(jSONObject, "body");
        String str2 = this.f26952e;
        C11368t0 t0Var = C11368t0.f28504a;
        String format = String.format(this.f26961n, Arrays.copyOf(new Object[]{str}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
        return this.f26949b.mo20288e(Intrinsics.stringPlus(str2, format), jSONObject, this.f26948a.mo19917a());
    }

    @C12579k
    /* renamed from: b */
    public C9872i mo20275b(@C12579k JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(jSONObject, "payload");
        return this.f26949b.mo20289f(this.f26951d, jSONObject);
    }

    @C12579k
    /* renamed from: c */
    public C9872i mo20276c(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "campaignFormId");
        String str2 = this.f26950c;
        C11368t0 t0Var = C11368t0.f28504a;
        String format = String.format(this.f26955h, Arrays.copyOf(new Object[]{str}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
        return this.f26949b.mo20287d(Intrinsics.stringPlus(str2, format));
    }

    @C12579k
    /* renamed from: d */
    public C9872i mo20277d() {
        return this.f26949b.mo20287d(Intrinsics.stringPlus(this.f26950c, this.f26962o));
    }

    @C12579k
    /* renamed from: e */
    public C9872i mo20278e(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "campaignId");
        String str2 = this.f26950c;
        C11368t0 t0Var = C11368t0.f28504a;
        String format = String.format(this.f26957j, Arrays.copyOf(new Object[]{str}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
        return this.f26949b.mo20287d(Intrinsics.stringPlus(str2, format));
    }

    @C12579k
    /* renamed from: f */
    public C9872i mo20279f(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "formId");
        return this.f26949b.mo20287d(this.f26950c + this.f26954g + str);
    }

    @C12579k
    /* renamed from: g */
    public C9872i mo20280g(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "appId");
        String str2 = this.f26950c;
        C11368t0 t0Var = C11368t0.f28504a;
        String format = String.format(this.f26956i, Arrays.copyOf(new Object[]{str}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
        return this.f26949b.mo20287d(Intrinsics.stringPlus(str2, format));
    }

    @C12579k
    /* renamed from: h */
    public C9872i mo20281h(@C12579k String str, @C12579k String str2) {
        Intrinsics.checkNotNullParameter(str, "appId");
        Intrinsics.checkNotNullParameter(str2, "base64TelemetryData");
        String str3 = this.f26953f;
        C11368t0 t0Var = C11368t0.f28504a;
        String format = String.format(this.f26963p, Arrays.copyOf(new Object[]{str, str2}, 2));
        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
        return this.f26949b.mo20287d(Intrinsics.stringPlus(str3, format));
    }

    @C12579k
    /* renamed from: i */
    public C9872i mo20282i(@C12579k String str, @C12579k JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(str, "campaignId");
        Intrinsics.checkNotNullParameter(jSONObject, "payload");
        String str2 = this.f26952e;
        C11368t0 t0Var = C11368t0.f28504a;
        String format = String.format(this.f26959l, Arrays.copyOf(new Object[]{str}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
        return this.f26949b.mo20289f(Intrinsics.stringPlus(str2, format), jSONObject);
    }

    @C12579k
    /* renamed from: j */
    public C9872i mo20283j(@C12579k List<String> list) {
        Intrinsics.checkNotNullParameter(list, "targetingIds");
        String stringPlus = Intrinsics.stringPlus(this.f26950c, this.f26958k);
        int i = 0;
        for (Object next : list) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.m40459W();
            }
            String str = (String) next;
            if (i == 0) {
                stringPlus = stringPlus + "?ids[]=" + str;
            } else {
                stringPlus = stringPlus + "&ids[]=" + str;
            }
            i = i2;
        }
        return this.f26949b.mo20287d(stringPlus);
    }

    @C12579k
    /* renamed from: k */
    public C9872i mo20284k(@C12579k String str, @C12579k String str2, @C12579k JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(str, "feedbackId");
        Intrinsics.checkNotNullParameter(str2, "campaignId");
        Intrinsics.checkNotNullParameter(jSONObject, "body");
        String str3 = this.f26952e;
        C11368t0 t0Var = C11368t0.f28504a;
        String format = String.format(this.f26960m, Arrays.copyOf(new Object[]{str2, str}, 2));
        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
        return this.f26949b.mo20288e(Intrinsics.stringPlus(str3, format), jSONObject, this.f26948a.mo19917a());
    }
}
