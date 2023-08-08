package com.carrefour.fid.android.data.repositories;

import com.carrefour.fid.android.data.provider.headers.C36558a;
import com.carrefour.fid.android.data.provider.headers.C36569k;
import com.carrefour.fid.android.data.service.C36634m;
import com.carrefour.fid.android.shared.util.C28909d;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.data.repositories.u */
public final class C36614u implements C10324h<PaymentRepository> {

    /* renamed from: a */
    public final Provider<C36634m> f90523a;

    /* renamed from: b */
    public final Provider<C36558a> f90524b;

    /* renamed from: c */
    public final Provider<C36569k> f90525c;

    /* renamed from: d */
    public final Provider<C28909d> f90526d;

    public C36614u(Provider<C36634m> provider, Provider<C36558a> provider2, Provider<C36569k> provider3, Provider<C28909d> provider4) {
        this.f90523a = provider;
        this.f90524b = provider2;
        this.f90525c = provider3;
        this.f90526d = provider4;
    }

    /* renamed from: a */
    public static C36614u m150220a(Provider<C36634m> provider, Provider<C36558a> provider2, Provider<C36569k> provider3, Provider<C28909d> provider4) {
        return new C36614u(provider, provider2, provider3, provider4);
    }

    /* renamed from: c */
    public static PaymentRepository m150221c(C36634m mVar, C36558a aVar, C36569k kVar, C28909d dVar) {
        return new PaymentRepository(mVar, aVar, kVar, dVar);
    }

    /* renamed from: b */
    public PaymentRepository get() {
        return m150221c(this.f90523a.get(), this.f90524b.get(), this.f90525c.get(), this.f90526d.get());
    }
}
