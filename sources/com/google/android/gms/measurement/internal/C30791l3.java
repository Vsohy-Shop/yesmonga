package com.google.android.gms.measurement.internal;

import androidx.annotation.C0348i1;
import com.google.android.gms.common.internal.C40843u;
import java.math.BigInteger;
import java.util.List;
import java.util.Locale;

/* renamed from: com.google.android.gms.measurement.internal.l3 */
public final class C30791l3 extends C30665b4 {

    /* renamed from: c */
    public String f73705c;

    /* renamed from: d */
    public String f73706d;

    /* renamed from: e */
    public int f73707e;

    /* renamed from: f */
    public String f73708f;

    /* renamed from: g */
    public String f73709g;

    /* renamed from: h */
    public long f73710h;

    /* renamed from: i */
    public final long f73711i;

    /* renamed from: j */
    public List f73712j;

    /* renamed from: k */
    public String f73713k;

    /* renamed from: l */
    public int f73714l;

    /* renamed from: m */
    public String f73715m;

    /* renamed from: n */
    public String f73716n;

    /* renamed from: o */
    public String f73717o;

    /* renamed from: p */
    public long f73718p = 0;

    /* renamed from: q */
    public String f73719q = null;

    public C30791l3(C30731g5 g5Var, long j) {
        super(g5Var);
        this.f73711i = j;
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x016a  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x018a A[Catch:{ IllegalStateException -> 0x01db }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x018b A[Catch:{ IllegalStateException -> 0x01db }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0194 A[Catch:{ IllegalStateException -> 0x01db }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01bc A[Catch:{ IllegalStateException -> 0x01db }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0206  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x023f  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x024c  */
    @androidx.annotation.C0348i1
    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"appId", "appStore", "appName", "gmpAppId", "gaAppId"})
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo86893l() {
        /*
            r11 = this;
            com.google.android.gms.measurement.internal.g5 r0 = r11.f74136a
            android.content.Context r0 = r0.mo86902c()
            java.lang.String r0 = r0.getPackageName()
            com.google.android.gms.measurement.internal.g5 r1 = r11.f74136a
            android.content.Context r1 = r1.mo86902c()
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            java.lang.String r3 = ""
            r4 = 0
            java.lang.String r5 = "Unknown"
            java.lang.String r6 = "unknown"
            if (r1 != 0) goto L_0x0035
            com.google.android.gms.measurement.internal.g5 r7 = r11.f74136a
            com.google.android.gms.measurement.internal.u3 r7 = r7.mo86903d()
            com.google.android.gms.measurement.internal.s3 r7 = r7.mo87489r()
            java.lang.Object r8 = com.google.android.gms.measurement.internal.C30899u3.m124186z(r0)
            java.lang.String r9 = "PackageManager is null, app identity information might be inaccurate. appId"
            r7.mo87464b(r9, r8)
        L_0x0032:
            r8 = r5
            goto L_0x009b
        L_0x0035:
            java.lang.String r6 = r1.getInstallerPackageName(r0)     // Catch:{ IllegalArgumentException -> 0x003a }
            goto L_0x004d
        L_0x003a:
            com.google.android.gms.measurement.internal.g5 r7 = r11.f74136a
            com.google.android.gms.measurement.internal.u3 r7 = r7.mo86903d()
            com.google.android.gms.measurement.internal.s3 r7 = r7.mo87489r()
            java.lang.Object r8 = com.google.android.gms.measurement.internal.C30899u3.m124186z(r0)
            java.lang.String r9 = "Error retrieving app installer package name. appId"
            r7.mo87464b(r9, r8)
        L_0x004d:
            if (r6 != 0) goto L_0x0052
            java.lang.String r6 = "manual_install"
            goto L_0x005b
        L_0x0052:
            java.lang.String r7 = "com.android.vending"
            boolean r7 = r7.equals(r6)
            if (r7 == 0) goto L_0x005b
            r6 = r3
        L_0x005b:
            com.google.android.gms.measurement.internal.g5 r7 = r11.f74136a     // Catch:{ NameNotFoundException -> 0x0085 }
            android.content.Context r7 = r7.mo86902c()     // Catch:{ NameNotFoundException -> 0x0085 }
            java.lang.String r7 = r7.getPackageName()     // Catch:{ NameNotFoundException -> 0x0085 }
            android.content.pm.PackageInfo r7 = r1.getPackageInfo(r7, r4)     // Catch:{ NameNotFoundException -> 0x0085 }
            if (r7 == 0) goto L_0x0032
            android.content.pm.ApplicationInfo r8 = r7.applicationInfo     // Catch:{ NameNotFoundException -> 0x0085 }
            java.lang.CharSequence r8 = r1.getApplicationLabel(r8)     // Catch:{ NameNotFoundException -> 0x0085 }
            boolean r9 = android.text.TextUtils.isEmpty(r8)     // Catch:{ NameNotFoundException -> 0x0085 }
            if (r9 != 0) goto L_0x007c
            java.lang.String r8 = r8.toString()     // Catch:{ NameNotFoundException -> 0x0085 }
            goto L_0x007d
        L_0x007c:
            r8 = r5
        L_0x007d:
            java.lang.String r5 = r7.versionName     // Catch:{ NameNotFoundException -> 0x0082 }
            int r2 = r7.versionCode     // Catch:{ NameNotFoundException -> 0x0082 }
            goto L_0x009b
        L_0x0082:
            r7 = r5
            r5 = r8
            goto L_0x0086
        L_0x0085:
            r7 = r5
        L_0x0086:
            com.google.android.gms.measurement.internal.g5 r8 = r11.f74136a
            com.google.android.gms.measurement.internal.u3 r8 = r8.mo86903d()
            com.google.android.gms.measurement.internal.s3 r8 = r8.mo87489r()
            java.lang.Object r9 = com.google.android.gms.measurement.internal.C30899u3.m124186z(r0)
            java.lang.String r10 = "Error retrieving package info. appId, appName"
            r8.mo87465c(r10, r9, r5)
            r8 = r5
            r5 = r7
        L_0x009b:
            r11.f73705c = r0
            r11.f73708f = r6
            r11.f73706d = r5
            r11.f73707e = r2
            r11.f73709g = r8
            r5 = 0
            r11.f73710h = r5
            com.google.android.gms.measurement.internal.g5 r2 = r11.f74136a
            java.lang.String r2 = r2.mo87111O()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x00c5
            com.google.android.gms.measurement.internal.g5 r2 = r11.f74136a
            java.lang.String r2 = r2.mo87112P()
            java.lang.String r5 = "am"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x00c5
            r2 = 1
            goto L_0x00c6
        L_0x00c5:
            r2 = r4
        L_0x00c6:
            com.google.android.gms.measurement.internal.g5 r5 = r11.f74136a
            int r5 = r5.mo87128x()
            switch(r5) {
                case 0: goto L_0x0150;
                case 1: goto L_0x0140;
                case 2: goto L_0x0130;
                case 3: goto L_0x0120;
                case 4: goto L_0x0110;
                case 5: goto L_0x0100;
                case 6: goto L_0x00f0;
                case 7: goto L_0x00e0;
                default: goto L_0x00cf;
            }
        L_0x00cf:
            com.google.android.gms.measurement.internal.g5 r6 = r11.f74136a
            com.google.android.gms.measurement.internal.u3 r6 = r6.mo86903d()
            com.google.android.gms.measurement.internal.s3 r6 = r6.mo87492u()
            java.lang.String r7 = "App measurement disabled due to denied storage consent"
            r6.mo87463a(r7)
            goto L_0x015f
        L_0x00e0:
            com.google.android.gms.measurement.internal.g5 r6 = r11.f74136a
            com.google.android.gms.measurement.internal.u3 r6 = r6.mo86903d()
            com.google.android.gms.measurement.internal.s3 r6 = r6.mo87492u()
            java.lang.String r7 = "App measurement disabled via the global data collection setting"
            r6.mo87463a(r7)
            goto L_0x015f
        L_0x00f0:
            com.google.android.gms.measurement.internal.g5 r6 = r11.f74136a
            com.google.android.gms.measurement.internal.u3 r6 = r6.mo86903d()
            com.google.android.gms.measurement.internal.s3 r6 = r6.mo87495x()
            java.lang.String r7 = "App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics"
            r6.mo87463a(r7)
            goto L_0x015f
        L_0x0100:
            com.google.android.gms.measurement.internal.g5 r6 = r11.f74136a
            com.google.android.gms.measurement.internal.u3 r6 = r6.mo86903d()
            com.google.android.gms.measurement.internal.s3 r6 = r6.mo87493v()
            java.lang.String r7 = "App measurement disabled via the init parameters"
            r6.mo87463a(r7)
            goto L_0x015f
        L_0x0110:
            com.google.android.gms.measurement.internal.g5 r6 = r11.f74136a
            com.google.android.gms.measurement.internal.u3 r6 = r6.mo86903d()
            com.google.android.gms.measurement.internal.s3 r6 = r6.mo87492u()
            java.lang.String r7 = "App measurement disabled via the manifest"
            r6.mo87463a(r7)
            goto L_0x015f
        L_0x0120:
            com.google.android.gms.measurement.internal.g5 r6 = r11.f74136a
            com.google.android.gms.measurement.internal.u3 r6 = r6.mo86903d()
            com.google.android.gms.measurement.internal.s3 r6 = r6.mo87492u()
            java.lang.String r7 = "App measurement disabled by setAnalyticsCollectionEnabled(false)"
            r6.mo87463a(r7)
            goto L_0x015f
        L_0x0130:
            com.google.android.gms.measurement.internal.g5 r6 = r11.f74136a
            com.google.android.gms.measurement.internal.u3 r6 = r6.mo86903d()
            com.google.android.gms.measurement.internal.s3 r6 = r6.mo87493v()
            java.lang.String r7 = "App measurement deactivated via the init parameters"
            r6.mo87463a(r7)
            goto L_0x015f
        L_0x0140:
            com.google.android.gms.measurement.internal.g5 r6 = r11.f74136a
            com.google.android.gms.measurement.internal.u3 r6 = r6.mo86903d()
            com.google.android.gms.measurement.internal.s3 r6 = r6.mo87492u()
            java.lang.String r7 = "App measurement deactivated via the manifest"
            r6.mo87463a(r7)
            goto L_0x015f
        L_0x0150:
            com.google.android.gms.measurement.internal.g5 r6 = r11.f74136a
            com.google.android.gms.measurement.internal.u3 r6 = r6.mo86903d()
            com.google.android.gms.measurement.internal.s3 r6 = r6.mo87493v()
            java.lang.String r7 = "App measurement collection enabled"
            r6.mo87463a(r7)
        L_0x015f:
            r11.f73715m = r3
            r11.f73716n = r3
            com.google.android.gms.measurement.internal.g5 r6 = r11.f74136a
            r6.mo86901b()
            if (r2 == 0) goto L_0x0172
            com.google.android.gms.measurement.internal.g5 r2 = r11.f74136a
            java.lang.String r2 = r2.mo87111O()
            r11.f73716n = r2
        L_0x0172:
            com.google.android.gms.measurement.internal.g5 r2 = r11.f74136a     // Catch:{ IllegalStateException -> 0x01db }
            android.content.Context r2 = r2.mo86902c()     // Catch:{ IllegalStateException -> 0x01db }
            com.google.android.gms.measurement.internal.g5 r6 = r11.f74136a     // Catch:{ IllegalStateException -> 0x01db }
            java.lang.String r6 = r6.mo87114R()     // Catch:{ IllegalStateException -> 0x01db }
            java.lang.String r7 = "google_app_id"
            java.lang.String r2 = com.google.android.gms.measurement.internal.C30891t7.m124173c(r2, r7, r6)     // Catch:{ IllegalStateException -> 0x01db }
            boolean r6 = android.text.TextUtils.isEmpty(r2)     // Catch:{ IllegalStateException -> 0x01db }
            if (r6 == 0) goto L_0x018b
            goto L_0x018c
        L_0x018b:
            r3 = r2
        L_0x018c:
            r11.f73715m = r3     // Catch:{ IllegalStateException -> 0x01db }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ IllegalStateException -> 0x01db }
            if (r2 != 0) goto L_0x01ba
            com.google.android.gms.measurement.internal.g5 r2 = r11.f74136a     // Catch:{ IllegalStateException -> 0x01db }
            android.content.Context r2 = r2.mo86902c()     // Catch:{ IllegalStateException -> 0x01db }
            com.google.android.gms.measurement.internal.g5 r3 = r11.f74136a     // Catch:{ IllegalStateException -> 0x01db }
            java.lang.String r3 = r3.mo87114R()     // Catch:{ IllegalStateException -> 0x01db }
            com.google.android.gms.common.internal.C40843u.m166202l(r2)     // Catch:{ IllegalStateException -> 0x01db }
            android.content.res.Resources r6 = r2.getResources()     // Catch:{ IllegalStateException -> 0x01db }
            boolean r7 = android.text.TextUtils.isEmpty(r3)     // Catch:{ IllegalStateException -> 0x01db }
            if (r7 != 0) goto L_0x01ae
            goto L_0x01b2
        L_0x01ae:
            java.lang.String r3 = com.google.android.gms.measurement.internal.C30948y4.m124319a(r2)     // Catch:{ IllegalStateException -> 0x01db }
        L_0x01b2:
            java.lang.String r2 = "admob_app_id"
            java.lang.String r2 = com.google.android.gms.measurement.internal.C30948y4.m124320b(r2, r6, r3)     // Catch:{ IllegalStateException -> 0x01db }
            r11.f73716n = r2     // Catch:{ IllegalStateException -> 0x01db }
        L_0x01ba:
            if (r5 != 0) goto L_0x01ef
            com.google.android.gms.measurement.internal.g5 r2 = r11.f74136a     // Catch:{ IllegalStateException -> 0x01db }
            com.google.android.gms.measurement.internal.u3 r2 = r2.mo86903d()     // Catch:{ IllegalStateException -> 0x01db }
            com.google.android.gms.measurement.internal.s3 r2 = r2.mo87493v()     // Catch:{ IllegalStateException -> 0x01db }
            java.lang.String r3 = "App measurement enabled for app package, google app id"
            java.lang.String r5 = r11.f73705c     // Catch:{ IllegalStateException -> 0x01db }
            java.lang.String r6 = r11.f73715m     // Catch:{ IllegalStateException -> 0x01db }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ IllegalStateException -> 0x01db }
            if (r6 == 0) goto L_0x01d5
            java.lang.String r6 = r11.f73716n     // Catch:{ IllegalStateException -> 0x01db }
            goto L_0x01d7
        L_0x01d5:
            java.lang.String r6 = r11.f73715m     // Catch:{ IllegalStateException -> 0x01db }
        L_0x01d7:
            r2.mo87465c(r3, r5, r6)     // Catch:{ IllegalStateException -> 0x01db }
            goto L_0x01ef
        L_0x01db:
            r2 = move-exception
            com.google.android.gms.measurement.internal.g5 r3 = r11.f74136a
            com.google.android.gms.measurement.internal.u3 r3 = r3.mo86903d()
            com.google.android.gms.measurement.internal.s3 r3 = r3.mo87489r()
            java.lang.Object r0 = com.google.android.gms.measurement.internal.C30899u3.m124186z(r0)
            java.lang.String r5 = "Fetching Google App Id failed with exception. appId"
            r3.mo87465c(r5, r0, r2)
        L_0x01ef:
            r0 = 0
            r11.f73712j = r0
            com.google.android.gms.measurement.internal.g5 r0 = r11.f74136a
            r0.mo86901b()
            com.google.android.gms.measurement.internal.g5 r0 = r11.f74136a
            com.google.android.gms.measurement.internal.g r0 = r0.mo87130z()
            java.lang.String r2 = "analytics.safelisted_events"
            java.util.List r0 = r0.mo87092y(r2)
            if (r0 != 0) goto L_0x0206
            goto L_0x023b
        L_0x0206:
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L_0x021c
            com.google.android.gms.measurement.internal.g5 r0 = r11.f74136a
            com.google.android.gms.measurement.internal.u3 r0 = r0.mo86903d()
            com.google.android.gms.measurement.internal.s3 r0 = r0.mo87495x()
            java.lang.String r2 = "Safelisted event list is empty. Ignoring"
            r0.mo87463a(r2)
            goto L_0x023d
        L_0x021c:
            java.util.Iterator r2 = r0.iterator()
        L_0x0220:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x023b
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            com.google.android.gms.measurement.internal.g5 r5 = r11.f74136a
            com.google.android.gms.measurement.internal.ua r5 = r5.mo87110N()
            java.lang.String r6 = "safelisted event"
            boolean r3 = r5.mo87518R(r6, r3)
            if (r3 != 0) goto L_0x0220
            goto L_0x023d
        L_0x023b:
            r11.f73712j = r0
        L_0x023d:
            if (r1 == 0) goto L_0x024c
            com.google.android.gms.measurement.internal.g5 r0 = r11.f74136a
            android.content.Context r0 = r0.mo86902c()
            boolean r0 = com.google.android.gms.common.wrappers.C41005a.m166705a(r0)
            r11.f73714l = r0
            return
        L_0x024c:
            r11.f73714l = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C30791l3.mo86893l():void");
    }

    /* renamed from: n */
    public final boolean mo86895n() {
        return true;
    }

    @C0348i1
    /* renamed from: o */
    public final int mo87242o() {
        mo86890i();
        return this.f73714l;
    }

    @C0348i1
    /* renamed from: p */
    public final int mo87243p() {
        mo86890i();
        return this.f73707e;
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x018a  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0190  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x01cf  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x01d2  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x01f6  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x021c  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0253  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0265  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0268  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0280  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x02b8  */
    @androidx.annotation.C0348i1
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.zzq mo87244q(java.lang.String r41) {
        /*
            r40 = this;
            r1 = r40
            r40.mo86866h()
            com.google.android.gms.measurement.internal.zzq r36 = new com.google.android.gms.measurement.internal.zzq
            java.lang.String r3 = r40.mo87246s()
            java.lang.String r4 = r40.mo87247t()
            r40.mo86890i()
            java.lang.String r5 = r1.f73706d
            r40.mo86890i()
            int r0 = r1.f73707e
            long r6 = (long) r0
            r40.mo86890i()
            java.lang.String r0 = r1.f73708f
            com.google.android.gms.common.internal.C40843u.m166202l(r0)
            java.lang.String r8 = r1.f73708f
            com.google.android.gms.measurement.internal.g5 r0 = r1.f74136a
            com.google.android.gms.measurement.internal.g r0 = r0.mo87130z()
            r0.mo87084q()
            r40.mo86890i()
            r40.mo86866h()
            long r9 = r1.f73710h
            r11 = 0
            int r0 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            r2 = 0
            if (r0 != 0) goto L_0x00d0
            com.google.android.gms.measurement.internal.g5 r0 = r1.f74136a
            com.google.android.gms.measurement.internal.ua r9 = r0.mo87110N()
            com.google.android.gms.measurement.internal.g5 r0 = r1.f74136a
            android.content.Context r0 = r0.mo86902c()
            com.google.android.gms.measurement.internal.g5 r10 = r1.f74136a
            android.content.Context r10 = r10.mo86902c()
            java.lang.String r10 = r10.getPackageName()
            r9.mo86866h()
            com.google.android.gms.common.internal.C40843u.m166202l(r0)
            com.google.android.gms.common.internal.C40843u.m166198h(r10)
            android.content.pm.PackageManager r13 = r0.getPackageManager()
            java.security.MessageDigest r14 = com.google.android.gms.measurement.internal.C30906ua.m124216t()
            r15 = -1
            if (r14 != 0) goto L_0x0078
            com.google.android.gms.measurement.internal.g5 r0 = r9.f74136a
            com.google.android.gms.measurement.internal.u3 r0 = r0.mo86903d()
            com.google.android.gms.measurement.internal.s3 r0 = r0.mo87489r()
            java.lang.String r9 = "Could not get MD5 instance"
            r0.mo87463a(r9)
        L_0x0076:
            r9 = r15
            goto L_0x00ce
        L_0x0078:
            if (r13 == 0) goto L_0x00cd
            boolean r10 = r9.mo87523W(r0, r10)     // Catch:{ NameNotFoundException -> 0x00bd }
            if (r10 != 0) goto L_0x00bb
            com.google.android.gms.common.wrappers.c r0 = com.google.android.gms.common.wrappers.C41008d.m166715a(r0)     // Catch:{ NameNotFoundException -> 0x00bd }
            com.google.android.gms.measurement.internal.g5 r10 = r9.f74136a     // Catch:{ NameNotFoundException -> 0x00bd }
            android.content.Context r10 = r10.mo86902c()     // Catch:{ NameNotFoundException -> 0x00bd }
            java.lang.String r10 = r10.getPackageName()     // Catch:{ NameNotFoundException -> 0x00bd }
            r13 = 64
            android.content.pm.PackageInfo r0 = r0.mo134784f(r10, r13)     // Catch:{ NameNotFoundException -> 0x00bd }
            android.content.pm.Signature[] r0 = r0.signatures     // Catch:{ NameNotFoundException -> 0x00bd }
            if (r0 == 0) goto L_0x00ab
            int r10 = r0.length     // Catch:{ NameNotFoundException -> 0x00bd }
            if (r10 <= 0) goto L_0x00ab
            r0 = r0[r2]     // Catch:{ NameNotFoundException -> 0x00bd }
            byte[] r0 = r0.toByteArray()     // Catch:{ NameNotFoundException -> 0x00bd }
            byte[] r0 = r14.digest(r0)     // Catch:{ NameNotFoundException -> 0x00bd }
            long r9 = com.google.android.gms.measurement.internal.C30906ua.m124215s0(r0)     // Catch:{ NameNotFoundException -> 0x00bd }
            r15 = r9
            goto L_0x0076
        L_0x00ab:
            com.google.android.gms.measurement.internal.g5 r0 = r9.f74136a     // Catch:{ NameNotFoundException -> 0x00bd }
            com.google.android.gms.measurement.internal.u3 r0 = r0.mo86903d()     // Catch:{ NameNotFoundException -> 0x00bd }
            com.google.android.gms.measurement.internal.s3 r0 = r0.mo87494w()     // Catch:{ NameNotFoundException -> 0x00bd }
            java.lang.String r10 = "Could not get signatures"
            r0.mo87463a(r10)     // Catch:{ NameNotFoundException -> 0x00bd }
            goto L_0x0076
        L_0x00bb:
            r15 = r11
            goto L_0x0076
        L_0x00bd:
            r0 = move-exception
            com.google.android.gms.measurement.internal.g5 r9 = r9.f74136a
            com.google.android.gms.measurement.internal.u3 r9 = r9.mo86903d()
            com.google.android.gms.measurement.internal.s3 r9 = r9.mo87489r()
            java.lang.String r10 = "Package name not found"
            r9.mo87464b(r10, r0)
        L_0x00cd:
            r9 = r11
        L_0x00ce:
            r1.f73710h = r9
        L_0x00d0:
            r13 = r9
            com.google.android.gms.measurement.internal.g5 r0 = r1.f74136a
            boolean r0 = r0.mo87123o()
            com.google.android.gms.measurement.internal.g5 r9 = r1.f74136a
            com.google.android.gms.measurement.internal.k4 r9 = r9.mo87103F()
            boolean r9 = r9.f73661q
            r10 = 1
            r15 = r9 ^ 1
            r40.mo86866h()
            com.google.android.gms.measurement.internal.g5 r9 = r1.f74136a
            boolean r9 = r9.mo87123o()
            r11 = 0
            if (r9 != 0) goto L_0x00f2
        L_0x00ee:
            r20 = r11
            goto L_0x0178
        L_0x00f2:
            com.google.android.gms.internal.measurement.C42234vf.m171008b()
            com.google.android.gms.measurement.internal.g5 r9 = r1.f74136a
            com.google.android.gms.measurement.internal.g r9 = r9.mo87130z()
            com.google.android.gms.measurement.internal.g3 r12 = com.google.android.gms.measurement.internal.C30742h3.f73530e0
            boolean r9 = r9.mo87070B(r11, r12)
            if (r9 == 0) goto L_0x0113
            com.google.android.gms.measurement.internal.g5 r9 = r1.f74136a
            com.google.android.gms.measurement.internal.u3 r9 = r9.mo86903d()
            com.google.android.gms.measurement.internal.s3 r9 = r9.mo87493v()
            java.lang.String r12 = "Disabled IID for tests."
            r9.mo87463a(r12)
            goto L_0x00ee
        L_0x0113:
            com.google.android.gms.measurement.internal.g5 r9 = r1.f74136a     // Catch:{ ClassNotFoundException -> 0x0176 }
            android.content.Context r9 = r9.mo86902c()     // Catch:{ ClassNotFoundException -> 0x0176 }
            java.lang.ClassLoader r9 = r9.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x0176 }
            java.lang.String r12 = "com.google.firebase.analytics.FirebaseAnalytics"
            java.lang.Class r9 = r9.loadClass(r12)     // Catch:{ ClassNotFoundException -> 0x0176 }
            if (r9 != 0) goto L_0x0126
            goto L_0x00ee
        L_0x0126:
            java.lang.String r12 = "getInstance"
            java.lang.Class[] r11 = new java.lang.Class[r10]     // Catch:{ Exception -> 0x0167 }
            java.lang.Class<android.content.Context> r19 = android.content.Context.class
            r11[r2] = r19     // Catch:{ Exception -> 0x0167 }
            java.lang.reflect.Method r11 = r9.getDeclaredMethod(r12, r11)     // Catch:{ Exception -> 0x0167 }
            java.lang.Object[] r12 = new java.lang.Object[r10]     // Catch:{ Exception -> 0x0167 }
            com.google.android.gms.measurement.internal.g5 r10 = r1.f74136a     // Catch:{ Exception -> 0x0167 }
            android.content.Context r10 = r10.mo86902c()     // Catch:{ Exception -> 0x0167 }
            r12[r2] = r10     // Catch:{ Exception -> 0x0167 }
            r10 = 0
            java.lang.Object r11 = r11.invoke(r10, r12)     // Catch:{ Exception -> 0x0167 }
            if (r11 != 0) goto L_0x0144
            goto L_0x0176
        L_0x0144:
            java.lang.String r10 = "getFirebaseInstanceId"
            java.lang.Class[] r12 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x0157 }
            java.lang.reflect.Method r9 = r9.getDeclaredMethod(r10, r12)     // Catch:{ Exception -> 0x0157 }
            java.lang.Object[] r10 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x0157 }
            java.lang.Object r9 = r9.invoke(r11, r10)     // Catch:{ Exception -> 0x0157 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ Exception -> 0x0157 }
            r20 = r9
            goto L_0x0178
        L_0x0157:
            com.google.android.gms.measurement.internal.g5 r9 = r1.f74136a
            com.google.android.gms.measurement.internal.u3 r9 = r9.mo86903d()
            com.google.android.gms.measurement.internal.s3 r9 = r9.mo87495x()
            java.lang.String r10 = "Failed to retrieve Firebase Instance Id"
            r9.mo87463a(r10)
            goto L_0x0176
        L_0x0167:
            com.google.android.gms.measurement.internal.g5 r9 = r1.f74136a
            com.google.android.gms.measurement.internal.u3 r9 = r9.mo86903d()
            com.google.android.gms.measurement.internal.s3 r9 = r9.mo87496y()
            java.lang.String r10 = "Failed to obtain Firebase Analytics instance"
            r9.mo87463a(r10)
        L_0x0176:
            r20 = 0
        L_0x0178:
            com.google.android.gms.measurement.internal.g5 r9 = r1.f74136a
            com.google.android.gms.measurement.internal.k4 r10 = r9.mo87103F()
            com.google.android.gms.measurement.internal.g4 r10 = r10.f73649e
            long r10 = r10.mo87096a()
            r16 = 0
            int r12 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r12 != 0) goto L_0x0190
            long r9 = r9.f73431G
            r12 = r3
            r22 = r9
            goto L_0x0199
        L_0x0190:
            r12 = r3
            long r2 = r9.f73431G
            long r2 = java.lang.Math.min(r2, r10)
            r22 = r2
        L_0x0199:
            r40.mo86890i()
            int r11 = r1.f73714l
            com.google.android.gms.measurement.internal.g5 r2 = r1.f74136a
            com.google.android.gms.measurement.internal.g r2 = r2.mo87130z()
            boolean r24 = r2.mo87069A()
            com.google.android.gms.measurement.internal.g5 r2 = r1.f74136a
            com.google.android.gms.measurement.internal.k4 r2 = r2.mo87103F()
            r2.mo86866h()
            android.content.SharedPreferences r2 = r2.mo87191o()
            java.lang.String r3 = "deferred_analytics_collection"
            r9 = 0
            boolean r25 = r2.getBoolean(r3, r9)
            r40.mo86890i()
            java.lang.String r3 = r1.f73716n
            com.google.android.gms.measurement.internal.g5 r2 = r1.f74136a
            com.google.android.gms.measurement.internal.g r2 = r2.mo87130z()
            java.lang.String r9 = "google_analytics_default_allow_ad_personalization_signals"
            java.lang.Boolean r2 = r2.mo87087t(r9)
            if (r2 != 0) goto L_0x01d2
            r26 = 0
            goto L_0x01de
        L_0x01d2:
            boolean r2 = r2.booleanValue()
            r9 = 1
            r2 = r2 ^ r9
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r26 = r2
        L_0x01de:
            long r9 = r1.f73711i
            java.util.List r2 = r1.f73712j
            r19 = r2
            com.google.android.gms.measurement.internal.g5 r2 = r1.f74136a
            com.google.android.gms.measurement.internal.k4 r2 = r2.mo87103F()
            com.google.android.gms.measurement.internal.h r2 = r2.mo87193q()
            java.lang.String r30 = r2.mo87140h()
            java.lang.String r2 = r1.f73713k
            if (r2 != 0) goto L_0x0202
            com.google.android.gms.measurement.internal.g5 r2 = r1.f74136a
            com.google.android.gms.measurement.internal.ua r2 = r2.mo87110N()
            java.lang.String r2 = r2.mo87536q()
            r1.f73713k = r2
        L_0x0202:
            java.lang.String r2 = r1.f73713k
            com.google.android.gms.internal.measurement.C41955ff.m169896b()
            r27 = r2
            com.google.android.gms.measurement.internal.g5 r2 = r1.f74136a
            com.google.android.gms.measurement.internal.g r2 = r2.mo87130z()
            r28 = r3
            com.google.android.gms.measurement.internal.g3 r3 = com.google.android.gms.measurement.internal.C30742h3.f73552p0
            r31 = r9
            r9 = 0
            boolean r2 = r2.mo87070B(r9, r3)
            if (r2 == 0) goto L_0x0253
            r40.mo86866h()
            long r2 = r1.f73718p
            r9 = 0
            int r2 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r2 != 0) goto L_0x0228
            goto L_0x0247
        L_0x0228:
            com.google.android.gms.measurement.internal.g5 r2 = r1.f74136a
            com.google.android.gms.common.util.g r2 = r2.mo86900a()
            long r2 = r2.mo134768a()
            long r9 = r1.f73718p
            long r2 = r2 - r9
            java.lang.String r9 = r1.f73717o
            if (r9 == 0) goto L_0x0247
            r9 = 86400000(0x5265c00, double:4.2687272E-316)
            int r2 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r2 <= 0) goto L_0x0247
            java.lang.String r2 = r1.f73719q
            if (r2 != 0) goto L_0x0247
            r40.mo87249v()
        L_0x0247:
            java.lang.String r2 = r1.f73717o
            if (r2 != 0) goto L_0x024e
            r40.mo87249v()
        L_0x024e:
            java.lang.String r2 = r1.f73717o
            r33 = r2
            goto L_0x0255
        L_0x0253:
            r33 = 0
        L_0x0255:
            com.google.android.gms.measurement.internal.g5 r2 = r1.f74136a
            com.google.android.gms.measurement.internal.g r2 = r2.mo87130z()
            com.google.android.gms.measurement.internal.g5 r3 = r2.f74136a
            java.lang.String r3 = "google_analytics_sgtm_upload_enabled"
            java.lang.Boolean r2 = r2.mo87087t(r3)
            if (r2 != 0) goto L_0x0268
            r34 = 0
            goto L_0x026e
        L_0x0268:
            boolean r2 = r2.booleanValue()
            r34 = r2
        L_0x026e:
            com.google.android.gms.internal.measurement.C42026je.m170421b()
            com.google.android.gms.measurement.internal.g5 r2 = r1.f74136a
            com.google.android.gms.measurement.internal.g r2 = r2.mo87130z()
            com.google.android.gms.measurement.internal.g3 r3 = com.google.android.gms.measurement.internal.C30742h3.f73497F0
            r9 = 0
            boolean r2 = r2.mo87070B(r9, r3)
            if (r2 == 0) goto L_0x02b8
            com.google.android.gms.measurement.internal.g5 r2 = r1.f74136a
            com.google.android.gms.measurement.internal.ua r2 = r2.mo87110N()
            java.lang.String r3 = r40.mo87246s()
            com.google.android.gms.measurement.internal.g5 r9 = r2.f74136a     // Catch:{ NameNotFoundException -> 0x029e }
            android.content.Context r9 = r9.mo86902c()     // Catch:{ NameNotFoundException -> 0x029e }
            com.google.android.gms.common.wrappers.c r9 = com.google.android.gms.common.wrappers.C41008d.m166715a(r9)     // Catch:{ NameNotFoundException -> 0x029e }
            r10 = 0
            android.content.pm.ApplicationInfo r9 = r9.mo134781c(r3, r10)     // Catch:{ NameNotFoundException -> 0x029f }
            if (r9 == 0) goto L_0x02b3
            int r2 = r9.targetSdkVersion     // Catch:{ NameNotFoundException -> 0x029f }
            goto L_0x02b4
        L_0x029e:
            r10 = 0
        L_0x029f:
            com.google.android.gms.measurement.internal.g5 r9 = r2.f74136a
            r9.mo86902c()
            com.google.android.gms.measurement.internal.g5 r2 = r2.f74136a
            com.google.android.gms.measurement.internal.u3 r2 = r2.mo86903d()
            com.google.android.gms.measurement.internal.s3 r2 = r2.mo87489r()
            java.lang.String r9 = "PackageManager failed to find running app: app_id"
            r2.mo87464b(r9, r3)
        L_0x02b3:
            r2 = r10
        L_0x02b4:
            long r2 = (long) r2
            r37 = r2
            goto L_0x02ba
        L_0x02b8:
            r37 = 0
        L_0x02ba:
            r9 = 76003(0x128e3, double:3.75505E-319)
            r17 = 0
            r29 = 0
            r35 = r19
            r39 = r27
            r2 = r36
            r27 = r28
            r3 = r12
            r21 = r11
            r11 = r13
            r13 = r41
            r14 = r0
            r16 = r20
            r19 = r22
            r22 = r24
            r23 = r25
            r24 = r27
            r25 = r26
            r26 = r31
            r28 = r35
            r31 = r39
            r32 = r33
            r33 = r34
            r34 = r37
            r2.<init>((java.lang.String) r3, (java.lang.String) r4, (java.lang.String) r5, (long) r6, (java.lang.String) r8, (long) r9, (long) r11, (java.lang.String) r13, (boolean) r14, (boolean) r15, (java.lang.String) r16, (long) r17, (long) r19, (int) r21, (boolean) r22, (boolean) r23, (java.lang.String) r24, (java.lang.Boolean) r25, (long) r26, (java.util.List) r28, (java.lang.String) r29, (java.lang.String) r30, (java.lang.String) r31, (java.lang.String) r32, (boolean) r33, (long) r34)
            return r36
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C30791l3.mo87244q(java.lang.String):com.google.android.gms.measurement.internal.zzq");
    }

    @C0348i1
    /* renamed from: r */
    public final String mo87245r() {
        mo86890i();
        return this.f73716n;
    }

    @C0348i1
    /* renamed from: s */
    public final String mo87246s() {
        mo86890i();
        C40843u.m166202l(this.f73705c);
        return this.f73705c;
    }

    @C0348i1
    /* renamed from: t */
    public final String mo87247t() {
        mo86866h();
        mo86890i();
        C40843u.m166202l(this.f73715m);
        return this.f73715m;
    }

    @C0348i1
    /* renamed from: u */
    public final List mo87248u() {
        return this.f73712j;
    }

    @C0348i1
    /* renamed from: v */
    public final void mo87249v() {
        String str;
        String str2;
        mo86866h();
        if (!this.f74136a.mo87103F().mo87193q().mo87142i(zzah.ANALYTICS_STORAGE)) {
            this.f74136a.mo86903d().mo87488q().mo87463a("Analytics Storage consent is not granted");
            str = null;
        } else {
            byte[] bArr = new byte[16];
            this.f74136a.mo87110N().mo87542u().nextBytes(bArr);
            str = String.format(Locale.US, "%032x", new Object[]{new BigInteger(1, bArr)});
        }
        C30875s3 q = this.f74136a.mo86903d().mo87488q();
        Object[] objArr = new Object[1];
        if (str == null) {
            str2 = "null";
        } else {
            str2 = "not null";
        }
        objArr[0] = str2;
        q.mo87463a(String.format("Resetting session stitching token to %s", objArr));
        this.f73717o = str;
        this.f73718p = this.f74136a.mo86900a().mo134768a();
    }

    /* renamed from: w */
    public final boolean mo87250w(String str) {
        String str2 = this.f73719q;
        boolean z = false;
        if (str2 != null && !str2.equals(str)) {
            z = true;
        }
        this.f73719q = str;
        return z;
    }
}
