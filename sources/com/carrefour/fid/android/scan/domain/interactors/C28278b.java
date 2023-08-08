package com.carrefour.fid.android.scan.domain.interactors;

import com.carrefour.fid.android.scan.data.repositories.C28267a;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.scan.domain.interactors.b */
public final class C28278b implements C10324h<GetScanTutorialHasBeenShownUseCase> {

    /* renamed from: a */
    public final Provider<C28267a> f68443a;

    public C28278b(Provider<C28267a> provider) {
        this.f68443a = provider;
    }

    /* renamed from: a */
    public static C28278b m118229a(Provider<C28267a> provider) {
        return new C28278b(provider);
    }

    /* renamed from: c */
    public static GetScanTutorialHasBeenShownUseCase m118230c(C28267a aVar) {
        return new GetScanTutorialHasBeenShownUseCase(aVar);
    }

    /* renamed from: b */
    public GetScanTutorialHasBeenShownUseCase get() {
        return m118230c(this.f68443a.get());
    }
}
