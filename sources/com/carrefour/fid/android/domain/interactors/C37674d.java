package com.carrefour.fid.android.domain.interactors;

import com.carrefour.fid.android.shared.util.environment.AppEnvironment;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.domain.interactors.d */
public final class C37674d implements C10324h<C37607c> {

    /* renamed from: a */
    public final Provider<AppEnvironment> f94532a;

    public C37674d(Provider<AppEnvironment> provider) {
        this.f94532a = provider;
    }

    /* renamed from: a */
    public static C37674d m154437a(Provider<AppEnvironment> provider) {
        return new C37674d(provider);
    }

    /* renamed from: c */
    public static C37607c m154438c(AppEnvironment appEnvironment) {
        return new C37607c(appEnvironment);
    }

    /* renamed from: b */
    public C37607c get() {
        return m154438c(this.f94532a.get());
    }
}
