package com.google.android.gms.analytics;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.internal.gtm.C41198d0;
import com.google.android.gms.internal.gtm.C41511q0;
import com.google.android.gms.internal.gtm.C41559s0;
import com.google.android.gms.internal.gtm.C41606u;
import com.google.android.gms.internal.gtm.C41607u0;
import com.google.android.gms.internal.gtm.C41611u4;
import com.google.android.gms.internal.gtm.C41655w0;
import com.google.android.gms.internal.gtm.C41706y3;
import com.usabilla.sdk.ubform.net.C9851c;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.analytics.k */
public final class C40399k extends C41511q0 implements C40376c0 {

    /* renamed from: e */
    public static DecimalFormat f102966e;

    /* renamed from: b */
    public final C41607u0 f102967b;

    /* renamed from: c */
    public final String f102968c;

    /* renamed from: d */
    public final Uri f102969d;

    public C40399k(C41607u0 u0Var, String str) {
        super(u0Var);
        C40843u.m166198h(str);
        this.f102967b = u0Var;
        this.f102968c = str;
        this.f102969d = m164468T(str);
    }

    /* renamed from: T */
    public static Uri m164468T(String str) {
        C40843u.m166198h(str);
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("uri");
        builder.authority("google-analytics.com");
        builder.path(str);
        return builder.build();
    }

