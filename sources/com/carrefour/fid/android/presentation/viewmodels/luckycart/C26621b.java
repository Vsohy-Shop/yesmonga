package com.carrefour.fid.android.presentation.viewmodels.luckycart;

import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.luckycart.b */
public final class C26621b implements C10324h<C26620a> {

    /* renamed from: a */
    public final Provider<C13783a> f65028a;

    public C26621b(Provider<C13783a> provider) {
        this.f65028a = provider;
    }

    /* renamed from: a */
    public static C26621b m113198a(Provider<C13783a> provider) {
        return new C26621b(provider);
    }

    /* renamed from: c */
    public static C26620a m113199c(C13783a aVar) {
        return new C26620a(aVar);
    }

    /* renamed from: b */
    public C26620a get() {
        return m113199c(this.f65028a.get());
    }
}
