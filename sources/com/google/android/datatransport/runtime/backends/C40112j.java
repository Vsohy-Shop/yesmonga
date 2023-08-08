package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.internal.C40141g;
import com.google.android.datatransport.runtime.time.C40309a;
import javax.inject.Provider;

/* renamed from: com.google.android.datatransport.runtime.backends.j */
public final class C40112j implements C40141g<C40111i> {

    /* renamed from: a */
    public final Provider<Context> f102334a;

    /* renamed from: b */
    public final Provider<C40309a> f102335b;

    /* renamed from: c */
    public final Provider<C40309a> f102336c;

    public C40112j(Provider<Context> provider, Provider<C40309a> provider2, Provider<C40309a> provider3) {
        this.f102334a = provider;
        this.f102335b = provider2;
        this.f102336c = provider3;
    }

    /* renamed from: a */
    public static C40112j m163314a(Provider<Context> provider, Provider<C40309a> provider2, Provider<C40309a> provider3) {
        return new C40112j(provider, provider2, provider3);
    }

    /* renamed from: c */
    public static C40111i m163315c(Context context, C40309a aVar, C40309a aVar2) {
        return new C40111i(context, aVar, aVar2);
    }

    /* renamed from: b */
    public C40111i get() {
        return m163315c(this.f102334a.get(), this.f102335b.get(), this.f102336c.get());
    }
}
