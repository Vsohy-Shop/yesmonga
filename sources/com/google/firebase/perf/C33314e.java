package com.google.firebase.perf;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.android.datatransport.C40087h;
import com.google.firebase.C33033f;
import com.google.firebase.inject.C33058b;
import com.google.firebase.installations.C33088k;
import com.google.firebase.perf.config.C33307a;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.logging.C33363a;
import com.google.firebase.perf.logging.C33364b;
import com.google.firebase.perf.metrics.C33380h;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.metrics.validator.C33388e;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.transport.C33424k;
import com.google.firebase.perf.util.C33435d;
import com.google.firebase.perf.util.Timer;
import com.google.firebase.remoteconfig.C33584t;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.net.URL;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
/* renamed from: com.google.firebase.perf.e */
public class C33314e implements C33316f {

    /* renamed from: X */
    public static final int f80980X = 100;

    /* renamed from: w */
    public static final C33363a f80981w = C33363a.m134449e();

    /* renamed from: x */
    public static final int f80982x = 5;

    /* renamed from: y */
    public static final int f80983y = 40;

    /* renamed from: z */
    public static final int f80984z = 100;

    /* renamed from: a */
    public final Map<String, String> f80985a = new ConcurrentHashMap();

    /* renamed from: b */
    public final C33307a f80986b;

    /* renamed from: c */
    public final C33435d f80987c;
    @C0363p0

    /* renamed from: d */
    public Boolean f80988d = null;

    /* renamed from: e */
    public final C33033f f80989e;

    /* renamed from: f */
    public final C33058b<C33584t> f80990f;

    /* renamed from: g */
    public final C33088k f80991g;

    /* renamed from: v */
    public final C33058b<C40087h> f80992v;

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.firebase.perf.e$a */
    public @interface C33315a {

        /* renamed from: Z2 */
        public static final String f80993Z2 = "GET";

        /* renamed from: a3 */
        public static final String f80994a3 = "PUT";

        /* renamed from: b3 */
        public static final String f80995b3 = "POST";

        /* renamed from: c3 */
        public static final String f80996c3 = "DELETE";

        /* renamed from: d3 */
        public static final String f80997d3 = "HEAD";

        /* renamed from: e3 */
        public static final String f80998e3 = "PATCH";

        /* renamed from: f3 */
        public static final String f80999f3 = "OPTIONS";

        /* renamed from: g3 */
        public static final String f81000g3 = "TRACE";

        /* renamed from: h3 */
        public static final String f81001h3 = "CONNECT";
    }

    @Inject
    @C0344h1
    public C33314e(C33033f fVar, C33058b<C33584t> bVar, C33088k kVar, C33058b<C40087h> bVar2, RemoteConfigManager remoteConfigManager, C33307a aVar, SessionManager sessionManager) {
        this.f80989e = fVar;
        this.f80990f = bVar;
        this.f80991g = kVar;
        this.f80992v = bVar2;
        if (fVar == null) {
            this.f80988d = Boolean.FALSE;
            this.f80986b = aVar;
            this.f80987c = new C33435d(new Bundle());
            return;
        }
        C33424k.m134761l().mo96877t(fVar, kVar, bVar2);
        Context n = fVar.mo95721n();
        C33435d b = m134396b(n);
        this.f80987c = b;
        remoteConfigManager.setFirebaseRemoteConfigProvider(bVar);
        this.f80986b = aVar;
        aVar.mo96360U(b);
        aVar.mo96356Q(n);
        sessionManager.setApplicationContext(n);
        this.f80988d = aVar.mo96369k();
        C33363a aVar2 = f80981w;
        if (aVar2.mo96435h() && mo96400e()) {
            aVar2.mo96433f(String.format("Firebase Performance Monitoring is successfully initialized! In a minute, visit the Firebase console to view your data: %s", new Object[]{C33364b.m134463b(fVar.mo95723s().mo96252n(), n.getPackageName())}));
        }
    }

    /* renamed from: b */
    public static C33435d m134396b(Context context) {
        Bundle bundle;
        C33435d dVar;
        try {
            bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        } catch (PackageManager.NameNotFoundException | NullPointerException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("No perf enable meta data found ");
            sb.append(e.getMessage());
            bundle = null;
        }
        if (bundle == null) {
            dVar = new C33435d();
        }
        return dVar;
    }

    @C0359n0
    /* renamed from: c */
    public static C33314e m134397c() {
        return (C33314e) C33033f.m133333p().mo95720l(C33314e.class);
    }

    @C0359n0
    /* renamed from: k */
    public static Trace m134398k(@C0359n0 String str) {
        Trace c = Trace.m134506c(str);
        c.start();
        return c;
    }

