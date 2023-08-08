package com.carrefour.fid.android.performance;

import com.google.firebase.crashlytics.internal.persistence.C32920e;
import com.google.firebase.perf.C33314e;
import com.google.firebase.perf.metrics.Trace;
import kotlin.C11079d2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.performance.g */
public abstract class C38335g {
    @C12579k

    /* renamed from: a */
    public final C33314e f97111a;
    @C12580l

    /* renamed from: b */
    public Trace f97112b;

    public /* synthetic */ C38335g(C33314e eVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(eVar);
    }

    @C12580l
    /* renamed from: a */
    public final Trace mo121193a() {
        return this.f97112b;
    }

    @C12579k
    /* renamed from: b */
    public abstract String mo121183b();

    /* renamed from: c */
    public final void mo121194c(@C12580l Trace trace) {
        this.f97112b = trace;
    }

    /* renamed from: d */
    public final void mo121195d(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "traceName");
        C33314e eVar = this.f97111a;
        String b = mo121183b();
        Trace h = eVar.mo96405h(b + C32920e.f79928l + str);
        h.start();
        this.f97112b = h;
    }

    @C12580l
    /* renamed from: e */
    public final C11079d2 mo121196e() {
        Trace trace = this.f97112b;
        if (trace == null) {
            return null;
        }
        trace.stop();
        return C11079d2.f28267a;
    }

    public C38335g(C33314e eVar) {
        this.f97111a = eVar;
    }
}
