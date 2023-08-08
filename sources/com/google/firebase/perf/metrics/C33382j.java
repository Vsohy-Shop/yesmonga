package com.google.firebase.perf.metrics;

import androidx.annotation.C0359n0;
import com.google.firebase.perf.p049v1.PerfSession;
import com.google.firebase.perf.p049v1.TraceMetric;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.firebase.perf.metrics.j */
public class C33382j {

    /* renamed from: a */
    public final Trace f81125a;

    public C33382j(@C0359n0 Trace trace) {
        this.f81125a = trace;
    }

    /* renamed from: a */
    public TraceMetric mo96557a() {
        TraceMetric.C33480b y0 = TraceMetric.newBuilder().mo97215B0(this.f81125a.mo96487f()).mo97247x0(this.f81125a.mo96491h().mo96894e()).mo97248y0(this.f81125a.mo96491h().mo96892d(this.f81125a.mo96486e()));
        for (Counter next : this.f81125a.mo96484d().values()) {
            y0.mo97241q0(next.mo96473b(), next.mo96472a());
        }
        List<Trace> i = this.f81125a.mo96492i();
        if (!i.isEmpty()) {
            for (Trace jVar : i) {
                y0.mo97230b0(new C33382j(jVar).mo96557a());
            }
        }
        y0.mo97240o0(this.f81125a.getAttributes());
        PerfSession[] b = com.google.firebase.perf.session.PerfSession.m134676b(this.f81125a.mo96489g());
        if (b != null) {
            y0.mo97221P(Arrays.asList(b));
        }
        return (TraceMetric) y0.mo100473g();
    }
}
