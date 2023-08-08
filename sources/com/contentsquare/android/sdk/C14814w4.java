package com.contentsquare.android.sdk;

import com.contentsquare.android.sdk.C14309ed;
import com.contentsquare.android.sdk.C14518m4;
import com.contentsquare.android.sdk.C14622pe;
import com.contentsquare.android.sdk.C14707sd;
import java.util.ArrayList;
import java.util.List;
import kotlin.C11079d2;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.contentsquare.android.sdk.w4 */
public final class C14814w4 extends C14374ga {

    /* renamed from: b */
    public final List<Long> f36716b = new ArrayList();

    /* renamed from: c */
    public final List<Integer> f36717c = new ArrayList();

    /* renamed from: d */
    public final List<Integer> f36718d = new ArrayList();

    /* renamed from: c */
    public C14518m4 mo34547c() {
        C14622pe.C14623a aVar = C14622pe.f36206b;
        C14518m4.C14519a Q = C14518m4.m62585Q();
        Intrinsics.checkNotNullExpressionValue(Q, "com.contentsquare.androi…dingV1.Event.newBuilder()");
        C14622pe a = aVar.mo36181a(Q);
        C14309ed.C14310a aVar2 = C14309ed.f35330b;
        C14707sd.C14708a J = C14707sd.m63406J();
        Intrinsics.checkNotNullExpressionValue(J, "com.contentsquare.androi…TouchGesture.newBuilder()");
        C14309ed a2 = aVar2.mo35088a(J);
        a2.mo35082b(a2.mo35083c(), this.f36716b);
        a2.mo35084d(a2.mo35085e(), this.f36717c);
        a2.mo35086f(a2.mo35087g(), this.f36718d);
        C11079d2 d2Var = C11079d2.f28267a;
        a.mo36180i(a2.mo35081a());
        return a.mo36172a();
    }

    /* renamed from: d */
    public final void mo36674d(long j, int i, int i2) {
        this.f36716b.add(Long.valueOf(j));
        this.f36717c.add(Integer.valueOf(i));
        this.f36718d.add(Integer.valueOf(i2));
    }
}
