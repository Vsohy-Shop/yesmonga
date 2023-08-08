package com.google.firebase.perf.application;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import androidx.annotation.C0359n0;
import androidx.fragment.app.C19232h;
import com.google.android.gms.common.util.C40974d0;
import com.google.firebase.perf.config.C33307a;
import com.google.firebase.perf.logging.C33363a;
import com.google.firebase.perf.metrics.C33378g;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.p049v1.ApplicationProcessState;
import com.google.firebase.perf.p049v1.TraceMetric;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.transport.C33424k;
import com.google.firebase.perf.util.C33431a;
import com.google.firebase.perf.util.C33436e;
import com.google.firebase.perf.util.C33440h;
import com.google.firebase.perf.util.Constants;
import com.google.firebase.perf.util.Timer;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.firebase.perf.application.a */
public class C33279a implements Application.ActivityLifecycleCallbacks {

    /* renamed from: G0 */
    public static final C33363a f80913G0 = C33363a.m134449e();

    /* renamed from: H0 */
    public static volatile C33279a f80914H0;

    /* renamed from: E0 */
    public boolean f80915E0;

    /* renamed from: F0 */
    public boolean f80916F0;

    /* renamed from: X */
    public Timer f80917X;

    /* renamed from: Y */
    public Timer f80918Y;

    /* renamed from: Z */
    public ApplicationProcessState f80919Z;

    /* renamed from: a */
    public final WeakHashMap<Activity, Boolean> f80920a;

    /* renamed from: b */
    public final WeakHashMap<Activity, C33284d> f80921b;

    /* renamed from: c */
    public final WeakHashMap<Activity, C33283c> f80922c;

    /* renamed from: d */
    public final WeakHashMap<Activity, Trace> f80923d;

    /* renamed from: e */
    public final Map<String, Long> f80924e;

    /* renamed from: f */
    public final Set<WeakReference<C33281b>> f80925f;

    /* renamed from: g */
    public Set<C33280a> f80926g;

    /* renamed from: v */
    public final AtomicInteger f80927v;

    /* renamed from: w */
    public final C33424k f80928w;

    /* renamed from: x */
    public final C33307a f80929x;

    /* renamed from: y */
    public final C33431a f80930y;

    /* renamed from: z */
    public final boolean f80931z;

    /* renamed from: com.google.firebase.perf.application.a$a */
    public interface C33280a {
        /* renamed from: a */
        void mo96292a();
    }

    /* renamed from: com.google.firebase.perf.application.a$b */
    public interface C33281b {
        void onUpdateAppState(ApplicationProcessState applicationProcessState);
    }

    public C33279a(C33424k kVar, C33431a aVar) {
        this(kVar, aVar, C33307a.m134328h(), m134179l());
    }

    /* renamed from: c */
    public static C33279a m134177c() {
        if (f80914H0 == null) {
            synchronized (C33279a.class) {
                if (f80914H0 == null) {
                    f80914H0 = new C33279a(C33424k.m134761l(), new C33431a());
                }
            }
        }
        return f80914H0;
    }

    /* renamed from: g */
    public static String m134178g(Activity activity) {
        return Constants.f81295p + activity.getClass().getSimpleName();
    }

    /* renamed from: l */
    public static boolean m134179l() {
        return C33284d.m134207a();
    }

    @C40974d0
    /* renamed from: a */
    public WeakHashMap<Activity, Trace> mo96263a() {
        return this.f80923d;
    }

    /* renamed from: b */
    public ApplicationProcessState mo96264b() {
        return this.f80919Z;
    }

    @C40974d0
    /* renamed from: d */
    public Timer mo96265d() {
        return this.f80918Y;
    }

    @C40974d0
    /* renamed from: e */
    public Timer mo96266e() {
        return this.f80917X;
    }

    @C40974d0
    /* renamed from: f */
    public WeakHashMap<Activity, Boolean> mo96267f() {
        return this.f80920a;
    }

    /* renamed from: h */
    public void mo96268h(@C0359n0 String str, long j) {
        synchronized (this.f80924e) {
            Long l = this.f80924e.get(str);
            if (l == null) {
                this.f80924e.put(str, Long.valueOf(j));
            } else {
                this.f80924e.put(str, Long.valueOf(l.longValue() + j));
            }
        }
    }

