package com.contentsquare.android.sdk;

import com.contentsquare.android.sdk.C14371g8;
import com.contentsquare.android.sdk.C14518m4;
import com.contentsquare.android.sdk.C14622pe;
import com.contentsquare.android.sdk.C14649qb;
import kotlin.C11079d2;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.contentsquare.android.sdk.af */
public final class C14190af extends C14374ga {

    /* renamed from: b */
    public final C14896yc f35070b;

    /* renamed from: c */
    public final boolean f35071c;

    public C14190af(long j, C14896yc ycVar, boolean z) {
        Intrinsics.checkNotNullParameter(ycVar, "reason");
        this.f35070b = ycVar;
        this.f35071c = z;
        mo35369b(j);
    }

    /* renamed from: c */
    public C14518m4 mo34547c() {
        C14622pe.C14623a aVar = C14622pe.f36206b;
        C14518m4.C14519a Q = C14518m4.m62585Q();
        Intrinsics.checkNotNullExpressionValue(Q, "com.contentsquare.androi…dingV1.Event.newBuilder()");
        C14622pe a = aVar.mo36181a(Q);
        C14371g8.C14372a aVar2 = C14371g8.f35548b;
        C14649qb.C14650a L = C14649qb.m63192L();
        Intrinsics.checkNotNullExpressionValue(L, "com.contentsquare.androi…cordingStart.newBuilder()");
        C14371g8 a2 = aVar2.mo35367a(L);
        a2.mo35364b(mo35368a());
        a2.mo35365c(mo34548d(this.f35070b));
        a2.mo35366d(this.f35071c);
        C11079d2 d2Var = C11079d2.f28267a;
        a.mo36177f(a2.mo35363a());
        return a.mo36172a();
    }

    /* renamed from: d */
    public final C14649qb.C14651b mo34548d(C14896yc ycVar) {
        int i = C14452je.f35698a[ycVar.ordinal()];
        if (i == 1) {
            return C14649qb.C14651b.START_REASON_REGULAR;
        }
        if (i == 2) {
            return C14649qb.C14651b.START_REASON_FORCED;
        }
        throw new NoWhenBranchMatchedException();
    }

    public String toString() {
        String g4Var = mo34547c().toString();
        Intrinsics.checkNotNullExpressionValue(g4Var, "toProto().toString()");
        return g4Var;
    }
}
