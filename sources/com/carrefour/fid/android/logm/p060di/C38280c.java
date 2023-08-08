package com.carrefour.fid.android.logm.p060di;

import android.content.Context;
import com.carrefour.fid.android.logm.data.service.C38276a;
import com.carrefour.fid.android.shared.util.C28909d;
import com.carrefour.fid.android.shared.util.environment.AppEnvironment;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10335o;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q({"dagger.hilt.android.qualifiers.ApplicationContext"})
@C10338r
/* renamed from: com.carrefour.fid.android.logm.di.c */
public final class C38280c implements C10324h<C38276a> {

    /* renamed from: a */
    public final Provider<Context> f96964a;

    /* renamed from: b */
    public final Provider<AppEnvironment> f96965b;

    /* renamed from: c */
    public final Provider<C28909d> f96966c;

    public C38280c(Provider<Context> provider, Provider<AppEnvironment> provider2, Provider<C28909d> provider3) {
        this.f96964a = provider;
        this.f96965b = provider2;
        this.f96966c = provider3;
    }

    /* renamed from: a */
    public static C38280c m158589a(Provider<Context> provider, Provider<AppEnvironment> provider2, Provider<C28909d> provider3) {
        return new C38280c(provider, provider2, provider3);
    }

    /* renamed from: c */
    public static C38276a m158590c(Context context, AppEnvironment appEnvironment, C28909d dVar) {
        return (C38276a) C10335o.m38554f(C38278b.f96962a.mo119875a(context, appEnvironment, dVar));
    }

    /* renamed from: b */
    public C38276a get() {
        return m158590c(this.f96964a.get(), this.f96965b.get(), this.f96966c.get());
    }
}
