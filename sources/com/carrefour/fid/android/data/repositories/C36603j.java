package com.carrefour.fid.android.data.repositories;

import com.google.firebase.analytics.FirebaseAnalytics;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.data.repositories.j */
public final class C36603j implements C10324h<C36602i> {

    /* renamed from: a */
    public final Provider<FirebaseAnalytics> f90491a;

    public C36603j(Provider<FirebaseAnalytics> provider) {
        this.f90491a = provider;
    }

    /* renamed from: a */
    public static C36603j m150189a(Provider<FirebaseAnalytics> provider) {
        return new C36603j(provider);
    }

    /* renamed from: c */
    public static C36602i m150190c(FirebaseAnalytics firebaseAnalytics) {
        return new C36602i(firebaseAnalytics);
    }

    /* renamed from: b */
    public C36602i get() {
        return m150190c(this.f90491a.get());
    }
}
