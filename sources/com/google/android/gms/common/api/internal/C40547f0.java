package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.C40663m;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.common.api.internal.f0 */
public final class C40547f0 implements C40663m.C40664a {

    /* renamed from: a */
    public final /* synthetic */ BasePendingResult f103362a;

    /* renamed from: b */
    public final /* synthetic */ C40559h0 f103363b;

    public C40547f0(C40559h0 h0Var, BasePendingResult basePendingResult) {
        this.f103363b = h0Var;
        this.f103362a = basePendingResult;
    }

    /* renamed from: a */
    public final void mo133895a(Status status) {
        this.f103363b.f103380a.remove(this.f103362a);
    }
}
