package com.carrefour.fid.android.utils.initializer;

import com.carrefour.fid.android.shared.data.datastore.pref.BaseAppPreferencesStorage;
import dagger.C10158g;
import dagger.internal.C10321e;
import dagger.internal.C10326j;
import dagger.internal.C10337q;
import javax.inject.Provider;

@C10321e
@C10337q
/* renamed from: com.carrefour.fid.android.utils.initializer.c */
public final class C22710c implements C10158g<FirebaseAppInitializer> {

    /* renamed from: a */
    public final Provider<BaseAppPreferencesStorage> f58200a;

    public C22710c(Provider<BaseAppPreferencesStorage> provider) {
        this.f58200a = provider;
    }

    /* renamed from: a */
    public static C10158g<FirebaseAppInitializer> m102875a(Provider<BaseAppPreferencesStorage> provider) {
        return new C22710c(provider);
    }

    @C10326j("com.carrefour.fid.android.utils.initializer.FirebaseAppInitializer.baseAppPreferencesStorage")
    /* renamed from: b */
    public static void m102876b(FirebaseAppInitializer firebaseAppInitializer, BaseAppPreferencesStorage baseAppPreferencesStorage) {
        firebaseAppInitializer.f58185a = baseAppPreferencesStorage;
    }

    /* renamed from: c */
    public void injectMembers(FirebaseAppInitializer firebaseAppInitializer) {
        m102876b(firebaseAppInitializer, this.f58200a.get());
    }
}
