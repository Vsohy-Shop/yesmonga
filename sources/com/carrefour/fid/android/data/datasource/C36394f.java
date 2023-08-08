package com.carrefour.fid.android.data.datasource;

import com.carrefour.fid.android.data.service.C36629h;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.data.datasource.f */
public final class C36394f implements C10324h<DlvDataSource> {

    /* renamed from: a */
    public final Provider<C36629h> f90038a;

    public C36394f(Provider<C36629h> provider) {
        this.f90038a = provider;
    }

    /* renamed from: a */
    public static C36394f m149314a(Provider<C36629h> provider) {
        return new C36394f(provider);
    }

    /* renamed from: c */
    public static DlvDataSource m149315c(C36629h hVar) {
        return new DlvDataSource(hVar);
    }

    /* renamed from: b */
    public DlvDataSource get() {
        return m149315c(this.f90038a.get());
    }
}
