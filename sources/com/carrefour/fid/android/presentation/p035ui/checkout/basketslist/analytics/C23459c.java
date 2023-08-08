package com.carrefour.fid.android.presentation.p035ui.checkout.basketslist.analytics;

import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.basketslist.analytics.c */
public final class C23459c implements C10324h<C23457b> {

    /* renamed from: a */
    public final Provider<C13783a> f59316a;

    public C23459c(Provider<C13783a> provider) {
        this.f59316a = provider;
    }

    /* renamed from: a */
    public static C23459c m104544a(Provider<C13783a> provider) {
        return new C23459c(provider);
    }

    /* renamed from: c */
    public static C23457b m104545c(C13783a aVar) {
        return new C23457b(aVar);
    }

    /* renamed from: b */
    public C23457b get() {
        return m104545c(this.f59316a.get());
    }
}
