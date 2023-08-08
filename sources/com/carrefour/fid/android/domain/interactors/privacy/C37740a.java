package com.carrefour.fid.android.domain.interactors.privacy;

import com.carrefour.fid.android.domain.repositories.C38198g;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.domain.interactors.privacy.a */
public final class C37740a implements C10324h<PrivacyUseCase> {

    /* renamed from: a */
    public final Provider<C38198g> f94735a;

    public C37740a(Provider<C38198g> provider) {
        this.f94735a = provider;
    }

    /* renamed from: a */
    public static C37740a m154694a(Provider<C38198g> provider) {
        return new C37740a(provider);
    }

    /* renamed from: c */
    public static PrivacyUseCase m154695c(C38198g gVar) {
        return new PrivacyUseCase(gVar);
    }

    /* renamed from: b */
    public PrivacyUseCase get() {
        return m154695c(this.f94735a.get());
    }
}
