package com.carrefour.fid.android.services;

import com.carrefour.fid.android.airship.data.datasource.C13747e;
import dagger.C10158g;
import dagger.internal.C10321e;
import dagger.internal.C10326j;
import dagger.internal.C10337q;
import javax.inject.Provider;

@C10321e
@C10337q
/* renamed from: com.carrefour.fid.android.services.a */
public final class C28441a implements C10158g<OneAppFCMService> {

    /* renamed from: a */
    public final Provider<C13747e> f68538a;

    public C28441a(Provider<C13747e> provider) {
        this.f68538a = provider;
    }

    /* renamed from: a */
    public static C10158g<OneAppFCMService> m118317a(Provider<C13747e> provider) {
        return new C28441a(provider);
    }

    @C10326j("com.carrefour.fid.android.services.OneAppFCMService.audienceTrackingManager")
    /* renamed from: b */
    public static void m118318b(OneAppFCMService oneAppFCMService, C13747e eVar) {
        oneAppFCMService.f68537a = eVar;
    }

    /* renamed from: c */
    public void injectMembers(OneAppFCMService oneAppFCMService) {
        m118318b(oneAppFCMService, this.f68538a.get());
    }
}
