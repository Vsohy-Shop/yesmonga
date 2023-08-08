package com.carrefour.fid.android.account.domain.interactors.address.dqe;

import com.carrefour.fid.android.account.data.repositories.DQEAddressesRepository;
import com.carrefour.fid.android.domain.interactors.address.C37542a;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

public final class AccountGetAddressGeolocationUseCase implements C37542a {
    @C12579k

    /* renamed from: a */
    public final DQEAddressesRepository f32602a;

    @Inject
    public AccountGetAddressGeolocationUseCase(@C12579k DQEAddressesRepository dQEAddressesRepository) {
        Intrinsics.checkNotNullParameter(dQEAddressesRepository, "dqeAddressesRepository");
        this.f32602a = dQEAddressesRepository;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m172728invokegIAlus(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.domain.interactors.address.C37542a.C37543a r6, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.LatLon>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.carrefour.fid.android.account.domain.interactors.address.dqe.AccountGetAddressGeolocationUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.carrefour.fid.android.account.domain.interactors.address.dqe.AccountGetAddressGeolocationUseCase$invoke$1 r0 = (com.carrefour.fid.android.account.domain.interactors.address.dqe.AccountGetAddressGeolocationUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.account.domain.interactors.address.dqe.AccountGetAddressGeolocationUseCase$invoke$1 r0 = new com.carrefour.fid.android.account.domain.interactors.address.dqe.AccountGetAddressGeolocationUseCase$invoke$1
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003a
            if (r2 == r4) goto L_0x0028
            if (r2 != r3) goto L_0x0032
        L_0x0028:
            kotlin.C11661u0.m45747n(r7)
            kotlin.Result r7 = (kotlin.Result) r7
            java.lang.Object r6 = r7.mo21858l()
            goto L_0x0065
        L_0x0032:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003a:
            kotlin.C11661u0.m45747n(r7)
            java.lang.String r7 = r6.mo114320e()
            if (r7 != 0) goto L_0x0052
            com.carrefour.fid.android.account.data.repositories.DQEAddressesRepository r7 = r5.f32602a
            java.lang.String r6 = r6.mo114322f()
            r0.label = r4
            java.lang.Object r6 = r7.mo31346d(r6, r0)
            if (r6 != r1) goto L_0x0065
            return r1
        L_0x0052:
            com.carrefour.fid.android.account.data.repositories.DQEAddressesRepository r7 = r5.f32602a
            java.lang.String r2 = r6.mo114322f()
            java.lang.String r6 = r6.mo114320e()
            r0.label = r3
            java.lang.Object r6 = r7.mo31345b(r2, r6, r0)
            if (r6 != r1) goto L_0x0065
            return r1
        L_0x0065:
            java.lang.Throwable r7 = kotlin.Result.m38705e(r6)
            if (r7 != 0) goto L_0x00a1
            java.util.List r6 = (java.util.List) r6
            r7 = r6
            java.util.Collection r7 = (java.util.Collection) r7
            boolean r7 = r7.isEmpty()
            r7 = r7 ^ r4
            if (r7 == 0) goto L_0x0091
            java.lang.Object r6 = kotlin.collections.CollectionsKt___CollectionsKt.m40706w2(r6)
            com.carrefour.fid.android.domain.models.LatLon r6 = (com.carrefour.fid.android.domain.models.LatLon) r6
            kotlin.Result$a r7 = kotlin.Result.f28060a
            com.carrefour.fid.android.domain.models.LatLon r7 = new com.carrefour.fid.android.domain.models.LatLon
            double r0 = r6.getLatitude()
            double r2 = r6.getLongitude()
            r7.<init>(r0, r2)
            java.lang.Object r6 = kotlin.Result.m38702b(r7)
            goto L_0x00ab
        L_0x0091:
            kotlin.Result$a r6 = kotlin.Result.f28060a
            com.carrefour.fid.android.shared.io.AddressNotAvailableThrowable r6 = new com.carrefour.fid.android.shared.io.AddressNotAvailableThrowable
            r6.<init>()
            java.lang.Object r6 = kotlin.C11661u0.m45734a(r6)
            java.lang.Object r6 = kotlin.Result.m38702b(r6)
            goto L_0x00ab
        L_0x00a1:
            kotlin.Result$a r6 = kotlin.Result.f28060a
            java.lang.Object r6 = kotlin.C11661u0.m45734a(r7)
            java.lang.Object r6 = kotlin.Result.m38702b(r6)
        L_0x00ab:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.account.domain.interactors.address.dqe.AccountGetAddressGeolocationUseCase.m172728invokegIAlus(com.carrefour.fid.android.domain.interactors.address.a$a, kotlin.coroutines.c):java.lang.Object");
    }
}
