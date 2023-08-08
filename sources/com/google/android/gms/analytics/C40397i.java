package com.google.android.gms.analytics;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.RecentlyNonNull;
import com.carrefour.fid.android.airship.util.C13758b;
import com.carrefour.fid.android.shared.constant.C28526d;
import com.carrefour.fid.android.shared.util.C28951s;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.common.util.C40974d0;
import com.google.android.gms.internal.gtm.C41130a4;
import com.google.android.gms.internal.gtm.C41535r0;
import com.google.android.gms.internal.gtm.C41587t4;
import com.google.android.gms.internal.gtm.C41607u0;
import com.google.android.gms.internal.gtm.C41611u4;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.urbanairship.analytics.C35557k;
import com.usabilla.sdk.ubform.telemetry.C10108c;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Random;

@C40974d0
/* renamed from: com.google.android.gms.analytics.i */
public class C40397i extends C41535r0 {

    /* renamed from: c */
    public boolean f102957c;

    /* renamed from: d */
    public final Map<String, String> f102958d;

    /* renamed from: e */
    public final Map<String, String> f102959e = new HashMap();

    /* renamed from: f */
    public final C41130a4 f102960f;

    /* renamed from: g */
    public final C40380e0 f102961g;

    /* renamed from: v */
    public C40377d f102962v;

    /* renamed from: w */
    public C41587t4 f102963w;

    public C40397i(C41607u0 u0Var, String str, C41130a4 a4Var) {
        super(u0Var);
        HashMap hashMap = new HashMap();
        this.f102958d = hashMap;
        if (str != null) {
            hashMap.put("&tid", str);
        }
        hashMap.put("useSecure", "1");
        hashMap.put("&a", Integer.toString(new Random().nextInt(Integer.MAX_VALUE) + 1));
        this.f102960f = new C41130a4(60, 2000, "tracking", mo135748j());
        this.f102961g = new C40380e0(this, u0Var);
    }

    /* renamed from: G1 */
    public static String m164424G1(Map.Entry<String, String> entry) {
        String key = entry.getKey();
        if (!key.startsWith("&") || key.length() < 2) {
            return null;
        }
        return entry.getKey().substring(1);
    }

    /* renamed from: a1 */
    public static void m164425a1(Map<String, String> map, Map<String, String> map2) {
        C40843u.m166202l(map2);
        if (map != null) {
            for (Map.Entry next : map.entrySet()) {
                String G1 = m164424G1(next);
                if (G1 != null) {
                    map2.put(G1, (String) next.getValue());
                }
            }
        }
    }

    /* renamed from: A0 */
    public void mo133388A0(@RecentlyNonNull String str) {
        mo133407d0("&dh", str);
    }

    /* renamed from: C0 */
    public void mo133389C0(@RecentlyNonNull String str) {
        mo133407d0("&ul", str);
    }

    /* renamed from: D0 */
    public void mo133390D0(@RecentlyNonNull String str) {
        mo133407d0("&dl", str);
    }

    /* renamed from: E0 */
    public void mo133391E0(@RecentlyNonNull String str) {
        mo133407d0("&dp", str);
    }

    /* renamed from: F0 */
    public void mo133392F0(@RecentlyNonNull String str) {
        mo133407d0("&dr", str);
    }

