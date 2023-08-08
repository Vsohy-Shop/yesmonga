package com.contentsquare.android.sdk;

import com.contentsquare.android.sdk.C14206b3;
import com.contentsquare.android.sdk.C14462k2;
import com.contentsquare.android.sdk.C14518m4;
import com.contentsquare.android.sdk.C14590ob;
import com.contentsquare.android.sdk.C14622pe;
import com.contentsquare.android.sdk.C14628q1;
import kotlin.C11079d2;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.contentsquare.android.sdk.v0 */
public final class C14785v0 extends C14374ga {

    /* renamed from: b */
    public final C14889y8 f36662b;

    /* renamed from: c */
    public final C14923z8 f36663c;

    /* renamed from: d */
    public final C14923z8 f36664d;

    /* renamed from: e */
    public final int f36665e;

    /* renamed from: f */
    public final int f36666f;

    public C14785v0(long j, C14889y8 y8Var, C14923z8 z8Var, C14923z8 z8Var2, int i, int i2) {
        Intrinsics.checkNotNullParameter(y8Var, "changeReason");
        Intrinsics.checkNotNullParameter(z8Var, "previousQualityLevel");
        Intrinsics.checkNotNullParameter(z8Var2, "currentQualityLevel");
        this.f36662b = y8Var;
        this.f36663c = z8Var;
        this.f36664d = z8Var2;
        this.f36665e = i;
        this.f36666f = i2;
        mo35369b(j);
    }

    /* renamed from: c */
    public C14518m4 mo34547c() {
        C14622pe.C14623a aVar = C14622pe.f36206b;
        C14518m4.C14519a Q = C14518m4.m62585Q();
        Intrinsics.checkNotNullExpressionValue(Q, "com.contentsquare.androi…dingV1.Event.newBuilder()");
        C14622pe a = aVar.mo36181a(Q);
        C14628q1.C14629a.C14630a aVar2 = C14628q1.C14629a.f36222b;
        C14590ob.C14591a M = C14590ob.m62848M();
        Intrinsics.checkNotNullExpressionValue(M, "com.contentsquare.androi…tingsApplied.newBuilder()");
        C14628q1.C14629a a2 = aVar2.mo36191a(M);
        a2.mo36187b(mo35368a());
        a2.mo36190e(mo36596e(this.f36662b));
        C14628q1 q1Var = C14628q1.f36221a;
        C14206b3.C14207a aVar3 = C14206b3.f35095b;
        C14590ob.C14594c.C14595a K = C14590ob.C14594c.m62866K();
        Intrinsics.checkNotNullExpressionValue(K, "com.contentsquare.androi…ualityLevels.newBuilder()");
        C14206b3 a3 = aVar3.mo34648a(K);
        a3.mo34647c(mo36597f(this.f36663c));
        a3.mo34646b(mo36597f(this.f36664d));
        C11079d2 d2Var = C11079d2.f28267a;
        a2.mo36189d(a3.mo34645a());
        C14462k2.C14463a aVar4 = C14462k2.f35720b;
        C14590ob.C14592b.C14593a K2 = C14590ob.C14592b.m62859K();
        Intrinsics.checkNotNullExpressionValue(K2, "com.contentsquare.androi…etworkValues.newBuilder()");
        C14462k2 a4 = aVar4.mo35703a(K2);
        a4.mo35702c(mo36595d(this.f36665e));
        a4.mo35701b(mo36595d(this.f36666f));
        a2.mo36188c(a4.mo35700a());
        a.mo36176e(a2.mo36186a());
        return a.mo36172a();
    }

    /* renamed from: d */
    public final C14529mb mo36595d(int i) {
        return (i == -1 || i == 0) ? C14529mb.NETWORK_STATUS_OFFLINE : i != 1 ? C14529mb.NETWORK_STATUS_CELLULAR : C14529mb.NETWORK_STATUS_WIFI;
    }

    /* renamed from: e */
    public final C14590ob.C14596d mo36596e(C14889y8 y8Var) {
        int i = C14196b0.f35081a[y8Var.ordinal()];
        if (i == 1) {
            return C14590ob.C14596d.REASON_CONFIG_APPLIED;
        }
        if (i == 2) {
            return C14590ob.C14596d.REASON_NETWORK_CHANGED;
        }
        if (i == 3) {
            return C14590ob.C14596d.REASON_CPU_USAGE_CHANGED;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: f */
    public final C14617pb mo36597f(C14923z8 z8Var) {
        int i = C14196b0.f35082b[z8Var.ordinal()];
        if (i == 1) {
            return C14617pb.RECORDING_QUALITY_LOW;
        }
        if (i == 2) {
            return C14617pb.RECORDING_QUALITY_MEDIUM;
        }
        if (i == 3) {
            return C14617pb.RECORDING_QUALITY_HIGH;
        }
        throw new NoWhenBranchMatchedException();
    }

    public String toString() {
        String g4Var = mo34547c().toString();
        Intrinsics.checkNotNullExpressionValue(g4Var, "toProto().toString()");
        return g4Var;
    }
}
