package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.os.Bundle;
import androidx.annotation.C0323b0;
import androidx.annotation.C0348i1;
import androidx.annotation.C0353k0;
import androidx.annotation.C0359n0;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.common.util.C40974d0;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.measurement.internal.c8 */
public final class C30682c8 extends C30665b4 {

    /* renamed from: c */
    public volatile C30903u7 f73257c;

    /* renamed from: d */
    public volatile C30903u7 f73258d;
    @C40974d0

    /* renamed from: e */
    public C30903u7 f73259e;

    /* renamed from: f */
    public final Map f73260f = new ConcurrentHashMap();
    @C0323b0("activityLock")

    /* renamed from: g */
    public Activity f73261g;
    @C0323b0("activityLock")

    /* renamed from: h */
    public volatile boolean f73262h;

    /* renamed from: i */
    public volatile C30903u7 f73263i;

    /* renamed from: j */
    public C30903u7 f73264j;
    @C0323b0("activityLock")

    /* renamed from: k */
    public boolean f73265k;

    /* renamed from: l */
    public final Object f73266l = new Object();

    public C30682c8(C30731g5 g5Var) {
        super(g5Var);
    }

    /* renamed from: w */
    public static /* bridge */ /* synthetic */ void m123538w(C30682c8 c8Var, Bundle bundle, C30903u7 u7Var, C30903u7 u7Var2, long j) {
        bundle.remove("screen_name");
        bundle.remove("screen_class");
        c8Var.mo86919o(u7Var, u7Var2, j, true, c8Var.f74136a.mo87110N().mo87548x0((String) null, FirebaseAnalytics.C32531a.f78878A, bundle, (List) null, false));
    }

    @C0353k0
    /* renamed from: A */
    public final void mo86912A(Activity activity) {
        synchronized (this.f73266l) {
            this.f73265k = false;
            this.f73262h = true;
        }
        long c = this.f74136a.mo86900a().mo134770c();
        if (!this.f74136a.mo87130z().mo87072D()) {
            this.f73257c = null;
            this.f74136a.mo86904f().mo86950z(new C30963z7(this, c));
            return;
        }
        C30903u7 F = mo86917F(activity);
        this.f73258d = this.f73257c;
        this.f73257c = null;
        this.f74136a.mo86904f().mo86950z(new C30656a8(this, F, c));
    }

    @C0353k0
    /* renamed from: B */
    public final void mo86913B(Activity activity) {
        synchronized (this.f73266l) {
            this.f73265k = true;
            if (activity != this.f73261g) {
                synchronized (this.f73266l) {
                    this.f73261g = activity;
                    this.f73262h = false;
                }
                if (this.f74136a.mo87130z().mo87072D()) {
                    this.f73263i = null;
                    this.f74136a.mo86904f().mo86950z(new C30669b8(this));
                }
            }
        }
        if (!this.f74136a.mo87130z().mo87072D()) {
            this.f73257c = this.f73263i;
            this.f74136a.mo86904f().mo86950z(new C30951y7(this));
            return;
        }
        mo86918G(activity, mo86917F(activity), false);
        C30957z1 y = this.f74136a.mo87129y();
        y.f74136a.mo86904f().mo86950z(new C30944y0(y, y.f74136a.mo86900a().mo134770c()));
    }