    /* renamed from: F1 */
    public final void mo133393F1(C41587t4 t4Var) {
        boolean z;
        boolean z2;
        mo135759v("Loading Tracker config values");
        this.f102963w = t4Var;
        String str = t4Var.f104972a;
        if (str != null) {
            mo133407d0("&tid", str);
            mo135760w("trackingId loaded", str);
        }
        double d = t4Var.f104973b;
        if (d >= 0.0d) {
            String d2 = Double.toString(d);
            mo133407d0("&sf", d2);
            mo135760w("Sample frequency loaded", d2);
        }
        int i = t4Var.f104974c;
        if (i >= 0) {
            mo133398O0((long) i);
            mo135760w("Session timeout loaded", Integer.valueOf(i));
        }
        int i2 = t4Var.f104975d;
        boolean z3 = false;
        if (i2 != -1) {
            if (1 != i2) {
                z2 = false;
            } else {
                z2 = true;
            }
            mo133402Z(z2);
            mo135760w("Auto activity tracking loaded", Boolean.valueOf(z2));
        }
        int i3 = t4Var.f104976e;
        if (i3 != -1) {
            if (i3 != 0) {
                mo133407d0("&aip", "1");
            }
            if (1 != i3) {
                z = false;
            } else {
                z = true;
            }
            mo135760w("Anonymize ip loaded", Boolean.valueOf(z));
        }
        if (t4Var.f104977f == 1) {
            z3 = true;
        }
        mo133404a0(z3);
    }

    /* renamed from: H0 */
    public void mo133394H0(double d) {
        mo133407d0("&sf", Double.toString(d));
    }

    /* renamed from: K0 */
    public void mo133395K0(@RecentlyNonNull String str) {
        mo133407d0("&sd", str);
    }

    /* renamed from: L0 */
    public void mo133396L0(@RecentlyNonNull String str) {
        mo133407d0("&cd", str);
    }

    /* renamed from: N0 */
    public void mo133397N0(int i, int i2) {
        if (i >= 0 || i2 >= 0) {
            StringBuilder sb = new StringBuilder(23);
            sb.append(i);
            sb.append("x");
            sb.append(i2);
            mo133407d0("&sr", sb.toString());
            return;
        }
        mo135762y("Invalid width or height. The values should be non-negative.");
    }

    /* renamed from: O0 */
    public void mo133398O0(long j) {
        this.f102961g.mo133298b0(j * 1000);
    }

    /* renamed from: R0 */
    public void mo133399R0(@RecentlyNonNull String str) {
        mo133407d0("&dt", str);
    }

    /* renamed from: U0 */
    public void mo133400U0(boolean z) {
        mo133407d0("useSecure", C41611u4.m168467c(z));
    }

    /* renamed from: W */
    public final void mo133294W() {
        this.f102961g.mo135795U();
        String X = mo135747i().mo135960X();
        if (X != null) {
            mo133407d0("&an", X);
        }
        String Z = mo135747i().mo135961Z();
        if (Z != null) {
            mo133407d0("&av", Z);
        }
    }

    /* renamed from: X */
    public void mo133401X(boolean z) {
        this.f102957c = z;
    }

    /* renamed from: Z */
    public void mo133402Z(boolean z) {
        this.f102961g.mo133297a0(z);
    }

