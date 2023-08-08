package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.NetworkOnMainThreadException;
import android.os.RemoteException;
import androidx.annotation.C0323b0;
import androidx.annotation.C0348i1;
import androidx.annotation.C0359n0;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.common.util.C40979g;
import com.google.android.gms.common.util.C40985k;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.measurement.api.C30638a;
import com.google.android.gms.measurement.internal.C30745h6;
import com.google.android.gms.measurement.internal.C30891t7;
import com.google.android.gms.measurement.internal.C30948y4;
import com.google.firebase.C33262n;
import com.urbanairship.util.RetryingExecutor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.measurement.h3 */
public final class C41979h3 {

    /* renamed from: j */
    public static volatile C41979h3 f106165j;

    /* renamed from: a */
    public final String f106166a;

    /* renamed from: b */
    public final C40979g f106167b;

    /* renamed from: c */
    public final ExecutorService f106168c;

    /* renamed from: d */
    public final C30638a f106169d;
    @C0323b0("listenerList")

    /* renamed from: e */
    public final List f106170e;

    /* renamed from: f */
    public int f106171f;

    /* renamed from: g */
    public boolean f106172g;

    /* renamed from: h */
    public final String f106173h;

    /* renamed from: i */
    public volatile C41923e1 f106174i;

    public C41979h3(Context context, String str, String str2, String str3, Bundle bundle) {
        if (str == null || !mo136930w(str2, str3)) {
            this.f106166a = "FA";
        } else {
            this.f106166a = str;
        }
        this.f106167b = C40985k.m166636d();
        C42270y0.m171160a();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new C42014j2(this));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f106168c = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.f106169d = new C30638a(this);
        this.f106170e = new ArrayList();
        try {
            if (C30891t7.m124173c(context, C33262n.f80886i, C30948y4.m124319a(context)) != null && !mo136926s()) {
                this.f106173h = null;
                this.f106172g = true;
                return;
            }
        } catch (IllegalStateException unused) {
        }
        if (!mo136930w(str2, str3)) {
            this.f106173h = "fa";
        } else {
            this.f106173h = str2;
        }
        mo136929v(new C42271y1(this, str2, str3, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application != null) {
            application.registerActivityLifecycleCallbacks(new C41961g3(this));
        }
    }

    /* renamed from: D */
    public static C41979h3 m170032D(Context context, String str, String str2, String str3, Bundle bundle) {
        C40843u.m166202l(context);
        if (f106165j == null) {
            synchronized (C41979h3.class) {
                if (f106165j == null) {
                    f106165j = new C41979h3(context, str, str2, str3, bundle);
                }
            }
        }
        return f106165j;
    }

    /* renamed from: A */
    public final C30638a mo136893A() {
        return this.f106169d;
    }

