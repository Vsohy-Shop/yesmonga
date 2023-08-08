package com.carrefour.fid.android.basket.domain.interactors.additionalorder;

import com.carrefour.fid.android.basket.domain.interactors.internal.DeleteBasketUseCase;
import com.carrefour.fid.android.domain.interactors.C37678e;
import javax.inject.Inject;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nAdditionalOrderDeleteCurrentBasketUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdditionalOrderDeleteCurrentBasketUseCase.kt\ncom/carrefour/fid/android/basket/domain/interactors/additionalorder/AdditionalOrderDeleteCurrentBasketUseCase\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,12:1\n1#2:13\n*E\n"})
public final class AdditionalOrderDeleteCurrentBasketUseCase implements C37678e<Boolean> {
    @C12579k

    /* renamed from: a */
    public final DeleteBasketUseCase f33912a;

    @Inject
    public AdditionalOrderDeleteCurrentBasketUseCase(@C12579k DeleteBasketUseCase deleteBasketUseCase) {
        Intrinsics.checkNotNullParameter(deleteBasketUseCase, "deleteBasketUseCase");
        this.f33912a = deleteBasketUseCase;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: invoke-IoAF18A  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m172773invokeIoAF18A(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<java.lang.Boolean>> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.carrefour.fid.android.basket.domain.interactors.additionalorder.AdditionalOrderDeleteCurrentBasketUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.carrefour.fid.android.basket.domain.interactors.additionalorder.AdditionalOrderDeleteCurrentBasketUseCase$invoke$1 r0 = (com.carrefour.fid.android.basket.domain.interactors.additionalorder.AdditionalOrderDeleteCurrentBasketUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.basket.domain.interactors.additionalorder.AdditionalOrderDeleteCurrentBasketUseCase$invoke$1 r0 = new com.carrefour.fid.android.basket.domain.interactors.additionalorder.AdditionalOrderDeleteCurrentBasketUseCase$invoke$1
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            kotlin.C11661u0.m45747n(r5)     // Catch:{ all -> 0x0059 }
            kotlin.Result r5 = (kotlin.Result) r5     // Catch:{ all -> 0x0059 }
            java.lang.Object r5 = r5.mo21858l()     // Catch:{ all -> 0x0059 }
            goto L_0x0047
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0037:
            kotlin.C11661u0.m45747n(r5)
            kotlin.Result$a r5 = kotlin.Result.f28060a     // Catch:{ all -> 0x0059 }
            com.carrefour.fid.android.basket.domain.interactors.internal.DeleteBasketUseCase r5 = r4.f33912a     // Catch:{ all -> 0x0059 }
            r0.label = r3     // Catch:{ all -> 0x0059 }
            java.lang.Object r5 = r5.m172782invokeIoAF18A(r0)     // Catch:{ all -> 0x0059 }
            if (r5 != r1) goto L_0x0047
            return r1
        L_0x0047:
            kotlin.C11661u0.m45747n(r5)     // Catch:{ all -> 0x0059 }
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch:{ all -> 0x0059 }
            boolean r5 = r5.booleanValue()     // Catch:{ all -> 0x0059 }
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.C11064a.m42615a(r5)     // Catch:{ all -> 0x0059 }
            java.lang.Object r5 = kotlin.Result.m38702b(r5)     // Catch:{ all -> 0x0059 }
            goto L_0x0064
        L_0x0059:
            r5 = move-exception
            kotlin.Result$a r0 = kotlin.Result.f28060a
            java.lang.Object r5 = kotlin.C11661u0.m45734a(r5)
            java.lang.Object r5 = kotlin.Result.m38702b(r5)
        L_0x0064:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.basket.domain.interactors.additionalorder.AdditionalOrderDeleteCurrentBasketUseCase.m172773invokeIoAF18A(kotlin.coroutines.c):java.lang.Object");
    }
}
