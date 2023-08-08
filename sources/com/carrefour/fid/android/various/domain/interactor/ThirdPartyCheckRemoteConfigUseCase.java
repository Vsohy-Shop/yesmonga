package com.carrefour.fid.android.various.domain.interactor;

import com.carrefour.fid.android.domain.interactors.remoteconfig.C37807b;
import com.carrefour.fid.android.various.domain.repository.C22798d;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

public final class ThirdPartyCheckRemoteConfigUseCase implements C37807b {
    @C12579k

    /* renamed from: a */
    public final C22798d f58332a;

    @Inject
    public ThirdPartyCheckRemoteConfigUseCase(@C12579k C22798d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "remoteConfig");
        this.f58332a = dVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m172811invokegIAlus(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.domain.interactors.remoteconfig.C37807b.C37808a r5, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<java.lang.Boolean>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.carrefour.fid.android.various.domain.interactor.ThirdPartyCheckRemoteConfigUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.carrefour.fid.android.various.domain.interactor.ThirdPartyCheckRemoteConfigUseCase$invoke$1 r0 = (com.carrefour.fid.android.various.domain.interactor.ThirdPartyCheckRemoteConfigUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.various.domain.interactor.ThirdPartyCheckRemoteConfigUseCase$invoke$1 r0 = new com.carrefour.fid.android.various.domain.interactor.ThirdPartyCheckRemoteConfigUseCase$invoke$1
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            kotlin.C11661u0.m45747n(r6)
            kotlin.Result r6 = (kotlin.Result) r6
            java.lang.Object r5 = r6.mo21858l()
            goto L_0x0049
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0037:
            kotlin.C11661u0.m45747n(r6)
            com.carrefour.fid.android.various.domain.repository.d r6 = r4.f58332a
            com.carrefour.fid.android.domain.models.remoteconfig.RemoteConfigTag r5 = r5.mo115197d()
            r0.label = r3
            java.lang.Object r5 = r6.mo67178a(r5, r0)
            if (r5 != r1) goto L_0x0049
            return r1
        L_0x0049:
            java.lang.Throwable r6 = kotlin.Result.m38705e(r5)
            if (r6 != 0) goto L_0x0072
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L_0x0062
            kotlin.Result$a r6 = kotlin.Result.f28060a
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.C11064a.m42615a(r5)
            java.lang.Object r5 = kotlin.Result.m38702b(r5)
            goto L_0x0071
        L_0x0062:
            kotlin.Result$a r5 = kotlin.Result.f28060a
            com.carrefour.fid.android.shared.io.RemoteConfigFeatureUnavailableThrowable r5 = new com.carrefour.fid.android.shared.io.RemoteConfigFeatureUnavailableThrowable
            r5.<init>()
            java.lang.Object r5 = kotlin.C11661u0.m45734a(r5)
            java.lang.Object r5 = kotlin.Result.m38702b(r5)
        L_0x0071:
            return r5
        L_0x0072:
            kotlin.Result$a r5 = kotlin.Result.f28060a
            java.lang.Object r5 = kotlin.C11661u0.m45734a(r6)
            java.lang.Object r5 = kotlin.Result.m38702b(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.various.domain.interactor.ThirdPartyCheckRemoteConfigUseCase.m172811invokegIAlus(com.carrefour.fid.android.domain.interactors.remoteconfig.b$a, kotlin.coroutines.c):java.lang.Object");
    }
}
