package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C42111ob;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.r4 */
public final /* synthetic */ class C30864r4 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C30936x4 f73905a;

    /* renamed from: b */
    public final /* synthetic */ String f73906b;

    public /* synthetic */ C30864r4(C30936x4 x4Var, String str) {
        this.f73905a = x4Var;
        this.f73906b = str;
    }

    public final Object call() {
        return new C42111ob("internal.remoteConfig", new C30924w4(this.f73905a, this.f73906b));
    }
}
