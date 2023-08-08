package com.carrefour.fid.android.various.data.repository;

import com.google.firebase.remoteconfig.C33563l;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.various.data.repository.a */
public final class C22771a implements C10324h<FirebaseRemoteConfigImpl> {

    /* renamed from: a */
    public final Provider<C33563l> f58317a;

    public C22771a(Provider<C33563l> provider) {
        this.f58317a = provider;
    }

    /* renamed from: a */
    public static C22771a m102978a(Provider<C33563l> provider) {
        return new C22771a(provider);
    }

    /* renamed from: c */
    public static FirebaseRemoteConfigImpl m102979c(C33563l lVar) {
        return new FirebaseRemoteConfigImpl(lVar);
    }

    /* renamed from: b */
    public FirebaseRemoteConfigImpl get() {
        return m102979c(this.f58317a.get());
    }
}
