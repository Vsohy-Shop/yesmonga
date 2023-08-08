package com.google.android.gms.analytics;

import android.text.TextUtils;
import androidx.annotation.RecentlyNonNull;
import androidx.appcompat.widget.SearchView;
import androidx.core.app.C17075f2;
import com.carrefour.fid.android.shared.constant.C28526d;
import com.google.android.gms.analytics.ecommerce.C40381a;
import com.google.android.gms.analytics.ecommerce.C40382b;
import com.google.android.gms.analytics.ecommerce.C40383c;
import com.google.android.gms.common.util.C40974d0;
import com.google.android.gms.internal.gtm.C41178c4;
import com.google.android.gms.internal.gtm.C41611u4;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@C40974d0
/* renamed from: com.google.android.gms.analytics.f */
public class C40384f {

    @Deprecated
    @C40974d0
    /* renamed from: com.google.android.gms.analytics.f$a */
    public static class C40385a extends C40388d<C40385a> {
        public C40385a() {
            mo133353f("&t", C28526d.f68840N0);
        }

        @RecentlyNonNull
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ C40388d mo133335a(@RecentlyNonNull C40381a aVar, @RecentlyNonNull String str) {
            super.mo133335a(aVar, str);
            return this;
        }

        @RecentlyNonNull
        /* renamed from: b */
        public final /* bridge */ /* synthetic */ C40388d mo133336b(@RecentlyNonNull C40381a aVar) {
            super.mo133336b(aVar);
            return this;
        }

        @RecentlyNonNull
        /* renamed from: c */
        public final /* bridge */ /* synthetic */ C40388d mo133337c(@RecentlyNonNull C40383c cVar) {
            super.mo133337c(cVar);
            return this;
        }

        @RecentlyNonNull
        /* renamed from: h */
        public final /* bridge */ /* synthetic */ C40388d mo133338h(@RecentlyNonNull String str) {
            super.mo133338h(str);
            return this;
        }

        @RecentlyNonNull
        /* renamed from: i */
        public final /* bridge */ /* synthetic */ C40388d mo133339i(int i, @RecentlyNonNull String str) {
            super.mo133339i(i, str);
            return this;
        }

        @RecentlyNonNull
        /* renamed from: j */
        public final /* bridge */ /* synthetic */ C40388d mo133340j(int i, float f) {
            super.mo133340j(i, f);
            return this;
        }

        @RecentlyNonNull
        /* renamed from: l */
        public final /* bridge */ /* synthetic */ C40388d mo133341l() {
            super.mo133341l();
            return this;
        }

        @RecentlyNonNull
        /* renamed from: m */
        public final /* bridge */ /* synthetic */ C40388d mo133342m(boolean z) {
            super.mo133342m(z);
            return this;
        }

        @RecentlyNonNull
        /* renamed from: n */
        public final /* bridge */ /* synthetic */ C40388d mo133343n(@RecentlyNonNull C40382b bVar) {
            super.mo133343n(bVar);
            return this;
        }

        @RecentlyNonNull
        /* renamed from: o */
        public final /* bridge */ /* synthetic */ C40388d mo133344o(@RecentlyNonNull String str) {
            super.mo133344o(str);
            return this;
        }
    }

    @C40974d0
    /* renamed from: com.google.android.gms.analytics.f$c */
    public static class C40387c extends C40388d<C40387c> {
        public C40387c() {
            mo133353f("&t", "exception");
        }

        @RecentlyNonNull
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ C40388d mo133335a(@RecentlyNonNull C40381a aVar, @RecentlyNonNull String str) {
            super.mo133335a(aVar, str);
            return this;
        }

        @RecentlyNonNull
        /* renamed from: b */
        public final /* bridge */ /* synthetic */ C40388d mo133336b(@RecentlyNonNull C40381a aVar) {
            super.mo133336b(aVar);
            return this;
        }

        @RecentlyNonNull
        /* renamed from: c */
        public final /* bridge */ /* synthetic */ C40388d mo133337c(@RecentlyNonNull C40383c cVar) {
            super.mo133337c(cVar);
            return this;
        }

        @RecentlyNonNull
        /* renamed from: h */
        public final /* bridge */ /* synthetic */ C40388d mo133338h(@RecentlyNonNull String str) {
            super.mo133338h(str);
            return this;
        }

        @RecentlyNonNull
        /* renamed from: i */
        public final /* bridge */ /* synthetic */ C40388d mo133339i(int i, @RecentlyNonNull String str) {
            super.mo133339i(i, str);
            return this;
        }

