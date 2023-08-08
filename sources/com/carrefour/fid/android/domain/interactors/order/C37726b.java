package com.carrefour.fid.android.domain.interactors.order;

import com.carrefour.fid.android.domain.repositories.C38192a;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.domain.interactors.order.b */
public final class C37726b implements C10324h<C37725a> {

    /* renamed from: a */
    public final Provider<C38192a> f94708a;

    public C37726b(Provider<C38192a> provider) {
        this.f94708a = provider;
    }

    /* renamed from: a */
    public static C37726b m154652a(Provider<C38192a> provider) {
        return new C37726b(provider);
    }

    /* renamed from: c */
    public static C37725a m154653c(C38192a aVar) {
        return new C37725a(aVar);
    }

    /* renamed from: b */
    public C37725a get() {
        return m154653c(this.f94708a.get());
    }
}
