package com.urbanairship.accengage;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0375v;
import com.urbanairship.json.C9323b;
import com.urbanairship.json.JsonException;
import com.urbanairship.json.JsonValue;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.urbanairship.accengage.c */
public class C35453c {

    /* renamed from: h */
    public static final String f87366h = "id";

    /* renamed from: i */
    public static final String f87367i = "url";

    /* renamed from: j */
    public static final String f87368j = "acc_url";

    /* renamed from: k */
    public static final String f87369k = "action";

    /* renamed from: l */
    public static final String f87370l = "acc_action";

    /* renamed from: m */
    public static final String f87371m = "title";

    /* renamed from: n */
    public static final String f87372n = "icon";

    /* renamed from: o */
    public static final String f87373o = "ccp";

    /* renamed from: p */
    public static final String f87374p = "oa";

    /* renamed from: a */
    public String f87375a;

    /* renamed from: b */
    public String f87376b;

    /* renamed from: c */
    public String f87377c;

    /* renamed from: d */
    public String f87378d;

    /* renamed from: e */
    public boolean f87379e = true;

    /* renamed from: f */
    public Map<String, String> f87380f;

    /* renamed from: g */
    public String f87381g;

    @C0359n0
    /* renamed from: a */
    public static C35453c m146289a(@C0359n0 JsonValue jsonValue) throws JsonException {
        C9323b A = jsonValue.mo18749A();
        C35453c cVar = new C35453c();
        cVar.f87375a = m146292l(A);
        cVar.f87377c = A.mo18801A("title").mo18769l();
        cVar.f87378d = A.mo18801A("icon").mo18769l();
        cVar.f87379e = A.mo18801A(f87374p).mo18757c(true);
        cVar.f87381g = m146290j(A);
        cVar.f87376b = m146293m(A);
        cVar.f87380f = m146291k(A);
        return cVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0061 A[RETURN] */
    @androidx.annotation.C0359n0
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m146290j(@androidx.annotation.C0359n0 com.urbanairship.json.C9323b r6) {
        /*
            java.lang.String r0 = "acc_action"
            boolean r1 = r6.mo18805e(r0)
            if (r1 == 0) goto L_0x0011
            com.urbanairship.json.JsonValue r6 = r6.mo18801A(r0)
            java.lang.String r6 = r6.mo18769l()
            goto L_0x0023
        L_0x0011:
            java.lang.String r0 = "action"
            boolean r1 = r6.mo18805e(r0)
            if (r1 == 0) goto L_0x0022
            com.urbanairship.json.JsonValue r6 = r6.mo18801A(r0)
            java.lang.String r6 = r6.mo18769l()
            goto L_0x0023
        L_0x0022:
            r6 = 0
        L_0x0023:
            if (r6 != 0) goto L_0x0027
            java.lang.String r6 = ""
        L_0x0027:
            int r0 = r6.hashCode()
            r1 = -170614112(0xfffffffff5d4a2a0, float:-5.390944E32)
            java.lang.String r2 = "webView"
            java.lang.String r3 = "browser"
            java.lang.String r4 = "urlExec"
            r5 = 1
            if (r0 == r1) goto L_0x0052
            r1 = 150940456(0x8ff2b28, float:1.53574E-33)
            if (r0 == r1) goto L_0x004a
            r1 = 1223471129(0x48ecb019, float:484736.78)
            if (r0 == r1) goto L_0x0042
            goto L_0x005a
        L_0x0042:
            boolean r6 = r6.equals(r2)
            if (r6 == 0) goto L_0x005a
            r6 = 2
            goto L_0x005b
        L_0x004a:
            boolean r6 = r6.equals(r3)
            if (r6 == 0) goto L_0x005a
            r6 = 0
            goto L_0x005b
        L_0x0052:
            boolean r6 = r6.equals(r4)
            if (r6 == 0) goto L_0x005a
            r6 = r5
            goto L_0x005b
        L_0x005a:
            r6 = -1
        L_0x005b:
            if (r6 == 0) goto L_0x0061
            if (r6 == r5) goto L_0x0060
            return r2
        L_0x0060:
            return r4
        L_0x0061:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.urbanairship.accengage.C35453c.m146290j(com.urbanairship.json.b):java.lang.String");
    }

    @C0359n0
    /* renamed from: k */
    public static Map<String, String> m146291k(@C0359n0 C9323b bVar) {
        HashMap hashMap = new HashMap();
        Iterator<Map.Entry<String, JsonValue>> it = bVar.mo18801A(f87373o).mo18749A().iterator();
        while (it.hasNext()) {
            Map.Entry next = it.next();
            hashMap.put((String) next.getKey(), ((JsonValue) next.getValue()).mo18770m(""));
        }
        return hashMap;
    }

    @C0359n0
    /* renamed from: l */
    public static String m146292l(@C0359n0 C9323b bVar) {
        String l = bVar.mo18801A("id").mo18769l();
        if (l == null) {
            return String.valueOf(bVar.mo18801A("id").mo18762f(0));
        }
        return l;
    }

    @C0363p0
    /* renamed from: m */
    public static String m146293m(@C0359n0 C9323b bVar) {
        if (bVar.mo18805e("acc_url")) {
            return bVar.mo18801A("acc_url").mo18769l();
        }
        if (bVar.mo18805e("url")) {
            return bVar.mo18801A("url").mo18769l();
        }
        return null;
    }

    @C0359n0
    /* renamed from: b */
    public String mo106276b() {
        return this.f87381g;
    }

    @C0363p0
    /* renamed from: c */
    public String mo106277c() {
        return this.f87376b;
    }

    @C0359n0
    /* renamed from: d */
    public Map<String, String> mo106278d() {
        return this.f87380f;
    }

    @C0375v
    /* renamed from: e */
    public int mo106279e(@C0359n0 Context context) {
        if (TextUtils.isEmpty(this.f87378d)) {
            return 0;
        }
        return context.getResources().getIdentifier(this.f87378d, "drawable", context.getPackageName());
    }

    @C0363p0
    /* renamed from: f */
    public String mo106280f() {
        return this.f87378d;
    }

    @C0359n0
    /* renamed from: g */
    public String mo106281g() {
        return this.f87375a;
    }

    /* renamed from: h */
    public boolean mo106282h() {
        return this.f87379e;
    }

    @C0363p0
    /* renamed from: i */
    public String mo106283i() {
        return this.f87377c;
    }
}
