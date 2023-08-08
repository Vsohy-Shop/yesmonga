package com.carrefour.fid.android.tracking.physicalstore;

import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.tracking.physicalstore.c */
public final class C29020c implements C10324h<C29019b> {

    /* renamed from: a */
    public final Provider<C13783a> f71115a;

    public C29020c(Provider<C13783a> provider) {
        this.f71115a = provider;
    }

    /* renamed from: a */
    public static C29020c m120065a(Provider<C13783a> provider) {
        return new C29020c(provider);
    }

    /* renamed from: c */
    public static C29019b m120066c(C13783a aVar) {
        return new C29019b(aVar);
    }

    /* renamed from: b */
    public C29019b get() {
        return m120066c(this.f71115a.get());
    }
}
