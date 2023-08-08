package com.google.android.gms.measurement.internal;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.C0348i1;
import androidx.annotation.C0386z0;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.common.util.C40974d0;
import com.google.android.gms.common.util.C40998x;
import com.google.android.gms.common.wrappers.C41008d;
import java.lang.reflect.InvocationTargetException;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* renamed from: com.google.android.gms.measurement.internal.g */
public final class C30725g extends C30961z5 {

    /* renamed from: b */
    public Boolean f73405b;

    /* renamed from: c */
    public C30712f f73406c = C30699e.f73347a;

    /* renamed from: d */
    public Boolean f73407d;

    public C30725g(C30731g5 g5Var) {
        super(g5Var);
    }

    /* renamed from: I */
    public static final long m123709I() {
        return ((Long) C30742h3.f73531f.mo87094a((Object) null)).longValue();
    }

    /* renamed from: i */
    public static final long m123710i() {
        return ((Long) C30742h3.f73496F.mo87094a((Object) null)).longValue();
    }

    /* renamed from: A */
    public final boolean mo87069A() {
        Boolean t = mo87087t("google_analytics_adid_collection_enabled");
        if (t == null || t.booleanValue()) {
            return true;
        }
        return false;
    }

    @C0348i1
    /* renamed from: B */
    public final boolean mo87070B(String str, C30729g3 g3Var) {
        if (str == null) {
            return ((Boolean) g3Var.mo87094a((Object) null)).booleanValue();
        }
        String e = this.f73406c.mo87050e(str, g3Var.mo87095b());
        if (TextUtils.isEmpty(e)) {
            return ((Boolean) g3Var.mo87094a((Object) null)).booleanValue();
        }
        return ((Boolean) g3Var.mo87094a(Boolean.valueOf("1".equals(e)))).booleanValue();
    }

    /* renamed from: C */
    public final boolean mo87071C(String str) {
        return "1".equals(this.f73406c.mo87050e(str, "gaia_collection_enabled"));
    }

    /* renamed from: D */
    public final boolean mo87072D() {
        Boolean t = mo87087t("google_analytics_automatic_screen_reporting_enabled");
        if (t == null || t.booleanValue()) {
            return true;
        }
        return false;
    }

    /* renamed from: E */
    public final boolean mo87073E() {
        this.f74136a.mo86901b();
        Boolean t = mo87087t("firebase_analytics_collection_deactivated");
        if (t == null || !t.booleanValue()) {
            return false;
        }
        return true;
    }

    /* renamed from: F */
    public final boolean mo87074F(String str) {
        return "1".equals(this.f73406c.mo87050e(str, "measurement.event_sampling_enabled"));
    }

    @C0348i1
    /* renamed from: G */
    public final boolean mo87075G() {
        if (this.f73405b == null) {
            Boolean t = mo87087t("app_measurement_lite");
            this.f73405b = t;
            if (t == null) {
                this.f73405b = Boolean.FALSE;
            }
        }
        if (this.f73405b.booleanValue() || !this.f74136a.mo87127s()) {
            return true;
        }
        return false;
    }

    @EnsuresNonNull({"this.isMainProcess"})
    /* renamed from: H */
    public final boolean mo87076H() {
        if (this.f73407d == null) {
            synchronized (this) {
                if (this.f73407d == null) {
                    ApplicationInfo applicationInfo = this.f74136a.mo86902c().getApplicationInfo();
                    String a = C40998x.m166697a();
                    if (applicationInfo != null) {
                        String str = applicationInfo.processName;
                        boolean z = false;
                        if (str != null && str.equals(a)) {
                            z = true;
                        }
                        this.f73407d = Boolean.valueOf(z);
                    }
                    if (this.f73407d == null) {
                        this.f73407d = Boolean.TRUE;
                        this.f74136a.mo86903d().mo87489r().mo87463a("My process not in the list of running processes");
                    }
                }
            }
        }
        return this.f73407d.booleanValue();
    }

