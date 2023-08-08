package com.google.mlkit.common.sdkinternal;

import com.google.android.gms.common.internal.C40843u;
import java.io.Closeable;

/* renamed from: com.google.mlkit.common.sdkinternal.i0 */
public final class C33946i0 implements Closeable {

    /* renamed from: a */
    public final /* synthetic */ C33971p f82365a;

    public /* synthetic */ C33946i0(C33971p pVar, C33944h0 h0Var) {
        boolean z;
        this.f82365a = pVar;
        if (((Thread) pVar.f82473d.getAndSet(Thread.currentThread())) == null) {
            z = true;
        } else {
            z = false;
        }
        C40843u.m166208r(z);
    }

    public final void close() {
        this.f82365a.f82473d.set((Object) null);
        this.f82365a.mo98828e();
    }
}
