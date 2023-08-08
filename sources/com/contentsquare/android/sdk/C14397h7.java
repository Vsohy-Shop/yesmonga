package com.contentsquare.android.sdk;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.contentsquare.android.sdk.h7 */
public final class C14397h7 {

    /* renamed from: a */
    public final C14453jf f35598a = new C14453jf("UserId");

    /* renamed from: b */
    public final String f35599b = "";

    /* renamed from: c */
    public final C14213b7 f35600c;

    public C14397h7(C14213b7 b7Var) {
        Intrinsics.checkNotNullParameter(b7Var, "preferencesStore");
        this.f35600c = b7Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0020, code lost:
        r0 = r1.optString("uid", r4.f35599b);
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo35500a() {
        /*
            r4 = this;
            com.contentsquare.android.sdk.b7 r0 = r4.f35600c     // Catch:{ JSONException -> 0x0012 }
            com.contentsquare.android.sdk.k8 r1 = com.contentsquare.android.sdk.C14477k8.USER_ID     // Catch:{ JSONException -> 0x0012 }
            java.lang.String r2 = r4.f35599b     // Catch:{ JSONException -> 0x0012 }
            java.lang.String r0 = r0.mo34673e(r1, r2)     // Catch:{ JSONException -> 0x0012 }
            if (r0 == 0) goto L_0x001d
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0012 }
            r1.<init>(r0)     // Catch:{ JSONException -> 0x0012 }
            goto L_0x001e
        L_0x0012:
            r0 = move-exception
            com.contentsquare.android.sdk.jf r1 = r4.f35598a
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r3 = "Cannot parse the user id."
            r1.mo35678g(r0, r3, r2)
        L_0x001d:
            r1 = 0
        L_0x001e:
            if (r1 == 0) goto L_0x002a
            java.lang.String r0 = r4.f35599b
            java.lang.String r2 = "uid"
            java.lang.String r0 = r1.optString(r2, r0)
            if (r0 != 0) goto L_0x002c
        L_0x002a:
            java.lang.String r0 = r4.f35599b
        L_0x002c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.contentsquare.android.sdk.C14397h7.mo35500a():java.lang.String");
    }
}
