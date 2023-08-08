package com.google.firebase.perf.metrics;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.PowerManager;
import android.os.Process;
import android.view.ViewTreeObserver;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.Keep;
import androidx.appcompat.widget.C0696c;
import androidx.lifecycle.C19428i0;
import androidx.lifecycle.C19441m0;
import androidx.lifecycle.C19475v;
import androidx.lifecycle.Lifecycle;
import com.carrefour.fid.android.airship.util.C13758b;
import com.google.android.gms.common.util.C40974d0;
import com.google.firebase.C33033f;
import com.google.firebase.C33277p;
import com.google.firebase.installations.C33124s;
import com.google.firebase.perf.config.C33307a;
import com.google.firebase.perf.p049v1.ApplicationProcessState;
import com.google.firebase.perf.p049v1.TraceMetric;
import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.transport.C33424k;
import com.google.firebase.perf.util.C33431a;
import com.google.firebase.perf.util.Constants;
import com.google.firebase.perf.util.Timer;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class AppStartTrace implements Application.ActivityLifecycleCallbacks, C19475v {
    @C0359n0

    /* renamed from: N0 */
    public static final Timer f81050N0 = new C33431a().mo96901a();

    /* renamed from: O0 */
    public static final long f81051O0 = TimeUnit.MINUTES.toMicros(1);

    /* renamed from: P0 */
    public static final int f81052P0 = 0;

    /* renamed from: Q0 */
    public static final int f81053Q0 = 1;

    /* renamed from: R0 */
    public static volatile AppStartTrace f81054R0;

    /* renamed from: S0 */
    public static ExecutorService f81055S0;
    @C0363p0

    /* renamed from: E0 */
    public Timer f81056E0;

    /* renamed from: F0 */
    public Timer f81057F0;

    /* renamed from: G0 */
    public Timer f81058G0;

    /* renamed from: H0 */
    public Timer f81059H0;

    /* renamed from: I0 */
    public PerfSession f81060I0;

    /* renamed from: J0 */
    public boolean f81061J0;

    /* renamed from: K0 */
    public int f81062K0;

    /* renamed from: L0 */
    public final C33367b f81063L0;

    /* renamed from: M0 */
    public boolean f81064M0;

    /* renamed from: X */
    public Timer f81065X;

    /* renamed from: Y */
    public Timer f81066Y;

    /* renamed from: Z */
    public Timer f81067Z;

    /* renamed from: a */
    public boolean f81068a = false;

    /* renamed from: b */
    public final C33424k f81069b;

    /* renamed from: c */
    public final C33431a f81070c;

    /* renamed from: d */
    public final C33307a f81071d;

    /* renamed from: e */
    public final TraceMetric.C33480b f81072e;

    /* renamed from: f */
    public Context f81073f;

    /* renamed from: g */
    public WeakReference<Activity> f81074g;

    /* renamed from: v */
    public WeakReference<Activity> f81075v;

    /* renamed from: w */
    public boolean f81076w = false;
    @C0363p0

    /* renamed from: x */
    public final Timer f81077x;
    @C0363p0

    /* renamed from: y */
    public final Timer f81078y;

    /* renamed from: z */
    public Timer f81079z;

    /* renamed from: com.google.firebase.perf.metrics.AppStartTrace$b */
    public final class C33367b implements ViewTreeObserver.OnDrawListener {
        public C33367b() {
        }

        public void onDraw() {
            AppStartTrace.m134479j(AppStartTrace.this);
        }
    }

    /* renamed from: com.google.firebase.perf.metrics.AppStartTrace$c */
    public static class C33368c implements Runnable {

        /* renamed from: a */
        public final AppStartTrace f81081a;

        public C33368c(AppStartTrace appStartTrace) {
            this.f81081a = appStartTrace;
        }

        public void run() {
            if (this.f81081a.f81079z == null) {
                boolean unused = this.f81081a.f81061J0 = true;
            }
        }
    }

    public AppStartTrace(@C0359n0 C33424k kVar, @C0359n0 C33431a aVar, @C0359n0 C33307a aVar2, @C0359n0 ExecutorService executorService) {
        Timer timer = null;
        this.f81079z = null;
        this.f81065X = null;
        this.f81066Y = null;
        this.f81067Z = null;
        this.f81056E0 = null;
        this.f81057F0 = null;
        this.f81058G0 = null;
        this.f81059H0 = null;
        this.f81061J0 = false;
        this.f81062K0 = 0;
        this.f81063L0 = new C33367b();
        this.f81064M0 = false;
        this.f81069b = kVar;
        this.f81070c = aVar;
        this.f81071d = aVar2;
        f81055S0 = executorService;
        this.f81072e = TraceMetric.newBuilder().mo97215B0("_experiment_app_start_ttid");
        this.f81077x = Timer.m134805f(Process.getStartElapsedRealtime());
        C33277p pVar = (C33277p) C33033f.m133333p().mo95720l(C33277p.class);
        this.f81078y = pVar != null ? Timer.m134805f(pVar.mo94598b()) : timer;
    }

    /* renamed from: j */
    public static /* synthetic */ int m134479j(AppStartTrace appStartTrace) {
        int i = appStartTrace.f81062K0;
        appStartTrace.f81062K0 = i + 1;
        return i;
    }

    /* renamed from: m */
    public static AppStartTrace m134480m() {
        return f81054R0 != null ? f81054R0 : m134481n(C33424k.m134761l(), new C33431a());
    }

    @SuppressLint({"ThreadPoolCreation"})
    /* renamed from: n */
    public static AppStartTrace m134481n(C33424k kVar, C33431a aVar) {
        if (f81054R0 == null) {
            synchronized (AppStartTrace.class) {
                if (f81054R0 == null) {
                    f81054R0 = new AppStartTrace(kVar, aVar, C33307a.m134328h(), new ThreadPoolExecutor(0, 1, f81051O0 + 10, TimeUnit.SECONDS, new LinkedBlockingQueue()));
                }
            }
        }
        return f81054R0;
    }

    @Keep
    public static void setLauncherActivityOnCreateTime(String str) {
    }

    @Keep
    public static void setLauncherActivityOnResumeTime(String str) {
    }

    @Keep
    public static void setLauncherActivityOnStartTime(String str) {
    }

    /* renamed from: t */
    public static boolean m134482t(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService(C0696c.f2306r);
        if (activityManager == null) {
            return true;
        }
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return false;
        }
        String packageName = context.getPackageName();
        String str = packageName + C33124s.f80355c;
        for (ActivityManager.RunningAppProcessInfo next : runningAppProcesses) {
            if (next.importance == 100 && (next.processName.equals(packageName) || next.processName.startsWith(str))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: u */
    public static boolean m134483u(Context context) {
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            return true;
        }
        return powerManager.isInteractive();
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public /* synthetic */ void m134484w(TraceMetric.C33480b bVar) {
        this.f81069b.mo96863I((TraceMetric) bVar.mo100473g(), ApplicationProcessState.FOREGROUND_BACKGROUND);
    }

    /* renamed from: B */
    public final void mo96446B() {
        String str;
        if (this.f81059H0 == null) {
            this.f81059H0 = this.f81070c.mo96901a();
            this.f81072e.mo97230b0((TraceMetric) TraceMetric.newBuilder().mo97215B0("_experiment_onDrawFoQ").mo97247x0(mo96467s().mo96894e()).mo97248y0(mo96467s().mo96892d(this.f81059H0)).mo100473g());
            if (this.f81077x != null) {
                this.f81072e.mo97230b0((TraceMetric) TraceMetric.newBuilder().mo97215B0("_experiment_procStart_to_classLoad").mo97247x0(mo96467s().mo96894e()).mo97248y0(mo96467s().mo96892d(mo96453l())).mo100473g());
            }
            TraceMetric.C33480b bVar = this.f81072e;
            if (this.f81064M0) {
                str = C13758b.f33436b;
            } else {
                str = C13758b.f33438c;
            }
            bVar.mo97242r0("systemDeterminedForeground", str);
            this.f81072e.mo97241q0("onDrawCount", (long) this.f81062K0);
            this.f81072e.mo97226V(this.f81060I0.mo96776a());
            mo96469z(this.f81072e);
        }
    }

    /* renamed from: C */
    public final void mo96447C() {
        if (this.f81057F0 == null) {
            this.f81057F0 = this.f81070c.mo96901a();
            this.f81072e.mo97247x0(mo96467s().mo96894e()).mo97248y0(mo96467s().mo96892d(this.f81057F0));
            mo96469z(this.f81072e);
        }
    }

    /* renamed from: D */
    public final void mo96448D() {
        if (this.f81058G0 == null) {
            this.f81058G0 = this.f81070c.mo96901a();
            this.f81072e.mo97230b0((TraceMetric) TraceMetric.newBuilder().mo97215B0("_experiment_preDrawFoQ").mo97247x0(mo96467s().mo96894e()).mo97248y0(mo96467s().mo96892d(this.f81058G0)).mo100473g());
            mo96469z(this.f81072e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0036, code lost:
        return;
     */
    /* renamed from: E */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo96449E(@androidx.annotation.C0359n0 android.content.Context r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f81068a     // Catch:{ all -> 0x0037 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r2)
            return
        L_0x0007:
            androidx.lifecycle.w r0 = androidx.lifecycle.C19441m0.m90725l()     // Catch:{ all -> 0x0037 }
            androidx.lifecycle.Lifecycle r0 = r0.getLifecycle()     // Catch:{ all -> 0x0037 }
            r0.mo57464a(r2)     // Catch:{ all -> 0x0037 }
            android.content.Context r3 = r3.getApplicationContext()     // Catch:{ all -> 0x0037 }
            boolean r0 = r3 instanceof android.app.Application     // Catch:{ all -> 0x0037 }
            if (r0 == 0) goto L_0x0035
            r0 = r3
            android.app.Application r0 = (android.app.Application) r0     // Catch:{ all -> 0x0037 }
            r0.registerActivityLifecycleCallbacks(r2)     // Catch:{ all -> 0x0037 }
            boolean r0 = r2.f81064M0     // Catch:{ all -> 0x0037 }
            r1 = 1
            if (r0 != 0) goto L_0x002e
            boolean r0 = m134482t(r3)     // Catch:{ all -> 0x0037 }
            if (r0 == 0) goto L_0x002c
            goto L_0x002e
        L_0x002c:
            r0 = 0
            goto L_0x002f
        L_0x002e:
            r0 = r1
        L_0x002f:
            r2.f81064M0 = r0     // Catch:{ all -> 0x0037 }
            r2.f81068a = r1     // Catch:{ all -> 0x0037 }
            r2.f81073f = r3     // Catch:{ all -> 0x0037 }
        L_0x0035:
            monitor-exit(r2)
            return
        L_0x0037:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.metrics.AppStartTrace.mo96449E(android.content.Context):void");
    }

    @C40974d0
    /* renamed from: F */
    public void mo96450F() {
        this.f81061J0 = true;
    }

    /* renamed from: G */
    public synchronized void mo96451G() {
        if (this.f81068a) {
            C19441m0.m90725l().getLifecycle().mo57467d(this);
            ((Application) this.f81073f).unregisterActivityLifecycleCallbacks(this);
            this.f81068a = false;
        }
    }

    @C0363p0
    @C40974d0
    /* renamed from: k */
    public Activity mo96452k() {
        return this.f81075v.get();
    }

    @C0359n0
    /* renamed from: l */
    public final Timer mo96453l() {
        Timer timer = this.f81078y;
        if (timer != null) {
            return timer;
        }
        return f81050N0;
    }

    @C0363p0
    @C40974d0
    /* renamed from: o */
    public Activity mo96454o() {
        return this.f81074g.get();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0041, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void onActivityCreated(android.app.Activity r4, android.os.Bundle r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r5 = r3.f81061J0     // Catch:{ all -> 0x0042 }
            if (r5 != 0) goto L_0x0040
            com.google.firebase.perf.util.Timer r5 = r3.f81079z     // Catch:{ all -> 0x0042 }
            if (r5 == 0) goto L_0x000a
            goto L_0x0040
        L_0x000a:
            boolean r5 = r3.f81064M0     // Catch:{ all -> 0x0042 }
            r0 = 1
            if (r5 != 0) goto L_0x001a
            android.content.Context r5 = r3.f81073f     // Catch:{ all -> 0x0042 }
            boolean r5 = m134482t(r5)     // Catch:{ all -> 0x0042 }
            if (r5 == 0) goto L_0x0018
            goto L_0x001a
        L_0x0018:
            r5 = 0
            goto L_0x001b
        L_0x001a:
            r5 = r0
        L_0x001b:
            r3.f81064M0 = r5     // Catch:{ all -> 0x0042 }
            java.lang.ref.WeakReference r5 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x0042 }
            r5.<init>(r4)     // Catch:{ all -> 0x0042 }
            r3.f81074g = r5     // Catch:{ all -> 0x0042 }
            com.google.firebase.perf.util.a r4 = r3.f81070c     // Catch:{ all -> 0x0042 }
            com.google.firebase.perf.util.Timer r4 = r4.mo96901a()     // Catch:{ all -> 0x0042 }
            r3.f81079z = r4     // Catch:{ all -> 0x0042 }
            com.google.firebase.perf.util.Timer r4 = r3.mo96467s()     // Catch:{ all -> 0x0042 }
            com.google.firebase.perf.util.Timer r5 = r3.f81079z     // Catch:{ all -> 0x0042 }
            long r4 = r4.mo96892d(r5)     // Catch:{ all -> 0x0042 }
            long r1 = f81051O0     // Catch:{ all -> 0x0042 }
            int r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r4 <= 0) goto L_0x003e
            r3.f81076w = r0     // Catch:{ all -> 0x0042 }
        L_0x003e:
            monitor-exit(r3)
            return
        L_0x0040:
            monitor-exit(r3)
            return
        L_0x0042:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.metrics.AppStartTrace.onActivityCreated(android.app.Activity, android.os.Bundle):void");
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivityPaused(Activity activity) {
        if (!this.f81061J0 && !this.f81076w && this.f81071d.mo96367i()) {
            activity.findViewById(16908290).getViewTreeObserver().removeOnDrawListener(this.f81063L0);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x009e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00a0, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void onActivityResumed(android.app.Activity r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            boolean r0 = r5.f81061J0     // Catch:{ all -> 0x00a1 }
            if (r0 != 0) goto L_0x009f
            boolean r0 = r5.f81076w     // Catch:{ all -> 0x00a1 }
            if (r0 == 0) goto L_0x000b
            goto L_0x009f
        L_0x000b:
            com.google.firebase.perf.config.a r0 = r5.f81071d     // Catch:{ all -> 0x00a1 }
            boolean r0 = r0.mo96367i()     // Catch:{ all -> 0x00a1 }
            if (r0 == 0) goto L_0x0038
            r1 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r1 = r6.findViewById(r1)     // Catch:{ all -> 0x00a1 }
            android.view.ViewTreeObserver r2 = r1.getViewTreeObserver()     // Catch:{ all -> 0x00a1 }
            com.google.firebase.perf.metrics.AppStartTrace$b r3 = r5.f81063L0     // Catch:{ all -> 0x00a1 }
            r2.addOnDrawListener(r3)     // Catch:{ all -> 0x00a1 }
            com.google.firebase.perf.metrics.b r2 = new com.google.firebase.perf.metrics.b     // Catch:{ all -> 0x00a1 }
            r2.<init>(r5)     // Catch:{ all -> 0x00a1 }
            com.google.firebase.perf.util.C33433c.m134819e(r1, r2)     // Catch:{ all -> 0x00a1 }
            com.google.firebase.perf.metrics.c r2 = new com.google.firebase.perf.metrics.c     // Catch:{ all -> 0x00a1 }
            r2.<init>(r5)     // Catch:{ all -> 0x00a1 }
            com.google.firebase.perf.metrics.d r3 = new com.google.firebase.perf.metrics.d     // Catch:{ all -> 0x00a1 }
            r3.<init>(r5)     // Catch:{ all -> 0x00a1 }
            com.google.firebase.perf.util.C33437f.m134830a(r1, r2, r3)     // Catch:{ all -> 0x00a1 }
        L_0x0038:
            com.google.firebase.perf.util.Timer r1 = r5.f81066Y     // Catch:{ all -> 0x00a1 }
            if (r1 == 0) goto L_0x003e
            monitor-exit(r5)
            return
        L_0x003e:
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x00a1 }
            r1.<init>(r6)     // Catch:{ all -> 0x00a1 }
            r5.f81075v = r1     // Catch:{ all -> 0x00a1 }
            com.google.firebase.perf.util.a r1 = r5.f81070c     // Catch:{ all -> 0x00a1 }
            com.google.firebase.perf.util.Timer r1 = r1.mo96901a()     // Catch:{ all -> 0x00a1 }
            r5.f81066Y = r1     // Catch:{ all -> 0x00a1 }
            com.google.firebase.perf.session.SessionManager r1 = com.google.firebase.perf.session.SessionManager.getInstance()     // Catch:{ all -> 0x00a1 }
            com.google.firebase.perf.session.PerfSession r1 = r1.perfSession()     // Catch:{ all -> 0x00a1 }
            r5.f81060I0 = r1     // Catch:{ all -> 0x00a1 }
            com.google.firebase.perf.logging.a r1 = com.google.firebase.perf.logging.C33363a.m134449e()     // Catch:{ all -> 0x00a1 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a1 }
            r2.<init>()     // Catch:{ all -> 0x00a1 }
            java.lang.String r3 = "onResume(): "
            r2.append(r3)     // Catch:{ all -> 0x00a1 }
            java.lang.Class r6 = r6.getClass()     // Catch:{ all -> 0x00a1 }
            java.lang.String r6 = r6.getName()     // Catch:{ all -> 0x00a1 }
            r2.append(r6)     // Catch:{ all -> 0x00a1 }
            java.lang.String r6 = ": "
            r2.append(r6)     // Catch:{ all -> 0x00a1 }
            com.google.firebase.perf.util.Timer r6 = r5.mo96453l()     // Catch:{ all -> 0x00a1 }
            com.google.firebase.perf.util.Timer r3 = r5.f81066Y     // Catch:{ all -> 0x00a1 }
            long r3 = r6.mo96892d(r3)     // Catch:{ all -> 0x00a1 }
            r2.append(r3)     // Catch:{ all -> 0x00a1 }
            java.lang.String r6 = " microseconds"
            r2.append(r6)     // Catch:{ all -> 0x00a1 }
            java.lang.String r6 = r2.toString()     // Catch:{ all -> 0x00a1 }
            r1.mo96429a(r6)     // Catch:{ all -> 0x00a1 }
            java.util.concurrent.ExecutorService r6 = f81055S0     // Catch:{ all -> 0x00a1 }
            com.google.firebase.perf.metrics.e r1 = new com.google.firebase.perf.metrics.e     // Catch:{ all -> 0x00a1 }
            r1.<init>(r5)     // Catch:{ all -> 0x00a1 }
            r6.execute(r1)     // Catch:{ all -> 0x00a1 }
            if (r0 != 0) goto L_0x009d
            r5.mo96451G()     // Catch:{ all -> 0x00a1 }
        L_0x009d:
            monitor-exit(r5)
            return
        L_0x009f:
            monitor-exit(r5)
            return
        L_0x00a1:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.metrics.AppStartTrace.onActivityResumed(android.app.Activity):void");
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0019, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void onActivityStarted(android.app.Activity r1) {
        /*
            r0 = this;
            monitor-enter(r0)
            boolean r1 = r0.f81061J0     // Catch:{ all -> 0x001a }
            if (r1 != 0) goto L_0x0018
            com.google.firebase.perf.util.Timer r1 = r0.f81065X     // Catch:{ all -> 0x001a }
            if (r1 != 0) goto L_0x0018
            boolean r1 = r0.f81076w     // Catch:{ all -> 0x001a }
            if (r1 == 0) goto L_0x000e
            goto L_0x0018
        L_0x000e:
            com.google.firebase.perf.util.a r1 = r0.f81070c     // Catch:{ all -> 0x001a }
            com.google.firebase.perf.util.Timer r1 = r1.mo96901a()     // Catch:{ all -> 0x001a }
            r0.f81065X = r1     // Catch:{ all -> 0x001a }
            monitor-exit(r0)
            return
        L_0x0018:
            monitor-exit(r0)
            return
        L_0x001a:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.metrics.AppStartTrace.onActivityStarted(android.app.Activity):void");
    }

    public void onActivityStopped(Activity activity) {
    }

    @Keep
    @C19428i0(Lifecycle.C19372Event.ON_STOP)
    public void onAppEnteredBackground() {
        if (!this.f81061J0 && !this.f81076w && this.f81056E0 == null) {
            this.f81056E0 = this.f81070c.mo96901a();
            this.f81072e.mo97230b0((TraceMetric) TraceMetric.newBuilder().mo97215B0("_experiment_firstBackgrounding").mo97247x0(mo96467s().mo96894e()).mo97248y0(mo96467s().mo96892d(this.f81056E0)).mo100473g());
        }
    }

    @Keep
    @C19428i0(Lifecycle.C19372Event.ON_START)
    public void onAppEnteredForeground() {
        if (!this.f81061J0 && !this.f81076w && this.f81067Z == null) {
            this.f81067Z = this.f81070c.mo96901a();
            this.f81072e.mo97230b0((TraceMetric) TraceMetric.newBuilder().mo97215B0("_experiment_firstForegrounding").mo97247x0(mo96467s().mo96894e()).mo97248y0(mo96467s().mo96892d(this.f81067Z)).mo100473g());
        }
    }

    @C40974d0
    /* renamed from: p */
    public Timer mo96464p() {
        return this.f81079z;
    }

    @C40974d0
    /* renamed from: q */
    public Timer mo96465q() {
        return this.f81066Y;
    }

    @C40974d0
    /* renamed from: r */
    public Timer mo96466r() {
        return this.f81065X;
    }

    @C0359n0
    /* renamed from: s */
    public final Timer mo96467s() {
        Timer timer = this.f81077x;
        if (timer != null) {
            return timer;
        }
        return mo96453l();
    }

    /* renamed from: x */
    public final void mo96468x() {
        TraceMetric.C33480b y0 = TraceMetric.newBuilder().mo97215B0(Constants.TraceNames.APP_START_TRACE_NAME.toString()).mo97247x0(mo96453l().mo96894e()).mo97248y0(mo96453l().mo96892d(this.f81066Y));
        ArrayList arrayList = new ArrayList(3);
        arrayList.add((TraceMetric) TraceMetric.newBuilder().mo97215B0(Constants.TraceNames.ON_CREATE_TRACE_NAME.toString()).mo97247x0(mo96453l().mo96894e()).mo97248y0(mo96453l().mo96892d(this.f81079z)).mo100473g());
        TraceMetric.C33480b newBuilder = TraceMetric.newBuilder();
        newBuilder.mo97215B0(Constants.TraceNames.ON_START_TRACE_NAME.toString()).mo97247x0(this.f81079z.mo96894e()).mo97248y0(this.f81079z.mo96892d(this.f81065X));
        arrayList.add((TraceMetric) newBuilder.mo100473g());
        TraceMetric.C33480b newBuilder2 = TraceMetric.newBuilder();
        newBuilder2.mo97215B0(Constants.TraceNames.ON_RESUME_TRACE_NAME.toString()).mo97247x0(this.f81065X.mo96894e()).mo97248y0(this.f81065X.mo96892d(this.f81066Y));
        arrayList.add((TraceMetric) newBuilder2.mo100473g());
        y0.mo97222R(arrayList).mo97226V(this.f81060I0.mo96776a());
        this.f81069b.mo96863I((TraceMetric) y0.mo100473g(), ApplicationProcessState.FOREGROUND_BACKGROUND);
    }

    /* renamed from: z */
    public final void mo96469z(TraceMetric.C33480b bVar) {
        if (this.f81057F0 != null && this.f81058G0 != null && this.f81059H0 != null) {
            f81055S0.execute(new C33377f(this, bVar));
            mo96451G();
        }
    }
}
