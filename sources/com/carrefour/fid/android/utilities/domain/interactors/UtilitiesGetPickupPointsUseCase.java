package com.carrefour.fid.android.utilities.domain.interactors;

import com.carrefour.fid.android.bff_data_shared.data.api.services.BffUtilitiesManagementApi;
import com.carrefour.fid.android.domain.interactors.utilities.C37887a;
import javax.inject.Inject;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nUtilitiesGetPickupPointsUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UtilitiesGetPickupPointsUseCase.kt\ncom/carrefour/fid/android/utilities/domain/interactors/UtilitiesGetPickupPointsUseCase\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,33:1\n1603#2,9:34\n1855#2:43\n1856#2:45\n1612#2:46\n1#3:44\n*S KotlinDebug\n*F\n+ 1 UtilitiesGetPickupPointsUseCase.kt\ncom/carrefour/fid/android/utilities/domain/interactors/UtilitiesGetPickupPointsUseCase\n*L\n24#1:34,9\n24#1:43\n24#1:45\n24#1:46\n24#1:44\n*E\n"})
public final class UtilitiesGetPickupPointsUseCase implements C37887a {
    @C12579k

    /* renamed from: a */
    public final BffUtilitiesManagementApi f58089a;

    @Inject
    public UtilitiesGetPickupPointsUseCase(@C12579k BffUtilitiesManagementApi bffUtilitiesManagementApi) {
        Intrinsics.checkNotNullParameter(bffUtilitiesManagementApi, "utilityApi");
        this.f58089a = bffUtilitiesManagementApi;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m172802invokegIAlus(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.domain.models.LatLon r11, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<? extends java.util.List<com.carrefour.fid.android.domain.models.pickup.C38080a>>> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof com.carrefour.fid.android.utilities.domain.interactors.UtilitiesGetPickupPointsUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r12
            com.carrefour.fid.android.utilities.domain.interactors.UtilitiesGetPickupPointsUseCase$invoke$1 r0 = (com.carrefour.fid.android.utilities.domain.interactors.UtilitiesGetPickupPointsUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.utilities.domain.interactors.UtilitiesGetPickupPointsUseCase$invoke$1 r0 = new com.carrefour.fid.android.utilities.domain.interactors.UtilitiesGetPickupPointsUseCase$invoke$1
            r0.<init>(r10, r12)
        L_0x0018:
            r7 = r0
            java.lang.Object r12 = r7.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r7.label
            r2 = 1
            if (r1 == 0) goto L_0x0032
            if (r1 != r2) goto L_0x002a
            kotlin.C11661u0.m45747n(r12)     // Catch:{ all -> 0x0060 }
            goto L_0x0059
        L_0x002a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0032:
            kotlin.C11661u0.m45747n(r12)
            kotlin.Result$a r12 = kotlin.Result.f28060a     // Catch:{ all -> 0x0060 }
            com.carrefour.fid.android.bff_data_shared.data.api.services.BffUtilitiesManagementApi r1 = r10.f58089a     // Catch:{ all -> 0x0060 }
            double r3 = r11.getLongitude()     // Catch:{ all -> 0x0060 }
            java.lang.String r12 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x0060 }
            double r3 = r11.getLatitude()     // Catch:{ all -> 0x0060 }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x0060 }
            r4 = 0
            r5 = 0
            r6 = 0
            r8 = 28
            r9 = 0
            r7.label = r2     // Catch:{ all -> 0x0060 }
            r2 = r12
            java.lang.Object r12 = com.carrefour.fid.android.bff_data_shared.data.api.services.BffUtilitiesManagementApi.DefaultImpls.getAllPickupPoints$default(r1, r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0060 }
            if (r12 != r0) goto L_0x0059
            return r0
        L_0x0059:
            retrofit2.w r12 = (retrofit2.C13091w) r12     // Catch:{ all -> 0x0060 }
            java.lang.Object r11 = kotlin.Result.m38702b(r12)     // Catch:{ all -> 0x0060 }
            goto L_0x006b
        L_0x0060:
            r11 = move-exception
            kotlin.Result$a r12 = kotlin.Result.f28060a
            java.lang.Object r11 = kotlin.C11661u0.m45734a(r11)
            java.lang.Object r11 = kotlin.Result.m38702b(r11)
        L_0x006b:
            boolean r12 = kotlin.Result.m38709i(r11)
            r0 = 0
            if (r12 == 0) goto L_0x0073
            r11 = r0
        L_0x0073:
            retrofit2.w r11 = (retrofit2.C13091w) r11
            if (r11 == 0) goto L_0x00c1
            boolean r12 = r11.mo30576g()
            if (r12 == 0) goto L_0x00c1
            java.lang.Object r11 = r11.mo30572a()
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffPickupPointDataResponse r11 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffPickupPointDataResponse) r11
            if (r11 == 0) goto L_0x008a
            java.util.List r11 = r11.getData()
            goto L_0x008b
        L_0x008a:
            r11 = r0
        L_0x008b:
            kotlin.Result$a r12 = kotlin.Result.f28060a
            if (r11 == 0) goto L_0x00b8
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.Iterator r11 = r11.iterator()
        L_0x009a:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L_0x00bc
            java.lang.Object r1 = r11.next()
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffPickupPointResponse r1 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffPickupPointResponse) r1
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffPickupPoint r1 = r1.getPickupPoint()
            if (r1 == 0) goto L_0x00b1
            com.carrefour.fid.android.domain.models.pickup.a r1 = com.carrefour.fid.android.utilities.data.api.mappers.C22676a.m102695a(r1)
            goto L_0x00b2
        L_0x00b1:
            r1 = r0
        L_0x00b2:
            if (r1 == 0) goto L_0x009a
            r12.add(r1)
            goto L_0x009a
        L_0x00b8:
            java.util.List r12 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
        L_0x00bc:
            java.lang.Object r11 = kotlin.Result.m38702b(r12)
            goto L_0x00ed
        L_0x00c1:
            kotlin.Result$a r12 = kotlin.Result.f28060a
            java.lang.Exception r12 = new java.lang.Exception
            if (r11 == 0) goto L_0x00d1
            okhttp3.ResponseBody r11 = r11.mo30574e()
            if (r11 == 0) goto L_0x00d1
            java.lang.String r0 = r11.string()
        L_0x00d1:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r1 = "Failed to fetch pickup points with "
            r11.append(r1)
            r11.append(r0)
            java.lang.String r11 = r11.toString()
            r12.<init>(r11)
            java.lang.Object r11 = kotlin.C11661u0.m45734a(r12)
            java.lang.Object r11 = kotlin.Result.m38702b(r11)
        L_0x00ed:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.utilities.domain.interactors.UtilitiesGetPickupPointsUseCase.m172802invokegIAlus(com.carrefour.fid.android.domain.models.LatLon, kotlin.coroutines.c):java.lang.Object");
    }
}
