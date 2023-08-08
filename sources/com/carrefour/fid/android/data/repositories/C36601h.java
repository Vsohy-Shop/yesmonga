package com.carrefour.fid.android.data.repositories;

import com.carrefour.fid.android.data.entities.mapper.C36467c;
import com.carrefour.fid.android.data.provider.headers.C36577s;
import com.carrefour.fid.android.data.service.C36628g;
import com.carrefour.fid.android.domain.interactors.logm.C37694a;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.data.repositories.h */
public final class C36601h implements C10324h<DepartmentListRepository> {

    /* renamed from: a */
    public final Provider<C36628g> f90485a;

    /* renamed from: b */
    public final Provider<C36467c> f90486b;

    /* renamed from: c */
    public final Provider<C36577s> f90487c;

    /* renamed from: d */
    public final Provider<C37694a> f90488d;

    public C36601h(Provider<C36628g> provider, Provider<C36467c> provider2, Provider<C36577s> provider3, Provider<C37694a> provider4) {
        this.f90485a = provider;
        this.f90486b = provider2;
        this.f90487c = provider3;
        this.f90488d = provider4;
    }

    /* renamed from: a */
    public static C36601h m150182a(Provider<C36628g> provider, Provider<C36467c> provider2, Provider<C36577s> provider3, Provider<C37694a> provider4) {
        return new C36601h(provider, provider2, provider3, provider4);
    }

    /* renamed from: c */
    public static DepartmentListRepository m150183c(C36628g gVar, C36467c cVar, C36577s sVar, C37694a aVar) {
        return new DepartmentListRepository(gVar, cVar, sVar, aVar);
    }

    /* renamed from: b */
    public DepartmentListRepository get() {
        return m150183c(this.f90485a.get(), this.f90486b.get(), this.f90487c.get(), this.f90488d.get());
    }
}
