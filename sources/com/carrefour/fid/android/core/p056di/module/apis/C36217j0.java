package com.carrefour.fid.android.core.p056di.module.apis;

import com.carrefour.fid.android.data.provider.headers.C36558a;
import com.carrefour.fid.android.data.provider.headers.C36569k;
import com.carrefour.fid.android.data.repositories.PaymentRepository;
import com.carrefour.fid.android.data.service.C36634m;
import com.carrefour.fid.android.shared.util.C28909d;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10335o;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r("javax.inject.Singleton")
/* renamed from: com.carrefour.fid.android.core.di.module.apis.j0 */
public final class C36217j0 implements C10324h<PaymentRepository> {

    /* renamed from: a */
    public final C36215i0 f89463a;

    /* renamed from: b */
    public final Provider<C36634m> f89464b;

    /* renamed from: c */
    public final Provider<C36558a> f89465c;

    /* renamed from: d */
    public final Provider<C36569k> f89466d;

    /* renamed from: e */
    public final Provider<C28909d> f89467e;

    public C36217j0(C36215i0 i0Var, Provider<C36634m> provider, Provider<C36558a> provider2, Provider<C36569k> provider3, Provider<C28909d> provider4) {
        this.f89463a = i0Var;
        this.f89464b = provider;
        this.f89465c = provider2;
        this.f89466d = provider3;
        this.f89467e = provider4;
    }

    /* renamed from: a */
    public static C36217j0 m148706a(C36215i0 i0Var, Provider<C36634m> provider, Provider<C36558a> provider2, Provider<C36569k> provider3, Provider<C28909d> provider4) {
        return new C36217j0(i0Var, provider, provider2, provider3, provider4);
    }

    /* renamed from: c */
    public static PaymentRepository m148707c(C36215i0 i0Var, C36634m mVar, C36558a aVar, C36569k kVar, C28909d dVar) {
        return (PaymentRepository) C10335o.m38554f(i0Var.mo108178a(mVar, aVar, kVar, dVar));
    }

    /* renamed from: b */
    public PaymentRepository get() {
        return m148707c(this.f89463a, this.f89464b.get(), this.f89465c.get(), this.f89466d.get(), this.f89467e.get());
    }
}
