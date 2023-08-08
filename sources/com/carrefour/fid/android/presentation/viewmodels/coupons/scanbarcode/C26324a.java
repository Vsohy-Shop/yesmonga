package com.carrefour.fid.android.presentation.viewmodels.coupons.scanbarcode;

import com.carrefour.fid.android.domain.interactors.coupons.C37649g;
import com.carrefour.fid.android.domain.interactors.coupons.C37651i;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.coupons.scanbarcode.a */
public final class C26324a implements C10324h<ScanBarcodeViewModel> {

    /* renamed from: a */
    public final Provider<C37649g> f64338a;

    /* renamed from: b */
    public final Provider<C37651i> f64339b;

    public C26324a(Provider<C37649g> provider, Provider<C37651i> provider2) {
        this.f64338a = provider;
        this.f64339b = provider2;
    }

    /* renamed from: a */
    public static C26324a m112378a(Provider<C37649g> provider, Provider<C37651i> provider2) {
        return new C26324a(provider, provider2);
    }

    /* renamed from: c */
    public static ScanBarcodeViewModel m112379c(C37649g gVar, C37651i iVar) {
        return new ScanBarcodeViewModel(gVar, iVar);
    }

    /* renamed from: b */
    public ScanBarcodeViewModel get() {
        return m112379c(this.f64338a.get(), this.f64339b.get());
    }
}
