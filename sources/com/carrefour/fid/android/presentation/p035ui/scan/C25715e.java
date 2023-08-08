package com.carrefour.fid.android.presentation.p035ui.scan;

import com.carrefour.fid.android.core.datastore.AppPreferencesStorage;
import com.carrefour.fid.android.presentation.viewmodels.product.search.C27264a;
import com.carrefour.fid.android.presentation.viewmodels.scan.C27400d;
import com.carrefour.fid.android.shared.navigation.C28796c;
import dagger.C10158g;
import dagger.internal.C10321e;
import dagger.internal.C10326j;
import dagger.internal.C10337q;
import javax.inject.Provider;

@C10321e
@C10337q
/* renamed from: com.carrefour.fid.android.presentation.ui.scan.e */
public final class C25715e implements C10158g<BarcodeScannerFragment> {

    /* renamed from: a */
    public final Provider<C28796c> f63015a;

    /* renamed from: b */
    public final Provider<C27264a> f63016b;

    /* renamed from: c */
    public final Provider<C27400d> f63017c;

    /* renamed from: d */
    public final Provider<AppPreferencesStorage> f63018d;

    public C25715e(Provider<C28796c> provider, Provider<C27264a> provider2, Provider<C27400d> provider3, Provider<AppPreferencesStorage> provider4) {
        this.f63015a = provider;
        this.f63016b = provider2;
        this.f63017c = provider3;
        this.f63018d = provider4;
    }

    /* renamed from: a */
    public static C10158g<BarcodeScannerFragment> m110413a(Provider<C28796c> provider, Provider<C27264a> provider2, Provider<C27400d> provider3, Provider<AppPreferencesStorage> provider4) {
        return new C25715e(provider, provider2, provider3, provider4);
    }

    @C10326j("com.carrefour.fid.android.presentation.ui.scan.BarcodeScannerFragment.appPreferencesStorage")
    /* renamed from: b */
    public static void m110414b(BarcodeScannerFragment barcodeScannerFragment, AppPreferencesStorage appPreferencesStorage) {
        barcodeScannerFragment.f62989x = appPreferencesStorage;
    }

    @C10326j("com.carrefour.fid.android.presentation.ui.scan.BarcodeScannerFragment.navigator")
    /* renamed from: d */
    public static void m110415d(BarcodeScannerFragment barcodeScannerFragment, C28796c cVar) {
        barcodeScannerFragment.f62986g = cVar;
    }

    @C10326j("com.carrefour.fid.android.presentation.ui.scan.BarcodeScannerFragment.productSearchAnalyticsViewModel")
    /* renamed from: e */
    public static void m110416e(BarcodeScannerFragment barcodeScannerFragment, C27264a aVar) {
        barcodeScannerFragment.f62987v = aVar;
    }

    @C10326j("com.carrefour.fid.android.presentation.ui.scan.BarcodeScannerFragment.scanBarCodeAnalyticsViewModel")
    /* renamed from: f */
    public static void m110417f(BarcodeScannerFragment barcodeScannerFragment, C27400d dVar) {
        barcodeScannerFragment.f62988w = dVar;
    }

    /* renamed from: c */
    public void injectMembers(BarcodeScannerFragment barcodeScannerFragment) {
        m110415d(barcodeScannerFragment, this.f63015a.get());
        m110416e(barcodeScannerFragment, this.f63016b.get());
        m110417f(barcodeScannerFragment, this.f63017c.get());
        m110414b(barcodeScannerFragment, this.f63018d.get());
    }
}
