package com.carrefour.fid.android.core.auth;

import com.carrefour.fid.android.account.data.repositories.LoginRepository;
import com.carrefour.fid.android.domain.interactors.logm.C37694a;
import com.carrefour.fid.android.shared.data.datastore.pref.BaseAppPreferencesStorage;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineDispatcher;

@C10321e
@C10337q({"com.carrefour.fid.android.shared.di.annotation.IoDispatcher"})
@C10338r("javax.inject.Singleton")
/* renamed from: com.carrefour.fid.android.core.auth.i */
public final class C36154i implements C10324h<TokenRefresherImpl> {

    /* renamed from: a */
    public final Provider<LoginRepository> f89238a;

    /* renamed from: b */
    public final Provider<CoroutineDispatcher> f89239b;

    /* renamed from: c */
    public final Provider<C37694a> f89240c;

    /* renamed from: d */
    public final Provider<BaseAppPreferencesStorage> f89241d;

    public C36154i(Provider<LoginRepository> provider, Provider<CoroutineDispatcher> provider2, Provider<C37694a> provider3, Provider<BaseAppPreferencesStorage> provider4) {
        this.f89238a = provider;
        this.f89239b = provider2;
        this.f89240c = provider3;
        this.f89241d = provider4;
    }

    /* renamed from: a */
    public static C36154i m148558a(Provider<LoginRepository> provider, Provider<CoroutineDispatcher> provider2, Provider<C37694a> provider3, Provider<BaseAppPreferencesStorage> provider4) {
        return new C36154i(provider, provider2, provider3, provider4);
    }

    /* renamed from: c */
    public static TokenRefresherImpl m148559c(LoginRepository loginRepository, CoroutineDispatcher coroutineDispatcher, C37694a aVar, BaseAppPreferencesStorage baseAppPreferencesStorage) {
        return new TokenRefresherImpl(loginRepository, coroutineDispatcher, aVar, baseAppPreferencesStorage);
    }

    /* renamed from: b */
    public TokenRefresherImpl get() {
        return m148559c(this.f89238a.get(), this.f89239b.get(), this.f89240c.get(), this.f89241d.get());
    }
}
