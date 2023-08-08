package com.contentsquare.android.sdk;

import com.contentsquare.android.sdk.C14925z9;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.contentsquare.android.sdk.q3 */
public final class C14632q3 {

    /* renamed from: h */
    public static final C14633a f36225h = new C14633a((DefaultConstructorMarker) null);

    /* renamed from: a */
    public final long f36226a;

    /* renamed from: b */
    public long f36227b;

    /* renamed from: c */
    public long f36228c;

    /* renamed from: d */
    public long f36229d;

    /* renamed from: e */
    public long f36230e;

    /* renamed from: f */
    public long f36231f;

    /* renamed from: g */
    public final C14370g7 f36232g;

    /* renamed from: com.contentsquare.android.sdk.q3$a */
    public static final class C14633a {
        public C14633a() {
        }

        public /* synthetic */ C14633a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C14632q3(C14370g7 g7Var) {
        Intrinsics.checkNotNullParameter(g7Var, "systemClockInstantiable");
        this.f36232g = g7Var;
        this.f36226a = g7Var.mo35362a();
    }

    /* renamed from: a */
    public final String mo36195a() {
        long a = this.f36232g.mo35362a() - this.f36226a;
        long j = this.f36228c;
        long j2 = this.f36227b;
        long j3 = this.f36229d;
        long d = mo36198d();
        long f = mo36200f();
        long g = mo36201g(a);
        long j4 = this.f36231f;
        return "statistics of http post private calls:\n\trun from = " + a + " ms\n\tlast request size = " + j + " bytes\n\ttotal sent = " + j2 + " bytes\n\ttotal time spent = " + j3 + " ms\n\taverage throughput = " + d + " KB/sec\n\tlast request throughput = " + f + " KB/sec\n\tdata usage = " + g + " KB/min\n\ttotal number of requests = " + j4;
    }

    /* renamed from: b */
    public final void mo36196b(long j) {
        this.f36227b += j;
        this.f36228c = j;
    }

    /* renamed from: c */
    public final void mo36197c(C14925z9.C14926a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "httpResponse");
        mo36199e(aVar.mo36971j());
        mo36196b(aVar.mo36962a());
        this.f36231f++;
    }

    /* renamed from: d */
    public final long mo36198d() {
        return C14415i4.m62085b(this.f36227b, this.f36229d);
    }

    /* renamed from: e */
    public final void mo36199e(long j) {
        this.f36229d += j;
        this.f36230e = j;
    }

    /* renamed from: f */
    public final long mo36200f() {
        return C14415i4.m62085b(this.f36228c, this.f36230e);
    }

    /* renamed from: g */
    public final long mo36201g(long j) {
        return C14415i4.m62085b(this.f36227b, j / ((long) 60));
    }
}
