package com.google.android.play.core.internal;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.google.android.play.core.internal.t0 */
public final class C32090t0 extends C32087s0 {

    /* renamed from: a */
    public final C32087s0 f78288a;

    /* renamed from: b */
    public final long f78289b;

    /* renamed from: c */
    public final long f78290c;

    public C32090t0(C32087s0 s0Var, long j, long j2) {
        this.f78288a = s0Var;
        long d = mo92828d(j);
        this.f78289b = d;
        this.f78290c = mo92828d(d + j2);
    }

    /* renamed from: a */
    public final long mo92549a() {
        return this.f78290c - this.f78289b;
    }

    /* renamed from: b */
    public final InputStream mo92550b(long j, long j2) throws IOException {
        long d = mo92828d(this.f78289b);
        return this.f78288a.mo92550b(d, mo92828d(j2 + d) - d);
    }

    public final void close() throws IOException {
    }

    /* renamed from: d */
    public final long mo92828d(long j) {
        if (j < 0) {
            return 0;
        }
        return j > this.f78288a.mo92549a() ? this.f78288a.mo92549a() : j;
    }
}