    /* renamed from: a */
    public final void mo96398a(@C0363p0 String str, @C0363p0 String str2) {
        if (str == null || str2 == null) {
            throw new IllegalArgumentException("Attribute must not have null key or value.");
        } else if (this.f80985a.containsKey(str) || this.f80985a.size() < 5) {
            C33388e.m134602d(str, str2);
        } else {
            throw new IllegalArgumentException(String.format(Locale.US, "Exceeds max limit of number of attributes - %d", new Object[]{5}));
        }
    }

    @C0344h1
    /* renamed from: d */
    public Boolean mo96399d() {
        return this.f80988d;
    }

    /* renamed from: e */
    public boolean mo96400e() {
        Boolean bool = this.f80988d;
        if (bool != null) {
            return bool.booleanValue();
        }
        return C33033f.m133333p().mo95705A();
    }

    @C0359n0
    /* renamed from: f */
    public C33380h mo96401f(@C0359n0 String str, @C0359n0 String str2) {
        return new C33380h(str, str2, C33424k.m134761l(), new Timer());
    }

    @C0359n0
    /* renamed from: g */
    public C33380h mo96402g(@C0359n0 URL url, @C0359n0 String str) {
        return new C33380h(url, str, C33424k.m134761l(), new Timer());
    }

    @C0363p0
    public String getAttribute(@C0359n0 String str) {
        return this.f80985a.get(str);
    }

    @C0359n0
    public Map<String, String> getAttributes() {
        return new HashMap(this.f80985a);
    }

    @C0359n0
    /* renamed from: h */
    public Trace mo96405h(@C0359n0 String str) {
        return Trace.m134506c(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004f, code lost:
        return;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo96406i(@androidx.annotation.C0363p0 java.lang.Boolean r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            com.google.firebase.C33033f.m133333p()     // Catch:{ IllegalStateException -> 0x0053 }
            com.google.firebase.perf.config.a r0 = r1.f80986b     // Catch:{ all -> 0x0050 }
            java.lang.Boolean r0 = r0.mo96368j()     // Catch:{ all -> 0x0050 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0050 }
            if (r0 == 0) goto L_0x0019
            com.google.firebase.perf.logging.a r2 = f80981w     // Catch:{ all -> 0x0050 }
            java.lang.String r0 = "Firebase Performance is permanently disabled"
            r2.mo96433f(r0)     // Catch:{ all -> 0x0050 }
            monitor-exit(r1)
            return
        L_0x0019:
            com.google.firebase.perf.config.a r0 = r1.f80986b     // Catch:{ all -> 0x0050 }
            r0.mo96359T(r2)     // Catch:{ all -> 0x0050 }
            if (r2 == 0) goto L_0x0023
            r1.f80988d = r2     // Catch:{ all -> 0x0050 }
            goto L_0x002b
        L_0x0023:
            com.google.firebase.perf.config.a r2 = r1.f80986b     // Catch:{ all -> 0x0050 }
            java.lang.Boolean r2 = r2.mo96369k()     // Catch:{ all -> 0x0050 }
            r1.f80988d = r2     // Catch:{ all -> 0x0050 }
        L_0x002b:
            java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0050 }
            java.lang.Boolean r0 = r1.f80988d     // Catch:{ all -> 0x0050 }
            boolean r2 = r2.equals(r0)     // Catch:{ all -> 0x0050 }
            if (r2 == 0) goto L_0x003d
            com.google.firebase.perf.logging.a r2 = f80981w     // Catch:{ all -> 0x0050 }
            java.lang.String r0 = "Firebase Performance is Enabled"
            r2.mo96433f(r0)     // Catch:{ all -> 0x0050 }
            goto L_0x004e
        L_0x003d:
            java.lang.Boolean r2 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0050 }
            java.lang.Boolean r0 = r1.f80988d     // Catch:{ all -> 0x0050 }
            boolean r2 = r2.equals(r0)     // Catch:{ all -> 0x0050 }
            if (r2 == 0) goto L_0x004e
            com.google.firebase.perf.logging.a r2 = f80981w     // Catch:{ all -> 0x0050 }
            java.lang.String r0 = "Firebase Performance is Disabled"
            r2.mo96433f(r0)     // Catch:{ all -> 0x0050 }
        L_0x004e:
            monitor-exit(r1)
            return
        L_0x0050:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        L_0x0053:
            monitor-exit(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.C33314e.mo96406i(java.lang.Boolean):void");
    }

    /* renamed from: j */
    public void mo96407j(boolean z) {
        mo96406i(Boolean.valueOf(z));
    }

    public void putAttribute(@C0359n0 String str, @C0359n0 String str2) {
        boolean z = true;
        try {
            str = str.trim();
            str2 = str2.trim();
            mo96398a(str, str2);
        } catch (Exception e) {
            f80981w.mo96432d("Can not set attribute %s with value %s (%s)", str, str2, e.getMessage());
            z = false;
        }
        if (z) {
            this.f80985a.put(str, str2);
        }
    }

    public void removeAttribute(@C0359n0 String str) {
        this.f80985a.remove(str);
    }
}
