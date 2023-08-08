package com.contentsquare.android.sdk;

import com.contentsquare.android.sdk.C14318f2;
import com.contentsquare.android.sdk.C14518m4;
import com.contentsquare.android.sdk.C14622pe;
import com.contentsquare.android.sdk.C14815w5;
import kotlin.C11079d2;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.contentsquare.android.sdk.bg */
public final class C14230bg extends C14374ga {

    /* renamed from: b */
    public final C14833wb f35146b;

    /* renamed from: c */
    public final long f35147c;

    /* renamed from: d */
    public final int f35148d;

    public C14230bg(long j, long j2, int i, C14507le leVar) {
        Intrinsics.checkNotNullParameter(leVar, "insertionView");
        this.f35147c = j2;
        this.f35148d = i;
        mo35369b(j);
        this.f35146b = leVar.mo35849T();
    }

    /* renamed from: c */
    public C14518m4 mo34547c() {
        C14622pe.C14623a aVar = C14622pe.f36206b;
        C14518m4.C14519a Q = C14518m4.m62585Q();
        Intrinsics.checkNotNullExpressionValue(Q, "com.contentsquare.androi…dingV1.Event.newBuilder()");
        C14622pe a = aVar.mo36181a(Q);
        C14318f2.C14319a aVar2 = C14318f2.f35350b;
        C14815w5.C14816a M = C14815w5.m63836M();
        Intrinsics.checkNotNullExpressionValue(M, "com.contentsquare.androi…tionMutation.newBuilder()");
        C14318f2 a2 = aVar2.mo35111a(M);
        long j = this.f35147c;
        if (j != -1) {
            a2.mo35108c(j);
        }
        int i = this.f35148d;
        if (i != -1) {
            a2.mo35107b(i);
        }
        a2.mo35110e(mo35368a());
        a2.mo35109d(this.f35146b);
        C11079d2 d2Var = C11079d2.f28267a;
        a.mo36174c(a2.mo35106a());
        return a.mo36172a();
    }

    public String toString() {
        String g4Var = mo34547c().toString();
        Intrinsics.checkNotNullExpressionValue(g4Var, "toProto().toString()");
        return g4Var;
    }
}
