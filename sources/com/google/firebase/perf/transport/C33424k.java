package com.google.firebase.perf.transport;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import androidx.annotation.C0344h1;
import androidx.annotation.C0348i1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.android.datatransport.C40087h;
import com.google.firebase.C33033f;
import com.google.firebase.inject.C33058b;
import com.google.firebase.installations.C33088k;
import com.google.firebase.perf.C33278a;
import com.google.firebase.perf.C33314e;
import com.google.firebase.perf.application.C33279a;
import com.google.firebase.perf.config.C33307a;
import com.google.firebase.perf.logging.C33363a;
import com.google.firebase.perf.logging.C33364b;
import com.google.firebase.perf.metrics.validator.C33388e;
import com.google.firebase.perf.p049v1.AndroidApplicationInfo;
import com.google.firebase.perf.p049v1.ApplicationInfo;
import com.google.firebase.perf.p049v1.ApplicationProcessState;
import com.google.firebase.perf.p049v1.C33496j;
import com.google.firebase.perf.p049v1.GaugeMetric;
import com.google.firebase.perf.p049v1.NetworkRequestMetric;
import com.google.firebase.perf.p049v1.PerfMetric;
import com.google.firebase.perf.p049v1.TraceMetric;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.util.C33438g;
import com.google.firebase.perf.util.Constants;
import com.usabilla.sdk.ubform.p007db.telemetry.TelemetryTable;
import java.lang.ref.WeakReference;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.firebase.perf.transport.k */
public class C33424k implements C33279a.C33281b {

    /* renamed from: G0 */
    public static final C33363a f81253G0 = C33363a.m134449e();

    /* renamed from: H0 */
    public static final C33424k f81254H0 = new C33424k();

    /* renamed from: I0 */
    public static final int f81255I0 = 0;

    /* renamed from: J0 */
    public static final int f81256J0 = 1;

    /* renamed from: K0 */
    public static final String f81257K0 = "KEY_AVAILABLE_TRACES_FOR_CACHING";

    /* renamed from: L0 */
    public static final String f81258L0 = "KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING";

    /* renamed from: M0 */
    public static final String f81259M0 = "KEY_AVAILABLE_GAUGES_FOR_CACHING";

    /* renamed from: N0 */
    public static final int f81260N0 = 50;

    /* renamed from: O0 */
    public static final int f81261O0 = 50;

    /* renamed from: P0 */
    public static final int f81262P0 = 50;

    /* renamed from: E0 */
    public String f81263E0;

    /* renamed from: F0 */
    public boolean f81264F0 = false;

    /* renamed from: X */
    public C33279a f81265X;

    /* renamed from: Y */
    public ApplicationInfo.C33449b f81266Y;

    /* renamed from: Z */
    public String f81267Z;

    /* renamed from: a */
    public final Map<String, Integer> f81268a;

    /* renamed from: b */
    public final ConcurrentLinkedQueue<C33415c> f81269b = new ConcurrentLinkedQueue<>();

    /* renamed from: c */
    public final AtomicBoolean f81270c = new AtomicBoolean(false);

    /* renamed from: d */
    public C33033f f81271d;
    @C0363p0

    /* renamed from: e */
    public C33314e f81272e;

    /* renamed from: f */
    public C33088k f81273f;

    /* renamed from: g */
    public C33058b<C40087h> f81274g;

    /* renamed from: v */
    public C33414b f81275v;

    /* renamed from: w */
    public ExecutorService f81276w = new ThreadPoolExecutor(0, 1, 10, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* renamed from: x */
    public Context f81277x;

    /* renamed from: y */
    public C33307a f81278y;

    /* renamed from: z */
    public C33416d f81279z;

    @SuppressLint({"ThreadPoolCreation"})
    public C33424k() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.f81268a = concurrentHashMap;
        concurrentHashMap.put(f81257K0, 50);
        concurrentHashMap.put(f81258L0, 50);
        concurrentHashMap.put(f81259M0, 50);
    }

