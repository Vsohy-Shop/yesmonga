package com.carrefour.fid.android.domain.interactors.coupons;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.core.datastore.AppPreferencesStorage;
import javax.inject.Inject;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nCouponsSetScanProductViewedUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CouponsSetScanProductViewedUseCase.kt\ncom/carrefour/fid/android/domain/interactors/coupons/CouponsSetScanProductViewedUseCase\n+ 2 Result.kt\ncom/carrefour/fid/android/shared/extension/ResultKt\n*L\n1#1,12:1\n3#2:13\n*S KotlinDebug\n*F\n+ 1 CouponsSetScanProductViewedUseCase.kt\ncom/carrefour/fid/android/domain/interactors/coupons/CouponsSetScanProductViewedUseCase\n*L\n10#1:13\n*E\n"})
public final class CouponsSetScanProductViewedUseCase implements C37651i {

    /* renamed from: b */
    public static final int f94417b = 8;
    @C12579k

    /* renamed from: a */
    public final AppPreferencesStorage f94418a;

    @Inject
    public CouponsSetScanProductViewedUseCase(@C12579k AppPreferencesStorage appPreferencesStorage) {
        Intrinsics.checkNotNullParameter(appPreferencesStorage, "appPreferencesStorage");
        this.f94418a = appPreferencesStorage;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: invoke-IoAF18A  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m172949invokeIoAF18A(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<kotlin.C11079d2>> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.carrefour.fid.android.domain.interactors.coupons.CouponsSetScanProductViewedUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.carrefour.fid.android.domain.interactors.coupons.CouponsSetScanProductViewedUseCase$invoke$1 r0 = (com.carrefour.fid.android.domain.interactors.coupons.CouponsSetScanProductViewedUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.domain.interactors.coupons.CouponsSetScanProductViewedUseCase$invoke$1 r0 = new com.carrefour.fid.android.domain.interactors.coupons.CouponsSetScanProductViewedUseCase$invoke$1
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            kotlin.C11661u0.m45747n(r5)
            goto L_0x003f
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0031:
            kotlin.C11661u0.m45747n(r5)
            com.carrefour.fid.android.core.datastore.AppPreferencesStorage r5 = r4.f94418a
            r0.label = r3
            java.lang.Object r5 = r5.mo108084g(r0)
            if (r5 != r1) goto L_0x003f
            return r1
        L_0x003f:
            kotlin.d2 r5 = kotlin.C11079d2.f28267a
            kotlin.Result$a r0 = kotlin.Result.f28060a
            java.lang.Object r5 = kotlin.Result.m38702b(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.interactors.coupons.CouponsSetScanProductViewedUseCase.m172949invokeIoAF18A(kotlin.coroutines.c):java.lang.Object");
    }
}
