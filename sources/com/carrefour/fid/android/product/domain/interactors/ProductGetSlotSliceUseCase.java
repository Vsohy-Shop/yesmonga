package com.carrefour.fid.android.product.domain.interactors;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.domain.interactors.basket.C37566e0;
import com.carrefour.fid.android.domain.interactors.slot.C37857d;
import com.carrefour.fid.android.domain.interactors.slot.C37858e;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
public final class ProductGetSlotSliceUseCase implements C37857d {

    /* renamed from: c */
    public static final int f66890c = 8;
    @C12579k

    /* renamed from: a */
    public final C37858e f66891a;
    @C12579k

    /* renamed from: b */
    public final C37566e0 f66892b;

    @Inject
    public ProductGetSlotSliceUseCase(@C12579k C37858e eVar, @C12579k C37566e0 e0Var) {
        Intrinsics.checkNotNullParameter(eVar, "getSlotStoreUseCase");
        Intrinsics.checkNotNullParameter(e0Var, "retrieveBasketFromCacheUseCase");
        this.f66891a = eVar;
        this.f66892b = e0Var;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo79994c(kotlin.coroutines.C11045c<? super kotlin.Result<java.lang.String>> r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof com.carrefour.fid.android.product.domain.interactors.ProductGetSlotSliceUseCase$getSlotSliceResultFromBasket$1
            if (r0 == 0) goto L_0x0013
            r0 = r11
            com.carrefour.fid.android.product.domain.interactors.ProductGetSlotSliceUseCase$getSlotSliceResultFromBasket$1 r0 = (com.carrefour.fid.android.product.domain.interactors.ProductGetSlotSliceUseCase$getSlotSliceResultFromBasket$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.product.domain.interactors.ProductGetSlotSliceUseCase$getSlotSliceResultFromBasket$1 r0 = new com.carrefour.fid.android.product.domain.interactors.ProductGetSlotSliceUseCase$getSlotSliceResultFromBasket$1
            r0.<init>(r10, r11)
        L_0x0018:
            java.lang.Object r11 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            kotlin.C11661u0.m45747n(r11)
            kotlin.Result r11 = (kotlin.Result) r11
            java.lang.Object r11 = r11.mo21858l()
            goto L_0x0045
        L_0x002f:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L_0x0037:
            kotlin.C11661u0.m45747n(r11)
            com.carrefour.fid.android.domain.interactors.basket.e0 r11 = r10.f66892b
            r0.label = r3
            java.lang.Object r11 = r11.m172965invokeIoAF18A(r0)
            if (r11 != r1) goto L_0x0045
            return r1
        L_0x0045:
            java.lang.Throwable r0 = kotlin.Result.m38705e(r11)
            if (r0 != 0) goto L_0x007a
            com.carrefour.fid.android.domain.models.basket.Basket r11 = (com.carrefour.fid.android.domain.models.basket.Basket) r11
            if (r11 == 0) goto L_0x0071
            com.carrefour.fid.android.domain.models.basket.BasketSlot r0 = r11.mo116826K()
            java.lang.String r0 = r0.mo117000k()
            int r0 = r0.length()
            if (r0 != 0) goto L_0x005e
            goto L_0x005f
        L_0x005e:
            r3 = 0
        L_0x005f:
            if (r3 == 0) goto L_0x0062
            goto L_0x0071
        L_0x0062:
            kotlin.Result$a r0 = kotlin.Result.f28060a
            com.carrefour.fid.android.domain.models.basket.BasketSlot r11 = r11.mo116826K()
            java.lang.String r11 = r11.mo117000k()
            java.lang.Object r11 = kotlin.Result.m38702b(r11)
            goto L_0x008f
        L_0x0071:
            kotlin.Result$a r11 = kotlin.Result.f28060a
            java.lang.String r11 = "1A"
            java.lang.Object r11 = kotlin.Result.m38702b(r11)
            goto L_0x008f
        L_0x007a:
            com.carrefour.fid.android.shared.util.i r4 = com.carrefour.fid.android.shared.util.C28935i.f70940a
            java.lang.String r5 = "Cannot get slot slice from basket"
            r7 = 0
            r8 = 4
            r9 = 0
            r6 = r0
            com.carrefour.fid.android.shared.util.C28935i.m119705e(r4, r5, r6, r7, r8, r9)
            kotlin.Result$a r11 = kotlin.Result.f28060a
            java.lang.Object r11 = kotlin.C11661u0.m45734a(r0)
            java.lang.Object r11 = kotlin.Result.m38702b(r11)
        L_0x008f:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.domain.interactors.ProductGetSlotSliceUseCase.mo79994c(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: invoke-IoAF18A  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m172817invokeIoAF18A(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<java.lang.String>> r14) {
        /*
            r13 = this;
            boolean r0 = r14 instanceof com.carrefour.fid.android.product.domain.interactors.ProductGetSlotSliceUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r14
            com.carrefour.fid.android.product.domain.interactors.ProductGetSlotSliceUseCase$invoke$1 r0 = (com.carrefour.fid.android.product.domain.interactors.ProductGetSlotSliceUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.product.domain.interactors.ProductGetSlotSliceUseCase$invoke$1 r0 = new com.carrefour.fid.android.product.domain.interactors.ProductGetSlotSliceUseCase$invoke$1
            r0.<init>(r13, r14)
        L_0x0018:
            java.lang.Object r14 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x004c
            if (r2 == r5) goto L_0x003e
            if (r2 == r4) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            goto L_0x0034
        L_0x002c:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L_0x0034:
            kotlin.C11661u0.m45747n(r14)
            kotlin.Result r14 = (kotlin.Result) r14
            java.lang.Object r14 = r14.mo21858l()
            goto L_0x009f
        L_0x003e:
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.product.domain.interactors.ProductGetSlotSliceUseCase r2 = (com.carrefour.fid.android.product.domain.interactors.ProductGetSlotSliceUseCase) r2
            kotlin.C11661u0.m45747n(r14)
            kotlin.Result r14 = (kotlin.Result) r14
            java.lang.Object r14 = r14.mo21858l()
            goto L_0x005d
        L_0x004c:
            kotlin.C11661u0.m45747n(r14)
            com.carrefour.fid.android.domain.interactors.slot.e r14 = r13.f66891a
            r0.L$0 = r13
            r0.label = r5
            java.lang.Object r14 = r14.m172965invokeIoAF18A(r0)
            if (r14 != r1) goto L_0x005c
            return r1
        L_0x005c:
            r2 = r13
        L_0x005d:
            java.lang.Throwable r8 = kotlin.Result.m38705e(r14)
            r12 = 0
            if (r8 != 0) goto L_0x008a
            com.carrefour.fid.android.domain.models.slot.Slot r14 = (com.carrefour.fid.android.domain.models.slot.Slot) r14
            java.lang.String r3 = r14.mo119507s()
            int r3 = r3.length()
            if (r3 != 0) goto L_0x0071
            goto L_0x0072
        L_0x0071:
            r5 = 0
        L_0x0072:
            if (r5 == 0) goto L_0x007f
            r0.L$0 = r12
            r0.label = r4
            java.lang.Object r14 = r2.mo79994c(r0)
            if (r14 != r1) goto L_0x009f
            return r1
        L_0x007f:
            kotlin.Result$a r0 = kotlin.Result.f28060a
            java.lang.String r14 = r14.mo119507s()
            java.lang.Object r14 = kotlin.Result.m38702b(r14)
            goto L_0x009f
        L_0x008a:
            com.carrefour.fid.android.shared.util.i r6 = com.carrefour.fid.android.shared.util.C28935i.f70940a
            java.lang.String r7 = "Cannot get saved slot"
            r9 = 0
            r10 = 4
            r11 = 0
            com.carrefour.fid.android.shared.util.C28935i.m119705e(r6, r7, r8, r9, r10, r11)
            r0.L$0 = r12
            r0.label = r3
            java.lang.Object r14 = r2.mo79994c(r0)
            if (r14 != r1) goto L_0x009f
            return r1
        L_0x009f:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.domain.interactors.ProductGetSlotSliceUseCase.m172817invokeIoAF18A(kotlin.coroutines.c):java.lang.Object");
    }
}
