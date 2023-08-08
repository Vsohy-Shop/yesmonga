package com.carrefour.fid.android.scan.domain.interactors;

import com.google.mlkit.vision.barcode.C34001b;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineDispatcher;

@C10321e
@C10337q({"com.carrefour.fid.android.shared.di.annotation.IoDispatcher"})
@C10338r
/* renamed from: com.carrefour.fid.android.scan.domain.interactors.a */
public final class C28277a implements C10324h<ExtractScannedDataUseCase> {

    /* renamed from: a */
    public final Provider<C34001b> f68441a;

    /* renamed from: b */
    public final Provider<CoroutineDispatcher> f68442b;

    public C28277a(Provider<C34001b> provider, Provider<CoroutineDispatcher> provider2) {
        this.f68441a = provider;
        this.f68442b = provider2;
    }

    /* renamed from: a */
    public static C28277a m118226a(Provider<C34001b> provider, Provider<CoroutineDispatcher> provider2) {
        return new C28277a(provider, provider2);
    }

    /* renamed from: c */
    public static ExtractScannedDataUseCase m118227c(C34001b bVar, CoroutineDispatcher coroutineDispatcher) {
        return new ExtractScannedDataUseCase(bVar, coroutineDispatcher);
    }

    /* renamed from: b */
    public ExtractScannedDataUseCase get() {
        return m118227c(this.f68441a.get(), this.f68442b.get());
    }
}
