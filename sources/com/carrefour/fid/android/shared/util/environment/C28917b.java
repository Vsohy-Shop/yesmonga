package com.carrefour.fid.android.shared.util.environment;

import android.content.Context;
import com.carrefour.fid.android.shared.app.C28443a;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q({"dagger.hilt.android.qualifiers.ApplicationContext"})
@C10338r("javax.inject.Singleton")
/* renamed from: com.carrefour.fid.android.shared.util.environment.b */
public final class C28917b implements C10324h<AppEnvironment> {

    /* renamed from: a */
    public final Provider<Context> f70841a;

    /* renamed from: b */
    public final Provider<C28443a> f70842b;

    public C28917b(Provider<Context> provider, Provider<C28443a> provider2) {
        this.f70841a = provider;
        this.f70842b = provider2;
    }

    /* renamed from: a */
    public static C28917b m119609a(Provider<Context> provider, Provider<C28443a> provider2) {
        return new C28917b(provider, provider2);
    }

    /* renamed from: c */
    public static AppEnvironment m119610c(Context context, C28443a aVar) {
        return new AppEnvironment(context, aVar);
    }

    /* renamed from: b */
    public AppEnvironment get() {
        return m119610c(this.f70841a.get(), this.f70842b.get());
    }
}