    /* renamed from: U */
    public static String m164469U(double d) {
        if (f102966e == null) {
            f102966e = new DecimalFormat("0.######");
        }
        return f102966e.format(d);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003c, code lost:
        if (android.text.TextUtils.isEmpty(r6) != false) goto L_0x0030;
     */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x001e A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0067  */
    @com.google.android.gms.common.util.C40974d0
    /* renamed from: V */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.Map<java.lang.String, java.lang.String> m164470V(com.google.android.gms.analytics.C40405q r12) {
        /*
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.Class<com.google.android.gms.internal.gtm.y> r1 = com.google.android.gms.internal.gtm.C41702y.class
            com.google.android.gms.analytics.s r1 = r12.mo133432c(r1)
            com.google.android.gms.internal.gtm.y r1 = (com.google.android.gms.internal.gtm.C41702y) r1
            r2 = 0
            r4 = 0
            if (r1 == 0) goto L_0x0071
            java.util.Map r1 = r1.mo136087e()
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x001e:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x0071
            java.lang.Object r5 = r1.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r6 = r5.getValue()
            if (r6 != 0) goto L_0x0032
        L_0x0030:
            r6 = r4
            goto L_0x0065
        L_0x0032:
            boolean r7 = r6 instanceof java.lang.String
            if (r7 == 0) goto L_0x003f
            java.lang.String r6 = (java.lang.String) r6
            boolean r7 = android.text.TextUtils.isEmpty(r6)
            if (r7 == 0) goto L_0x0065
            goto L_0x0030
        L_0x003f:
            boolean r7 = r6 instanceof java.lang.Double
            if (r7 == 0) goto L_0x0056
            java.lang.Double r6 = (java.lang.Double) r6
            double r7 = r6.doubleValue()
            int r7 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r7 == 0) goto L_0x0030
            double r6 = r6.doubleValue()
            java.lang.String r6 = m164469U(r6)
            goto L_0x0065
        L_0x0056:
            boolean r7 = r6 instanceof java.lang.Boolean
            if (r7 == 0) goto L_0x0061
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            if (r6 == r7) goto L_0x0030
            java.lang.String r6 = "1"
            goto L_0x0065
        L_0x0061:
            java.lang.String r6 = java.lang.String.valueOf(r6)
        L_0x0065:
            if (r6 == 0) goto L_0x001e
            java.lang.Object r5 = r5.getKey()
            java.lang.String r5 = (java.lang.String) r5
            r0.put(r5, r6)
            goto L_0x001e
        L_0x0071:
            java.lang.Class<com.google.android.gms.internal.gtm.d0> r1 = com.google.android.gms.internal.gtm.C41198d0.class
            com.google.android.gms.analytics.s r1 = r12.mo133432c(r1)
            com.google.android.gms.internal.gtm.d0 r1 = (com.google.android.gms.internal.gtm.C41198d0) r1
            if (r1 == 0) goto L_0x00b6
            java.lang.String r5 = "t"
            java.lang.String r6 = r1.mo135194g()
            m164471W(r0, r5, r6)
            java.lang.String r5 = "cid"
            java.lang.String r6 = r1.mo135193f()
            m164471W(r0, r5, r6)
            java.lang.String r5 = "uid"
            java.lang.String r6 = r1.mo135195h()
            m164471W(r0, r5, r6)
            java.lang.String r5 = "sc"
            m164471W(r0, r5, r4)
            java.lang.String r5 = "ni"
            boolean r6 = r1.mo135203p()
            m164472X(r0, r5, r6)
            java.lang.String r5 = "adid"
            java.lang.String r6 = r1.mo135192e()
            m164471W(r0, r5, r6)
            java.lang.String r5 = "ate"
            boolean r1 = r1.mo135202o()
            m164472X(r0, r5, r1)
        L_0x00b6:
            java.lang.Class<com.google.android.gms.internal.gtm.e0> r1 = com.google.android.gms.internal.gtm.C41222e0.class
            com.google.android.gms.analytics.s r1 = r12.mo133432c(r1)
            com.google.android.gms.internal.gtm.e0 r1 = (com.google.android.gms.internal.gtm.C41222e0) r1
            if (r1 == 0) goto L_0x00dc
            java.lang.String r5 = "cd"
            m164471W(r0, r5, r4)
            int r1 = r1.mo135311e()
            double r5 = (double) r1
            int r1 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r1 == 0) goto L_0x00d7
            java.lang.String r1 = "a"
            java.lang.String r2 = m164469U(r5)
            r0.put(r1, r2)
        L_0x00d7:
            java.lang.String r1 = "dr"
            m164471W(r0, r1, r4)
        L_0x00dc:
            java.lang.Class<com.google.android.gms.internal.gtm.b0> r1 = com.google.android.gms.internal.gtm.C41150b0.class
            com.google.android.gms.analytics.s r1 = r12.mo133432c(r1)
            com.google.android.gms.internal.gtm.b0 r1 = (com.google.android.gms.internal.gtm.C41150b0) r1
            if (r1 == 0) goto L_0x00f5
            java.lang.String r1 = "ec"
            m164471W(r0, r1, r4)
            java.lang.String r1 = "ea"
            m164471W(r0, r1, r4)
            java.lang.String r1 = "el"
            m164471W(r0, r1, r4)
        L_0x00f5:
            java.lang.Class<com.google.android.gms.internal.gtm.v> r1 = com.google.android.gms.internal.gtm.C41630v.class
            com.google.android.gms.analytics.s r1 = r12.mo133432c(r1)
            com.google.android.gms.internal.gtm.v r1 = (com.google.android.gms.internal.gtm.C41630v) r1
            if (r1 == 0) goto L_0x0159
            java.lang.String r2 = "cn"
            java.lang.String r3 = r1.mo135939m()
            m164471W(r0, r2, r3)
            java.lang.String r2 = "cs"
            java.lang.String r3 = r1.mo135940n()
            m164471W(r0, r2, r3)
            java.lang.String r2 = "cm"
            java.lang.String r3 = r1.mo135938l()
            m164471W(r0, r2, r3)
            java.lang.String r2 = "ck"
            java.lang.String r3 = r1.mo135937k()
            m164471W(r0, r2, r3)
            java.lang.String r2 = "cc"
            java.lang.String r3 = r1.mo135933g()
            m164471W(r0, r2, r3)
            java.lang.String r2 = "ci"
            java.lang.String r3 = r1.mo135936j()
            m164471W(r0, r2, r3)
            java.lang.String r2 = "anid"
            java.lang.String r3 = r1.mo135932f()
            m164471W(r0, r2, r3)
            java.lang.String r2 = "gclid"
            java.lang.String r3 = r1.mo135935i()
            m164471W(r0, r2, r3)
            java.lang.String r2 = "dclid"
            java.lang.String r3 = r1.mo135934h()
            m164471W(r0, r2, r3)
            java.lang.String r2 = "aclid"
            java.lang.String r1 = r1.mo135931e()
            m164471W(r0, r2, r1)
        L_0x0159:
            java.lang.Class<com.google.android.gms.internal.gtm.c0> r1 = com.google.android.gms.internal.gtm.C41174c0.class
            com.google.android.gms.analytics.s r1 = r12.mo133432c(r1)
            com.google.android.gms.internal.gtm.c0 r1 = (com.google.android.gms.internal.gtm.C41174c0) r1
            if (r1 == 0) goto L_0x0168
            java.lang.String r1 = "exd"
            m164471W(r0, r1, r4)
        L_0x0168:
            java.lang.Class<com.google.android.gms.internal.gtm.f0> r1 = com.google.android.gms.internal.gtm.C41246f0.class
            com.google.android.gms.analytics.s r1 = r12.mo133432c(r1)
            com.google.android.gms.internal.gtm.f0 r1 = (com.google.android.gms.internal.gtm.C41246f0) r1
            if (r1 == 0) goto L_0x0181
            java.lang.String r1 = "sn"
            m164471W(r0, r1, r4)
            java.lang.String r1 = "sa"
            m164471W(r0, r1, r4)
            java.lang.String r1 = "st"
            m164471W(r0, r1, r4)
        L_0x0181:
            java.lang.Class<com.google.android.gms.internal.gtm.g0> r1 = com.google.android.gms.internal.gtm.C41270g0.class
            com.google.android.gms.analytics.s r1 = r12.mo133432c(r1)
            com.google.android.gms.internal.gtm.g0 r1 = (com.google.android.gms.internal.gtm.C41270g0) r1
            if (r1 == 0) goto L_0x019a
            java.lang.String r1 = "utv"
            m164471W(r0, r1, r4)
            java.lang.String r1 = "utc"
            m164471W(r0, r1, r4)
            java.lang.String r1 = "utl"
            m164471W(r0, r1, r4)
        L_0x019a:
            java.lang.Class<com.google.android.gms.internal.gtm.w> r1 = com.google.android.gms.internal.gtm.C41654w.class
            com.google.android.gms.analytics.s r1 = r12.mo133432c(r1)
            com.google.android.gms.internal.gtm.w r1 = (com.google.android.gms.internal.gtm.C41654w) r1
            if (r1 == 0) goto L_0x01da
            java.util.Map r1 = r1.mo136006e()
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x01b0:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x01da
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            java.lang.String r3 = com.google.android.gms.analytics.C40401m.m164475b(r3)
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 != 0) goto L_0x01b0
            java.lang.Object r2 = r2.getValue()
            java.lang.String r2 = (java.lang.String) r2
            r0.put(r3, r2)
            goto L_0x01b0
        L_0x01da:
            java.lang.Class<com.google.android.gms.internal.gtm.x> r1 = com.google.android.gms.internal.gtm.C41678x.class
            com.google.android.gms.analytics.s r1 = r12.mo133432c(r1)
            com.google.android.gms.internal.gtm.x r1 = (com.google.android.gms.internal.gtm.C41678x) r1
            if (r1 == 0) goto L_0x0222
            java.util.Map r1 = r1.mo136027e()
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x01f0:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0222
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            java.lang.String r3 = com.google.android.gms.analytics.C40401m.m164478e(r3)
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 != 0) goto L_0x01f0
            java.lang.Object r2 = r2.getValue()
            java.lang.Double r2 = (java.lang.Double) r2
            double r4 = r2.doubleValue()
            java.lang.String r2 = m164469U(r4)
            r0.put(r3, r2)
            goto L_0x01f0
        L_0x0222:
            java.lang.Class<com.google.android.gms.internal.gtm.a0> r1 = com.google.android.gms.internal.gtm.C41126a0.class
            com.google.android.gms.analytics.s r1 = r12.mo133432c(r1)
            com.google.android.gms.internal.gtm.a0 r1 = (com.google.android.gms.internal.gtm.C41126a0) r1
            if (r1 == 0) goto L_0x02ee
            java.util.List r2 = r1.mo134990f()
            java.util.Iterator r2 = r2.iterator()
            r3 = 1
            r4 = r3
        L_0x0236:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x024f
            java.lang.Object r5 = r2.next()
            com.google.android.gms.analytics.ecommerce.c r5 = (com.google.android.gms.analytics.ecommerce.C40383c) r5
            java.lang.String r6 = com.google.android.gms.analytics.C40401m.m164486m(r4)
            java.util.Map r5 = r5.mo133332e(r6)
            r0.putAll(r5)
            int r4 = r4 + r3
            goto L_0x0236
        L_0x024f:
            java.util.List r2 = r1.mo134989e()
            java.util.Iterator r2 = r2.iterator()
            r4 = r3
        L_0x0258:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x0271
            java.lang.Object r5 = r2.next()
            com.google.android.gms.analytics.ecommerce.a r5 = (com.google.android.gms.analytics.ecommerce.C40381a) r5
            java.lang.String r6 = com.google.android.gms.analytics.C40401m.m164484k(r4)
            java.util.Map r5 = r5.mo133312l(r6)
            r0.putAll(r5)
            int r4 = r4 + r3
            goto L_0x0258
        L_0x0271:
            java.util.Map r1 = r1.mo134991g()
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
            r2 = r3
        L_0x027e:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x02ee
            java.lang.Object r4 = r1.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r5 = r4.getValue()
            java.util.List r5 = (java.util.List) r5
            java.lang.String r6 = com.google.android.gms.analytics.C40401m.m164481h(r2)
            java.util.Iterator r5 = r5.iterator()
            r7 = r3
        L_0x0299:
            boolean r8 = r5.hasNext()
            if (r8 == 0) goto L_0x02cc
            java.lang.Object r8 = r5.next()
            com.google.android.gms.analytics.ecommerce.a r8 = (com.google.android.gms.analytics.ecommerce.C40381a) r8
            java.lang.String r9 = java.lang.String.valueOf(r6)
            java.lang.String r10 = com.google.android.gms.analytics.C40401m.m164482i(r7)
            java.lang.String r10 = java.lang.String.valueOf(r10)
            int r11 = r10.length()
            if (r11 == 0) goto L_0x02bc
            java.lang.String r9 = r9.concat(r10)
            goto L_0x02c2
        L_0x02bc:
            java.lang.String r10 = new java.lang.String
            r10.<init>(r9)
            r9 = r10
        L_0x02c2:
            java.util.Map r8 = r8.mo133312l(r9)
            r0.putAll(r8)
            int r7 = r7 + 1
            goto L_0x0299
        L_0x02cc:
            java.lang.Object r5 = r4.getKey()
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x02eb
            java.lang.String r5 = java.lang.String.valueOf(r6)
            java.lang.String r6 = "nm"
            java.lang.String r5 = r5.concat(r6)
            java.lang.Object r4 = r4.getKey()
            java.lang.String r4 = (java.lang.String) r4
            r0.put(r5, r4)
        L_0x02eb:
            int r2 = r2 + 1
            goto L_0x027e
        L_0x02ee:
            java.lang.Class<com.google.android.gms.internal.gtm.z> r1 = com.google.android.gms.internal.gtm.C41726z.class
            com.google.android.gms.analytics.s r1 = r12.mo133432c(r1)
            com.google.android.gms.internal.gtm.z r1 = (com.google.android.gms.internal.gtm.C41726z) r1
            if (r1 == 0) goto L_0x0324
            java.lang.String r2 = "ul"
            java.lang.String r3 = r1.mo136115e()
            m164471W(r0, r2, r3)
            int r2 = r1.f105316b
            int r1 = r1.f105317c
            if (r2 <= 0) goto L_0x0324
            if (r1 <= 0) goto L_0x0324
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r4 = 23
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r2 = "x"
            r3.append(r2)
            r3.append(r1)
            java.lang.String r1 = "sr"
            java.lang.String r2 = r3.toString()
            r0.put(r1, r2)
        L_0x0324:
            java.lang.Class<com.google.android.gms.internal.gtm.u> r1 = com.google.android.gms.internal.gtm.C41606u.class
            com.google.android.gms.analytics.s r12 = r12.mo133432c(r1)
            com.google.android.gms.internal.gtm.u r12 = (com.google.android.gms.internal.gtm.C41606u) r12
            if (r12 == 0) goto L_0x0352
            java.lang.String r1 = "an"
            java.lang.String r2 = r12.mo135883g()
            m164471W(r0, r1, r2)
            java.lang.String r1 = "aid"
            java.lang.String r2 = r12.mo135881e()
            m164471W(r0, r1, r2)
            java.lang.String r1 = "aiid"
            java.lang.String r2 = r12.mo135882f()
            m164471W(r0, r1, r2)
            java.lang.String r1 = "av"
            java.lang.String r12 = r12.mo135884h()
            m164471W(r0, r1, r12)
        L_0x0352:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.analytics.C40399k.m164470V(com.google.android.gms.analytics.q):java.util.Map");
    }

    /* renamed from: W */
    public static void m164471W(Map<String, String> map, String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            map.put(str, str2);
        }
    }

    /* renamed from: X */
    public static void m164472X(Map<String, String> map, String str, boolean z) {
        if (z) {
            map.put(str, "1");
        }
    }

    /* renamed from: d */
    public final void mo133268d(C40405q qVar) {
        C40843u.m166202l(qVar);
        C40843u.m166192b(qVar.mo133442m(), "Can't deliver not submitted measurement");
        C40843u.m166201k("deliver should be called on worker thread");
        C40405q qVar2 = new C40405q(qVar);
        C41198d0 d0Var = (C41198d0) qVar2.mo133431b(C41198d0.class);
        if (TextUtils.isEmpty(d0Var.mo135194g())) {
            mo135745S().mo135212a0(m164470V(qVar2), "Ignoring measurement without type");
        } else if (TextUtils.isEmpty(d0Var.mo135193f())) {
            mo135745S().mo135212a0(m164470V(qVar2), "Ignoring measurement without client id");
        } else if (this.f102967b.mo135893c().mo133279j()) {
        } else {
            if (C41611u4.m168474j(0.0d, d0Var.mo135193f())) {
                mo135751n("Sampling enabled. Hit sampled out. sampling rate", Double.valueOf(0.0d));
                return;
            }
            Map<String, String> V = m164470V(qVar2);
            V.put(C9851c.f26937h, "1");
            V.put("_v", C41559s0.f104934b);
            V.put("tid", this.f102968c);
            if (this.f102967b.mo135893c().mo133281m()) {
                StringBuilder sb = new StringBuilder();
                for (Map.Entry next : V.entrySet()) {
                    if (sb.length() != 0) {
                        sb.append(", ");
                    }
                    sb.append((String) next.getKey());
                    sb.append("=");
                    sb.append((String) next.getValue());
                }
                mo135758u("Dry run is enabled. GoogleAnalytics would have sent", sb.toString());
                return;
            }
            HashMap hashMap = new HashMap();
            C41611u4.m168471g(hashMap, "uid", d0Var.mo135195h());
            C41606u uVar = (C41606u) qVar.mo133432c(C41606u.class);
            if (uVar != null) {
                C41611u4.m168471g(hashMap, "an", uVar.mo135883g());
                C41611u4.m168471g(hashMap, "aid", uVar.mo135881e());
                C41611u4.m168471g(hashMap, "av", uVar.mo135884h());
                C41611u4.m168471g(hashMap, "aiid", uVar.mo135882f());
            }
            V.put("_s", String.valueOf(mo135738L().mo135690X(new C41655w0(0, d0Var.mo135193f(), this.f102968c, !TextUtils.isEmpty(d0Var.mo135192e()), 0, hashMap))));
            mo135738L().mo135695e0(new C41706y3(mo135745S(), V, qVar.mo133430a(), true));
        }
    }

    public final Uri zzb() {
        return this.f102969d;
    }
}
