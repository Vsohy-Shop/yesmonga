package com.google.android.datatransport.runtime.scheduling.persistence;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.internal.C40141g;
import javax.inject.Provider;

/* renamed from: com.google.android.datatransport.runtime.scheduling.persistence.v0 */
public final class C40301v0 implements C40141g<C40298u0> {

    /* renamed from: a */
    public final Provider<Context> f102671a;

    /* renamed from: b */
    public final Provider<String> f102672b;

    /* renamed from: c */
    public final Provider<Integer> f102673c;

    public C40301v0(Provider<Context> provider, Provider<String> provider2, Provider<Integer> provider3) {
        this.f102671a = provider;
        this.f102672b = provider2;
        this.f102673c = provider3;
    }

    /* renamed from: a */
    public static C40301v0 m163804a(Provider<Context> provider, Provider<String> provider2, Provider<Integer> provider3) {
        return new C40301v0(provider, provider2, provider3);
    }

    /* renamed from: c */
    public static C40298u0 m163805c(Context context, String str, int i) {
        return new C40298u0(context, str, i);
    }

    /* renamed from: b */
    public C40298u0 get() {
        return m163805c(this.f102671a.get(), this.f102672b.get(), this.f102673c.get().intValue());
    }
}
