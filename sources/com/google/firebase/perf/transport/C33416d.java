package com.google.firebase.perf.transport;

import android.content.Context;
import androidx.annotation.C0359n0;
import com.google.android.gms.common.util.C40974d0;
import com.google.firebase.perf.config.C33307a;
import com.google.firebase.perf.logging.C33363a;
import com.google.firebase.perf.metrics.resource.C33383a;
import com.google.firebase.perf.p049v1.PerfMetric;
import com.google.firebase.perf.p049v1.PerfSession;
import com.google.firebase.perf.p049v1.SessionVerbosity;
import com.google.firebase.perf.util.C33431a;
import com.google.firebase.perf.util.C33438g;
import com.google.firebase.perf.util.C33443k;
import com.google.firebase.perf.util.Constants;
import com.google.firebase.perf.util.Timer;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.firebase.perf.transport.d */
public final class C33416d {

    /* renamed from: a */
    public final C33307a f81222a;

    /* renamed from: b */
    public final float f81223b;

    /* renamed from: c */
    public final float f81224c;

    /* renamed from: d */
    public C33417a f81225d;

    /* renamed from: e */
    public C33417a f81226e;

    /* renamed from: f */
    public boolean f81227f;

    /* renamed from: com.google.firebase.perf.transport.d$a */
    public static class C33417a {

        /* renamed from: k */
        public static final C33363a f81228k = C33363a.m134449e();

        /* renamed from: l */
        public static final long f81229l = TimeUnit.SECONDS.toMicros(1);

        /* renamed from: a */
        public final C33431a f81230a;

        /* renamed from: b */
        public final boolean f81231b;

        /* renamed from: c */
        public Timer f81232c;

        /* renamed from: d */
        public C33438g f81233d;

        /* renamed from: e */
        public long f81234e;

        /* renamed from: f */
        public double f81235f;

        /* renamed from: g */
        public C33438g f81236g;

        /* renamed from: h */
        public C33438g f81237h;

        /* renamed from: i */
        public long f81238i;

        /* renamed from: j */
        public long f81239j;

        public C33417a(C33438g gVar, long j, C33431a aVar, C33307a aVar2, @C33383a String str, boolean z) {
            this.f81230a = aVar;
            this.f81234e = j;
            this.f81233d = gVar;
            this.f81235f = (double) j;
            this.f81232c = aVar.mo96901a();
            mo96851m(aVar2, str, z);
            this.f81231b = z;
        }

        /* renamed from: e */
        public static long m134739e(C33307a aVar, @C33383a String str) {
            if (str == "Trace") {
                return aVar.mo96346G();
            }
            return aVar.mo96376r();
        }

        /* renamed from: f */
        public static long m134740f(C33307a aVar, @C33383a String str) {
            if (str == "Trace") {
                return aVar.mo96379u();
            }
            return aVar.mo96379u();
        }

        /* renamed from: g */
        public static long m134741g(C33307a aVar, @C33383a String str) {
            if (str == "Trace") {
                return aVar.mo96347H();
            }
            return aVar.mo96377s();
        }

        /* renamed from: h */
        public static long m134742h(C33307a aVar, @C33383a String str) {
            if (str == "Trace") {
                return aVar.mo96379u();
            }
            return aVar.mo96379u();
        }

