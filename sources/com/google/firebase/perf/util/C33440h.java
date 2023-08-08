package com.google.firebase.perf.util;

import com.google.firebase.perf.logging.C33363a;
import com.google.firebase.perf.metrics.C33378g;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.util.Constants;

/* renamed from: com.google.firebase.perf.util.h */
public class C33440h {

    /* renamed from: a */
    public static final C33363a f81341a = C33363a.m134449e();

    /* renamed from: a */
    public static Trace m134832a(Trace trace, C33378g.C33379a aVar) {
        if (aVar.mo96523d() > 0) {
            trace.putMetric(Constants.CounterNames.FRAMES_TOTAL.toString(), (long) aVar.mo96523d());
        }
        if (aVar.mo96522c() > 0) {
            trace.putMetric(Constants.CounterNames.FRAMES_SLOW.toString(), (long) aVar.mo96522c());
        }
        if (aVar.mo96521b() > 0) {
            trace.putMetric(Constants.CounterNames.FRAMES_FROZEN.toString(), (long) aVar.mo96521b());
        }
        C33363a aVar2 = f81341a;
        aVar2.mo96429a("Screen trace: " + trace.mo96487f() + " _fr_tot:" + aVar.mo96523d() + " _fr_slo:" + aVar.mo96522c() + " _fr_fzn:" + aVar.mo96521b());
        return trace;
    }
}