        @RecentlyNonNull
        /* renamed from: j */
        public final /* bridge */ /* synthetic */ C40388d mo133340j(int i, float f) {
            super.mo133340j(i, f);
            return this;
        }

        @RecentlyNonNull
        /* renamed from: l */
        public final /* bridge */ /* synthetic */ C40388d mo133341l() {
            super.mo133341l();
            return this;
        }

        @RecentlyNonNull
        /* renamed from: m */
        public final /* bridge */ /* synthetic */ C40388d mo133342m(boolean z) {
            super.mo133342m(z);
            return this;
        }

        @RecentlyNonNull
        /* renamed from: n */
        public final /* bridge */ /* synthetic */ C40388d mo133343n(@RecentlyNonNull C40382b bVar) {
            super.mo133343n(bVar);
            return this;
        }

        @RecentlyNonNull
        /* renamed from: o */
        public final /* bridge */ /* synthetic */ C40388d mo133344o(@RecentlyNonNull String str) {
            super.mo133344o(str);
            return this;
        }

        @RecentlyNonNull
        /* renamed from: q */
        public C40387c mo133349q(@RecentlyNonNull String str) {
            mo133353f("&exd", str);
            return this;
        }

        @RecentlyNonNull
        /* renamed from: r */
        public C40387c mo133350r(boolean z) {
            mo133353f("&exf", C41611u4.m168467c(z));
            return this;
        }
    }

    @C40974d0
    /* renamed from: com.google.android.gms.analytics.f$d */
    public static class C40388d<T extends C40388d> {

        /* renamed from: a */
        public Map<String, String> f102947a = new HashMap();

        /* renamed from: b */
        public C40382b f102948b;

        /* renamed from: c */
        public Map<String, List<C40381a>> f102949c = new HashMap();

        /* renamed from: d */
        public List<C40383c> f102950d = new ArrayList();

        /* renamed from: e */
        public List<C40381a> f102951e = new ArrayList();

        @RecentlyNonNull
        /* renamed from: a */
        public T mo133335a(@RecentlyNonNull C40381a aVar, @RecentlyNonNull String str) {
            if (aVar == null) {
                C41178c4.m167251e("product should be non-null");
                return this;
            }
            if (str == null) {
                str = "";
            }
            if (!this.f102949c.containsKey(str)) {
                this.f102949c.put(str, new ArrayList());
            }
            this.f102949c.get(str).add(aVar);
            return this;
        }

        @RecentlyNonNull
        /* renamed from: b */
        public T mo133336b(@RecentlyNonNull C40381a aVar) {
            if (aVar == null) {
                C41178c4.m167251e("product should be non-null");
                return this;
            }
            this.f102951e.add(aVar);
            return this;
        }

        @RecentlyNonNull
        /* renamed from: c */
        public T mo133337c(@RecentlyNonNull C40383c cVar) {
            if (cVar == null) {
                C41178c4.m167251e("promotion should be non-null");
                return this;
            }
            this.f102950d.add(cVar);
            return this;
        }

        @RecentlyNonNull
        /* renamed from: d */
        public Map<String, String> mo133351d() {
            String str;
            HashMap hashMap = new HashMap(this.f102947a);
            C40382b bVar = this.f102948b;
            if (bVar != null) {
                hashMap.putAll(bVar.mo133325k());
            }
            int i = 1;
            for (C40383c e : this.f102950d) {
                hashMap.putAll(e.mo133332e(C40401m.m164485l(i)));
                i++;
            }
            int i2 = 1;
            for (C40381a l : this.f102951e) {
                hashMap.putAll(l.mo133312l(C40401m.m164483j(i2)));
                i2++;
            }
            int i3 = 1;
            for (Map.Entry next : this.f102949c.entrySet()) {
                String g = C40401m.m164480g(i3);
                int i4 = 1;
                for (C40381a aVar : (List) next.getValue()) {
                    String valueOf = String.valueOf(g);
                    String valueOf2 = String.valueOf(C40401m.m164482i(i4));
                    if (valueOf2.length() != 0) {
                        str = valueOf.concat(valueOf2);
                    } else {
                        str = new String(valueOf);
                    }
                    hashMap.putAll(aVar.mo133312l(str));
                    i4++;
                }
                if (!TextUtils.isEmpty((CharSequence) next.getKey())) {
                    hashMap.put(String.valueOf(g).concat(SearchView.f2053T1), (String) next.getKey());
                }
                i3++;
            }
            return hashMap;
        }

