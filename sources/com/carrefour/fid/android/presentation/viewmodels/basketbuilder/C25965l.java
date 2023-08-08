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
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.basketbuilder.l */
public final class C25965l implements C10324h<C25964k> {

    /* renamed from: a */
    public final Provider<C13783a> f63492a;

    public C25965l(Provider<C13783a> provider) {
        this.f63492a = provider;
    }

    /* renamed from: a */
    public static C25965l m111148a(Provider<C13783a> provider) {
        return new C25965l(provider);
    }

    /* renamed from: c */
    public static C25964k m111149c(C13783a aVar) {
        return new C25964k(aVar);
    }

    /* renamed from: b */
    public C25964k get() {
        return m111149c(this.f63492a.get());
    }
}
