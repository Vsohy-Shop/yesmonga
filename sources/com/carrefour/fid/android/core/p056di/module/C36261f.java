package com.carrefour.fid.android.core.p056di.module;

import com.carrefour.fid.android.core.auth.TokenRefresherImpl;
import com.carrefour.fid.android.shared.network.C28812h;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10335o;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r("javax.inject.Singleton")
/* renamed from: com.carrefour.fid.android.core.di.module.f */
public final class C36261f implements C10324h<C28812h> {

    /* renamed from: a */
    public final C36245c f89566a;

    /* renamed from: b */
    public final Provider<TokenRefresherImpl> f89567b;

    public C36261f(C36245c cVar, Provider<TokenRefresherImpl> provider) {
        this.f89566a = cVar;
        this.f89567b = provider;
    }

    /* renamed from: a */
    public static C36261f m148813a(C36245c cVar, Provider<TokenRefresherImpl> provider) {
        return new C36261f(cVar, provider);
    }

    /* renamed from: c */
    public static C28812h m148814c(C36245c cVar, TokenRefresherImpl tokenRefresherImpl) {
        return (C28812h) C10335o.m38554f(cVar.mo108213c(tokenRefresherImpl));
    }

    /* renamed from: b */
    public C28812h get() {
        return m148814c(this.f89566a, this.f89567b.get());
    }
}
