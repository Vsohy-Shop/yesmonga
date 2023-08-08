package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C41974gg;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.s4 */
public final /* synthetic */ class C30876s4 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C30936x4 f73936a;

    /* renamed from: b */
    public final /* synthetic */ String f73937b;

    public /* synthetic */ C30876s4(C30936x4 x4Var, String str) {
        this.f73936a = x4Var;
        this.f73937b = str;
    }

    public final Object call() {
        return new C41974gg("internal.appMetadata", new C30852q4(this.f73936a, this.f73937b));
    }
}
