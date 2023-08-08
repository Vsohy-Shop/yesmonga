package com.usabilla.sdk.ubform.utils;

import android.content.Context;
import androidx.annotation.RestrictTo;
import com.urbanairship.iam.events.C9175a;
import com.usabilla.sdk.ubform.eventengine.C9834c;
import com.usabilla.sdk.ubform.eventengine.TargetingOptionsModel;
import com.usabilla.sdk.ubform.eventengine.rules.Rule;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;
import org.json.JSONObject;

/* renamed from: com.usabilla.sdk.ubform.utils.f */
public final class C10139f {
    @C12579k

    /* renamed from: a */
    public static final C10139f f27869a = new C10139f();
    @C12579k

    /* renamed from: b */
    public static final String f27870b = "JSON/";
    @C12579k

    /* renamed from: c */
    public static final String f27871c = "parsing_test/";
    @C12579k

    /* renamed from: d */
    public static final String f27872d = "id";
    @C12579k

    /* renamed from: e */
    public static final String f27873e = "last_modified_at";
    @C12579k

    /* renamed from: f */
    public static final String f27874f = "options";
    @C12579k

    /* renamed from: g */
    public static final String f27875g = "rule";

    @C12580l
    @RestrictTo({RestrictTo.Scope.TESTS})
    /* renamed from: a */
    public final JSONObject mo21580a(@C12579k String str, @C12579k Context context) {
        Intrinsics.checkNotNullParameter(str, "name");
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        return mo21582c(f27871c, str, context);
    }

    @C12580l
    @RestrictTo({RestrictTo.Scope.TESTS})
    /* renamed from: b */
    public final JSONObject mo21581b(@C12579k String str, @C12579k Context context) {
        Intrinsics.checkNotNullParameter(str, "name");
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        return mo21582c(f27870b, str, context);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0029, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        kotlin.p010io.C11133b.m42950a(r4, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002d, code lost:
        throw r6;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final org.json.JSONObject mo21582c(java.lang.String r4, java.lang.String r5, android.content.Context r6) {
        /*
            r3 = this;
            r0 = 0
            android.content.res.AssetManager r6 = r6.getAssets()     // Catch:{ IOException -> 0x0033, JSONException -> 0x002e }
            java.lang.String r4 = kotlin.jvm.internal.Intrinsics.stringPlus(r4, r5)     // Catch:{ IOException -> 0x0033, JSONException -> 0x002e }
            java.io.InputStream r4 = r6.open(r4)     // Catch:{ IOException -> 0x0033, JSONException -> 0x002e }
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ all -> 0x0027 }
            java.lang.String r6 = "it"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r6)     // Catch:{ all -> 0x0027 }
            byte[] r6 = kotlin.p010io.C11131a.m42936p(r4)     // Catch:{ all -> 0x0027 }
            java.nio.charset.Charset r1 = kotlin.text.C11602d.f28868b     // Catch:{ all -> 0x0027 }
            java.lang.String r2 = new java.lang.String     // Catch:{ all -> 0x0027 }
            r2.<init>(r6, r1)     // Catch:{ all -> 0x0027 }
            r5.<init>(r2)     // Catch:{ all -> 0x0027 }
            kotlin.p010io.C11133b.m42950a(r4, r0)     // Catch:{ IOException -> 0x0033, JSONException -> 0x002e }
            r0 = r5
            goto L_0x0037
        L_0x0027:
            r5 = move-exception
            throw r5     // Catch:{ all -> 0x0029 }
        L_0x0029:
            r6 = move-exception
            kotlin.p010io.C11133b.m42950a(r4, r5)     // Catch:{ IOException -> 0x0033, JSONException -> 0x002e }
            throw r6     // Catch:{ IOException -> 0x0033, JSONException -> 0x002e }
        L_0x002e:
            r4 = move-exception
            r4.printStackTrace()
            goto L_0x0037
        L_0x0033:
            r4 = move-exception
            r4.printStackTrace()
        L_0x0037:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.usabilla.sdk.ubform.utils.C10139f.mo21582c(java.lang.String, java.lang.String, android.content.Context):org.json.JSONObject");
    }

    @C12579k
    /* renamed from: d */
    public final TargetingOptionsModel mo21583d(@C12579k JSONObject jSONObject) {
        String str;
        Intrinsics.checkNotNullParameter(jSONObject, "item");
        JSONObject jSONObject2 = jSONObject.getJSONObject("options").getJSONObject("rule");
        C9834c cVar = C9834c.f26896a;
        Intrinsics.checkNotNullExpressionValue(jSONObject2, "ruleJson");
        Rule b = cVar.mo20225b(jSONObject2);
        if (jSONObject.has("last_modified_at")) {
            str = jSONObject.getString("last_modified_at");
        } else {
            str = null;
        }
        String string = jSONObject.getString("id");
        Intrinsics.checkNotNullExpressionValue(string, "id");
        return new TargetingOptionsModel(b, string, str);
    }
}
