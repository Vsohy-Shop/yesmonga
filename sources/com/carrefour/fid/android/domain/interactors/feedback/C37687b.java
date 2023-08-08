package com.carrefour.fid.android.domain.interactors.feedback;

import android.content.Context;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q({"dagger.hilt.android.qualifiers.ApplicationContext"})
@C10338r
/* renamed from: com.carrefour.fid.android.domain.interactors.feedback.b */
public final class C37687b implements C10324h<C37686a> {

    /* renamed from: a */
    public final Provider<Context> f94546a;

    public C37687b(Provider<Context> provider) {
        this.f94546a = provider;
    }

    /* renamed from: a */
    public static C37687b m154459a(Provider<Context> provider) {
        return new C37687b(provider);
    }

    /* renamed from: c */
    public static C37686a m154460c(Context context) {
        return new C37686a(context);
    }

    /* renamed from: b */
    public C37686a get() {
        return m154460c(this.f94546a.get());
    }
}
