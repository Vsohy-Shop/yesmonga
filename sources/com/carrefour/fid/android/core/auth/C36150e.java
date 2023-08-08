package com.carrefour.fid.android.core.auth;

import com.carrefour.fid.android.domain.interactors.logm.C37694a;
import com.carrefour.fid.android.shared.data.datastore.pref.BaseAppPreferencesStorage;
import com.carrefour.fid.android.shared.util.C28909d;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;
import kotlinx.coroutines.C12074o0;
import okhttp3.Authenticator;

@C10321e
@C10337q({"com.carrefour.fid.android.shared.di.annotation.ApplicationScope", "com.carrefour.fid.android.core.di.module.TokenAuthenticator"})
@C10338r
/* renamed from: com.carrefour.fid.android.core.auth.e */
public final class C36150e implements C10324h<TokenAuthenticator> {

    /* renamed from: a */
    public final Provider<C12074o0> f89227a;

    /* renamed from: b */
    public final Provider<Authenticator> f89228b;

    /* renamed from: c */
    public final Provider<C37694a> f89229c;

    /* renamed from: d */
    public final Provider<C28909d> f89230d;

    /* renamed from: e */
    public final Provider<BaseAppPreferencesStorage> f89231e;

    public C36150e(Provider<C12074o0> provider, Provider<Authenticator> provider2, Provider<C37694a> provider3, Provider<C28909d> provider4, Provider<BaseAppPreferencesStorage> provider5) {
        this.f89227a = provider;
        this.f89228b = provider2;
        this.f89229c = provider3;
        this.f89230d = provider4;
        this.f89231e = provider5;
    }

    /* renamed from: a */
    public static C36150e m148552a(Provider<C12074o0> provider, Provider<Authenticator> provider2, Provider<C37694a> provider3, Provider<C28909d> provider4, Provider<BaseAppPreferencesStorage> provider5) {
        return new C36150e(provider, provider2, provider3, provider4, provider5);
    }

    /* renamed from: c */
    public static TokenAuthenticator m148553c(C12074o0 o0Var, Authenticator authenticator, C37694a aVar, C28909d dVar, BaseAppPreferencesStorage baseAppPreferencesStorage) {
        return new TokenAuthenticator(o0Var, authenticator, aVar, dVar, baseAppPreferencesStorage);
    }

    /* renamed from: b */
    public TokenAuthenticator get() {
        return m148553c(this.f89227a.get(), this.f89228b.get(), this.f89229c.get(), this.f89230d.get(), this.f89231e.get());
    }
}
