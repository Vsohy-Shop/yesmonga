package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;

/* renamed from: com.google.android.gms.internal.measurement.j6 */
public final class C42018j6 extends ContentObserver {

    /* renamed from: a */
    public final /* synthetic */ C42036k6 f106233a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C42018j6(C42036k6 k6Var, Handler handler) {
        super((Handler) null);
        this.f106233a = k6Var;
    }

    public final void onChange(boolean z) {
        this.f106233a.mo137070f();
    }
}