    /* access modifiers changed from: private */
    /* renamed from: A */
    public /* synthetic */ void m134752A(NetworkRequestMetric networkRequestMetric, ApplicationProcessState applicationProcessState) {
        mo96867M(PerfMetric.newBuilder().mo97163j0(networkRequestMetric), applicationProcessState);
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public /* synthetic */ void m134753B(GaugeMetric gaugeMetric, ApplicationProcessState applicationProcessState) {
        mo96867M(PerfMetric.newBuilder().mo97161h0(gaugeMetric), applicationProcessState);
    }

    /* access modifiers changed from: private */
    /* renamed from: C */
    public /* synthetic */ void m134754C() {
        this.f81279z.mo96831a(this.f81264F0);
    }

    /* renamed from: l */
    public static C33424k m134761l() {
        return f81254H0;
    }

    /* renamed from: m */
    public static String m134762m(GaugeMetric gaugeMetric) {
        return String.format(Locale.ENGLISH, "gauges (hasMetadata: %b, cpuGaugeCount: %d, memoryGaugeCount: %d)", new Object[]{Boolean.valueOf(gaugeMetric.hasGaugeMetadata()), Integer.valueOf(gaugeMetric.getCpuMetricReadingsCount()), Integer.valueOf(gaugeMetric.getAndroidMemoryReadingsCount())});
    }

    /* renamed from: n */
    public static String m134763n(NetworkRequestMetric networkRequestMetric) {
        long j;
        String str;
        if (networkRequestMetric.hasTimeToResponseCompletedUs()) {
            j = networkRequestMetric.getTimeToResponseCompletedUs();
        } else {
            j = 0;
        }
        if (networkRequestMetric.hasHttpResponseCode()) {
            str = String.valueOf(networkRequestMetric.getHttpResponseCode());
        } else {
            str = "UNKNOWN";
        }
        return String.format(Locale.ENGLISH, "network request trace: %s (responseCode: %s, responseTime: %sms)", new Object[]{networkRequestMetric.getUrl(), str, new DecimalFormat("#.####").format(((double) j) / 1000.0d)});
    }

    /* renamed from: o */
    public static String m134764o(C33496j jVar) {
        if (jVar.hasTraceMetric()) {
            return m134765p(jVar.getTraceMetric());
        }
        if (jVar.hasNetworkRequestMetric()) {
            return m134763n(jVar.getNetworkRequestMetric());
        }
        if (jVar.hasGaugeMetric()) {
            return m134762m(jVar.getGaugeMetric());
        }
        return TelemetryTable.f26835g;
    }

    /* renamed from: p */
    public static String m134765p(TraceMetric traceMetric) {
        long durationUs = traceMetric.getDurationUs();
        return String.format(Locale.ENGLISH, "trace metric: %s (duration: %sms)", new Object[]{traceMetric.getName(), new DecimalFormat("#.####").format(((double) durationUs) / 1000.0d)});
    }

    /* renamed from: r */
    public static String m134766r(Context context) {
        try {
            String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            if (str == null) {
                return "";
            }
            return str;
        } catch (PackageManager.NameNotFoundException unused) {
            return "";
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public /* synthetic */ void m134767y(C33415c cVar) {
        mo96867M(cVar.f81220a, cVar.f81221b);
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public /* synthetic */ void m134768z(TraceMetric traceMetric, ApplicationProcessState applicationProcessState) {
        mo96867M(PerfMetric.newBuilder().mo97165l0(traceMetric), applicationProcessState);
    }

    /* renamed from: D */
    public void mo96858D(GaugeMetric gaugeMetric) {
        mo96859E(gaugeMetric, ApplicationProcessState.APPLICATION_PROCESS_STATE_UNKNOWN);
    }

    /* renamed from: E */
    public void mo96859E(GaugeMetric gaugeMetric, ApplicationProcessState applicationProcessState) {
        this.f81276w.execute(new C33423j(this, gaugeMetric, applicationProcessState));
    }

    /* renamed from: F */
    public void mo96860F(NetworkRequestMetric networkRequestMetric) {
        mo96861G(networkRequestMetric, ApplicationProcessState.APPLICATION_PROCESS_STATE_UNKNOWN);
    }

    /* renamed from: G */
    public void mo96861G(NetworkRequestMetric networkRequestMetric, ApplicationProcessState applicationProcessState) {
        this.f81276w.execute(new C33420g(this, networkRequestMetric, applicationProcessState));
    }

    /* renamed from: H */
    public void mo96862H(TraceMetric traceMetric) {
        mo96863I(traceMetric, ApplicationProcessState.APPLICATION_PROCESS_STATE_UNKNOWN);
    }

    /* renamed from: I */
    public void mo96863I(TraceMetric traceMetric, ApplicationProcessState applicationProcessState) {
        this.f81276w.execute(new C33418e(this, traceMetric, applicationProcessState));
    }

    /* renamed from: J */
    public final PerfMetric mo96864J(PerfMetric.C33473b bVar, ApplicationProcessState applicationProcessState) {
        mo96868N();
        ApplicationInfo.C33449b h0 = this.f81266Y.mo96972h0(applicationProcessState);
        if (bVar.hasTraceMetric() || bVar.hasNetworkRequestMetric()) {
            h0 = ((ApplicationInfo.C33449b) h0.mo100471f()).mo96965Y(mo96874k());
        }
        return (PerfMetric) bVar.mo97158c0(h0).mo100473g();
    }

    @C0344h1
    /* renamed from: K */
    public void mo96865K(boolean z) {
        this.f81270c.set(z);
    }

    @C0348i1
    /* renamed from: L */
    public final void mo96866L() {
        Context n = this.f81271d.mo95721n();
        this.f81277x = n;
        this.f81267Z = n.getPackageName();
        this.f81278y = C33307a.m134328h();
        this.f81279z = new C33416d(this.f81277x, new C33438g(100, 1, TimeUnit.MINUTES), 500);
        this.f81265X = C33279a.m134177c();
        this.f81275v = new C33414b(this.f81274g, this.f81278y.mo96361b());
        mo96872i();
    }

    @C0348i1
    /* renamed from: M */
    public final void mo96867M(PerfMetric.C33473b bVar, ApplicationProcessState applicationProcessState) {
        if (mo96881x()) {
            PerfMetric J = mo96864J(bVar, applicationProcessState);
            if (mo96880w(J)) {
                mo96871h(J);
                SessionManager.getInstance().updatePerfSessionIfExpired();
            }
        } else if (mo96879v(bVar)) {
            f81253G0.mo96430b("Transport is not initialized yet, %s will be queued for to be dispatched later", m134764o(bVar));
            this.f81269b.add(new C33415c(bVar, applicationProcessState));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0068  */
    @androidx.annotation.C0348i1
    /* renamed from: N */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo96868N() {
        /*
            r6 = this;
            com.google.firebase.perf.config.a r0 = r6.f81278y
            boolean r0 = r0.mo96352M()
            if (r0 == 0) goto L_0x006f
            com.google.firebase.perf.v1.ApplicationInfo$b r0 = r6.f81266Y
            boolean r0 = r0.hasAppInstanceId()
            if (r0 == 0) goto L_0x0015
            boolean r0 = r6.f81264F0
            if (r0 != 0) goto L_0x0015
            return
        L_0x0015:
            r0 = 0
            r1 = 1
            com.google.firebase.installations.k r2 = r6.f81273f     // Catch:{ ExecutionException -> 0x004b, InterruptedException -> 0x003a, TimeoutException -> 0x0029 }
            com.google.android.gms.tasks.k r2 = r2.getId()     // Catch:{ ExecutionException -> 0x004b, InterruptedException -> 0x003a, TimeoutException -> 0x0029 }
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ ExecutionException -> 0x004b, InterruptedException -> 0x003a, TimeoutException -> 0x0029 }
            r4 = 60000(0xea60, double:2.9644E-319)
            java.lang.Object r2 = com.google.android.gms.tasks.C31053n.m124520b(r2, r4, r3)     // Catch:{ ExecutionException -> 0x004b, InterruptedException -> 0x003a, TimeoutException -> 0x0029 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ ExecutionException -> 0x004b, InterruptedException -> 0x003a, TimeoutException -> 0x0029 }
            goto L_0x005c
        L_0x0029:
            r2 = move-exception
            com.google.firebase.perf.logging.a r3 = f81253G0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = r2.getMessage()
            r1[r0] = r2
            java.lang.String r0 = "Task to retrieve Installation Id is timed out: %s"
            r3.mo96432d(r0, r1)
            goto L_0x005b
        L_0x003a:
            r2 = move-exception
            com.google.firebase.perf.logging.a r3 = f81253G0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = r2.getMessage()
            r1[r0] = r2
            java.lang.String r0 = "Task to retrieve Installation Id is interrupted: %s"
            r3.mo96432d(r0, r1)
            goto L_0x005b
        L_0x004b:
            r2 = move-exception
            com.google.firebase.perf.logging.a r3 = f81253G0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = r2.getMessage()
            r1[r0] = r2
            java.lang.String r0 = "Unable to retrieve Installation Id: %s"
            r3.mo96432d(r0, r1)
        L_0x005b:
            r2 = 0
        L_0x005c:
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x0068
            com.google.firebase.perf.v1.ApplicationInfo$b r0 = r6.f81266Y
            r0.mo96970d0(r2)
            goto L_0x006f
        L_0x0068:
            com.google.firebase.perf.logging.a r0 = f81253G0
            java.lang.String r1 = "Firebase Installation Id is empty, contact Firebase Support for debugging."
            r0.mo96439l(r1)
        L_0x006f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.transport.C33424k.mo96868N():void");
    }

    /* renamed from: O */
    public final void mo96869O() {
        if (this.f81272e == null && mo96881x()) {
            this.f81272e = C33314e.m134397c();
        }
    }

    @C0344h1
    /* renamed from: g */
    public void mo96870g() {
        this.f81266Y.mo96960R();
    }

    @C0348i1
    /* renamed from: h */
    public final void mo96871h(PerfMetric perfMetric) {
        if (perfMetric.hasTraceMetric()) {
            f81253G0.mo96434g("Logging %s. In a minute, visit the Firebase console to view your data: %s", m134764o(perfMetric), mo96873j(perfMetric.getTraceMetric()));
        } else {
            f81253G0.mo96434g("Logging %s", m134764o(perfMetric));
        }
        this.f81275v.mo96830b(perfMetric);
    }

    /* renamed from: i */
    public final void mo96872i() {
        this.f81265X.mo96282p(new WeakReference(f81254H0));
        ApplicationInfo.C33449b newBuilder = ApplicationInfo.newBuilder();
        this.f81266Y = newBuilder;
        newBuilder.mo96973i0(this.f81271d.mo95723s().mo96248j()).mo96968b0(AndroidApplicationInfo.newBuilder().mo96929T(this.f81267Z).mo96931V(C33278a.f80910e).mo96933Z(m134766r(this.f81277x)));
        this.f81270c.set(true);
        while (!this.f81269b.isEmpty()) {
            C33415c poll = this.f81269b.poll();
            if (poll != null) {
                this.f81276w.execute(new C33422i(this, poll));
            }
        }
    }

    /* renamed from: j */
    public final String mo96873j(TraceMetric traceMetric) {
        String name = traceMetric.getName();
        if (name.startsWith(Constants.f81295p)) {
            return C33364b.m134464c(this.f81263E0, this.f81267Z, name);
        }
        return C33364b.m134462a(this.f81263E0, this.f81267Z, name);
    }

    /* renamed from: k */
    public final Map<String, String> mo96874k() {
        mo96869O();
        C33314e eVar = this.f81272e;
        if (eVar != null) {
            return eVar.getAttributes();
        }
        return Collections.emptyMap();
    }

    public void onUpdateAppState(ApplicationProcessState applicationProcessState) {
        boolean z;
        if (applicationProcessState == ApplicationProcessState.FOREGROUND) {
            z = true;
        } else {
            z = false;
        }
        this.f81264F0 = z;
        if (mo96881x()) {
            this.f81276w.execute(new C33421h(this));
        }
    }

    @C0344h1
    /* renamed from: q */
    public ConcurrentLinkedQueue<C33415c> mo96875q() {
        return new ConcurrentLinkedQueue<>(this.f81269b);
    }

    /* renamed from: s */
    public final void mo96876s(PerfMetric perfMetric) {
        if (perfMetric.hasTraceMetric()) {
            this.f81265X.mo96268h(Constants.CounterNames.TRACE_EVENT_RATE_LIMITED.toString(), 1);
        } else if (perfMetric.hasNetworkRequestMetric()) {
            this.f81265X.mo96268h(Constants.CounterNames.NETWORK_TRACE_EVENT_RATE_LIMITED.toString(), 1);
        }
    }

    /* renamed from: t */
    public void mo96877t(@C0359n0 C33033f fVar, @C0359n0 C33088k kVar, @C0359n0 C33058b<C40087h> bVar) {
        this.f81271d = fVar;
        this.f81263E0 = fVar.mo95723s().mo96252n();
        this.f81273f = kVar;
        this.f81274g = bVar;
        this.f81276w.execute(new C33419f(this));
    }

    @C0344h1(otherwise = 5)
    /* renamed from: u */
    public void mo96878u(C33033f fVar, C33314e eVar, C33088k kVar, C33058b<C40087h> bVar, C33307a aVar, C33416d dVar, C33279a aVar2, C33414b bVar2, ExecutorService executorService) {
        this.f81271d = fVar;
        this.f81263E0 = fVar.mo95723s().mo96252n();
        this.f81277x = fVar.mo95721n();
        this.f81272e = eVar;
        this.f81273f = kVar;
        this.f81274g = bVar;
        this.f81278y = aVar;
        this.f81279z = dVar;
        this.f81265X = aVar2;
        this.f81275v = bVar2;
        this.f81276w = executorService;
        this.f81268a.put(f81257K0, 50);
        this.f81268a.put(f81258L0, 50);
        this.f81268a.put(f81259M0, 50);
        mo96872i();
    }

    @C0348i1
    /* renamed from: v */
    public final boolean mo96879v(C33496j jVar) {
        int intValue = this.f81268a.get(f81257K0).intValue();
        int intValue2 = this.f81268a.get(f81258L0).intValue();
        int intValue3 = this.f81268a.get(f81259M0).intValue();
        if (jVar.hasTraceMetric() && intValue > 0) {
            this.f81268a.put(f81257K0, Integer.valueOf(intValue - 1));
            return true;
        } else if (jVar.hasNetworkRequestMetric() && intValue2 > 0) {
            this.f81268a.put(f81258L0, Integer.valueOf(intValue2 - 1));
            return true;
        } else if (!jVar.hasGaugeMetric() || intValue3 <= 0) {
            f81253G0.mo96430b("%s is not allowed to cache. Cache exhausted the limit (availableTracesForCaching: %d, availableNetworkRequestsForCaching: %d, availableGaugesForCaching: %d).", m134764o(jVar), Integer.valueOf(intValue), Integer.valueOf(intValue2), Integer.valueOf(intValue3));
            return false;
        } else {
            this.f81268a.put(f81259M0, Integer.valueOf(intValue3 - 1));
            return true;
        }
    }

    @C0348i1
    /* renamed from: w */
    public final boolean mo96880w(PerfMetric perfMetric) {
        if (!this.f81278y.mo96352M()) {
            f81253G0.mo96434g("Performance collection is not enabled, dropping %s", m134764o(perfMetric));
            return false;
        } else if (!perfMetric.getApplicationInfo().hasAppInstanceId()) {
            f81253G0.mo96440m("App Instance ID is null or empty, dropping %s", m134764o(perfMetric));
            return false;
        } else if (!C33388e.m134601b(perfMetric, this.f81277x)) {
            f81253G0.mo96440m("Unable to process the PerfMetric (%s) due to missing or invalid values. See earlier log statements for additional information on the specific missing/invalid values.", m134764o(perfMetric));
            return false;
        } else if (!this.f81279z.mo96840k(perfMetric)) {
            mo96876s(perfMetric);
            f81253G0.mo96434g("Event dropped due to device sampling - %s", m134764o(perfMetric));
            return false;
        } else if (!this.f81279z.mo96839j(perfMetric)) {
            return true;
        } else {
            mo96876s(perfMetric);
            f81253G0.mo96434g("Rate limited (per device) - %s", m134764o(perfMetric));
            return false;
        }
    }

    /* renamed from: x */
    public boolean mo96881x() {
        return this.f81270c.get();
    }
}
