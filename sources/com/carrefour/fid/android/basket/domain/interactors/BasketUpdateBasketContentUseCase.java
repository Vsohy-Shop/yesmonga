package com.carrefour.fid.android.basket.domain.interactors;

import com.carrefour.fid.android.basket.domain.interactors.additionalorder.AdditionalOrderUpdateBasketContentUseCase;
import com.carrefour.fid.android.basket.domain.interactors.internal.C13924e;
import com.carrefour.fid.android.basket.domain.interactors.standard.StdUpdateBasketContentUseCase;
import com.carrefour.fid.android.domain.interactors.basket.C37588n0;
import com.carrefour.fid.android.domain.models.basket.BasketType;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

public final class BasketUpdateBasketContentUseCase implements C37588n0 {
    @C12579k

    /* renamed from: a */
    public final C13924e f33893a;
    @C12579k

    /* renamed from: b */
    public final AdditionalOrderUpdateBasketContentUseCase f33894b;
    @C12579k

    /* renamed from: c */
    public final StdUpdateBasketContentUseCase f33895c;

    /* renamed from: com.carrefour.fid.android.basket.domain.interactors.BasketUpdateBasketContentUseCase$a */
    public /* synthetic */ class C13895a {
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
    public BasketUpdateBasketContentUseCase(@C12579k C13924e eVar, @C12579k AdditionalOrderUpdateBasketContentUseCase additionalOrderUpdateBasketContentUseCase, @C12579k StdUpdateBasketContentUseCase stdUpdateBasketContentUseCase) {
        Intrinsics.checkNotNullParameter(eVar, "getBasketTypeUseCase");
        Intrinsics.checkNotNullParameter(additionalOrderUpdateBasketContentUseCase, "additionalOrderUpdateBasketContentUseCase");
        Intrinsics.checkNotNullParameter(stdUpdateBasketContentUseCase, "stdUpdateBasketContentUseCase");
        this.f33893a = eVar;
        this.f33894b = additionalOrderUpdateBasketContentUseCase;
        this.f33895c = stdUpdateBasketContentUseCase;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0070 A[SYNTHETIC, Splitter:B:26:0x0070] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m172769invokegIAlus(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.domain.interactors.basket.C37588n0.C37589a r8, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.basket.Basket>> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.carrefour.fid.android.basket.domain.interactors.BasketUpdateBasketContentUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.carrefour.fid.android.basket.domain.interactors.BasketUpdateBasketContentUseCase$invoke$1 r0 = (com.carrefour.fid.android.basket.domain.interactors.BasketUpdateBasketContentUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.basket.domain.interactors.BasketUpdateBasketContentUseCase$invoke$1 r0 = new com.carrefour.fid.android.basket.domain.interactors.BasketUpdateBasketContentUseCase$invoke$1
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0057
            if (r2 == r5) goto L_0x0045
            if (r2 == r4) goto L_0x003d
            if (r2 != r3) goto L_0x0035
            kotlin.C11661u0.m45747n(r9)     // Catch:{ all -> 0x0043 }
            kotlin.Result r9 = (kotlin.Result) r9     // Catch:{ all -> 0x0043 }
        L_0x0030:
            java.lang.Object r8 = r9.mo21858l()     // Catch:{ all -> 0x0043 }
            goto L_0x009d
        L_0x0035:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x003d:
            kotlin.C11661u0.m45747n(r9)     // Catch:{ all -> 0x0043 }
            kotlin.Result r9 = (kotlin.Result) r9     // Catch:{ all -> 0x0043 }
            goto L_0x0030
        L_0x0043:
            r8 = move-exception
            goto L_0x00a7
        L_0x0045:
            java.lang.Object r8 = r0.L$1
            com.carrefour.fid.android.domain.interactors.basket.n0$a r8 = (com.carrefour.fid.android.domain.interactors.basket.C37588n0.C37589a) r8
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.basket.domain.interactors.BasketUpdateBasketContentUseCase r2 = (com.carrefour.fid.android.basket.domain.interactors.BasketUpdateBasketContentUseCase) r2
            kotlin.C11661u0.m45747n(r9)
            kotlin.Result r9 = (kotlin.Result) r9
            java.lang.Object r9 = r9.mo21858l()
            goto L_0x006a
        L_0x0057:
            kotlin.C11661u0.m45747n(r9)
            com.carrefour.fid.android.basket.domain.interactors.internal.e r9 = r7.f33893a
            r0.L$0 = r7
            r0.L$1 = r8
            r0.label = r5
            java.lang.Object r9 = r9.m172791invokeIoAF18A(r0)
            if (r9 != r1) goto L_0x0069
            return r1
        L_0x0069:
            r2 = r7
        L_0x006a:
            boolean r6 = kotlin.Result.m38710j(r9)
            if (r6 == 0) goto L_0x00b2
            kotlin.Result$a r6 = kotlin.Result.f28060a     // Catch:{ all -> 0x0043 }
            com.carrefour.fid.android.domain.models.basket.BasketType r9 = (com.carrefour.fid.android.domain.models.basket.BasketType) r9     // Catch:{ all -> 0x0043 }
            int[] r6 = com.carrefour.fid.android.basket.domain.interactors.BasketUpdateBasketContentUseCase.C13895a.$EnumSwitchMapping$0     // Catch:{ all -> 0x0043 }
            int r9 = r9.ordinal()     // Catch:{ all -> 0x0043 }
            r9 = r6[r9]     // Catch:{ all -> 0x0043 }
            r6 = 0
            if (r9 != r5) goto L_0x008e
            com.carrefour.fid.android.basket.domain.interactors.additionalorder.AdditionalOrderUpdateBasketContentUseCase r9 = r2.f33894b     // Catch:{ all -> 0x0043 }
            r0.L$0 = r6     // Catch:{ all -> 0x0043 }
            r0.L$1 = r6     // Catch:{ all -> 0x0043 }
            r0.label = r4     // Catch:{ all -> 0x0043 }
            java.lang.Object r8 = r9.m172776invokegIAlus(r8, r0)     // Catch:{ all -> 0x0043 }
            if (r8 != r1) goto L_0x009d
            return r1
        L_0x008e:
            com.carrefour.fid.android.basket.domain.interactors.standard.StdUpdateBasketContentUseCase r9 = r2.f33895c     // Catch:{ all -> 0x0043 }
            r0.L$0 = r6     // Catch:{ all -> 0x0043 }
            r0.L$1 = r6     // Catch:{ all -> 0x0043 }
            r0.label = r3     // Catch:{ all -> 0x0043 }
            java.lang.Object r8 = r9.m172797invokegIAlus(r8, r0)     // Catch:{ all -> 0x0043 }
            if (r8 != r1) goto L_0x009d
            return r1
        L_0x009d:
            kotlin.C11661u0.m45747n(r8)     // Catch:{ all -> 0x0043 }
            com.carrefour.fid.android.domain.models.basket.Basket r8 = (com.carrefour.fid.android.domain.models.basket.Basket) r8     // Catch:{ all -> 0x0043 }
            java.lang.Object r8 = kotlin.Result.m38702b(r8)     // Catch:{ all -> 0x0043 }
            goto L_0x00b6
        L_0x00a7:
            kotlin.Result$a r9 = kotlin.Result.f28060a
            java.lang.Object r8 = kotlin.C11661u0.m45734a(r8)
            java.lang.Object r8 = kotlin.Result.m38702b(r8)
            goto L_0x00b6
        L_0x00b2:
            java.lang.Object r8 = kotlin.Result.m38702b(r9)
        L_0x00b6:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.basket.domain.interactors.BasketUpdateBasketContentUseCase.m172769invokegIAlus(com.carrefour.fid.android.domain.interactors.basket.n0$a, kotlin.coroutines.c):java.lang.Object");
    }
}