        /* renamed from: a */
        public synchronized void mo96843a(boolean z) {
            C33438g gVar;
            long j;
            if (z) {
                gVar = this.f81236g;
            } else {
                gVar = this.f81237h;
            }
            this.f81233d = gVar;
            if (z) {
                j = this.f81238i;
            } else {
                j = this.f81239j;
            }
            this.f81234e = j;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0047, code lost:
            return false;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public synchronized boolean mo96844b(@androidx.annotation.C0359n0 com.google.firebase.perf.p049v1.PerfMetric r5) {
            /*
                r4 = this;
                monitor-enter(r4)
                com.google.firebase.perf.util.a r5 = r4.f81230a     // Catch:{ all -> 0x0049 }
                com.google.firebase.perf.util.Timer r5 = r5.mo96901a()     // Catch:{ all -> 0x0049 }
                com.google.firebase.perf.util.Timer r0 = r4.f81232c     // Catch:{ all -> 0x0049 }
                long r0 = r0.mo96892d(r5)     // Catch:{ all -> 0x0049 }
                double r0 = (double) r0     // Catch:{ all -> 0x0049 }
                com.google.firebase.perf.util.g r2 = r4.f81233d     // Catch:{ all -> 0x0049 }
                double r2 = r2.mo96914a()     // Catch:{ all -> 0x0049 }
                double r0 = r0 * r2
                long r2 = f81229l     // Catch:{ all -> 0x0049 }
                double r2 = (double) r2     // Catch:{ all -> 0x0049 }
                double r0 = r0 / r2
                r2 = 0
                int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r2 <= 0) goto L_0x002d
                double r2 = r4.f81235f     // Catch:{ all -> 0x0049 }
                double r2 = r2 + r0
                long r0 = r4.f81234e     // Catch:{ all -> 0x0049 }
                double r0 = (double) r0     // Catch:{ all -> 0x0049 }
                double r0 = java.lang.Math.min(r2, r0)     // Catch:{ all -> 0x0049 }
                r4.f81235f = r0     // Catch:{ all -> 0x0049 }
                r4.f81232c = r5     // Catch:{ all -> 0x0049 }
            L_0x002d:
                double r0 = r4.f81235f     // Catch:{ all -> 0x0049 }
                r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
                int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r5 < 0) goto L_0x003b
                double r0 = r0 - r2
                r4.f81235f = r0     // Catch:{ all -> 0x0049 }
                monitor-exit(r4)
                r5 = 1
                return r5
            L_0x003b:
                boolean r5 = r4.f81231b     // Catch:{ all -> 0x0049 }
                if (r5 == 0) goto L_0x0046
                com.google.firebase.perf.logging.a r5 = f81228k     // Catch:{ all -> 0x0049 }
                java.lang.String r0 = "Exceeded log rate limit, dropping the log."
                r5.mo96439l(r0)     // Catch:{ all -> 0x0049 }
            L_0x0046:
                monitor-exit(r4)
                r5 = 0
                return r5
            L_0x0049:
                r5 = move-exception
                monitor-exit(r4)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.transport.C33416d.C33417a.mo96844b(com.google.firebase.perf.v1.PerfMetric):boolean");
        }

        @C40974d0
        /* renamed from: c */
        public long mo96845c() {
            return this.f81239j;
        }

        @C40974d0
        /* renamed from: d */
        public C33438g mo96846d() {
            return this.f81237h;
        }

        @C40974d0
        /* renamed from: i */
        public long mo96847i() {
            return this.f81238i;
        }

        @C40974d0
        /* renamed from: j */
        public C33438g mo96848j() {
            return this.f81236g;
        }

        @C40974d0
        /* renamed from: k */
        public C33438g mo96849k() {
            return this.f81233d;
        }

        @C40974d0
        /* renamed from: l */
        public void mo96850l(C33438g gVar) {
            this.f81233d = gVar;
        }

        /* renamed from: m */
        public final void mo96851m(C33307a aVar, @C33383a String str, boolean z) {
            long h = m134742h(aVar, str);
            long g = m134741g(aVar, str);
            TimeUnit timeUnit = TimeUnit.SECONDS;
            C33438g gVar = new C33438g(g, h, timeUnit);
            this.f81236g = gVar;
            this.f81238i = g;
            if (z) {
                f81228k.mo96430b("Foreground %s logging rate:%f, burst capacity:%d", str, gVar, Long.valueOf(g));
            }
            long f = m134740f(aVar, str);
            long e = m134739e(aVar, str);
            C33438g gVar2 = new C33438g(e, f, timeUnit);
            this.f81237h = gVar2;
            this.f81239j = e;
            if (z) {
                f81228k.mo96430b("Background %s logging rate:%f, capacity:%d", str, gVar2, Long.valueOf(e));
            }
        }
    }

    public C33416d(@C0359n0 Context context, C33438g gVar, long j) {
        this(gVar, j, new C33431a(), m134726e(), m134726e(), C33307a.m134328h());
        this.f81227f = C33443k.m134837c(context);
    }

    @C40974d0
    /* renamed from: e */
    public static float m134726e() {
        return new Random().nextFloat();
    }

    /* renamed from: a */
    public void mo96831a(boolean z) {
        this.f81225d.mo96843a(z);
        this.f81226e.mo96843a(z);
    }

    @C40974d0
    /* renamed from: b */
    public boolean mo96832b() {
        return mo96836g();
    }

    @C40974d0
    /* renamed from: c */
    public boolean mo96833c() {
        return mo96837h();
    }

    @C40974d0
    /* renamed from: d */
    public boolean mo96834d() {
        return mo96838i();
    }

    /* renamed from: f */
    public final boolean mo96835f(List<PerfSession> list) {
        if (list.size() <= 0 || list.get(0).getSessionVerbosityCount() <= 0 || list.get(0).getSessionVerbosity(0) != SessionVerbosity.GAUGES_AND_SYSTEM_EVENTS) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public final boolean mo96836g() {
        if (this.f81224c < this.f81222a.mo96366g()) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public final boolean mo96837h() {
        if (this.f81223b < this.f81222a.mo96378t()) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public final boolean mo96838i() {
        if (this.f81223b < this.f81222a.mo96348I()) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public boolean mo96839j(PerfMetric perfMetric) {
        if (!mo96842m(perfMetric)) {
            return false;
        }
        if (perfMetric.hasNetworkRequestMetric()) {
            return !this.f81226e.mo96844b(perfMetric);
        }
        if (perfMetric.hasTraceMetric()) {
            return !this.f81225d.mo96844b(perfMetric);
        }
        return true;
    }

    /* renamed from: k */
    public boolean mo96840k(PerfMetric perfMetric) {
        if (perfMetric.hasTraceMetric() && !mo96838i() && !mo96835f(perfMetric.getTraceMetric().getPerfSessionsList())) {
            return false;
        }
        if (mo96841l(perfMetric) && !mo96836g() && !mo96835f(perfMetric.getTraceMetric().getPerfSessionsList())) {
            return false;
        }
        if (!perfMetric.hasNetworkRequestMetric() || mo96837h() || mo96835f(perfMetric.getNetworkRequestMetric().getPerfSessionsList())) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public boolean mo96841l(PerfMetric perfMetric) {
        if (!perfMetric.hasTraceMetric() || !perfMetric.getTraceMetric().getName().startsWith(Constants.f81295p) || !perfMetric.getTraceMetric().containsCustomAttributes(Constants.f81297r)) {
            return false;
        }
        return true;
    }

    /* renamed from: m */
    public boolean mo96842m(@C0359n0 PerfMetric perfMetric) {
        if ((!perfMetric.hasTraceMetric() || ((!perfMetric.getTraceMetric().getName().equals(Constants.TraceNames.FOREGROUND_TRACE_NAME.toString()) && !perfMetric.getTraceMetric().getName().equals(Constants.TraceNames.BACKGROUND_TRACE_NAME.toString())) || perfMetric.getTraceMetric().getCountersCount() <= 0)) && !perfMetric.hasGaugeMetric()) {
            return true;
        }
        return false;
    }

    public C33416d(C33438g gVar, long j, C33431a aVar, float f, float f2, C33307a aVar2) {
        float f3 = f;
        float f4 = f2;
        this.f81225d = null;
        this.f81226e = null;
        boolean z = false;
        this.f81227f = false;
        C33443k.m134836b(0.0f <= f3 && f3 < 1.0f, "Sampling bucket ID should be in range [0.0f, 1.0f).");
        if (0.0f <= f4 && f4 < 1.0f) {
            z = true;
        }
        C33443k.m134836b(z, "Fragment sampling bucket ID should be in range [0.0f, 1.0f).");
        this.f81223b = f3;
        this.f81224c = f4;
        this.f81222a = aVar2;
        C33438g gVar2 = gVar;
        long j2 = j;
        C33431a aVar3 = aVar;
        C33307a aVar4 = aVar2;
        this.f81225d = new C33417a(gVar2, j2, aVar3, aVar4, "Trace", this.f81227f);
        this.f81226e = new C33417a(gVar2, j2, aVar3, aVar4, C33383a.f81127j3, this.f81227f);
    }
}
