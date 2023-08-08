package com.carrefour.fid.android.presentation.viewmodels.basketbuilder;

import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.basketbuilder.q */
public final class C25973q implements C10324h<C25972p> {

    /* renamed from: a */
    public final Provider<C13783a> f63499a;

    public C25973q(Provider<C13783a> provider) {
        this.f63499a = provider;
    }

    /* renamed from: a */
    public static C25973q m111162a(Provider<C13783a> provider) {
        return new C25973q(provider);
    }

    /* renamed from: c */
    public static C25972p m111163c(C13783a aVar) {
        return new C25972p(aVar);
    }

    /* renamed from: b */
    public C25972p get() {
        return m111163c(this.f63499a.get());
    }
}
