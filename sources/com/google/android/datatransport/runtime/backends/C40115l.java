package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.internal.C40141g;
import javax.inject.Provider;

/* renamed from: com.google.android.datatransport.runtime.backends.l */
public final class C40115l implements C40141g<C40113k> {

    /* renamed from: a */
    public final Provider<Context> f102344a;

    /* renamed from: b */
    public final Provider<C40111i> f102345b;

    public C40115l(Provider<Context> provider, Provider<C40111i> provider2) {
        this.f102344a = provider;
        this.f102345b = provider2;
    }

    /* renamed from: a */
    public static C40115l m163321a(Provider<Context> provider, Provider<C40111i> provider2) {
        return new C40115l(provider, provider2);
    }

    /* renamed from: c */
    public static C40113k m163322c(Context context, Object obj) {
        return new C40113k(context, (C40111i) obj);
    }

    /* renamed from: b */
    public C40113k get() {
        return m163322c(this.f102344a.get(), this.f102345b.get());
    }
}
