package com.carrefour.fid.android.data.repositories;

import com.carrefour.fid.android.data.entities.mapper.C36501k;
import com.carrefour.fid.android.data.provider.headers.C36573o;
import com.carrefour.fid.android.data.service.C36620a;
import com.carrefour.fid.android.domain.interactors.logm.C37694a;
import com.carrefour.fid.android.domain.interactors.service.C37823k;
import com.carrefour.fid.android.domain.interactors.slot.C37857d;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.data.repositories.a */
public final class C36588a implements C10324h<APIMProductDetailsRepository> {

    /* renamed from: a */
    public final Provider<C37823k> f90447a;

    /* renamed from: b */
    public final Provider<C36620a> f90448b;

    /* renamed from: c */
    public final Provider<C36501k> f90449c;

    /* renamed from: d */
    public final Provider<C36573o> f90450d;

    /* renamed from: e */
    public final Provider<C37694a> f90451e;

    /* renamed from: f */
    public final Provider<C37857d> f90452f;

    public C36588a(Provider<C37823k> provider, Provider<C36620a> provider2, Provider<C36501k> provider3, Provider<C36573o> provider4, Provider<C37694a> provider5, Provider<C37857d> provider6) {
        this.f90447a = provider;
        this.f90448b = provider2;
        this.f90449c = provider3;
        this.f90450d = provider4;
        this.f90451e = provider5;
        this.f90452f = provider6;
    }

    /* renamed from: a */
    public static C36588a m150116a(Provider<C37823k> provider, Provider<C36620a> provider2, Provider<C36501k> provider3, Provider<C36573o> provider4, Provider<C37694a> provider5, Provider<C37857d> provider6) {
        return new C36588a(provider, provider2, provider3, provider4, provider5, provider6);
    }

    /* renamed from: c */
    public static APIMProductDetailsRepository m150117c(C37823k kVar, C36620a aVar, C36501k kVar2, C36573o oVar, C37694a aVar2, C37857d dVar) {
        return new APIMProductDetailsRepository(kVar, aVar, kVar2, oVar, aVar2, dVar);
    }

    /* renamed from: b */
    public APIMProductDetailsRepository get() {
        return m150117c(this.f90447a.get(), this.f90448b.get(), this.f90449c.get(), this.f90450d.get(), this.f90451e.get(), this.f90452f.get());
    }
}
