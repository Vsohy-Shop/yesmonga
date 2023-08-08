package com.google.android.gms.common;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.common.s0 */
public final class C40931s0 extends C40962u0 {

    /* renamed from: f */
    public final Callable f104118f;

    public /* synthetic */ C40931s0(Callable callable, C40929r0 r0Var) {
        super(false, 1, 5, (String) null, (Throwable) null, (C40960t0) null);
        this.f104118f = callable;
    }

    /* renamed from: a */
    public final String mo134616a() {
        try {
            return (String) this.f104118f.call();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