    /* renamed from: i */
    public void mo96269i(int i) {
        this.f80927v.addAndGet(i);
    }

    /* renamed from: j */
    public boolean mo96270j() {
        return this.f80916F0;
    }

    /* renamed from: k */
    public boolean mo96271k() {
        return this.f80919Z == ApplicationProcessState.FOREGROUND;
    }

    /* renamed from: m */
    public boolean mo96272m() {
        return this.f80931z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0018, code lost:
        return;
     */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo96273n(android.content.Context r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.f80915E0     // Catch:{ all -> 0x0019 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r1)
            return
        L_0x0007:
            android.content.Context r2 = r2.getApplicationContext()     // Catch:{ all -> 0x0019 }
            boolean r0 = r2 instanceof android.app.Application     // Catch:{ all -> 0x0019 }
            if (r0 == 0) goto L_0x0017
            android.app.Application r2 = (android.app.Application) r2     // Catch:{ all -> 0x0019 }
            r2.registerActivityLifecycleCallbacks(r1)     // Catch:{ all -> 0x0019 }
            r2 = 1
            r1.f80915E0 = r2     // Catch:{ all -> 0x0019 }
        L_0x0017:
            monitor-exit(r1)
            return
        L_0x0019:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.application.C33279a.mo96273n(android.content.Context):void");
    }

    /* renamed from: o */
    public void mo96274o(C33280a aVar) {
        synchronized (this.f80926g) {
            this.f80926g.add(aVar);
        }
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        mo96288v(activity);
    }

    public void onActivityDestroyed(Activity activity) {
        this.f80921b.remove(activity);
        if (this.f80922c.containsKey(activity)) {
            ((C19232h) activity).mo57175g0().mo56875f2(this.f80922c.remove(activity));
        }
    }

    public void onActivityPaused(Activity activity) {
    }

    public synchronized void onActivityResumed(Activity activity) {
        if (this.f80920a.isEmpty()) {
            this.f80917X = this.f80930y.mo96901a();
            this.f80920a.put(activity, Boolean.TRUE);
            if (this.f80916F0) {
                mo96291y(ApplicationProcessState.FOREGROUND);
                mo96283q();
                this.f80916F0 = false;
            } else {
                mo96285s(Constants.TraceNames.BACKGROUND_TRACE_NAME.toString(), this.f80918Y, this.f80917X);
                mo96291y(ApplicationProcessState.FOREGROUND);
            }
        } else {
            this.f80920a.put(activity, Boolean.TRUE);
        }
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public synchronized void onActivityStarted(Activity activity) {
        if (mo96272m() && this.f80929x.mo96352M()) {
            if (!this.f80921b.containsKey(activity)) {
                mo96288v(activity);
            }
            this.f80921b.get(activity).mo96302c();
            Trace trace = new Trace(m134178g(activity), this.f80928w, this.f80930y, this);
            trace.start();
            this.f80923d.put(activity, trace);
        }
    }

    public synchronized void onActivityStopped(Activity activity) {
        if (mo96272m()) {
            mo96284r(activity);
        }
        if (this.f80920a.containsKey(activity)) {
            this.f80920a.remove(activity);
            if (this.f80920a.isEmpty()) {
                this.f80918Y = this.f80930y.mo96901a();
                mo96285s(Constants.TraceNames.FOREGROUND_TRACE_NAME.toString(), this.f80917X, this.f80918Y);
                mo96291y(ApplicationProcessState.BACKGROUND);
            }
        }
    }

    /* renamed from: p */
    public void mo96282p(WeakReference<C33281b> weakReference) {
        synchronized (this.f80925f) {
            this.f80925f.add(weakReference);
        }
    }

    /* renamed from: q */
    public final void mo96283q() {
        synchronized (this.f80926g) {
            for (C33280a next : this.f80926g) {
                if (next != null) {
                    next.mo96292a();
                }
            }
        }
    }

    /* renamed from: r */
    public final void mo96284r(Activity activity) {
        Trace trace = this.f80923d.get(activity);
        if (trace != null) {
            this.f80923d.remove(activity);
            C33436e<C33378g.C33379a> e = this.f80921b.get(activity).mo96304e();
            if (!e.mo96912d()) {
                f80913G0.mo96440m("Failed to record frame data for %s.", activity.getClass().getSimpleName());
                return;
            }
            C33440h.m134832a(trace, e.mo96911c());
            trace.stop();
        }
    }

    /* renamed from: s */
    public final void mo96285s(String str, Timer timer, Timer timer2) {
        if (this.f80929x.mo96352M()) {
            TraceMetric.C33480b V = TraceMetric.newBuilder().mo97215B0(str).mo97247x0(timer.mo96894e()).mo97248y0(timer.mo96892d(timer2)).mo97226V(SessionManager.getInstance().perfSession().mo96776a());
            int andSet = this.f80927v.getAndSet(0);
            synchronized (this.f80924e) {
                V.mo97239m0(this.f80924e);
                if (andSet != 0) {
                    V.mo97241q0(Constants.CounterNames.TRACE_STARTED_NOT_STOPPED.toString(), (long) andSet);
                }
                this.f80924e.clear();
            }
            this.f80928w.mo96863I((TraceMetric) V.mo100473g(), ApplicationProcessState.FOREGROUND_BACKGROUND);
        }
    }

    @C40974d0
    /* renamed from: t */
    public void mo96286t(boolean z) {
        this.f80916F0 = z;
    }

    @C40974d0
    /* renamed from: u */
    public void mo96287u(Timer timer) {
        this.f80918Y = timer;
    }

    /* renamed from: v */
    public final void mo96288v(Activity activity) {
        if (mo96272m() && this.f80929x.mo96352M()) {
            C33284d dVar = new C33284d(activity);
            this.f80921b.put(activity, dVar);
            if (activity instanceof C19232h) {
                C33283c cVar = new C33283c(this.f80930y, this.f80928w, this, dVar);
                this.f80922c.put(activity, cVar);
                ((C19232h) activity).mo57175g0().mo56787B1(cVar, true);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0018, code lost:
        return;
     */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo96289w(android.content.Context r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.f80915E0     // Catch:{ all -> 0x0019 }
            if (r0 != 0) goto L_0x0007
            monitor-exit(r1)
            return
        L_0x0007:
            android.content.Context r2 = r2.getApplicationContext()     // Catch:{ all -> 0x0019 }
            boolean r0 = r2 instanceof android.app.Application     // Catch:{ all -> 0x0019 }
            if (r0 == 0) goto L_0x0017
            android.app.Application r2 = (android.app.Application) r2     // Catch:{ all -> 0x0019 }
            r2.unregisterActivityLifecycleCallbacks(r1)     // Catch:{ all -> 0x0019 }
            r2 = 0
            r1.f80915E0 = r2     // Catch:{ all -> 0x0019 }
        L_0x0017:
            monitor-exit(r1)
            return
        L_0x0019:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.application.C33279a.mo96289w(android.content.Context):void");
    }

    /* renamed from: x */
    public void mo96290x(WeakReference<C33281b> weakReference) {
        synchronized (this.f80925f) {
            this.f80925f.remove(weakReference);
        }
    }

    /* renamed from: y */
    public final void mo96291y(ApplicationProcessState applicationProcessState) {
        this.f80919Z = applicationProcessState;
        synchronized (this.f80925f) {
            Iterator<WeakReference<C33281b>> it = this.f80925f.iterator();
            while (it.hasNext()) {
                C33281b bVar = (C33281b) it.next().get();
                if (bVar != null) {
                    bVar.onUpdateAppState(this.f80919Z);
                } else {
                    it.remove();
                }
            }
        }
    }

    @C40974d0
    public C33279a(C33424k kVar, C33431a aVar, C33307a aVar2, boolean z) {
        this.f80920a = new WeakHashMap<>();
        this.f80921b = new WeakHashMap<>();
        this.f80922c = new WeakHashMap<>();
        this.f80923d = new WeakHashMap<>();
        this.f80924e = new HashMap();
        this.f80925f = new HashSet();
        this.f80926g = new HashSet();
        this.f80927v = new AtomicInteger(0);
        this.f80919Z = ApplicationProcessState.BACKGROUND;
        this.f80915E0 = false;
        this.f80916F0 = true;
        this.f80928w = kVar;
        this.f80930y = aVar;
        this.f80929x = aVar2;
        this.f80931z = z;
    }
}
