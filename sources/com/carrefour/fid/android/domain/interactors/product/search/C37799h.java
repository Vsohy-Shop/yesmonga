package com.carrefour.fid.android.domain.interactors.product.search;

import com.carrefour.fid.android.domain.interactors.remoteconfig.C37807b;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.domain.interactors.product.search.h */
public final class C37799h implements C10324h<SearchWithListRemoteConfigUseCase> {

    /* renamed from: a */
    public final Provider<C37807b> f94885a;

    public C37799h(Provider<C37807b> provider) {
        this.f94885a = provider;
    }

    /* renamed from: a */
    public static C37799h m154944a(Provider<C37807b> provider) {
        return new C37799h(provider);
    }

    /* renamed from: c */
    public static SearchWithListRemoteConfigUseCase m154945c(C37807b bVar) {
        return new SearchWithListRemoteConfigUseCase(bVar);
    }

    /* renamed from: b */
    public SearchWithListRemoteConfigUseCase get() {
        return m154945c(this.f94885a.get());
    }
}
