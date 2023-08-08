package com.carrefour.fid.android.data.repositories;

import android.content.Context;
import com.carrefour.fid.android.data.service.C36637p;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q({"dagger.hilt.android.qualifiers.ApplicationContext"})
@C10338r
/* renamed from: com.carrefour.fid.android.data.repositories.z */
public final class C36619z implements C10324h<StickersRepository> {

    /* renamed from: a */
    public final Provider<Context> f90532a;

    /* renamed from: b */
    public final Provider<C36637p> f90533b;

    public C36619z(Provider<Context> provider, Provider<C36637p> provider2) {
        this.f90532a = provider;
        this.f90533b = provider2;
    }

    /* renamed from: a */
    public static C36619z m150235a(Provider<Context> provider, Provider<C36637p> provider2) {
        return new C36619z(provider, provider2);
    }

    /* renamed from: c */
    public static StickersRepository m150236c(Context context, C36637p pVar) {
        return new StickersRepository(context, pVar);
    }

    /* renamed from: b */
    public StickersRepository get() {
        return m150236c(this.f90532a.get(), this.f90533b.get());
    }
}
