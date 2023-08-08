package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.common.util.C40979g;

/* renamed from: com.google.android.gms.internal.gtm.q4 */
public final class C41515q4 {

    /* renamed from: a */
    public final C40979g f104894a;

    /* renamed from: b */
    public long f104895b;

    public C41515q4(C40979g gVar) {
        C40843u.m166202l(gVar);
        this.f104894a = gVar;
    }

    /* renamed from: a */
    public final void mo135769a() {
        this.f104895b = 0;
    }

    /* renamed from: b */
    public final void mo135770b() {
        this.f104895b = this.f104894a.mo134770c();
    }

    /* renamed from: c */
    public final boolean mo135771c(long j) {
        if (this.f104895b != 0 && this.f104894a.mo134770c() - this.f104895b <= j) {
            return false;
        }
        return true;
    }

    public C41515q4(C40979g gVar, long j) {
        C40843u.m166202l(gVar);
        this.f104894a = gVar;
        this.f104895b = j;
    }
}
