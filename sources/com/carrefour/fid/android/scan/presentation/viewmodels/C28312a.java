package com.carrefour.fid.android.scan.presentation.viewmodels;

import com.carrefour.fid.android.scan.domain.interactors.ExtractScannedDataUseCase;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.scan.presentation.viewmodels.a */
public final class C28312a implements C10324h<ScannerViewModel> {

    /* renamed from: a */
    public final Provider<ExtractScannedDataUseCase> f68483a;

    public C28312a(Provider<ExtractScannedDataUseCase> provider) {
        this.f68483a = provider;
    }

    /* renamed from: a */
    public static C28312a m118281a(Provider<ExtractScannedDataUseCase> provider) {
        return new C28312a(provider);
    }

    /* renamed from: c */
    public static ScannerViewModel m118282c(ExtractScannedDataUseCase extractScannedDataUseCase) {
        return new ScannerViewModel(extractScannedDataUseCase);
    }

    /* renamed from: b */
    public ScannerViewModel get() {
        return m118282c(this.f68483a.get());
    }
}
