package com.carrefour.fid.android.core.p056di.module;

import com.carrefour.fid.android.core.auth.C36146b;
import com.carrefour.fid.android.core.auth.TokenRefresherImpl;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10335o;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;
import okhttp3.Authenticator;

@C10321e
@C10337q({"com.carrefour.fid.android.core.di.module.TokenAuthenticator"})
@C10338r("javax.inject.Singleton")
/* renamed from: com.carrefour.fid.android.core.di.module.d */
public final class C36246d implements C10324h<Authenticator> {

    /* renamed from: a */
    public final C36245c f89560a;

    /* renamed from: b */
    public final Provider<TokenRefresherImpl> f89561b;

    /* renamed from: c */
    public final Provider<C36146b> f89562c;

    public C36246d(C36245c cVar, Provider<TokenRefresherImpl> provider, Provider<C36146b> provider2) {
        this.f89560a = cVar;
        this.f89561b = provider;
        this.f89562c = provider2;
    }

    /* renamed from: a */
    public static C36246d m148769a(C36245c cVar, Provider<TokenRefresherImpl> provider, Provider<C36146b> provider2) {
        return new C36246d(cVar, provider, provider2);
    }

    /* renamed from: c */
    public static Authenticator m148770c(C36245c cVar, TokenRefresherImpl tokenRefresherImpl, C36146b bVar) {
        return (Authenticator) C10335o.m38554f(cVar.mo108211a(tokenRefresherImpl, bVar));
    }

    /* renamed from: b */
    public Authenticator get() {
        return m148770c(this.f89560a, this.f89561b.get(), this.f89562c.get());
    }
}
