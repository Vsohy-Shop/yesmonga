package com.contentsquare.android.sdk;

import com.contentsquare.android.sdk.C14428ic;
import com.contentsquare.android.sdk.C14518m4;
import com.contentsquare.android.sdk.C14622pe;
import com.contentsquare.android.sdk.C14776ub;
import kotlin.C11079d2;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.contentsquare.android.sdk.j */
public final class C14435j extends C14374ga {

    /* renamed from: b */
    public final long f35660b;

    public C14435j(long j, long j2) {
        this.f35660b = j2;
        mo35369b(j);
    }

    /* renamed from: c */
    public C14518m4 mo34547c() {
        C14622pe.C14623a aVar = C14622pe.f36206b;
        C14518m4.C14519a Q = C14518m4.m62585Q();
        Intrinsics.checkNotNullExpressionValue(Q, "com.contentsquare.androi…dingV1.Event.newBuilder()");
        C14622pe a = aVar.mo36181a(Q);
        C14428ic.C14429a aVar2 = C14428ic.f35650b;
        C14776ub.C14777a K = C14776ub.m63636K();
        Intrinsics.checkNotNullExpressionValue(K, "com.contentsquare.androi…ovalMutation.newBuilder()");
        C14428ic a2 = aVar2.mo35547a(K);
        a2.mo35545b(mo35368a());
        a2.mo35546c(this.f35660b);
        C11079d2 d2Var = C11079d2.f28267a;
        a.mo36178g(a2.mo35544a());
        return a.mo36172a();
    }

    public String toString() {
        String g4Var = mo34547c().toString();
        Intrinsics.checkNotNullExpressionValue(g4Var, "toProto().toString()");
        return g4Var;
    }
}
