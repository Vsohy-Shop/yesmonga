package com.carrefour.fid.android.domain.interactors.slot;

import com.carrefour.fid.android.domain.interactors.remoteconfig.C37807b;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.domain.interactors.slot.i */
public final class C37864i implements C10324h<ShiftSlotRemoteConfigUseCase> {

    /* renamed from: a */
    public final Provider<C37807b> f94958a;

    public C37864i(Provider<C37807b> provider) {
        this.f94958a = provider;
    }

    /* renamed from: a */
    public static C37864i m155088a(Provider<C37807b> provider) {
        return new C37864i(provider);
    }

    /* renamed from: c */
    public static ShiftSlotRemoteConfigUseCase m155089c(C37807b bVar) {
        return new ShiftSlotRemoteConfigUseCase(bVar);
    }

    /* renamed from: b */
    public ShiftSlotRemoteConfigUseCase get() {
        return m155089c(this.f94958a.get());
    }
}
