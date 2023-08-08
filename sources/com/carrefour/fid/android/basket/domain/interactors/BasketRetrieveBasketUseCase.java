package com.carrefour.fid.android.basket.domain.interactors;

import com.carrefour.fid.android.basket.domain.interactors.additionalorder.AdditionalOrderRetrieveBasketUseCase;
import com.carrefour.fid.android.basket.domain.interactors.internal.C13924e;
import com.carrefour.fid.android.basket.domain.interactors.standard.StdRetrieveBasketUseCase;
import com.carrefour.fid.android.domain.interactors.basket.C37569f0;
import com.carrefour.fid.android.domain.models.basket.BasketType;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

public final class BasketRetrieveBasketUseCase implements C37569f0 {
    @C12579k

    /* renamed from: a */
    public final AdditionalOrderRetrieveBasketUseCase f33879a;
    @C12579k

    /* renamed from: b */
    public final C13924e f33880b;
    @C12579k

    /* renamed from: c */
    public final StdRetrieveBasketUseCase f33881c;

    /* renamed from: com.carrefour.fid.android.basket.domain.interactors.BasketRetrieveBasketUseCase$a */
    public /* synthetic */ class C13893a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BasketType.values().length];
            try {
                iArr[BasketType.BASKET_V4_ADDITIONAL_ORDER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Inject
    public BasketRetrieveBasketUseCase(@C12579k AdditionalOrderRetrieveBasketUseCase additionalOrderRetrieveBasketUseCase, @C12579k C13924e eVar, @C12579k StdRetrieveBasketUseCase stdRetrieveBasketUseCase) {
        Intrinsics.checkNotNullParameter(additionalOrderRetrieveBasketUseCase, "additionalOrderRetrieveBasketUseCase");
        Intrinsics.checkNotNullParameter(eVar, "getBasketTypeUseCase");
        Intrinsics.checkNotNullParameter(stdRetrieveBasketUseCase, "stdRetrieveBasketUseCase");
        this.f33879a = additionalOrderRetrieveBasketUseCase;
        this.f33880b = eVar;
        this.f33881c = stdRetrieveBasketUseCase;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x006a A[SYNTHETIC, Splitter:B:26:0x006a] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: invoke-IoAF18A  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m172763invokeIoAF18A(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.basket.Basket>> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.carrefour.fid.android.basket.domain.interactors.BasketRetrieveBasketUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.carrefour.fid.android.basket.domain.interactors.BasketRetrieveBasketUseCase$invoke$1 r0 = (com.carrefour.fid.android.basket.domain.interactors.BasketRetrieveBasketUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.basket.domain.interactors.BasketRetrieveBasketUseCase$invoke$1 r0 = new com.carrefour.fid.android.basket.domain.interactors.BasketRetrieveBasketUseCase$invoke$1
            r0.<init>(r7, r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0053
            if (r2 == r5) goto L_0x0045
            if (r2 == r4) goto L_0x003d
            if (r2 != r3) goto L_0x0035
            kotlin.C11661u0.m45747n(r8)     // Catch:{ all -> 0x0043 }
            kotlin.Result r8 = (kotlin.Result) r8     // Catch:{ all -> 0x0043 }
        L_0x0030:
            java.lang.Object r8 = r8.mo21858l()     // Catch:{ all -> 0x0043 }
            goto L_0x0093
        L_0x0035:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x003d:
            kotlin.C11661u0.m45747n(r8)     // Catch:{ all -> 0x0043 }
            kotlin.Result r8 = (kotlin.Result) r8     // Catch:{ all -> 0x0043 }
            goto L_0x0030
        L_0x0043:
            r8 = move-exception
            goto L_0x009d
        L_0x0045:
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.basket.domain.interactors.BasketRetrieveBasketUseCase r2 = (com.carrefour.fid.android.basket.domain.interactors.BasketRetrieveBasketUseCase) r2
            kotlin.C11661u0.m45747n(r8)
            kotlin.Result r8 = (kotlin.Result) r8
            java.lang.Object r8 = r8.mo21858l()
            goto L_0x0064
        L_0x0053:
            kotlin.C11661u0.m45747n(r8)
            com.carrefour.fid.android.basket.domain.interactors.internal.e r8 = r7.f33880b
            r0.L$0 = r7
            r0.label = r5
            java.lang.Object r8 = r8.m172791invokeIoAF18A(r0)
            if (r8 != r1) goto L_0x0063
            return r1
        L_0x0063:
            r2 = r7
        L_0x0064:
            boolean r6 = kotlin.Result.m38710j(r8)
            if (r6 == 0) goto L_0x00a3
            kotlin.Result$a r6 = kotlin.Result.f28060a     // Catch:{ all -> 0x0043 }
            com.carrefour.fid.android.domain.models.basket.BasketType r8 = (com.carrefour.fid.android.domain.models.basket.BasketType) r8     // Catch:{ all -> 0x0043 }
            int[] r6 = com.carrefour.fid.android.basket.domain.interactors.BasketRetrieveBasketUseCase.C13893a.$EnumSwitchMapping$0     // Catch:{ all -> 0x0043 }
            int r8 = r8.ordinal()     // Catch:{ all -> 0x0043 }
            r8 = r6[r8]     // Catch:{ all -> 0x0043 }
            r6 = 0
            if (r8 != r5) goto L_0x0086
            com.carrefour.fid.android.basket.domain.interactors.additionalorder.AdditionalOrderRetrieveBasketUseCase r8 = r2.f33879a     // Catch:{ all -> 0x0043 }
            r0.L$0 = r6     // Catch:{ all -> 0x0043 }
            r0.label = r4     // Catch:{ all -> 0x0043 }
            java.lang.Object r8 = r8.m172774invokeIoAF18A(r0)     // Catch:{ all -> 0x0043 }
            if (r8 != r1) goto L_0x0093
            return r1
        L_0x0086:
            com.carrefour.fid.android.basket.domain.interactors.standard.StdRetrieveBasketUseCase r8 = r2.f33881c     // Catch:{ all -> 0x0043 }
            r0.L$0 = r6     // Catch:{ all -> 0x0043 }
            r0.label = r3     // Catch:{ all -> 0x0043 }
            java.lang.Object r8 = r8.m172795invokeIoAF18A(r0)     // Catch:{ all -> 0x0043 }
            if (r8 != r1) goto L_0x0093
            return r1
        L_0x0093:
            kotlin.C11661u0.m45747n(r8)     // Catch:{ all -> 0x0043 }
            com.carrefour.fid.android.domain.models.basket.Basket r8 = (com.carrefour.fid.android.domain.models.basket.Basket) r8     // Catch:{ all -> 0x0043 }
            java.lang.Object r8 = kotlin.Result.m38702b(r8)     // Catch:{ all -> 0x0043 }
            goto L_0x00a7
        L_0x009d:
            kotlin.Result$a r0 = kotlin.Result.f28060a
            java.lang.Object r8 = kotlin.C11661u0.m45734a(r8)
        L_0x00a3:
            java.lang.Object r8 = kotlin.Result.m38702b(r8)
        L_0x00a7:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.basket.domain.interactors.BasketRetrieveBasketUseCase.m172763invokeIoAF18A(kotlin.coroutines.c):java.lang.Object");
    }
}