    /* renamed from: j */
    public final String mo87077j(String str, String str2) {
        Class<String> cls = String.class;
        try {
            String str3 = (String) Class.forName("android.os.SystemProperties").getMethod("get", new Class[]{cls, cls}).invoke((Object) null, new Object[]{str, ""});
            C40843u.m166202l(str3);
            return str3;
        } catch (ClassNotFoundException e) {
            this.f74136a.mo86903d().mo87489r().mo87464b("Could not find SystemProperties class", e);
            return "";
        } catch (NoSuchMethodException e2) {
            this.f74136a.mo86903d().mo87489r().mo87464b("Could not find SystemProperties.get() method", e2);
            return "";
        } catch (IllegalAccessException e3) {
            this.f74136a.mo86903d().mo87489r().mo87464b("Could not access SystemProperties.get()", e3);
            return "";
        } catch (InvocationTargetException e4) {
            this.f74136a.mo86903d().mo87489r().mo87464b("SystemProperties.get() threw an exception", e4);
            return "";
        }
    }

    @C0348i1
    /* renamed from: k */
    public final double mo87078k(String str, C30729g3 g3Var) {
        if (str == null) {
            return ((Double) g3Var.mo87094a((Object) null)).doubleValue();
        }
        String e = this.f73406c.mo87050e(str, g3Var.mo87095b());
        if (TextUtils.isEmpty(e)) {
            return ((Double) g3Var.mo87094a((Object) null)).doubleValue();
        }
        try {
            return ((Double) g3Var.mo87094a(Double.valueOf(Double.parseDouble(e)))).doubleValue();
        } catch (NumberFormatException unused) {
            return ((Double) g3Var.mo87094a((Object) null)).doubleValue();
        }
    }

    /* renamed from: l */
    public final int mo87079l(@C0386z0(min = 1) String str) {
        return mo87083p(str, C30742h3.f73504J, 500, 2000);
    }

    /* renamed from: m */
    public final int mo87080m() {
        if (this.f74136a.mo87110N().mo87524X(201500000, true)) {
            return 100;
        }
        return 25;
    }

    /* renamed from: n */
    public final int mo87081n(@C0386z0(min = 1) String str) {
        return mo87083p(str, C30742h3.f73505K, 25, 100);
    }

    @C0348i1
    /* renamed from: o */
    public final int mo87082o(String str, C30729g3 g3Var) {
        if (str == null) {
            return ((Integer) g3Var.mo87094a((Object) null)).intValue();
        }
        String e = this.f73406c.mo87050e(str, g3Var.mo87095b());
        if (TextUtils.isEmpty(e)) {
            return ((Integer) g3Var.mo87094a((Object) null)).intValue();
        }
        try {
            return ((Integer) g3Var.mo87094a(Integer.valueOf(Integer.parseInt(e)))).intValue();
        } catch (NumberFormatException unused) {
            return ((Integer) g3Var.mo87094a((Object) null)).intValue();
        }
    }

    @C0348i1
    /* renamed from: p */
    public final int mo87083p(String str, C30729g3 g3Var, int i, int i2) {
        return Math.max(Math.min(mo87082o(str, g3Var), i2), i);
    }

    /* renamed from: q */
    public final long mo87084q() {
        this.f74136a.mo86901b();
        return 76003;
    }

    @C0348i1
    /* renamed from: r */
    public final long mo87085r(String str, C30729g3 g3Var) {
        if (str == null) {
            return ((Long) g3Var.mo87094a((Object) null)).longValue();
        }
        String e = this.f73406c.mo87050e(str, g3Var.mo87095b());
        if (TextUtils.isEmpty(e)) {
            return ((Long) g3Var.mo87094a((Object) null)).longValue();
        }
        try {
            return ((Long) g3Var.mo87094a(Long.valueOf(Long.parseLong(e)))).longValue();
        } catch (NumberFormatException unused) {
            return ((Long) g3Var.mo87094a((Object) null)).longValue();
        }
    }