    /* renamed from: C */
    public final C41923e1 mo136894C(Context context, boolean z) {
        try {
            return C41905d1.asInterface(DynamiteModule.m166879e(context, DynamiteModule.f104322i, ModuleDescriptor.MODULE_ID).mo134842d("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
        } catch (DynamiteModule.LoadingException e) {
            mo136927t(e, true, false);
            return null;
        }
    }

    @C0348i1
    /* renamed from: E */
    public final Long mo136895E() {
        C41851a1 a1Var = new C41851a1();
        mo136929v(new C42068m2(this, a1Var));
        return a1Var.mo136497O0(RetryingExecutor.f26394v);
    }

    /* renamed from: F */
    public final Object mo136896F(int i) {
        C41851a1 a1Var = new C41851a1();
        mo136929v(new C42085n2(this, a1Var, i));
        return C41851a1.m169583E8(a1Var.mo136496H0(15000), Object.class);
    }

    /* renamed from: H */
    public final String mo136897H() {
        return this.f106173h;
    }

    @C0348i1
    /* renamed from: I */
    public final String mo136898I() {
        C41851a1 a1Var = new C41851a1();
        mo136929v(new C42050l2(this, a1Var));
        return a1Var.mo136498T6(RetryingExecutor.f26394v);
    }

    /* renamed from: J */
    public final String mo136899J() {
        C41851a1 a1Var = new C41851a1();
        mo136929v(new C41888c2(this, a1Var));
        return a1Var.mo136498T6(50);
    }

    /* renamed from: K */
    public final String mo136900K() {
        C41851a1 a1Var = new C41851a1();
        mo136929v(new C41942f2(this, a1Var));
        return a1Var.mo136498T6(500);
    }

    /* renamed from: L */
    public final String mo136901L() {
        C41851a1 a1Var = new C41851a1();
        mo136929v(new C41924e2(this, a1Var));
        return a1Var.mo136498T6(500);
    }

    /* renamed from: M */
    public final String mo136902M() {
        C41851a1 a1Var = new C41851a1();
        mo136929v(new C41870b2(this, a1Var));
        return a1Var.mo136498T6(500);
    }

    /* renamed from: N */
    public final List mo136903N(String str, String str2) {
        C41851a1 a1Var = new C41851a1();
        mo136929v(new C42135q1(this, str, str2, a1Var));
        List list = (List) C41851a1.m169583E8(a1Var.mo136496H0(5000), List.class);
        if (list == null) {
            return Collections.emptyList();
        }
        return list;
    }

    /* renamed from: O */
    public final Map mo136904O(String str, String str2, boolean z) {
        C41851a1 a1Var = new C41851a1();
        mo136929v(new C41960g2(this, str, str2, z, a1Var));
        Bundle H0 = a1Var.mo136496H0(5000);
        if (H0 == null || H0.size() == 0) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap(H0.size());
        for (String next : H0.keySet()) {
            Object obj = H0.get(next);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                hashMap.put(next, obj);
            }
        }
        return hashMap;
    }

    /* renamed from: S */
    public final void mo136905S(String str) {
        mo136929v(new C42288z1(this, str));
    }

    /* renamed from: T */
    public final void mo136906T(String str, String str2, Bundle bundle) {
        mo136929v(new C42118p1(this, str, str2, bundle));
    }

    /* renamed from: U */
    public final void mo136907U(String str) {
        mo136929v(new C41852a2(this, str));
    }

    /* renamed from: V */
    public final void mo136908V(@C0359n0 String str, Bundle bundle) {
        mo136928u((String) null, str, bundle, false, true, (Long) null);
    }

    /* renamed from: W */
    public final void mo136909W(String str, String str2, Bundle bundle) {
        mo136928u(str, str2, bundle, true, true, (Long) null);
    }

    /* renamed from: a */
    public final void mo136910a(String str, String str2, Bundle bundle, long j) {
        mo136928u(str, str2, bundle, true, false, Long.valueOf(j));
    }

    /* renamed from: b */
    public final void mo136911b(int i, String str, Object obj, Object obj2, Object obj3) {
        mo136929v(new C41978h2(this, false, 5, str, obj, (Object) null, (Object) null));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0036, code lost:
        if (r4.f106174i == null) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r4.f106174i.registerOnMeasurementEventListener(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003e, code lost:
        mo136929v(new com.google.android.gms.internal.measurement.C42153r2(r4, r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0046, code lost:
        return;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo136912c(com.google.android.gms.measurement.internal.C30758i6 r5) {
        /*
            r4 = this;
            com.google.android.gms.common.internal.C40843u.m166202l(r5)
            java.util.List r0 = r4.f106170e
            monitor-enter(r0)
            r1 = 0
        L_0x0007:
            java.util.List r2 = r4.f106170e     // Catch:{ all -> 0x0047 }
            int r2 = r2.size()     // Catch:{ all -> 0x0047 }
            if (r1 >= r2) goto L_0x0024
            java.util.List r2 = r4.f106170e     // Catch:{ all -> 0x0047 }
            java.lang.Object r2 = r2.get(r1)     // Catch:{ all -> 0x0047 }
            android.util.Pair r2 = (android.util.Pair) r2     // Catch:{ all -> 0x0047 }
            java.lang.Object r2 = r2.first     // Catch:{ all -> 0x0047 }
            boolean r2 = r5.equals(r2)     // Catch:{ all -> 0x0047 }
            if (r2 == 0) goto L_0x0021
            monitor-exit(r0)     // Catch:{ all -> 0x0047 }
            return
        L_0x0021:
            int r1 = r1 + 1
            goto L_0x0007
        L_0x0024:
            com.google.android.gms.internal.measurement.x2 r1 = new com.google.android.gms.internal.measurement.x2     // Catch:{ all -> 0x0047 }
            r1.<init>(r5)     // Catch:{ all -> 0x0047 }
            java.util.List r2 = r4.f106170e     // Catch:{ all -> 0x0047 }
            android.util.Pair r3 = new android.util.Pair     // Catch:{ all -> 0x0047 }
            r3.<init>(r5, r1)     // Catch:{ all -> 0x0047 }
            r2.add(r3)     // Catch:{ all -> 0x0047 }
            monitor-exit(r0)     // Catch:{ all -> 0x0047 }
            com.google.android.gms.internal.measurement.e1 r5 = r4.f106174i
            if (r5 == 0) goto L_0x003e
            com.google.android.gms.internal.measurement.e1 r5 = r4.f106174i     // Catch:{ BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException -> 0x003e }
            r5.registerOnMeasurementEventListener(r1)     // Catch:{ BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException -> 0x003e }
            return
        L_0x003e:
            com.google.android.gms.internal.measurement.r2 r5 = new com.google.android.gms.internal.measurement.r2
            r5.<init>(r4, r1)
            r4.mo136929v(r5)
            return
        L_0x0047:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0047 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C41979h3.mo136912c(com.google.android.gms.measurement.internal.i6):void");
    }

    /* renamed from: d */
    public final void mo136913d() {
        mo136929v(new C42237w1(this));
    }

    /* renamed from: e */
    public final void mo136914e(Bundle bundle) {
        mo136929v(new C42101o1(this, bundle));
    }

    /* renamed from: f */
    public final void mo136915f(Bundle bundle) {
        mo136929v(new C42203u1(this, bundle));
    }

    /* renamed from: g */
    public final void mo136916g(Bundle bundle) {
        mo136929v(new C42220v1(this, bundle));
    }

    /* renamed from: h */
    public final void mo136917h(Activity activity, String str, String str2) {
        mo136929v(new C42169s1(this, activity, str, str2));
    }

    /* renamed from: i */
    public final void mo136918i(boolean z) {
        mo136929v(new C42102o2(this, z));
    }

    /* renamed from: j */
    public final void mo136919j(Bundle bundle) {
        mo136929v(new C42119p2(this, bundle));
    }

    /* renamed from: k */
    public final void mo136920k(C30745h6 h6Var) {
        C42238w2 w2Var = new C42238w2(h6Var);
        if (this.f106174i != null) {
            try {
                this.f106174i.setEventInterceptor(w2Var);
                return;
            } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
            }
        }
        mo136929v(new C42136q2(this, w2Var));
    }

    /* renamed from: l */
    public final void mo136921l(Boolean bool) {
        mo136929v(new C42186t1(this, bool));
    }

    /* renamed from: m */
    public final void mo136922m(long j) {
        mo136929v(new C42254x1(this, j));
    }

    /* renamed from: n */
    public final void mo136923n(String str) {
        mo136929v(new C42152r1(this, str));
    }

    /* renamed from: o */
    public final void mo136924o(String str, String str2, Object obj, boolean z) {
        mo136929v(new C42204u2(this, str, str2, obj, z));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003c, code lost:
        if (r3.f106174i == null) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r3.f106174i.unregisterOnMeasurementEventListener(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0043, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0044, code lost:
        mo136929v(new com.google.android.gms.internal.measurement.C42170s2(r3, r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004c, code lost:
        return;
     */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo136925p(com.google.android.gms.measurement.internal.C30758i6 r4) {
        /*
            r3 = this;
            com.google.android.gms.common.internal.C40843u.m166202l(r4)
            java.util.List r0 = r3.f106170e
            monitor-enter(r0)
            r1 = 0
        L_0x0007:
            java.util.List r2 = r3.f106170e     // Catch:{ all -> 0x004d }
            int r2 = r2.size()     // Catch:{ all -> 0x004d }
            if (r1 >= r2) goto L_0x002b
            java.util.List r2 = r3.f106170e     // Catch:{ all -> 0x004d }
            java.lang.Object r2 = r2.get(r1)     // Catch:{ all -> 0x004d }
            android.util.Pair r2 = (android.util.Pair) r2     // Catch:{ all -> 0x004d }
            java.lang.Object r2 = r2.first     // Catch:{ all -> 0x004d }
            boolean r2 = r4.equals(r2)     // Catch:{ all -> 0x004d }
            if (r2 == 0) goto L_0x0028
            java.util.List r4 = r3.f106170e     // Catch:{ all -> 0x004d }
            java.lang.Object r4 = r4.get(r1)     // Catch:{ all -> 0x004d }
            android.util.Pair r4 = (android.util.Pair) r4     // Catch:{ all -> 0x004d }
            goto L_0x002c
        L_0x0028:
            int r1 = r1 + 1
            goto L_0x0007
        L_0x002b:
            r4 = 0
        L_0x002c:
            if (r4 != 0) goto L_0x0030
            monitor-exit(r0)     // Catch:{ all -> 0x004d }
            return
        L_0x0030:
            java.util.List r1 = r3.f106170e     // Catch:{ all -> 0x004d }
            r1.remove(r4)     // Catch:{ all -> 0x004d }
            java.lang.Object r4 = r4.second     // Catch:{ all -> 0x004d }
            com.google.android.gms.internal.measurement.x2 r4 = (com.google.android.gms.internal.measurement.C42255x2) r4     // Catch:{ all -> 0x004d }
            monitor-exit(r0)     // Catch:{ all -> 0x004d }
            com.google.android.gms.internal.measurement.e1 r0 = r3.f106174i
            if (r0 == 0) goto L_0x0044
            com.google.android.gms.internal.measurement.e1 r0 = r3.f106174i     // Catch:{ BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException -> 0x0044 }
            r0.unregisterOnMeasurementEventListener(r4)     // Catch:{ BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException -> 0x0044 }
            return
        L_0x0044:
            com.google.android.gms.internal.measurement.s2 r0 = new com.google.android.gms.internal.measurement.s2
            r0.<init>(r3, r4)
            r3.mo136929v(r0)
            return
        L_0x004d:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x004d }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C41979h3.mo136925p(com.google.android.gms.measurement.internal.i6):void");
    }

    /* renamed from: s */
    public final boolean mo136926s() {
        try {
            Class.forName("com.google.firebase.analytics.FirebaseAnalytics", false, C41979h3.class.getClassLoader());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: t */
    public final void mo136927t(Exception exc, boolean z, boolean z2) {
        this.f106172g |= z;
        if (!z && z2) {
            mo136911b(5, "Error with data collection. Data lost.", exc, (Object) null, (Object) null);
        }
    }

    /* renamed from: u */
    public final void mo136928u(String str, String str2, Bundle bundle, boolean z, boolean z2, Long l) {
        mo136929v(new C42187t2(this, l, str, str2, bundle, z, z2));
    }

    /* renamed from: v */
    public final void mo136929v(C42221v2 v2Var) {
        this.f106168c.execute(v2Var);
    }

    /* renamed from: w */
    public final boolean mo136930w(String str, String str2) {
        return (str2 == null || str == null || mo136926s()) ? false : true;
    }

    /* renamed from: x */
    public final int mo136931x(String str) {
        C41851a1 a1Var = new C41851a1();
        mo136929v(new C42032k2(this, str, a1Var));
        Integer num = (Integer) C41851a1.m169583E8(a1Var.mo136496H0(10000), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    /* renamed from: y */
    public final long mo136932y() {
        C41851a1 a1Var = new C41851a1();
        mo136929v(new C41906d2(this, a1Var));
        Long O0 = a1Var.mo136497O0(500);
        if (O0 != null) {
            return O0.longValue();
        }
        long nextLong = new Random(System.nanoTime() ^ this.f106167b.mo134768a()).nextLong();
        int i = this.f106171f + 1;
        this.f106171f = i;
        return nextLong + ((long) i);
    }

    /* renamed from: z */
    public final Bundle mo136933z(Bundle bundle, boolean z) {
        C41851a1 a1Var = new C41851a1();
        mo136929v(new C41996i2(this, bundle, a1Var));
        if (z) {
            return a1Var.mo136496H0(5000);
        }
        return null;
    }
}
