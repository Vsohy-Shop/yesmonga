package com.contentsquare.android.sdk;

import com.contentsquare.android.sdk.C14256cd;
import com.contentsquare.android.sdk.C14518m4;
import com.contentsquare.android.sdk.C14608p4;
import com.contentsquare.android.sdk.C14622pe;
import kotlin.C11079d2;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.contentsquare.android.sdk.z */
public final class C14912z extends C14374ga {

    /* renamed from: b */
    public final C14348fg f36973b;

    /* renamed from: c */
    public final long f36974c;

    public C14912z(long j, long j2, C14507le leVar) {
        Intrinsics.checkNotNullParameter(leVar, "updateViewLight");
        this.f36974c = j2;
        mo35369b(j);
        this.f36973b = leVar.mo35848S();
    }

    /* renamed from: c */
    public C14518m4 mo34547c() {
        C14622pe.C14623a aVar = C14622pe.f36206b;
        C14518m4.C14519a Q = C14518m4.m62585Q();
        Intrinsics.checkNotNullExpressionValue(Q, "com.contentsquare.androi…dingV1.Event.newBuilder()");
        C14622pe a = aVar.mo36181a(Q);
        C14608p4.C14609a aVar2 = C14608p4.f36166b;
        C14256cd.C14257a L = C14256cd.m61344L();
        Intrinsics.checkNotNullExpressionValue(L, "com.contentsquare.androi…tyleMutation.newBuilder()");
        C14608p4 a2 = aVar2.mo36141a(L);
        a2.mo36138b(mo35368a());
        a2.mo36140d(this.f36974c);
        a2.mo36139c(this.f36973b);
        C11079d2 d2Var = C11079d2.f28267a;
        a.mo36179h(a2.mo36137a());
        return a.mo36172a();
    }

    public String toString() {
        String g4Var = mo34547c().toString();
        Intrinsics.checkNotNullExpressionValue(g4Var, "toProto().toString()");
        return g4Var;
    }
}
