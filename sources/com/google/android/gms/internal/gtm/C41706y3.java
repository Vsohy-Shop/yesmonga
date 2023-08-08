package com.google.android.gms.internal.gtm;

import android.text.TextUtils;
import com.google.android.gms.common.internal.C40843u;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.gtm.y3 */
public final class C41706y3 {

    /* renamed from: a */
    public final Map<String, String> f105285a;

    /* renamed from: b */
    public final List<zzcp> f105286b;

    /* renamed from: c */
    public final long f105287c;

    /* renamed from: d */
    public final long f105288d;

    /* renamed from: e */
    public final int f105289e;

    /* renamed from: f */
    public final boolean f105290f;

    /* renamed from: g */
    public final String f105291g;

    public C41706y3(C41511q0 q0Var, Map<String, String> map, long j, boolean z) {
        this(q0Var, map, j, z, 0, 0, (List<zzcp>) null);
    }

    /* renamed from: e */
    public static C41706y3 m168836e(C41511q0 q0Var, C41706y3 y3Var, Map<String, String> map) {
        return new C41706y3(q0Var, map, y3Var.f105288d, y3Var.f105290f, y3Var.f105287c, y3Var.f105289e, y3Var.f105286b);
    }

    /* renamed from: j */
    public static String m168837j(C41511q0 q0Var, Object obj) {
        if (obj == null) {
            return null;
        }
        String obj2 = obj.toString();
        if (obj2.startsWith("&")) {
            obj2 = obj2.substring(1);
        }
        int length = obj2.length();
        if (length > 256) {
            obj2 = obj2.substring(0, 256);
            q0Var.mo135731B("Hit param name is too long and will be trimmed", Integer.valueOf(length), obj2);
        }
        if (TextUtils.isEmpty(obj2)) {
            return null;
        }
        return obj2;
    }

    /* renamed from: k */
    public static String m168838k(C41511q0 q0Var, Object obj) {
        String str;
        if (obj == null) {
            str = "";
        } else {
            str = obj.toString();
        }
        int length = str.length();
        if (length <= 8192) {
            return str;
        }
        String substring = str.substring(0, 8192);
        q0Var.mo135731B("Hit param value is too long and will be trimmed", Integer.valueOf(length), substring);
        return substring;
    }

    /* renamed from: l */
    public static boolean m168839l(Object obj) {
        if (obj == null) {
            return false;
        }
        return obj.toString().startsWith("&");
    }

    /* renamed from: a */
    public final int mo136091a() {
        return this.f105289e;
    }

    /* renamed from: b */
    public final long mo136092b() {
        return this.f105287c;
    }

    /* renamed from: c */
    public final long mo136093c() {
        return C41611u4.m168465a(mo136098i("_s", "0"));
    }

    /* renamed from: d */
    public final long mo136094d() {
        return this.f105288d;
    }

    /* renamed from: f */
    public final String mo136095f() {
        return mo136098i("_m", "");
    }

    /* renamed from: g */
    public final Map<String, String> mo136096g() {
        return this.f105285a;
    }

    /* renamed from: h */
    public final boolean mo136097h() {
        return this.f105290f;
    }

    /* renamed from: i */
    public final String mo136098i(String str, String str2) {
        C40843u.m166198h(str);
        C40843u.m166192b(!str.startsWith("&"), "Short param name required");
        String str3 = this.f105285a.get(str);
        if (str3 != null) {
            return str3;
        }
        return str2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ht=");
        sb.append(this.f105288d);
        if (this.f105287c != 0) {
            sb.append(", dbId=");
            sb.append(this.f105287c);
        }
        if (this.f105289e != 0) {
            sb.append(", appUID=");
            sb.append(this.f105289e);
        }
        ArrayList arrayList = new ArrayList(this.f105285a.keySet());
        Collections.sort(arrayList);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            String str = (String) arrayList.get(i);
            sb.append(", ");
            sb.append(str);
            sb.append("=");
            sb.append(this.f105285a.get(str));
        }
        return sb.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C41706y3(com.google.android.gms.internal.gtm.C41511q0 r1, java.util.Map<java.lang.String, java.lang.String> r2, long r3, boolean r5, long r6, int r8, java.util.List<com.google.android.gms.internal.gtm.zzcp> r9) {
        /*
            r0 = this;
            r0.<init>()
            com.google.android.gms.common.internal.C40843u.m166202l(r1)
            com.google.android.gms.common.internal.C40843u.m166202l(r2)
            r0.f105288d = r3
            r0.f105290f = r5
            r0.f105287c = r6
            r0.f105289e = r8
            if (r9 == 0) goto L_0x0015
            r3 = r9
            goto L_0x0019
        L_0x0015:
            java.util.List r3 = java.util.Collections.emptyList()
        L_0x0019:
            r0.f105286b = r3
            r3 = 0
            if (r9 == 0) goto L_0x003f
            java.util.Iterator r4 = r9.iterator()
        L_0x0022:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x003f
            java.lang.Object r5 = r4.next()
            com.google.android.gms.internal.gtm.zzcp r5 = (com.google.android.gms.internal.gtm.zzcp) r5
            java.lang.String r6 = r5.mo136138a()
            java.lang.String r7 = "appendVersion"
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L_0x0022
            java.lang.String r4 = r5.mo136139b()
            goto L_0x0040
        L_0x003f:
            r4 = r3
        L_0x0040:
            r5 = 1
            boolean r6 = android.text.TextUtils.isEmpty(r4)
            if (r5 != r6) goto L_0x0048
            goto L_0x0049
        L_0x0048:
            r3 = r4
        L_0x0049:
            r0.f105291g = r3
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.util.Set r4 = r2.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L_0x0058:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0084
            java.lang.Object r5 = r4.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r6 = r5.getKey()
            boolean r6 = m168839l(r6)
            if (r6 == 0) goto L_0x0058
            java.lang.Object r6 = r5.getKey()
            java.lang.String r6 = m168837j(r1, r6)
            if (r6 == 0) goto L_0x0058
            java.lang.Object r5 = r5.getValue()
            java.lang.String r5 = m168838k(r1, r5)
            r3.put(r6, r5)
            goto L_0x0058
        L_0x0084:
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x008c:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x00b8
            java.lang.Object r4 = r2.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r5 = r4.getKey()
            boolean r5 = m168839l(r5)
            if (r5 != 0) goto L_0x008c
            java.lang.Object r5 = r4.getKey()
            java.lang.String r5 = m168837j(r1, r5)
            if (r5 == 0) goto L_0x008c
            java.lang.Object r4 = r4.getValue()
            java.lang.String r4 = m168838k(r1, r4)
            r3.put(r5, r4)
            goto L_0x008c
        L_0x00b8:
            java.lang.String r1 = r0.f105291g
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x00e0
            java.lang.String r1 = "_v"
            java.lang.String r2 = r0.f105291g
            com.google.android.gms.internal.gtm.C41611u4.m168471g(r3, r1, r2)
            java.lang.String r1 = r0.f105291g
            java.lang.String r2 = "ma4.0.0"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x00db
            java.lang.String r1 = r0.f105291g
            java.lang.String r2 = "ma4.0.1"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x00e0
        L_0x00db:
            java.lang.String r1 = "adid"
            r3.remove(r1)
        L_0x00e0:
            java.util.Map r1 = java.util.Collections.unmodifiableMap(r3)
            r0.f105285a = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.C41706y3.<init>(com.google.android.gms.internal.gtm.q0, java.util.Map, long, boolean, long, int, java.util.List):void");
    }
}