    @C40974d0
    /* renamed from: s */
    public final Bundle mo87086s() {
        try {
            if (this.f74136a.mo86902c().getPackageManager() == null) {
                this.f74136a.mo86903d().mo87489r().mo87463a("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo c = C41008d.m166715a(this.f74136a.mo86902c()).mo134781c(this.f74136a.mo86902c().getPackageName(), 128);
            if (c != null) {
                return c.metaData;
            }
            this.f74136a.mo86903d().mo87489r().mo87463a("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            this.f74136a.mo86903d().mo87489r().mo87464b("Failed to load metadata: Package name not found", e);
            return null;
        }
    }

    @C40974d0
    /* renamed from: t */
    public final Boolean mo87087t(@C0386z0(min = 1) String str) {
        C40843u.m166198h(str);
        Bundle s = mo87086s();
        if (s == null) {
            this.f74136a.mo86903d().mo87489r().mo87463a("Failed to load metadata: Metadata bundle is null");
            return null;
        } else if (!s.containsKey(str)) {
            return null;
        } else {
            return Boolean.valueOf(s.getBoolean(str));
        }
    }

    /* renamed from: u */
    public final String mo87088u() {
        return mo87077j("debug.firebase.analytics.app", "");
    }

    /* renamed from: v */
    public final String mo87089v() {
        return mo87077j("debug.deferred.deeplink", "");
    }

    /* renamed from: w */
    public final String mo87090w() {
        this.f74136a.mo86901b();
        return "FA";
    }

    @C0348i1
    /* renamed from: x */
    public final String mo87091x(String str, C30729g3 g3Var) {
        if (str == null) {
            return (String) g3Var.mo87094a((Object) null);
        }
        return (String) g3Var.mo87094a(this.f73406c.mo87050e(str, g3Var.mo87095b()));
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x002e A[SYNTHETIC, Splitter:B:8:0x002e] */
    @com.google.android.gms.common.util.C40974d0
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List mo87092y(@androidx.annotation.C0386z0(min = 1) java.lang.String r4) {
        /*
            r3 = this;
            java.lang.String r4 = "analytics.safelisted_events"
            com.google.android.gms.common.internal.C40843u.m166198h(r4)
            android.os.Bundle r0 = r3.mo87086s()
            r1 = 0
            if (r0 != 0) goto L_0x001d
            com.google.android.gms.measurement.internal.g5 r4 = r3.f74136a
            com.google.android.gms.measurement.internal.u3 r4 = r4.mo86903d()
            com.google.android.gms.measurement.internal.s3 r4 = r4.mo87489r()
            java.lang.String r0 = "Failed to load metadata: Metadata bundle is null"
            r4.mo87463a(r0)
        L_0x001b:
            r4 = r1
            goto L_0x002c
        L_0x001d:
            boolean r2 = r0.containsKey(r4)
            if (r2 != 0) goto L_0x0024
            goto L_0x001b
        L_0x0024:
            int r4 = r0.getInt(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
        L_0x002c:
            if (r4 == 0) goto L_0x0058
            com.google.android.gms.measurement.internal.g5 r0 = r3.f74136a     // Catch:{ NotFoundException -> 0x0048 }
            android.content.Context r0 = r0.mo86902c()     // Catch:{ NotFoundException -> 0x0048 }
            android.content.res.Resources r0 = r0.getResources()     // Catch:{ NotFoundException -> 0x0048 }
            int r4 = r4.intValue()     // Catch:{ NotFoundException -> 0x0048 }
            java.lang.String[] r4 = r0.getStringArray(r4)     // Catch:{ NotFoundException -> 0x0048 }
            if (r4 != 0) goto L_0x0043
            return r1
        L_0x0043:
            java.util.List r4 = java.util.Arrays.asList(r4)     // Catch:{ NotFoundException -> 0x0048 }
            return r4
        L_0x0048:
            r4 = move-exception
            com.google.android.gms.measurement.internal.g5 r0 = r3.f74136a
            com.google.android.gms.measurement.internal.u3 r0 = r0.mo86903d()
            com.google.android.gms.measurement.internal.s3 r0 = r0.mo87489r()
            java.lang.String r2 = "Failed to load string array from metadata: resource not found"
            r0.mo87464b(r2, r4)
        L_0x0058:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C30725g.mo87092y(java.lang.String):java.util.List");
    }

    /* renamed from: z */
    public final void mo87093z(C30712f fVar) {
        this.f73406c = fVar;
    }
}
