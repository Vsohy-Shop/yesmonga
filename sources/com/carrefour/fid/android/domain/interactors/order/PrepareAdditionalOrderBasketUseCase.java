package com.carrefour.fid.android.domain.interactors.order;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.domain.interactors.C37678e;
import com.carrefour.fid.android.domain.interactors.basket.C37569f0;
import com.carrefour.fid.android.domain.interactors.basket.C37575i;
import com.carrefour.fid.android.domain.interactors.basket.C37576i0;
import javax.inject.Inject;
import kotlin.C11079d2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
public final class PrepareAdditionalOrderBasketUseCase implements C37678e<C11079d2> {

    /* renamed from: d */
    public static final int f94699d = 8;
    @C12579k

    /* renamed from: a */
    public final C37575i f94700a;
    @C12579k

    /* renamed from: b */
    public final C37576i0 f94701b;
    @C12579k

    /* renamed from: c */
    public final C37569f0 f94702c;

    @Inject
    public PrepareAdditionalOrderBasketUseCase(@C12579k C37575i iVar, @C12579k C37576i0 i0Var, @C12579k C37569f0 f0Var) {
        Intrinsics.checkNotNullParameter(iVar, "deleteBasketUseCase");
        Intrinsics.checkNotNullParameter(i0Var, "switchBasketTypeUseCase");
        Intrinsics.checkNotNullParameter(f0Var, "retrieveBasketUseCase");
        this.f94700a = iVar;
        this.f94701b = i0Var;
        this.f94702c = f0Var;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x009b A[SYNTHETIC, Splitter:B:35:0x009b] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00b2 A[Catch:{ all -> 0x0071 }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00c7 A[Catch:{ all -> 0x0071 }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00d5 A[Catch:{ all -> 0x0071 }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00f0 A[Catch:{ all -> 0x0071 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: invoke-IoAF18A  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m172984invokeIoAF18A(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<kotlin.C11079d2>> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.carrefour.fid.android.domain.interactors.order.PrepareAdditionalOrderBasketUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.carrefour.fid.android.domain.interactors.order.PrepareAdditionalOrderBasketUseCase$invoke$1 r0 = (com.carrefour.fid.android.domain.interactors.order.PrepareAdditionalOrderBasketUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.domain.interactors.order.PrepareAdditionalOrderBasketUseCase$invoke$1 r0 = new com.carrefour.fid.android.domain.interactors.order.PrepareAdditionalOrderBasketUseCase$invoke$1
            r0.<init>(r8, r9)
        L_0x0018:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 5
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            if (r2 == 0) goto L_0x0082
            if (r2 == r7) goto L_0x0074
            if (r2 == r6) goto L_0x0063
            if (r2 == r5) goto L_0x0055
            if (r2 == r4) goto L_0x0047
            if (r2 != r3) goto L_0x003f
            java.lang.Object r0 = r0.L$0
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            kotlin.C11661u0.m45747n(r9)     // Catch:{ all -> 0x0071 }
            kotlin.Result r9 = (kotlin.Result) r9     // Catch:{ all -> 0x0071 }
            r9.mo21858l()     // Catch:{ all -> 0x0071 }
            goto L_0x0113
        L_0x003f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L_0x0047:
            java.lang.Object r0 = r0.L$0
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            kotlin.C11661u0.m45747n(r9)     // Catch:{ all -> 0x0071 }
            kotlin.Result r9 = (kotlin.Result) r9     // Catch:{ all -> 0x0071 }
            r9.mo21858l()     // Catch:{ all -> 0x0071 }
            goto L_0x00e5
        L_0x0055:
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.domain.interactors.order.PrepareAdditionalOrderBasketUseCase r2 = (com.carrefour.fid.android.domain.interactors.order.PrepareAdditionalOrderBasketUseCase) r2
            kotlin.C11661u0.m45747n(r9)     // Catch:{ all -> 0x0071 }
            kotlin.Result r9 = (kotlin.Result) r9     // Catch:{ all -> 0x0071 }
            java.lang.Object r9 = r9.mo21858l()     // Catch:{ all -> 0x0071 }
            goto L_0x00c1
        L_0x0063:
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.domain.interactors.order.PrepareAdditionalOrderBasketUseCase r2 = (com.carrefour.fid.android.domain.interactors.order.PrepareAdditionalOrderBasketUseCase) r2
            kotlin.C11661u0.m45747n(r9)     // Catch:{ all -> 0x0071 }
            kotlin.Result r9 = (kotlin.Result) r9     // Catch:{ all -> 0x0071 }
            java.lang.Object r9 = r9.mo21858l()     // Catch:{ all -> 0x0071 }
            goto L_0x00ac
        L_0x0071:
            r9 = move-exception
            goto L_0x0125
        L_0x0074:
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.domain.interactors.order.PrepareAdditionalOrderBasketUseCase r2 = (com.carrefour.fid.android.domain.interactors.order.PrepareAdditionalOrderBasketUseCase) r2
            kotlin.C11661u0.m45747n(r9)
            kotlin.Result r9 = (kotlin.Result) r9
            java.lang.Object r9 = r9.mo21858l()
            goto L_0x0095
        L_0x0082:
            kotlin.C11661u0.m45747n(r9)
            com.carrefour.fid.android.domain.interactors.basket.i0 r9 = r8.f94701b
            com.carrefour.fid.android.domain.models.basket.BasketType r2 = com.carrefour.fid.android.domain.models.basket.BasketType.BASKET_V4_ADDITIONAL_ORDER
            r0.L$0 = r8
            r0.label = r7
            java.lang.Object r9 = r9.m172966invokegIAlus(r2, r0)
            if (r9 != r1) goto L_0x0094
            return r1
        L_0x0094:
            r2 = r8
        L_0x0095:
            boolean r7 = kotlin.Result.m38710j(r9)
            if (r7 == 0) goto L_0x012b
            kotlin.Result$a r7 = kotlin.Result.f28060a     // Catch:{ all -> 0x0071 }
            kotlin.d2 r9 = (kotlin.C11079d2) r9     // Catch:{ all -> 0x0071 }
            com.carrefour.fid.android.domain.interactors.basket.f0 r9 = r2.f94702c     // Catch:{ all -> 0x0071 }
            r0.L$0 = r2     // Catch:{ all -> 0x0071 }
            r0.label = r6     // Catch:{ all -> 0x0071 }
            java.lang.Object r9 = r9.m172965invokeIoAF18A(r0)     // Catch:{ all -> 0x0071 }
            if (r9 != r1) goto L_0x00ac
            return r1
        L_0x00ac:
            boolean r6 = kotlin.Result.m38710j(r9)     // Catch:{ all -> 0x0071 }
            if (r6 == 0) goto L_0x00f0
            com.carrefour.fid.android.domain.models.basket.Basket r9 = (com.carrefour.fid.android.domain.models.basket.Basket) r9     // Catch:{ all -> 0x0071 }
            com.carrefour.fid.android.domain.interactors.basket.i r9 = r2.f94700a     // Catch:{ all -> 0x0071 }
            r0.L$0 = r2     // Catch:{ all -> 0x0071 }
            r0.label = r5     // Catch:{ all -> 0x0071 }
            java.lang.Object r9 = r9.m172965invokeIoAF18A(r0)     // Catch:{ all -> 0x0071 }
            if (r9 != r1) goto L_0x00c1
            return r1
        L_0x00c1:
            java.lang.Throwable r3 = kotlin.Result.m38705e(r9)     // Catch:{ all -> 0x0071 }
            if (r3 != 0) goto L_0x00d5
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch:{ all -> 0x0071 }
            r9.booleanValue()     // Catch:{ all -> 0x0071 }
            kotlin.Result$a r9 = kotlin.Result.f28060a     // Catch:{ all -> 0x0071 }
            kotlin.d2 r9 = kotlin.C11079d2.f28267a     // Catch:{ all -> 0x0071 }
            java.lang.Object r9 = kotlin.Result.m38702b(r9)     // Catch:{ all -> 0x0071 }
            return r9
        L_0x00d5:
            com.carrefour.fid.android.domain.interactors.basket.i0 r9 = r2.f94701b     // Catch:{ all -> 0x0071 }
            com.carrefour.fid.android.domain.models.basket.BasketType r2 = com.carrefour.fid.android.domain.models.basket.BasketType.BASKET_V4_DRIVE     // Catch:{ all -> 0x0071 }
            r0.L$0 = r3     // Catch:{ all -> 0x0071 }
            r0.label = r4     // Catch:{ all -> 0x0071 }
            java.lang.Object r9 = r9.m172966invokegIAlus(r2, r0)     // Catch:{ all -> 0x0071 }
            if (r9 != r1) goto L_0x00e4
            return r1
        L_0x00e4:
            r0 = r3
        L_0x00e5:
            kotlin.Result$a r9 = kotlin.Result.f28060a     // Catch:{ all -> 0x0071 }
            java.lang.Object r9 = kotlin.C11661u0.m45734a(r0)     // Catch:{ all -> 0x0071 }
            java.lang.Object r9 = kotlin.Result.m38702b(r9)     // Catch:{ all -> 0x0071 }
            return r9
        L_0x00f0:
            java.lang.Throwable r9 = kotlin.Result.m38705e(r9)     // Catch:{ all -> 0x0071 }
            if (r9 == 0) goto L_0x011e
            boolean r4 = r9 instanceof com.carrefour.fid.android.domain.exceptions.BasketNotFoundThrowable     // Catch:{ all -> 0x0071 }
            if (r4 == 0) goto L_0x0103
            kotlin.Result$a r9 = kotlin.Result.f28060a     // Catch:{ all -> 0x0071 }
            kotlin.d2 r9 = kotlin.C11079d2.f28267a     // Catch:{ all -> 0x0071 }
            java.lang.Object r9 = kotlin.Result.m38702b(r9)     // Catch:{ all -> 0x0071 }
            return r9
        L_0x0103:
            com.carrefour.fid.android.domain.interactors.basket.i0 r2 = r2.f94701b     // Catch:{ all -> 0x0071 }
            com.carrefour.fid.android.domain.models.basket.BasketType r4 = com.carrefour.fid.android.domain.models.basket.BasketType.BASKET_V4_DRIVE     // Catch:{ all -> 0x0071 }
            r0.L$0 = r9     // Catch:{ all -> 0x0071 }
            r0.label = r3     // Catch:{ all -> 0x0071 }
            java.lang.Object r0 = r2.m172966invokegIAlus(r4, r0)     // Catch:{ all -> 0x0071 }
            if (r0 != r1) goto L_0x0112
            return r1
        L_0x0112:
            r0 = r9
        L_0x0113:
            kotlin.Result$a r9 = kotlin.Result.f28060a     // Catch:{ all -> 0x0071 }
            java.lang.Object r9 = kotlin.C11661u0.m45734a(r0)     // Catch:{ all -> 0x0071 }
            java.lang.Object r9 = kotlin.Result.m38702b(r9)     // Catch:{ all -> 0x0071 }
            return r9
        L_0x011e:
            kotlin.d2 r9 = kotlin.C11079d2.f28267a     // Catch:{ all -> 0x0071 }
            java.lang.Object r9 = kotlin.Result.m38702b(r9)     // Catch:{ all -> 0x0071 }
            goto L_0x012f
        L_0x0125:
            kotlin.Result$a r0 = kotlin.Result.f28060a
            java.lang.Object r9 = kotlin.C11661u0.m45734a(r9)
        L_0x012b:
            java.lang.Object r9 = kotlin.Result.m38702b(r9)
        L_0x012f:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.interactors.order.PrepareAdditionalOrderBasketUseCase.m172984invokeIoAF18A(kotlin.coroutines.c):java.lang.Object");
    }
}
