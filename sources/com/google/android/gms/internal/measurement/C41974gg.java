package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.measurement.gg */
public final class C41974gg extends C42011j {

    /* renamed from: c */
    public final Callable f106159c;

    public C41974gg(String str, Callable callable) {
        super("internal.appMetadata");
        this.f106159c = callable;
    }

    /* renamed from: a */
    public final C42133q mo136725a(C41909d5 d5Var, List list) {
        try {
            return C41947f7.m169877b(this.f106159c.call());
        } catch (Exception unused) {
            return C42133q.f106351H;
        }
    }
}