    /* renamed from: Z0 */
    public void mo133403Z0(@RecentlyNonNull String str) {
        mo133407d0("&vp", str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0033, code lost:
        return;
     */
    /* renamed from: a0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo133404a0(boolean r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            com.google.android.gms.analytics.d r0 = r2.f102962v     // Catch:{ all -> 0x0034 }
            if (r0 != 0) goto L_0x0007
            r1 = 0
            goto L_0x0008
        L_0x0007:
            r1 = 1
        L_0x0008:
            if (r1 != r3) goto L_0x000c
            monitor-exit(r2)     // Catch:{ all -> 0x0034 }
            return
        L_0x000c:
            if (r3 == 0) goto L_0x0026
            android.content.Context r3 = r2.mo135734G()     // Catch:{ all -> 0x0034 }
            java.lang.Thread$UncaughtExceptionHandler r0 = java.lang.Thread.getDefaultUncaughtExceptionHandler()     // Catch:{ all -> 0x0034 }
            com.google.android.gms.analytics.d r1 = new com.google.android.gms.analytics.d     // Catch:{ all -> 0x0034 }
            r1.<init>(r2, r0, r3)     // Catch:{ all -> 0x0034 }
            r2.f102962v = r1     // Catch:{ all -> 0x0034 }
            java.lang.Thread.setDefaultUncaughtExceptionHandler(r1)     // Catch:{ all -> 0x0034 }
            java.lang.String r3 = "Uncaught exceptions will be reported to Google Analytics"
            r2.mo135759v(r3)     // Catch:{ all -> 0x0034 }
            goto L_0x0032
        L_0x0026:
            java.lang.Thread$UncaughtExceptionHandler r3 = r0.mo133272c()     // Catch:{ all -> 0x0034 }
            java.lang.Thread.setDefaultUncaughtExceptionHandler(r3)     // Catch:{ all -> 0x0034 }
            java.lang.String r3 = "Uncaught exceptions will not be reported to Google Analytics"
            r2.mo135759v(r3)     // Catch:{ all -> 0x0034 }
        L_0x0032:
            monitor-exit(r2)     // Catch:{ all -> 0x0034 }
            return
        L_0x0034:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0034 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.analytics.C40397i.mo133404a0(boolean):void");
    }

    @RecentlyNonNull
    /* renamed from: b0 */
    public String mo133405b0(@RecentlyNonNull String str) {
        mo135794T();
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (this.f102958d.containsKey(str)) {
            return this.f102958d.get(str);
        }
        if (str.equals("&ul")) {
            return C41611u4.m168468d(Locale.getDefault());
        }
        if (str.equals("&cid")) {
            return mo135741O().mo135656Z();
        }
        if (str.equals("&sr")) {
            return mo135743Q().mo136015Z();
        }
        if (str.equals("&aid")) {
            return mo135740N().mo135356X().mo135881e();
        }
        if (str.equals("&an")) {
            return mo135740N().mo135356X().mo135883g();
        }
        if (str.equals("&av")) {
            return mo135740N().mo135356X().mo135884h();
        }
        if (str.equals("&aiid")) {
            return mo135740N().mo135356X().mo135882f();
        }
        return null;
    }

    /* renamed from: c0 */
    public void mo133406c0(@RecentlyNonNull Map<String, String> map) {
        boolean z;
        long a = mo135748j().mo134768a();
        if (mo135735I().mo133279j()) {
            mo135750m("AppOptOut is set to true. Not sending Google Analytics hit");
            return;
        }
        boolean m = mo135735I().mo133281m();
        HashMap hashMap = new HashMap();
        m164425a1(this.f102958d, hashMap);
        m164425a1(map, hashMap);
        String str = this.f102958d.get("useSecure");
        int i = 1;
        if (str == null || str.equalsIgnoreCase(C13758b.f33436b) || str.equalsIgnoreCase("yes") || str.equalsIgnoreCase("1") || (!str.equalsIgnoreCase(C13758b.f33438c) && !str.equalsIgnoreCase("no") && !str.equalsIgnoreCase("0"))) {
            z = true;
        } else {
            z = false;
        }
        Map<String, String> map2 = this.f102959e;
        C40843u.m166202l(hashMap);
        for (Map.Entry next : map2.entrySet()) {
            String G1 = m164424G1(next);
            if (G1 != null && !hashMap.containsKey(G1)) {
                hashMap.put(G1, (String) next.getValue());
            }
        }
        this.f102959e.clear();
        String str2 = (String) hashMap.get(C10108c.f27801d);
        if (TextUtils.isEmpty(str2)) {
            mo135745S().mo135212a0(hashMap, "Missing hit type parameter");
            return;
        }
        String str3 = (String) hashMap.get("tid");
        if (!TextUtils.isEmpty(str3)) {
            boolean z2 = this.f102957c;
            synchronized (this) {
                if (C28526d.f68840N0.equalsIgnoreCase(str2) || "pageview".equalsIgnoreCase(str2) || "appview".equalsIgnoreCase(str2) || TextUtils.isEmpty(str2)) {
                    String str4 = this.f102958d.get("&a");
                    C40843u.m166202l(str4);
                    int parseInt = Integer.parseInt(str4) + 1;
                    if (parseInt < Integer.MAX_VALUE) {
                        i = parseInt;
                    }
                    this.f102958d.put("&a", Integer.toString(i));
                }
            }
            mo135736J().mo133262i(new C40378d0(this, hashMap, z2, str2, a, m, z, str3));
            return;
        }
        mo135745S().mo135212a0(hashMap, "Missing tracking id parameter");
    }

    /* renamed from: d0 */
    public void mo133407d0(@RecentlyNonNull String str, @RecentlyNonNull String str2) {
        C40843u.m166203m(str, "Key should be non-null");
        if (!TextUtils.isEmpty(str)) {
            this.f102958d.put(str, str2);
        }
    }

    /* renamed from: e0 */
    public void mo133408e0(boolean z) {
        mo133407d0("&aip", C41611u4.m168467c(z));
    }

    /* renamed from: f0 */
    public void mo133409f0(@RecentlyNonNull String str) {
        mo133407d0("&aid", str);
    }

    /* renamed from: g0 */
    public void mo133410g0(@RecentlyNonNull String str) {
        mo133407d0("&aiid", str);
    }

    /* renamed from: n0 */
    public void mo133411n0(@RecentlyNonNull String str) {
        mo133407d0("&an", str);
    }

    /* renamed from: p0 */
    public void mo133412p0(@RecentlyNonNull String str) {
        mo133407d0("&av", str);
    }

    /* renamed from: q0 */
    public void mo133413q0(@RecentlyNonNull Uri uri) {
        String str;
        if (uri != null && !uri.isOpaque()) {
            String queryParameter = uri.getQueryParameter(C35557k.f87781a);
            if (!TextUtils.isEmpty(queryParameter)) {
                String valueOf = String.valueOf(queryParameter);
                if (valueOf.length() != 0) {
                    str = "http://hostname/?".concat(valueOf);
                } else {
                    str = new String("http://hostname/?");
                }
                Uri parse = Uri.parse(str);
                String queryParameter2 = parse.getQueryParameter("utm_id");
                if (queryParameter2 != null) {
                    this.f102959e.put("&ci", queryParameter2);
                }
                String queryParameter3 = parse.getQueryParameter("anid");
                if (queryParameter3 != null) {
                    this.f102959e.put("&anid", queryParameter3);
                }
                String queryParameter4 = parse.getQueryParameter(C28951s.f70971h);
                if (queryParameter4 != null) {
                    this.f102959e.put("&cn", queryParameter4);
                }
                String queryParameter5 = parse.getQueryParameter(C28951s.f70972i);
                if (queryParameter5 != null) {
                    this.f102959e.put("&cc", queryParameter5);
                }
                String queryParameter6 = parse.getQueryParameter(C28951s.f70970g);
                if (queryParameter6 != null) {
                    this.f102959e.put("&cm", queryParameter6);
                }
                String queryParameter7 = parse.getQueryParameter(C28951s.f70969f);
                if (queryParameter7 != null) {
                    this.f102959e.put("&cs", queryParameter7);
                }
                String queryParameter8 = parse.getQueryParameter("utm_term");
                if (queryParameter8 != null) {
                    this.f102959e.put("&ck", queryParameter8);
                }
                String queryParameter9 = parse.getQueryParameter("dclid");
                if (queryParameter9 != null) {
                    this.f102959e.put("&dclid", queryParameter9);
                }
                String queryParameter10 = parse.getQueryParameter("gclid");
                if (queryParameter10 != null) {
                    this.f102959e.put("&gclid", queryParameter10);
                }
                String queryParameter11 = parse.getQueryParameter(FirebaseAnalytics.C32532b.f78929Q);
                if (queryParameter11 != null) {
                    this.f102959e.put("&aclid", queryParameter11);
                }
            }
        }
    }

    /* renamed from: t0 */
    public void mo133414t0(@RecentlyNonNull String str) {
        mo133407d0("&cid", str);
    }

    /* renamed from: x0 */
    public void mo133415x0(@RecentlyNonNull String str) {
        mo133407d0("&de", str);
    }
}
