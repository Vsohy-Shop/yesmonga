package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.C40663m;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C40839t;
import com.google.android.gms.tasks.C31049l;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.common.internal.w0 */
public final class C40850w0 implements C40663m.C40664a {

    /* renamed from: a */
    public final /* synthetic */ C40663m f103954a;

    /* renamed from: b */
    public final /* synthetic */ C31049l f103955b;

    /* renamed from: c */
    public final /* synthetic */ C40839t.C40840a f103956c;

    /* renamed from: d */
    public final /* synthetic */ C40862z0 f103957d;

    public C40850w0(C40663m mVar, C31049l lVar, C40839t.C40840a aVar, C40862z0 z0Var) {
        this.f103954a = mVar;
        this.f103955b = lVar;
        this.f103956c = aVar;
        this.f103957d = z0Var;
    }

    /* renamed from: a */
    public final void mo133895a(Status status) {
        if (status.mo133655p0()) {
            this.f103955b.mo87743c(this.f103956c.mo134504a(this.f103954a.mo133785e(0, TimeUnit.MILLISECONDS)));
            return;
        }
        this.f103955b.mo87742b(C40737c.m165762a(status));
    }
}
