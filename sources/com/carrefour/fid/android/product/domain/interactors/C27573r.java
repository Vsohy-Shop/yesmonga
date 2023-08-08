package com.carrefour.fid.android.product.domain.interactors;

import com.carrefour.fid.android.domain.interactors.basket.C37559b0;
import com.carrefour.fid.android.domain.interactors.basket.C37606z;
import com.carrefour.fid.android.domain.interactors.favorites.shoppinglist.C37681b;
import com.carrefour.fid.android.domain.interactors.favorites.shoppinglist.C37682c;
import com.carrefour.fid.android.domain.interactors.slot.C37857d;
import com.carrefour.fid.android.performance.C38328d;
import com.carrefour.fid.android.product.domain.repositories.ProductRepository;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.product.domain.interactors.r */
public final class C27573r implements C10324h<ProductGetOldProductFlowUseCase> {

    /* renamed from: a */
    public final Provider<ProductRepository> f66970a;

    /* renamed from: b */
    public final Provider<C37857d> f66971b;

    /* renamed from: c */
    public final Provider<C37682c> f66972c;

    /* renamed from: d */
    public final Provider<C37606z> f66973d;

    /* renamed from: e */
    public final Provider<C37559b0> f66974e;

    /* renamed from: f */
    public final Provider<C37681b> f66975f;

    /* renamed from: g */
    public final Provider<C38328d> f66976g;

    public C27573r(Provider<ProductRepository> provider, Provider<C37857d> provider2, Provider<C37682c> provider3, Provider<C37606z> provider4, Provider<C37559b0> provider5, Provider<C37681b> provider6, Provider<C38328d> provider7) {
        this.f66970a = provider;
        this.f66971b = provider2;
        this.f66972c = provider3;
        this.f66973d = provider4;
        this.f66974e = provider5;
        this.f66975f = provider6;
        this.f66976g = provider7;
    }

    /* renamed from: a */
    public static C27573r m116000a(Provider<ProductRepository> provider, Provider<C37857d> provider2, Provider<C37682c> provider3, Provider<C37606z> provider4, Provider<C37559b0> provider5, Provider<C37681b> provider6, Provider<C38328d> provider7) {
        return new C27573r(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    /* renamed from: c */
    public static ProductGetOldProductFlowUseCase m116001c(ProductRepository productRepository, C37857d dVar, C37682c cVar, C37606z zVar, C37559b0 b0Var, C37681b bVar, C38328d dVar2) {
        return new ProductGetOldProductFlowUseCase(productRepository, dVar, cVar, zVar, b0Var, bVar, dVar2);
    }

    /* renamed from: b */
    public ProductGetOldProductFlowUseCase get() {
        return m116001c(this.f66970a.get(), this.f66971b.get(), this.f66972c.get(), this.f66973d.get(), this.f66974e.get(), this.f66975f.get(), this.f66976g.get());
    }
}
