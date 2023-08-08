package com.carrefour.fid.android.domain.interactors.product.recommended;

import com.carrefour.fid.android.account.data.repositories.LoginRepository;
import com.carrefour.fid.android.domain.interactors.additionalorder.C37540a;
import com.carrefour.fid.android.domain.interactors.basket.C37566e0;
import com.carrefour.fid.android.domain.interactors.favorites.shoppinglist.C37681b;
import com.carrefour.fid.android.domain.interactors.product.C37776o;
import com.carrefour.fid.android.domain.repositories.C38199h;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.domain.interactors.product.recommended.a */
public final class C37784a implements C10324h<LoadBasketBuilderUseCase> {

    /* renamed from: a */
    public final Provider<C37681b> f94828a;

    /* renamed from: b */
    public final Provider<C37540a> f94829b;

    /* renamed from: c */
    public final Provider<C37776o> f94830c;

    /* renamed from: d */
    public final Provider<C38199h> f94831d;

    /* renamed from: e */
    public final Provider<LoginRepository> f94832e;

    /* renamed from: f */
    public final Provider<C37566e0> f94833f;

    public C37784a(Provider<C37681b> provider, Provider<C37540a> provider2, Provider<C37776o> provider3, Provider<C38199h> provider4, Provider<LoginRepository> provider5, Provider<C37566e0> provider6) {
        this.f94828a = provider;
        this.f94829b = provider2;
        this.f94830c = provider3;
        this.f94831d = provider4;
        this.f94832e = provider5;
        this.f94833f = provider6;
    }

    /* renamed from: a */
    public static C37784a m154879a(Provider<C37681b> provider, Provider<C37540a> provider2, Provider<C37776o> provider3, Provider<C38199h> provider4, Provider<LoginRepository> provider5, Provider<C37566e0> provider6) {
        return new C37784a(provider, provider2, provider3, provider4, provider5, provider6);
    }

    /* renamed from: c */
    public static LoadBasketBuilderUseCase m154880c(C37681b bVar, C37540a aVar, C37776o oVar, C38199h hVar, LoginRepository loginRepository, C37566e0 e0Var) {
        return new LoadBasketBuilderUseCase(bVar, aVar, oVar, hVar, loginRepository, e0Var);
    }

    /* renamed from: b */
    public LoadBasketBuilderUseCase get() {
        return m154880c(this.f94828a.get(), this.f94829b.get(), this.f94830c.get(), this.f94831d.get(), this.f94832e.get(), this.f94833f.get());
    }
}
