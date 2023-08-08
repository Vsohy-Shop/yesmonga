package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.common.util.C40979g;

/* renamed from: com.google.android.gms.measurement.internal.v9 */
public final class C30917v9 {

    /* renamed from: a */
    public final C40979g f74032a;

    /* renamed from: b */
    public long f74033b;

    public C30917v9(C40979g gVar) {
        C40843u.m166202l(gVar);
        this.f74032a = gVar;
    }

    /* renamed from: a */
    public final void mo87558a() {
        this.f74033b = 0;
    }

    /* renamed from: b */
    public final void mo87559b() {
        this.f74033b = this.f74032a.mo134770c();
    }

    /* renamed from: c */
    public final boolean mo87560c(long j) {
        return this.f74033b == 0 || this.f74032a.mo134770c() - this.f74033b >= 3600000;
    }
}
