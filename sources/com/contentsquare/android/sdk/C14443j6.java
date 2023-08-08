package com.contentsquare.android.sdk;

import com.contentsquare.android.error.C14117a;
import com.contentsquare.android.sdk.C14301e7;
import com.contentsquare.android.sdk.C14518m4;
import com.contentsquare.android.sdk.C14622pe;
import com.contentsquare.android.sdk.C14640q5;
import kotlin.C11079d2;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.contentsquare.android.sdk.j6 */
public final class C14443j6 extends C14374ga {

    /* renamed from: b */
    public final C14117a f35683b;

    public C14443j6(C14117a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "event");
        this.f35683b = aVar;
        mo35369b(aVar.mo34373m());
    }

    /* renamed from: c */
    public C14518m4 mo34547c() {
        C14622pe.C14623a aVar = C14622pe.f36206b;
        C14518m4.C14519a Q = C14518m4.m62585Q();
        Intrinsics.checkNotNullExpressionValue(Q, "com.contentsquare.androi…dingV1.Event.newBuilder()");
        C14622pe a = aVar.mo36181a(Q);
        C14640q5.C14641a aVar2 = C14640q5.f36257b;
        C14301e7.C14302a O = C14301e7.m61489O();
        Intrinsics.checkNotNullExpressionValue(O, "com.contentsquare.androi…equestMetric.newBuilder()");
        C14640q5 a2 = aVar2.mo36230a(O);
        a2.mo36229g(this.f35683b.mo34373m());
        a2.mo36226d(this.f35683b.mo34369i());
        a2.mo36228f(this.f35683b.mo34374n());
        a2.mo36224b(this.f35683b.mo34372l());
        a2.mo36227e(this.f35683b.mo34371k());
        a2.mo36225c(this.f35683b.mo34370j());
        C11079d2 d2Var = C11079d2.f28267a;
        a.mo36175d(a2.mo36223a());
        return a.mo36172a();
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C14443j6) && Intrinsics.areEqual((Object) this.f35683b, (Object) ((C14443j6) obj).f35683b);
        }
        return true;
    }

    public int hashCode() {
        C14117a aVar = this.f35683b;
        if (aVar != null) {
            return aVar.hashCode();
        }
        return 0;
    }

    public String toString() {
        C14117a aVar = this.f35683b;
        return "NetworkSrEvent(event=" + aVar + ")";
    }
}