    @C0353k0
    /* renamed from: C */
    public final void mo86914C(Activity activity, Bundle bundle) {
        C30903u7 u7Var;
        if (this.f74136a.mo87130z().mo87072D() && bundle != null && (u7Var = (C30903u7) this.f73260f.get(activity)) != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("id", u7Var.f73995c);
            bundle2.putString("name", u7Var.f73993a);
            bundle2.putString("referrer_name", u7Var.f73994b);
            bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0088, code lost:
        if (r1 <= 100) goto L_0x00a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00b4, code lost:
        if (r1 <= 100) goto L_0x00cf;
     */
    @java.lang.Deprecated
    /* renamed from: D */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo86915D(@androidx.annotation.C0359n0 android.app.Activity r4, @androidx.annotation.C0386z0(max = 36, min = 1) java.lang.String r5, @androidx.annotation.C0386z0(max = 36, min = 1) java.lang.String r6) {
        /*
            r3 = this;
            com.google.android.gms.measurement.internal.g5 r0 = r3.f74136a
            com.google.android.gms.measurement.internal.g r0 = r0.mo87130z()
            boolean r0 = r0.mo87072D()
            if (r0 != 0) goto L_0x001c
            com.google.android.gms.measurement.internal.g5 r4 = r3.f74136a
            com.google.android.gms.measurement.internal.u3 r4 = r4.mo86903d()
            com.google.android.gms.measurement.internal.s3 r4 = r4.mo87495x()
            java.lang.String r5 = "setCurrentScreen cannot be called while screen reporting is disabled."
            r4.mo87463a(r5)
            return
        L_0x001c:
            com.google.android.gms.measurement.internal.u7 r0 = r3.f73257c
            if (r0 != 0) goto L_0x0030
            com.google.android.gms.measurement.internal.g5 r4 = r3.f74136a
            com.google.android.gms.measurement.internal.u3 r4 = r4.mo86903d()
            com.google.android.gms.measurement.internal.s3 r4 = r4.mo87495x()
            java.lang.String r5 = "setCurrentScreen cannot be called while no activity active"
            r4.mo87463a(r5)
            return
        L_0x0030:
            java.util.Map r1 = r3.f73260f
            java.lang.Object r1 = r1.get(r4)
            if (r1 != 0) goto L_0x0048
            com.google.android.gms.measurement.internal.g5 r4 = r3.f74136a
            com.google.android.gms.measurement.internal.u3 r4 = r4.mo86903d()
            com.google.android.gms.measurement.internal.s3 r4 = r4.mo87495x()
            java.lang.String r5 = "setCurrentScreen must be called with an activity in the activity lifecycle"
            r4.mo87463a(r5)
            return
        L_0x0048:
            if (r6 != 0) goto L_0x0054
            java.lang.Class r6 = r4.getClass()
            java.lang.String r1 = "Activity"
            java.lang.String r6 = r3.mo86923t(r6, r1)
        L_0x0054:
            java.lang.String r1 = r0.f73994b
            boolean r1 = com.google.android.gms.measurement.internal.C30915v7.m124274a(r1, r6)
            java.lang.String r0 = r0.f73993a
            boolean r0 = com.google.android.gms.measurement.internal.C30915v7.m124274a(r0, r5)
            if (r1 == 0) goto L_0x0075
            if (r0 != 0) goto L_0x0065
            goto L_0x0075
        L_0x0065:
            com.google.android.gms.measurement.internal.g5 r4 = r3.f74136a
            com.google.android.gms.measurement.internal.u3 r4 = r4.mo86903d()
            com.google.android.gms.measurement.internal.s3 r4 = r4.mo87495x()
            java.lang.String r5 = "setCurrentScreen cannot be called with the same class and name"
            r4.mo87463a(r5)
            return
        L_0x0075:
            r0 = 100
            if (r5 == 0) goto L_0x00a3
            int r1 = r5.length()
            if (r1 <= 0) goto L_0x008b
            int r1 = r5.length()
            com.google.android.gms.measurement.internal.g5 r2 = r3.f74136a
            r2.mo87130z()
            if (r1 > r0) goto L_0x008b
            goto L_0x00a3
        L_0x008b:
            com.google.android.gms.measurement.internal.g5 r4 = r3.f74136a
            com.google.android.gms.measurement.internal.u3 r4 = r4.mo86903d()
            com.google.android.gms.measurement.internal.s3 r4 = r4.mo87495x()
            int r5 = r5.length()
            java.lang.String r6 = "Invalid screen name length in setCurrentScreen. Length"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4.mo87464b(r6, r5)
            return
        L_0x00a3:
            if (r6 == 0) goto L_0x00cf
            int r1 = r6.length()
            if (r1 <= 0) goto L_0x00b7
            int r1 = r6.length()
            com.google.android.gms.measurement.internal.g5 r2 = r3.f74136a
            r2.mo87130z()
            if (r1 > r0) goto L_0x00b7
            goto L_0x00cf
        L_0x00b7:
            com.google.android.gms.measurement.internal.g5 r4 = r3.f74136a
            com.google.android.gms.measurement.internal.u3 r4 = r4.mo86903d()
            com.google.android.gms.measurement.internal.s3 r4 = r4.mo87495x()
            int r5 = r6.length()
            java.lang.String r6 = "Invalid class name length in setCurrentScreen. Length"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4.mo87464b(r6, r5)
            return
        L_0x00cf:
            com.google.android.gms.measurement.internal.g5 r0 = r3.f74136a
            com.google.android.gms.measurement.internal.u3 r0 = r0.mo86903d()
            com.google.android.gms.measurement.internal.s3 r0 = r0.mo87493v()
            if (r5 != 0) goto L_0x00de
            java.lang.String r1 = "null"
            goto L_0x00df
        L_0x00de:
            r1 = r5
        L_0x00df:
            java.lang.String r2 = "Setting current screen to name, class"
            r0.mo87465c(r2, r1, r6)
            com.google.android.gms.measurement.internal.u7 r0 = new com.google.android.gms.measurement.internal.u7
            com.google.android.gms.measurement.internal.g5 r1 = r3.f74136a
            com.google.android.gms.measurement.internal.ua r1 = r1.mo87110N()
            long r1 = r1.mo87541t0()
            r0.<init>(r5, r6, r1)
            java.util.Map r5 = r3.f73260f
            r5.put(r4, r0)
            r5 = 1
            r3.mo86918G(r4, r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C30682c8.mo86915D(android.app.Activity, java.lang.String, java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0031, code lost:
        if (r2 > 100) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0063, code lost:
        if (r4 > 100) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00c1, code lost:
        r0 = r12.f74136a.mo86903d().mo87493v();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00cb, code lost:
        if (r3 != null) goto L_0x00d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00cd, code lost:
        r1 = "null";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00d0, code lost:
        r1 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00d1, code lost:
        if (r4 != null) goto L_0x00d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00d3, code lost:
        r2 = "null";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00d6, code lost:
        r2 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00d7, code lost:
        r0.mo87465c("Logging screen view with name, class", r1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00de, code lost:
        if (r12.f73257c != null) goto L_0x00e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00e0, code lost:
        r0 = r12.f73258d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00e3, code lost:
        r0 = r12.f73257c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00e5, code lost:
        r2 = new com.google.android.gms.measurement.internal.C30903u7(r3, r4, r12.f74136a.mo87110N().mo87541t0(), true, r14);
        r12.f73257c = r2;
        r12.f73258d = r0;
        r12.f73263i = r2;
        r12.f74136a.mo86904f().mo86950z(new com.google.android.gms.measurement.internal.C30927w7(r12, r13, r2, r0, r12.f74136a.mo86900a().mo134770c()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x011a, code lost:
        return;
     */
    /* renamed from: E */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo86916E(android.os.Bundle r13, long r14) {
        /*
            r12 = this;
            java.lang.Object r0 = r12.f73266l
            monitor-enter(r0)
            boolean r1 = r12.f73265k     // Catch:{ all -> 0x011b }
            if (r1 != 0) goto L_0x0018
            com.google.android.gms.measurement.internal.g5 r13 = r12.f74136a     // Catch:{ all -> 0x011b }
            com.google.android.gms.measurement.internal.u3 r13 = r13.mo86903d()     // Catch:{ all -> 0x011b }
            com.google.android.gms.measurement.internal.s3 r13 = r13.mo87495x()     // Catch:{ all -> 0x011b }
            java.lang.String r14 = "Cannot log screen view event when the app is in the background."
            r13.mo87463a(r14)     // Catch:{ all -> 0x011b }
            monitor-exit(r0)     // Catch:{ all -> 0x011b }
            return
        L_0x0018:
            java.lang.String r1 = "screen_name"
            java.lang.String r3 = r13.getString(r1)     // Catch:{ all -> 0x011b }
            r1 = 100
            if (r3 == 0) goto L_0x004c
            int r2 = r3.length()     // Catch:{ all -> 0x011b }
            if (r2 <= 0) goto L_0x0033
            int r2 = r3.length()     // Catch:{ all -> 0x011b }
            com.google.android.gms.measurement.internal.g5 r4 = r12.f74136a     // Catch:{ all -> 0x011b }
            r4.mo87130z()     // Catch:{ all -> 0x011b }
            if (r2 <= r1) goto L_0x004c
        L_0x0033:
            com.google.android.gms.measurement.internal.g5 r13 = r12.f74136a     // Catch:{ all -> 0x011b }
            com.google.android.gms.measurement.internal.u3 r13 = r13.mo86903d()     // Catch:{ all -> 0x011b }
            com.google.android.gms.measurement.internal.s3 r13 = r13.mo87495x()     // Catch:{ all -> 0x011b }
            java.lang.String r14 = "Invalid screen name length for screen view. Length"
            int r15 = r3.length()     // Catch:{ all -> 0x011b }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)     // Catch:{ all -> 0x011b }
            r13.mo87464b(r14, r15)     // Catch:{ all -> 0x011b }
            monitor-exit(r0)     // Catch:{ all -> 0x011b }
            return
        L_0x004c:
            java.lang.String r2 = "screen_class"
            java.lang.String r2 = r13.getString(r2)     // Catch:{ all -> 0x011b }
            if (r2 == 0) goto L_0x007e
            int r4 = r2.length()     // Catch:{ all -> 0x011b }
            if (r4 <= 0) goto L_0x0065
            int r4 = r2.length()     // Catch:{ all -> 0x011b }
            com.google.android.gms.measurement.internal.g5 r5 = r12.f74136a     // Catch:{ all -> 0x011b }
            r5.mo87130z()     // Catch:{ all -> 0x011b }
            if (r4 <= r1) goto L_0x007e
        L_0x0065:
            com.google.android.gms.measurement.internal.g5 r13 = r12.f74136a     // Catch:{ all -> 0x011b }
            com.google.android.gms.measurement.internal.u3 r13 = r13.mo86903d()     // Catch:{ all -> 0x011b }
            com.google.android.gms.measurement.internal.s3 r13 = r13.mo87495x()     // Catch:{ all -> 0x011b }
            java.lang.String r14 = "Invalid screen class length for screen view. Length"
            int r15 = r2.length()     // Catch:{ all -> 0x011b }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)     // Catch:{ all -> 0x011b }
            r13.mo87464b(r14, r15)     // Catch:{ all -> 0x011b }
            monitor-exit(r0)     // Catch:{ all -> 0x011b }
            return
        L_0x007e:
            if (r2 != 0) goto L_0x0093
            android.app.Activity r1 = r12.f73261g     // Catch:{ all -> 0x011b }
            if (r1 == 0) goto L_0x008f
            java.lang.Class r1 = r1.getClass()     // Catch:{ all -> 0x011b }
            java.lang.String r2 = "Activity"
            java.lang.String r1 = r12.mo86923t(r1, r2)     // Catch:{ all -> 0x011b }
            goto L_0x0091
        L_0x008f:
            java.lang.String r1 = "Activity"
        L_0x0091:
            r4 = r1
            goto L_0x0094
        L_0x0093:
            r4 = r2
        L_0x0094:
            com.google.android.gms.measurement.internal.u7 r1 = r12.f73257c     // Catch:{ all -> 0x011b }
            boolean r2 = r12.f73262h     // Catch:{ all -> 0x011b }
            if (r2 == 0) goto L_0x00c0
            if (r1 == 0) goto L_0x00c0
            r2 = 0
            r12.f73262h = r2     // Catch:{ all -> 0x011b }
            java.lang.String r2 = r1.f73994b     // Catch:{ all -> 0x011b }
            boolean r2 = com.google.android.gms.measurement.internal.C30915v7.m124274a(r2, r4)     // Catch:{ all -> 0x011b }
            java.lang.String r1 = r1.f73993a     // Catch:{ all -> 0x011b }
            boolean r1 = com.google.android.gms.measurement.internal.C30915v7.m124274a(r1, r3)     // Catch:{ all -> 0x011b }
            if (r2 == 0) goto L_0x00c0
            if (r1 == 0) goto L_0x00c0
            com.google.android.gms.measurement.internal.g5 r13 = r12.f74136a     // Catch:{ all -> 0x011b }
            com.google.android.gms.measurement.internal.u3 r13 = r13.mo86903d()     // Catch:{ all -> 0x011b }
            com.google.android.gms.measurement.internal.s3 r13 = r13.mo87495x()     // Catch:{ all -> 0x011b }
            java.lang.String r14 = "Ignoring call to log screen view event with duplicate parameters."
            r13.mo87463a(r14)     // Catch:{ all -> 0x011b }
            monitor-exit(r0)     // Catch:{ all -> 0x011b }
            return
        L_0x00c0:
            monitor-exit(r0)     // Catch:{ all -> 0x011b }
            com.google.android.gms.measurement.internal.g5 r0 = r12.f74136a
            com.google.android.gms.measurement.internal.u3 r0 = r0.mo86903d()
            com.google.android.gms.measurement.internal.s3 r0 = r0.mo87493v()
            if (r3 != 0) goto L_0x00d0
            java.lang.String r1 = "null"
            goto L_0x00d1
        L_0x00d0:
            r1 = r3
        L_0x00d1:
            if (r4 != 0) goto L_0x00d6
            java.lang.String r2 = "null"
            goto L_0x00d7
        L_0x00d6:
            r2 = r4
        L_0x00d7:
            java.lang.String r5 = "Logging screen view with name, class"
            r0.mo87465c(r5, r1, r2)
            com.google.android.gms.measurement.internal.u7 r0 = r12.f73257c
            if (r0 != 0) goto L_0x00e3
            com.google.android.gms.measurement.internal.u7 r0 = r12.f73258d
            goto L_0x00e5
        L_0x00e3:
            com.google.android.gms.measurement.internal.u7 r0 = r12.f73257c
        L_0x00e5:
            com.google.android.gms.measurement.internal.u7 r1 = new com.google.android.gms.measurement.internal.u7
            com.google.android.gms.measurement.internal.g5 r2 = r12.f74136a
            com.google.android.gms.measurement.internal.ua r2 = r2.mo87110N()
            long r5 = r2.mo87541t0()
            r7 = 1
            r2 = r1
            r8 = r14
            r2.<init>(r3, r4, r5, r7, r8)
            r12.f73257c = r1
            r12.f73258d = r0
            r12.f73263i = r1
            com.google.android.gms.measurement.internal.g5 r14 = r12.f74136a
            com.google.android.gms.common.util.g r14 = r14.mo86900a()
            long r10 = r14.mo134770c()
            com.google.android.gms.measurement.internal.g5 r14 = r12.f74136a
            com.google.android.gms.measurement.internal.d5 r14 = r14.mo86904f()
            com.google.android.gms.measurement.internal.w7 r15 = new com.google.android.gms.measurement.internal.w7
            r5 = r15
            r6 = r12
            r7 = r13
            r8 = r1
            r9 = r0
            r5.<init>(r6, r7, r8, r9, r10)
            r14.mo86950z(r15)
            return
        L_0x011b:
            r13 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x011b }
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C30682c8.mo86916E(android.os.Bundle, long):void");
    }

    @C0353k0
    /* renamed from: F */
    public final C30903u7 mo86917F(@C0359n0 Activity activity) {
        C40843u.m166202l(activity);
        C30903u7 u7Var = (C30903u7) this.f73260f.get(activity);
        if (u7Var == null) {
            C30903u7 u7Var2 = new C30903u7((String) null, mo86923t(activity.getClass(), "Activity"), this.f74136a.mo87110N().mo87541t0());
            this.f73260f.put(activity, u7Var2);
            u7Var = u7Var2;
        }
        if (this.f73263i != null) {
            return this.f73263i;
        }
        return u7Var;
    }

    @C0353k0
    /* renamed from: G */
    public final void mo86918G(Activity activity, C30903u7 u7Var, boolean z) {
        C30903u7 u7Var2;
        C30903u7 u7Var3;
        String str;
        C30903u7 u7Var4 = u7Var;
        if (this.f73257c == null) {
            u7Var2 = this.f73258d;
        } else {
            u7Var2 = this.f73257c;
        }
        C30903u7 u7Var5 = u7Var2;
        if (u7Var4.f73994b == null) {
            if (activity != null) {
                str = mo86923t(activity.getClass(), "Activity");
            } else {
                str = null;
            }
            u7Var3 = new C30903u7(u7Var4.f73993a, str, u7Var4.f73995c, u7Var4.f73997e, u7Var4.f73998f);
        } else {
            u7Var3 = u7Var4;
        }
        this.f73258d = this.f73257c;
        this.f73257c = u7Var3;
        this.f74136a.mo86904f().mo86950z(new C30939x7(this, u7Var3, u7Var5, this.f74136a.mo86900a().mo134770c(), z));
    }

    /* renamed from: n */
    public final boolean mo86895n() {
        return false;
    }

    @C0348i1
    /* renamed from: o */
    public final void mo86919o(C30903u7 u7Var, C30903u7 u7Var2, long j, boolean z, Bundle bundle) {
        boolean z2;
        Bundle bundle2;
        String str;
        long j2;
        long j3;
        C30903u7 u7Var3 = u7Var;
        C30903u7 u7Var4 = u7Var2;
        long j4 = j;
        Bundle bundle3 = bundle;
        mo86866h();
        boolean z3 = false;
        if (u7Var4 == null || u7Var4.f73995c != u7Var3.f73995c || !C30915v7.m124274a(u7Var4.f73994b, u7Var3.f73994b) || !C30915v7.m124274a(u7Var4.f73993a, u7Var3.f73993a)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z && this.f73259e != null) {
            z3 = true;
        }
        if (z2) {
            if (bundle3 != null) {
                bundle2 = new Bundle(bundle3);
            } else {
                bundle2 = new Bundle();
            }
            Bundle bundle4 = bundle2;
            C30906ua.m124218y(u7Var3, bundle4, true);
            if (u7Var4 != null) {
                String str2 = u7Var4.f73993a;
                if (str2 != null) {
                    bundle4.putString("_pn", str2);
                }
                String str3 = u7Var4.f73994b;
                if (str3 != null) {
                    bundle4.putString("_pc", str3);
                }
                bundle4.putLong("_pi", u7Var4.f73995c);
            }
            if (z3) {
                C30881s9 s9Var = this.f74136a.mo87109M().f74006e;
                long j5 = j4 - s9Var.f73952b;
                s9Var.f73952b = j4;
                if (j5 > 0) {
                    this.f74136a.mo87110N().mo87545w(bundle4, j5);
                }
            }
            if (!this.f74136a.mo87130z().mo87072D()) {
                bundle4.putLong("_mst", 1);
            }
            if (true != u7Var3.f73997e) {
                str = "auto";
            } else {
                str = FirebaseMessaging.f80405r;
            }
            String str4 = str;
            long a = this.f74136a.mo86900a().mo134768a();
            if (u7Var3.f73997e) {
                j3 = a;
                long j6 = u7Var3.f73998f;
                if (j6 != 0) {
                    j2 = j6;
                    this.f74136a.mo87105I().mo87335v(str4, "_vs", j2, bundle4);
                }
            } else {
                j3 = a;
            }
            j2 = j3;
            this.f74136a.mo87105I().mo87335v(str4, "_vs", j2, bundle4);
        }
        if (z3) {
            mo86920p(this.f73259e, true, j4);
        }
        this.f73259e = u7Var3;
        if (u7Var3.f73997e) {
            this.f73264j = u7Var3;
        }
        this.f74136a.mo87108L().mo87043u(u7Var3);
    }

    @C0348i1
    /* renamed from: p */
    public final void mo86920p(C30903u7 u7Var, boolean z, long j) {
        boolean z2;
        this.f74136a.mo87129y().mo87618n(this.f74136a.mo86900a().mo134770c());
        if (u7Var == null || !u7Var.f73996d) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (this.f74136a.mo87109M().f74006e.mo87474d(z2, z, j) && u7Var != null) {
            u7Var.f73996d = false;
        }
    }

    /* renamed from: r */
    public final C30903u7 mo86921r() {
        return this.f73257c;
    }

    @C0348i1
    /* renamed from: s */
    public final C30903u7 mo86922s(boolean z) {
        mo86890i();
        mo86866h();
        if (!z) {
            return this.f73259e;
        }
        C30903u7 u7Var = this.f73259e;
        if (u7Var != null) {
            return u7Var;
        }
        return this.f73264j;
    }

    @C40974d0
    /* renamed from: t */
    public final String mo86923t(Class cls, String str) {
        String str2;
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            return "Activity";
        }
        String[] split = canonicalName.split("\\.");
        int length = split.length;
        if (length > 0) {
            str2 = split[length - 1];
        } else {
            str2 = "";
        }
        int length2 = str2.length();
        this.f74136a.mo87130z();
        if (length2 <= 100) {
            return str2;
        }
        this.f74136a.mo87130z();
        return str2.substring(0, 100);
    }

    @C0353k0
    /* renamed from: y */
    public final void mo86924y(Activity activity, Bundle bundle) {
        Bundle bundle2;
        if (this.f74136a.mo87130z().mo87072D() && bundle != null && (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) != null) {
            this.f73260f.put(activity, new C30903u7(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong("id")));
        }
    }

    @C0353k0
    /* renamed from: z */
    public final void mo86925z(Activity activity) {
        synchronized (this.f73266l) {
            if (activity == this.f73261g) {
                this.f73261g = null;
            }
        }
        if (this.f74136a.mo87130z().mo87072D()) {
            this.f73260f.remove(activity);
        }
    }
}
