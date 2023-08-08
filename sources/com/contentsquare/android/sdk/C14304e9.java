package com.contentsquare.android.sdk;

import com.contentsquare.android.sdk.C14385h0;
import com.contentsquare.android.sdk.C14518m4;
import com.contentsquare.android.sdk.C14523m8;
import com.contentsquare.android.sdk.C14622pe;
import kotlin.C11079d2;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.contentsquare.android.sdk.e9 */
public final class C14304e9 extends C14374ga {

    /* renamed from: b */
    public final long f35325b;

    /* renamed from: c */
    public final String f35326c;

    /* renamed from: d */
    public final long f35327d;

    public C14304e9(long j, String str, long j2) {
        Intrinsics.checkNotNullParameter(str, "event");
        this.f35325b = j;
        this.f35326c = str;
        this.f35327d = j2;
        mo35369b(j2);
    }

    /* renamed from: c */
    public C14518m4 mo34547c() {
        C14622pe.C14623a aVar = C14622pe.f36206b;
        C14518m4.C14519a Q = C14518m4.m62585Q();
        Intrinsics.checkNotNullExpressionValue(Q, "com.contentsquare.androi…dingV1.Event.newBuilder()");
        C14622pe a = aVar.mo36181a(Q);
        C14523m8.C14524a aVar2 = C14523m8.f35929b;
        C14385h0.C14386a L = C14385h0.m61950L();
        Intrinsics.checkNotNullExpressionValue(L, "com.contentsquare.androi…WebviewEvent.newBuilder()");
        C14523m8 a2 = aVar2.mo35911a(L);
        a2.mo35909c(this.f35326c);
        a2.mo35910d(this.f35325b);
        a2.mo35908b(this.f35327d);
        C11079d2 d2Var = C11079d2.f28267a;
        a.mo36173b(a2.mo35907a());
        return a.mo36172a();
    }

    public boolean equals(Object obj) {
        if (obj instanceof C14304e9) {
            C14304e9 e9Var = (C14304e9) obj;
            return this.f35325b == e9Var.f35325b && Intrinsics.areEqual((Object) this.f35326c, (Object) e9Var.f35326c) && this.f35327d == e9Var.f35327d;
        }
    }

    public int hashCode() {
        return ((((this.f35326c.hashCode() + 31) * 31) + Long.hashCode(this.f35325b)) * 31) + Long.hashCode(this.f35327d);
    }

    public String toString() {
        long j = this.f35325b;
        String str = this.f35326c;
        long j2 = this.f35327d;
        return "WebviewSrEvent(webviewId=" + j + ", event=" + str + ", timestampMs=" + j2 + ")";
    }
}