        @RecentlyNonNull
        @C40974d0
        /* renamed from: e */
        public String mo133352e(@RecentlyNonNull String str) {
            return this.f102947a.get(str);
        }

        @RecentlyNonNull
        /* renamed from: f */
        public final T mo133353f(@RecentlyNonNull String str, @RecentlyNonNull String str2) {
            if (str != null) {
                this.f102947a.put(str, str2);
            } else {
                C41178c4.m167251e("HitBuilder.set() called with a null paramName.");
            }
            return this;
        }

        @RecentlyNonNull
        /* renamed from: g */
        public final T mo133354g(@RecentlyNonNull Map<String, String> map) {
            if (map == null) {
                return this;
            }
            this.f102947a.putAll(new HashMap(map));
            return this;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0032, code lost:
            if (r15.contains("=") == false) goto L_0x0090;
         */
        @androidx.annotation.RecentlyNonNull
        /* renamed from: h */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public T mo133338h(@androidx.annotation.RecentlyNonNull java.lang.String r15) {
            /*
                r14 = this;
                boolean r0 = android.text.TextUtils.isEmpty(r15)
                r1 = 0
                if (r0 == 0) goto L_0x0009
                goto L_0x0090
            L_0x0009:
                java.lang.String r0 = "?"
                boolean r0 = r15.contains(r0)
                if (r0 == 0) goto L_0x001d
                java.lang.String r0 = "[\\?]"
                java.lang.String[] r0 = r15.split(r0)
                int r2 = r0.length
                r3 = 1
                if (r2 <= r3) goto L_0x001d
                r15 = r0[r3]
            L_0x001d:
                java.lang.String r0 = "%3D"
                boolean r0 = r15.contains(r0)
                java.lang.String r2 = "="
                if (r0 == 0) goto L_0x002e
                java.lang.String r0 = "UTF-8"
                java.lang.String r15 = java.net.URLDecoder.decode(r15, r0)     // Catch:{ UnsupportedEncodingException -> 0x0090 }
                goto L_0x0035
            L_0x002e:
                boolean r0 = r15.contains(r2)
                if (r0 != 0) goto L_0x0035
                goto L_0x0090
            L_0x0035:
                java.util.Map r15 = com.google.android.gms.internal.gtm.C41611u4.m168470f(r15)
                java.lang.String r3 = "dclid"
                java.lang.String r4 = "utm_source"
                java.lang.String r5 = "gclid"
                java.lang.String r6 = "aclid"
                java.lang.String r7 = "utm_campaign"
                java.lang.String r8 = "utm_medium"
                java.lang.String r9 = "utm_term"
                java.lang.String r10 = "utm_content"
                java.lang.String r11 = "utm_id"
                java.lang.String r12 = "anid"
                java.lang.String r13 = "gmob_t"
                java.lang.String[] r0 = new java.lang.String[]{r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13}
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r3 = 0
            L_0x0059:
                r4 = 11
                if (r3 >= r4) goto L_0x008c
                r4 = r0[r3]
                java.lang.Object r4 = r15.get(r4)
                java.lang.CharSequence r4 = (java.lang.CharSequence) r4
                boolean r4 = android.text.TextUtils.isEmpty(r4)
                if (r4 != 0) goto L_0x0089
                int r4 = r1.length()
                if (r4 <= 0) goto L_0x0076
                java.lang.String r4 = "&"
                r1.append(r4)
            L_0x0076:
                r4 = r0[r3]
                r1.append(r4)
                r1.append(r2)
                r4 = r0[r3]
                java.lang.Object r4 = r15.get(r4)
                java.lang.String r4 = (java.lang.String) r4
                r1.append(r4)
            L_0x0089:
                int r3 = r3 + 1
                goto L_0x0059
            L_0x008c:
                java.lang.String r1 = r1.toString()
            L_0x0090:
                boolean r15 = android.text.TextUtils.isEmpty(r1)
                if (r15 == 0) goto L_0x0097
                return r14
            L_0x0097:
                java.util.Map r15 = com.google.android.gms.internal.gtm.C41611u4.m168470f(r1)
                java.lang.String r0 = "utm_content"
                java.lang.Object r0 = r15.get(r0)
                java.lang.String r0 = (java.lang.String) r0
                java.lang.String r1 = "&cc"
                r14.mo133356p(r1, r0)
                java.lang.String r0 = "utm_medium"
                java.lang.Object r0 = r15.get(r0)
                java.lang.String r0 = (java.lang.String) r0
                java.lang.String r1 = "&cm"
                r14.mo133356p(r1, r0)
                java.lang.String r0 = "utm_campaign"
                java.lang.Object r0 = r15.get(r0)
                java.lang.String r0 = (java.lang.String) r0
                java.lang.String r1 = "&cn"
                r14.mo133356p(r1, r0)
                java.lang.String r0 = "utm_source"
                java.lang.Object r0 = r15.get(r0)
                java.lang.String r0 = (java.lang.String) r0
                java.lang.String r1 = "&cs"
                r14.mo133356p(r1, r0)
                java.lang.String r0 = "utm_term"
                java.lang.Object r0 = r15.get(r0)
                java.lang.String r0 = (java.lang.String) r0
                java.lang.String r1 = "&ck"
                r14.mo133356p(r1, r0)
                java.lang.String r0 = "utm_id"
                java.lang.Object r0 = r15.get(r0)
                java.lang.String r0 = (java.lang.String) r0
                java.lang.String r1 = "&ci"
                r14.mo133356p(r1, r0)
                java.lang.String r0 = "anid"
                java.lang.Object r0 = r15.get(r0)
                java.lang.String r0 = (java.lang.String) r0
                java.lang.String r1 = "&anid"
                r14.mo133356p(r1, r0)
                java.lang.String r0 = "gclid"
                java.lang.Object r0 = r15.get(r0)
                java.lang.String r0 = (java.lang.String) r0
                java.lang.String r1 = "&gclid"
                r14.mo133356p(r1, r0)
                java.lang.String r0 = "dclid"
                java.lang.Object r0 = r15.get(r0)
                java.lang.String r0 = (java.lang.String) r0
                java.lang.String r1 = "&dclid"
                r14.mo133356p(r1, r0)
                java.lang.String r0 = "aclid"
                java.lang.Object r0 = r15.get(r0)
                java.lang.String r0 = (java.lang.String) r0
                java.lang.String r1 = "&aclid"
                r14.mo133356p(r1, r0)
                java.lang.String r0 = "gmob_t"
                java.lang.Object r15 = r15.get(r0)
                java.lang.String r15 = (java.lang.String) r15
                java.lang.String r0 = "&gmob_t"
                r14.mo133356p(r0, r15)
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.analytics.C40384f.C40388d.mo133338h(java.lang.String):com.google.android.gms.analytics.f$d");
        }

        @RecentlyNonNull
        /* renamed from: i */
        public T mo133339i(int i, @RecentlyNonNull String str) {
            mo133353f(C40401m.m164474a(i), str);
            return this;
        }

        @RecentlyNonNull
        /* renamed from: j */
        public T mo133340j(int i, float f) {
            mo133353f(C40401m.m164477d(i), Float.toString(f));
            return this;
        }

        @RecentlyNonNull
        /* renamed from: k */
        public T mo133355k(@RecentlyNonNull String str) {
            mo133353f("&t", str);
            return this;
        }

        @RecentlyNonNull
        /* renamed from: l */
        public T mo133341l() {
            mo133353f("&sc", "start");
            return this;
        }

        @RecentlyNonNull
        /* renamed from: m */
        public T mo133342m(boolean z) {
            mo133353f("&ni", C41611u4.m168467c(z));
            return this;
        }

        @RecentlyNonNull
        /* renamed from: n */
        public T mo133343n(@RecentlyNonNull C40382b bVar) {
            this.f102948b = bVar;
            return this;
        }

        @RecentlyNonNull
        /* renamed from: o */
        public T mo133344o(@RecentlyNonNull String str) {
            this.f102947a.put("&promoa", str);
            return this;
        }

        /* renamed from: p */
        public final T mo133356p(String str, String str2) {
            if (str2 != null) {
                this.f102947a.put(str, str2);
            }
            return this;
        }
    }

    @Deprecated
    @C40974d0
    /* renamed from: com.google.android.gms.analytics.f$e */
    public static class C40389e extends C40388d<C40389e> {
        public C40389e() {
            mo133353f("&t", "item");
        }

        @RecentlyNonNull
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ C40388d mo133335a(@RecentlyNonNull C40381a aVar, @RecentlyNonNull String str) {
            super.mo133335a(aVar, str);
            return this;
        }

        @RecentlyNonNull
        /* renamed from: b */
        public final /* bridge */ /* synthetic */ C40388d mo133336b(@RecentlyNonNull C40381a aVar) {
            super.mo133336b(aVar);
            return this;
        }

        @RecentlyNonNull
        /* renamed from: c */
        public final /* bridge */ /* synthetic */ C40388d mo133337c(@RecentlyNonNull C40383c cVar) {
            super.mo133337c(cVar);
            return this;
        }

        @RecentlyNonNull
        /* renamed from: h */
        public final /* bridge */ /* synthetic */ C40388d mo133338h(@RecentlyNonNull String str) {
            super.mo133338h(str);
            return this;
        }

        @RecentlyNonNull
        /* renamed from: i */
        public final /* bridge */ /* synthetic */ C40388d mo133339i(int i, @RecentlyNonNull String str) {
            super.mo133339i(i, str);
            return this;
        }

        @RecentlyNonNull
        /* renamed from: j */
        public final /* bridge */ /* synthetic */ C40388d mo133340j(int i, float f) {
            super.mo133340j(i, f);
            return this;
        }

        @RecentlyNonNull
        /* renamed from: l */
        public final /* bridge */ /* synthetic */ C40388d mo133341l() {
            super.mo133341l();
            return this;
        }

        @RecentlyNonNull
        /* renamed from: m */
        public final /* bridge */ /* synthetic */ C40388d mo133342m(boolean z) {
            super.mo133342m(z);
            return this;
        }

        @RecentlyNonNull
        /* renamed from: n */
        public final /* bridge */ /* synthetic */ C40388d mo133343n(@RecentlyNonNull C40382b bVar) {
            super.mo133343n(bVar);
            return this;
        }

        @RecentlyNonNull
        /* renamed from: o */
        public final /* bridge */ /* synthetic */ C40388d mo133344o(@RecentlyNonNull String str) {
            super.mo133344o(str);
            return this;
        }

        @RecentlyNonNull
        /* renamed from: q */
        public C40389e mo133357q(@RecentlyNonNull String str) {
            mo133353f("&iv", str);
            return this;
        }

        @RecentlyNonNull
        /* renamed from: r */
        public C40389e mo133358r(@RecentlyNonNull String str) {
            mo133353f("&cu", str);
            return this;
        }

        @RecentlyNonNull
        /* renamed from: s */
        public C40389e mo133359s(@RecentlyNonNull String str) {
            mo133353f("&in", str);
            return this;
        }

        @RecentlyNonNull
        /* renamed from: t */
        public C40389e mo133360t(double d) {
            mo133353f("&ip", Double.toString(d));
            return this;
        }

        @RecentlyNonNull
        /* renamed from: u */
        public C40389e mo133361u(long j) {
            mo133353f("&iq", Long.toString(j));
            return this;
        }

        @RecentlyNonNull
        /* renamed from: v */
        public C40389e mo133362v(@RecentlyNonNull String str) {
            mo133353f("&ic", str);
            return this;
        }

        @RecentlyNonNull
        /* renamed from: w */
        public C40389e mo133363w(@RecentlyNonNull String str) {
            mo133353f("&ti", str);
            return this;
        }
    }

    @C40974d0
    /* renamed from: com.google.android.gms.analytics.f$f */
    public static class C40390f extends C40388d<C40390f> {
        public C40390f() {
            mo133353f("&t", C28526d.f68840N0);
        }

        @RecentlyNonNull
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ C40388d mo133335a(@RecentlyNonNull C40381a aVar, @RecentlyNonNull String str) {
            super.mo133335a(aVar, str);
            return this;
        }

        @RecentlyNonNull
        /* renamed from: b */
        public final /* bridge */ /* synthetic */ C40388d mo133336b(@RecentlyNonNull C40381a aVar) {
            super.mo133336b(aVar);
            return this;
        }

        @RecentlyNonNull
        /* renamed from: c */
        public final /* bridge */ /* synthetic */ C40388d mo133337c(@RecentlyNonNull C40383c cVar) {
            super.mo133337c(cVar);
            return this;
        }

        @RecentlyNonNull
        /* renamed from: h */
        public final /* bridge */ /* synthetic */ C40388d mo133338h(@RecentlyNonNull String str) {
            super.mo133338h(str);
            return this;
        }

        @RecentlyNonNull
        /* renamed from: i */
        public final /* bridge */ /* synthetic */ C40388d mo133339i(int i, @RecentlyNonNull String str) {
            super.mo133339i(i, str);
            return this;
        }

        @RecentlyNonNull
        /* renamed from: j */
        public final /* bridge */ /* synthetic */ C40388d mo133340j(int i, float f) {
            super.mo133340j(i, f);
            return this;
        }

        @RecentlyNonNull
        /* renamed from: l */
        public final /* bridge */ /* synthetic */ C40388d mo133341l() {
            super.mo133341l();
            return this;
        }

        @RecentlyNonNull
        /* renamed from: m */
        public final /* bridge */ /* synthetic */ C40388d mo133342m(boolean z) {
            super.mo133342m(z);
            return this;
        }

        @RecentlyNonNull
        /* renamed from: n */
        public final /* bridge */ /* synthetic */ C40388d mo133343n(@RecentlyNonNull C40382b bVar) {
            super.mo133343n(bVar);
            return this;
        }

        @RecentlyNonNull
        /* renamed from: o */
        public final /* bridge */ /* synthetic */ C40388d mo133344o(@RecentlyNonNull String str) {
            super.mo133344o(str);
            return this;
        }
    }

    @C40974d0
    /* renamed from: com.google.android.gms.analytics.f$g */
    public static class C40391g extends C40388d<C40391g> {
        public C40391g() {
            mo133353f("&t", C17075f2.f45120y0);
        }

        @RecentlyNonNull
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ C40388d mo133335a(@RecentlyNonNull C40381a aVar, @RecentlyNonNull String str) {
            super.mo133335a(aVar, str);
            return this;
        }

        @RecentlyNonNull
        /* renamed from: b */
        public final /* bridge */ /* synthetic */ C40388d mo133336b(@RecentlyNonNull C40381a aVar) {
            super.mo133336b(aVar);
            return this;
        }

        @RecentlyNonNull
        /* renamed from: c */
        public final /* bridge */ /* synthetic */ C40388d mo133337c(@RecentlyNonNull C40383c cVar) {
            super.mo133337c(cVar);
            return this;
        }

        @RecentlyNonNull
        /* renamed from: h */
        public final /* bridge */ /* synthetic */ C40388d mo133338h(@RecentlyNonNull String str) {
            super.mo133338h(str);
            return this;
        }

        @RecentlyNonNull
        /* renamed from: i */
        public final /* bridge */ /* synthetic */ C40388d mo133339i(int i, @RecentlyNonNull String str) {
            super.mo133339i(i, str);
            return this;
        }

        @RecentlyNonNull
        /* renamed from: j */
        public final /* bridge */ /* synthetic */ C40388d mo133340j(int i, float f) {
            super.mo133340j(i, f);
            return this;
        }

        @RecentlyNonNull
        /* renamed from: l */
        public final /* bridge */ /* synthetic */ C40388d mo133341l() {
            super.mo133341l();
            return this;
        }

        @RecentlyNonNull
        /* renamed from: m */
        public final /* bridge */ /* synthetic */ C40388d mo133342m(boolean z) {
            super.mo133342m(z);
            return this;
        }

        @RecentlyNonNull
        /* renamed from: n */
        public final /* bridge */ /* synthetic */ C40388d mo133343n(@RecentlyNonNull C40382b bVar) {
            super.mo133343n(bVar);
            return this;
        }

        @RecentlyNonNull
        /* renamed from: o */
        public final /* bridge */ /* synthetic */ C40388d mo133344o(@RecentlyNonNull String str) {
            super.mo133344o(str);
            return this;
        }

        @RecentlyNonNull
        /* renamed from: q */
        public C40391g mo133364q(@RecentlyNonNull String str) {
            mo133353f("&sa", str);
            return this;
        }

        @RecentlyNonNull
        /* renamed from: r */
        public C40391g mo133365r(@RecentlyNonNull String str) {
            mo133353f("&sn", str);
            return this;
        }

        @RecentlyNonNull
        /* renamed from: s */
        public C40391g mo133366s(@RecentlyNonNull String str) {
            mo133353f("&st", str);
            return this;
        }
    }

    @Deprecated
    @C40974d0
    /* renamed from: com.google.android.gms.analytics.f$i */
    public static class C40393i extends C40388d<C40393i> {
        public C40393i() {
            mo133353f("&t", "transaction");
        }

        @RecentlyNonNull
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ C40388d mo133335a(@RecentlyNonNull C40381a aVar, @RecentlyNonNull String str) {
            super.mo133335a(aVar, str);
            return this;
        }

        @RecentlyNonNull
        /* renamed from: b */
        public final /* bridge */ /* synthetic */ C40388d mo133336b(@RecentlyNonNull C40381a aVar) {
            super.mo133336b(aVar);
            return this;
        }

        @RecentlyNonNull
        /* renamed from: c */
        public final /* bridge */ /* synthetic */ C40388d mo133337c(@RecentlyNonNull C40383c cVar) {
            super.mo133337c(cVar);
            return this;
        }

        @RecentlyNonNull
        /* renamed from: h */
        public final /* bridge */ /* synthetic */ C40388d mo133338h(@RecentlyNonNull String str) {
            super.mo133338h(str);
            return this;
        }

        @RecentlyNonNull
        /* renamed from: i */
        public final /* bridge */ /* synthetic */ C40388d mo133339i(int i, @RecentlyNonNull String str) {
            super.mo133339i(i, str);
            return this;
        }

        @RecentlyNonNull
        /* renamed from: j */
        public final /* bridge */ /* synthetic */ C40388d mo133340j(int i, float f) {
            super.mo133340j(i, f);
            return this;
        }

        @RecentlyNonNull
        /* renamed from: l */
        public final /* bridge */ /* synthetic */ C40388d mo133341l() {
            super.mo133341l();
            return this;
        }

        @RecentlyNonNull
        /* renamed from: m */
        public final /* bridge */ /* synthetic */ C40388d mo133342m(boolean z) {
            super.mo133342m(z);
            return this;
        }

        @RecentlyNonNull
        /* renamed from: n */
        public final /* bridge */ /* synthetic */ C40388d mo133343n(@RecentlyNonNull C40382b bVar) {
            super.mo133343n(bVar);
            return this;
        }

        @RecentlyNonNull
        /* renamed from: o */
        public final /* bridge */ /* synthetic */ C40388d mo133344o(@RecentlyNonNull String str) {
            super.mo133344o(str);
            return this;
        }

        @RecentlyNonNull
        /* renamed from: q */
        public C40393i mo133371q(@RecentlyNonNull String str) {
            mo133353f("&ta", str);
            return this;
        }

        @RecentlyNonNull
        /* renamed from: r */
        public C40393i mo133372r(@RecentlyNonNull String str) {
            mo133353f("&cu", str);
            return this;
        }

        @RecentlyNonNull
        /* renamed from: s */
        public C40393i mo133373s(double d) {
            mo133353f("&tr", Double.toString(d));
            return this;
        }

        @RecentlyNonNull
        /* renamed from: t */
        public C40393i mo133374t(double d) {
            mo133353f("&ts", Double.toString(d));
            return this;
        }

        @RecentlyNonNull
        /* renamed from: u */
        public C40393i mo133375u(double d) {
            mo133353f("&tt", Double.toString(d));
            return this;
        }

        @RecentlyNonNull
        /* renamed from: v */
        public C40393i mo133376v(@RecentlyNonNull String str) {
            mo133353f("&ti", str);
            return this;
        }
    }

    @C40974d0
    /* renamed from: com.google.android.gms.analytics.f$b */
    public static class C40386b extends C40388d<C40386b> {
        public C40386b() {
            mo133353f("&t", "event");
        }

        @RecentlyNonNull
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ C40388d mo133335a(@RecentlyNonNull C40381a aVar, @RecentlyNonNull String str) {
            super.mo133335a(aVar, str);
            return this;
        }

        @RecentlyNonNull
        /* renamed from: b */
        public final /* bridge */ /* synthetic */ C40388d mo133336b(@RecentlyNonNull C40381a aVar) {
            super.mo133336b(aVar);
            return this;
        }

        @RecentlyNonNull
        /* renamed from: c */
        public final /* bridge */ /* synthetic */ C40388d mo133337c(@RecentlyNonNull C40383c cVar) {
            super.mo133337c(cVar);
            return this;
        }

        @RecentlyNonNull
        /* renamed from: h */
        public final /* bridge */ /* synthetic */ C40388d mo133338h(@RecentlyNonNull String str) {
            super.mo133338h(str);
            return this;
        }

        @RecentlyNonNull
        /* renamed from: i */
        public final /* bridge */ /* synthetic */ C40388d mo133339i(int i, @RecentlyNonNull String str) {
            super.mo133339i(i, str);
            return this;
        }

        @RecentlyNonNull
        /* renamed from: j */
        public final /* bridge */ /* synthetic */ C40388d mo133340j(int i, float f) {
            super.mo133340j(i, f);
            return this;
        }

        @RecentlyNonNull
        /* renamed from: l */
        public final /* bridge */ /* synthetic */ C40388d mo133341l() {
            super.mo133341l();
            return this;
        }

        @RecentlyNonNull
        /* renamed from: m */
        public final /* bridge */ /* synthetic */ C40388d mo133342m(boolean z) {
            super.mo133342m(z);
            return this;
        }

        @RecentlyNonNull
        /* renamed from: n */
        public final /* bridge */ /* synthetic */ C40388d mo133343n(@RecentlyNonNull C40382b bVar) {
            super.mo133343n(bVar);
            return this;
        }

        @RecentlyNonNull
        /* renamed from: o */
        public final /* bridge */ /* synthetic */ C40388d mo133344o(@RecentlyNonNull String str) {
            super.mo133344o(str);
            return this;
        }

        @RecentlyNonNull
        /* renamed from: q */
        public C40386b mo133345q(@RecentlyNonNull String str) {
            mo133353f("&ea", str);
            return this;
        }

        @RecentlyNonNull
        /* renamed from: r */
        public C40386b mo133346r(@RecentlyNonNull String str) {
            mo133353f("&ec", str);
            return this;
        }

        @RecentlyNonNull
        /* renamed from: s */
        public C40386b mo133347s(@RecentlyNonNull String str) {
            mo133353f("&el", str);
            return this;
        }

        @RecentlyNonNull
        /* renamed from: t */
        public C40386b mo133348t(long j) {
            mo133353f("&ev", Long.toString(j));
            return this;
        }

        public C40386b(@RecentlyNonNull String str, @RecentlyNonNull String str2) {
            this();
            mo133346r(str);
            mo133345q(str2);
        }
    }

    @C40974d0
    /* renamed from: com.google.android.gms.analytics.f$h */
    public static class C40392h extends C40388d<C40392h> {
        public C40392h() {
            mo133353f("&t", "timing");
        }

        @RecentlyNonNull
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ C40388d mo133335a(@RecentlyNonNull C40381a aVar, @RecentlyNonNull String str) {
            super.mo133335a(aVar, str);
            return this;
        }

        @RecentlyNonNull
        /* renamed from: b */
        public final /* bridge */ /* synthetic */ C40388d mo133336b(@RecentlyNonNull C40381a aVar) {
            super.mo133336b(aVar);
            return this;
        }

        @RecentlyNonNull
        /* renamed from: c */
        public final /* bridge */ /* synthetic */ C40388d mo133337c(@RecentlyNonNull C40383c cVar) {
            super.mo133337c(cVar);
            return this;
        }

        @RecentlyNonNull
        /* renamed from: h */
        public final /* bridge */ /* synthetic */ C40388d mo133338h(@RecentlyNonNull String str) {
            super.mo133338h(str);
            return this;
        }

        @RecentlyNonNull
        /* renamed from: i */
        public final /* bridge */ /* synthetic */ C40388d mo133339i(int i, @RecentlyNonNull String str) {
            super.mo133339i(i, str);
            return this;
        }

        @RecentlyNonNull
        /* renamed from: j */
        public final /* bridge */ /* synthetic */ C40388d mo133340j(int i, float f) {
            super.mo133340j(i, f);
            return this;
        }

        @RecentlyNonNull
        /* renamed from: l */
        public final /* bridge */ /* synthetic */ C40388d mo133341l() {
            super.mo133341l();
            return this;
        }

        @RecentlyNonNull
        /* renamed from: m */
        public final /* bridge */ /* synthetic */ C40388d mo133342m(boolean z) {
            super.mo133342m(z);
            return this;
        }

        @RecentlyNonNull
        /* renamed from: n */
        public final /* bridge */ /* synthetic */ C40388d mo133343n(@RecentlyNonNull C40382b bVar) {
            super.mo133343n(bVar);
            return this;
        }

        @RecentlyNonNull
        /* renamed from: o */
        public final /* bridge */ /* synthetic */ C40388d mo133344o(@RecentlyNonNull String str) {
            super.mo133344o(str);
            return this;
        }

        @RecentlyNonNull
        /* renamed from: q */
        public C40392h mo133367q(@RecentlyNonNull String str) {
            mo133353f("&utc", str);
            return this;
        }

        @RecentlyNonNull
        /* renamed from: r */
        public C40392h mo133368r(@RecentlyNonNull String str) {
            mo133353f("&utl", str);
            return this;
        }

        @RecentlyNonNull
        /* renamed from: s */
        public C40392h mo133369s(long j) {
            mo133353f("&utt", Long.toString(j));
            return this;
        }

        @RecentlyNonNull
        /* renamed from: t */
        public C40392h mo133370t(@RecentlyNonNull String str) {
            mo133353f("&utv", str);
            return this;
        }

        public C40392h(@RecentlyNonNull String str, @RecentlyNonNull String str2, long j) {
            this();
            mo133370t(str2);
            mo133369s(j);
            mo133367q(str);
        }
    }
}
