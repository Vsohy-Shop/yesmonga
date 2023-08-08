package com.carrefour.fid.android.checkout.domain.interactors;

import com.carrefour.fid.android.checkout.domain.repositories.SlotRepository;
import com.carrefour.fid.android.domain.interactors.slot.C37859f;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

public final class CheckoutGetSlotYieldListUseCase implements C37859f {
    @C12579k

    /* renamed from: a */
    public final SlotRepository f101661a;

    @Inject
    public CheckoutGetSlotYieldListUseCase(@C12579k SlotRepository slotRepository) {
        Intrinsics.checkNotNullParameter(slotRepository, "repository");
        this.f101661a = slotRepository;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m173113invokegIAlus(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.domain.interactors.slot.C37859f.C37860a r5, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.slot.ServiceSlot>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.carrefour.fid.android.checkout.domain.interactors.CheckoutGetSlotYieldListUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.carrefour.fid.android.checkout.domain.interactors.CheckoutGetSlotYieldListUseCase$invoke$1 r0 = (com.carrefour.fid.android.checkout.domain.interactors.CheckoutGetSlotYieldListUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.checkout.domain.interactors.CheckoutGetSlotYieldListUseCase$invoke$1 r0 = new com.carrefour.fid.android.checkout.domain.interactors.CheckoutGetSlotYieldListUseCase$invoke$1
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
            goto L_0x0045
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0037:
            kotlin.C11661u0.m45747n(r6)
            com.carrefour.fid.android.checkout.domain.repositories.SlotRepository r6 = r4.f101661a
            r0.label = r3
            java.lang.Object r5 = r6.mo131434h(r5, r0)
            if (r5 != r1) goto L_0x0045
            return r1
        L_0x0045:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.checkout.domain.interactors.CheckoutGetSlotYieldListUseCase.m173113invokegIAlus(com.carrefour.fid.android.domain.interactors.slot.f$a, kotlin.coroutines.c):java.lang.Object");
    }
}
