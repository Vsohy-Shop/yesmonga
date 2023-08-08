package com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.otp.analytics;

import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.otp.analytics.c */
public final class C24605c implements C10324h<C24604b> {

    /* renamed from: a */
    public final Provider<C13783a> f61155a;

    public C24605c(Provider<C13783a> provider) {
        this.f61155a = provider;
    }

    /* renamed from: a */
    public static C24605c m107584a(Provider<C13783a> provider) {
        return new C24605c(provider);
    }

    /* renamed from: c */
    public static C24604b m107585c(C13783a aVar) {
        return new C24604b(aVar);
    }

    /* renamed from: b */
    public C24604b get() {
        return m107585c(this.f61155a.get());
    }
}
