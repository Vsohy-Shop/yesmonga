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
/* renamed from: com.carrefour.fid.android.scan.domain.interactors.c */
public final class C28279c implements C10324h<UpdateScanTutorialHasBeenShownUseCase> {

    /* renamed from: a */
    public final Provider<C28267a> f68444a;

    public C28279c(Provider<C28267a> provider) {
        this.f68444a = provider;
    }

    /* renamed from: a */
    public static C28279c m118232a(Provider<C28267a> provider) {
        return new C28279c(provider);
    }

    /* renamed from: c */
    public static UpdateScanTutorialHasBeenShownUseCase m118233c(C28267a aVar) {
        return new UpdateScanTutorialHasBeenShownUseCase(aVar);
    }

    /* renamed from: b */
    public UpdateScanTutorialHasBeenShownUseCase get() {
        return m118233c(this.f68444a.get());
    }
}
