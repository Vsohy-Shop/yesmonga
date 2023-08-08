package com.carrefour.fid.android.data.repositories;

import android.content.Context;
import com.carrefour.fid.android.data.service.C36623c;
import com.carrefour.fid.android.data.service.C36624d;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q({"dagger.hilt.android.qualifiers.ApplicationContext"})
@C10338r
/* renamed from: com.carrefour.fid.android.data.repositories.e */
public final class C36598e implements C10324h<ArsenalGameRepository> {

    /* renamed from: a */
    public final Provider<Context> f90475a;

    /* renamed from: b */
    public final Provider<C36623c> f90476b;

    /* renamed from: c */
    public final Provider<C36624d> f90477c;

    public C36598e(Provider<Context> provider, Provider<C36623c> provider2, Provider<C36624d> provider3) {
        this.f90475a = provider;
        this.f90476b = provider2;
        this.f90477c = provider3;
    }

    /* renamed from: a */
    public static C36598e m150173a(Provider<Context> provider, Provider<C36623c> provider2, Provider<C36624d> provider3) {
        return new C36598e(provider, provider2, provider3);
    }

    /* renamed from: c */
    public static ArsenalGameRepository m150174c(Context context, C36623c cVar, C36624d dVar) {
        return new ArsenalGameRepository(context, cVar, dVar);
    }

    /* renamed from: b */
    public ArsenalGameRepository get() {
        return m150174c(this.f90475a.get(), this.f90476b.get(), this.f90477c.get());
    }
}
