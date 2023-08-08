package com.carrefour.fid.android.utilities.domain.interactors;

import android.content.Context;
import com.carrefour.fid.android.domain.interactors.account.C37518d;
import com.carrefour.fid.android.domain.interactors.criteo.C37668h;
import com.carrefour.fid.android.domain.interactors.luckycart.C37711e;
import com.carrefour.fid.android.domain.interactors.remoteconfig.C37807b;
import com.carrefour.fid.android.domain.interactors.slot.C37857d;
import com.carrefour.fid.android.performance.C38328d;
import com.carrefour.fid.android.utilities.domain.repositories.UtilitiesRepository;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q({"dagger.hilt.android.qualifiers.ApplicationContext"})
@C10338r
/* renamed from: com.carrefour.fid.android.utilities.domain.interactors.c */
public final class C22686c implements C10324h<UtilitiesGetSponsoredItemsUseCase> {

    /* renamed from: a */
    public final Provider<Context> f58104a;

    /* renamed from: b */
    public final Provider<UtilitiesRepository> f58105b;

    /* renamed from: c */
    public final Provider<C37807b> f58106c;

    /* renamed from: d */
    public final Provider<C37668h> f58107d;

    /* renamed from: e */
    public final Provider<C37711e> f58108e;

    /* renamed from: f */
    public final Provider<C37518d> f58109f;

    /* renamed from: g */
    public final Provider<C37857d> f58110g;

    /* renamed from: h */
    public final Provider<C38328d> f58111h;

    public C22686c(Provider<Context> provider, Provider<UtilitiesRepository> provider2, Provider<C37807b> provider3, Provider<C37668h> provider4, Provider<C37711e> provider5, Provider<C37518d> provider6, Provider<C37857d> provider7, Provider<C38328d> provider8) {
        this.f58104a = provider;
        this.f58105b = provider2;
        this.f58106c = provider3;
        this.f58107d = provider4;
        this.f58108e = provider5;
        this.f58109f = provider6;
        this.f58110g = provider7;
        this.f58111h = provider8;
    }

    /* renamed from: a */
    public static C22686c m102732a(Provider<Context> provider, Provider<UtilitiesRepository> provider2, Provider<C37807b> provider3, Provider<C37668h> provider4, Provider<C37711e> provider5, Provider<C37518d> provider6, Provider<C37857d> provider7, Provider<C38328d> provider8) {
        return new C22686c(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    /* renamed from: c */
    public static UtilitiesGetSponsoredItemsUseCase m102733c(Context context, UtilitiesRepository utilitiesRepository, C37807b bVar, C37668h hVar, C37711e eVar, C37518d dVar, C37857d dVar2, C38328d dVar3) {
        return new UtilitiesGetSponsoredItemsUseCase(context, utilitiesRepository, bVar, hVar, eVar, dVar, dVar2, dVar3);
    }

    /* renamed from: b */
    public UtilitiesGetSponsoredItemsUseCase get() {
        return m102733c(this.f58104a.get(), this.f58105b.get(), this.f58106c.get(), this.f58107d.get(), this.f58108e.get(), this.f58109f.get(), this.f58110g.get(), this.f58111h.get());
    }
}
