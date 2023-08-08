package com.carrefour.fid.android.basket.domain.interactors;

import com.carrefour.fid.android.domain.models.basket.C37968a;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.internal.C11363r0;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11908f;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,112:1\n51#2,5:113\n*E\n"})
/* renamed from: com.carrefour.fid.android.basket.domain.interactors.BasketObserveBasketItemQuantityToSellUseCase$invoke-CjOXOYQ$$inlined$map$1 */
public final class C13888x3f20449a implements C11907e<C37968a> {

    /* renamed from: a */
    public final /* synthetic */ C11907e f33868a;

    /* renamed from: b */
    public final /* synthetic */ String f33869b;

    public C13888x3f20449a(C11907e eVar, String str) {
        this.f33868a = eVar;
        this.f33869b = str;
    }

    @C12580l
    public Object collect(@C12579k final C11908f fVar, @C12579k C11045c cVar) {
        C11907e eVar = this.f33868a;
        final String str = this.f33869b;
        Object collect = eVar.collect(new C11908f() {
            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            @org.jetbrains.annotations.C12580l
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r9, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c r10) {
                /*
                    r8 = this;
                    boolean r0 = r10 instanceof com.carrefour.fid.android.basket.domain.interactors.C13888x3f20449a.C138892.C138901
                    if (r0 == 0) goto L_0x0013
                    r0 = r10
                    com.carrefour.fid.android.basket.domain.interactors.BasketObserveBasketItemQuantityToSellUseCase$invoke-CjOXOYQ$$inlined$map$1$2$1 r0 = (com.carrefour.fid.android.basket.domain.interactors.C13888x3f20449a.C138892.C138901) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L_0x0018
                L_0x0013:
                    com.carrefour.fid.android.basket.domain.interactors.BasketObserveBasketItemQuantityToSellUseCase$invoke-CjOXOYQ$$inlined$map$1$2$1 r0 = new com.carrefour.fid.android.basket.domain.interactors.BasketObserveBasketItemQuantityToSellUseCase$invoke-CjOXOYQ$$inlined$map$1$2$1
                    r0.<init>(r8, r10)
                L_0x0018:
                    java.lang.Object r10 = r0.result
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
                    int r2 = r0.label
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    kotlin.C11661u0.m45747n(r10)
                    goto L_0x008d
                L_0x0029:
                    java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                    java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                    r9.<init>(r10)
                    throw r9
                L_0x0031:
                    kotlin.C11661u0.m45747n(r10)
                    kotlinx.coroutines.flow.f r10 = r4
                    com.carrefour.fid.android.domain.models.basket.Basket r9 = (com.carrefour.fid.android.domain.models.basket.Basket) r9
                    r2 = 0
                    r4 = 0
                    if (r9 == 0) goto L_0x006e
                    java.util.List r9 = r9.mo116817B()
                    if (r9 == 0) goto L_0x006e
                    java.lang.Iterable r9 = (java.lang.Iterable) r9
                    java.util.Iterator r9 = r9.iterator()
                L_0x0048:
                    boolean r5 = r9.hasNext()
                    if (r5 == 0) goto L_0x006a
                    java.lang.Object r5 = r9.next()
                    r6 = r5
                    com.carrefour.fid.android.domain.models.offer.Offer r6 = (com.carrefour.fid.android.domain.models.offer.Offer) r6
                    com.carrefour.fid.android.domain.models.offer.OfferIdentifier r6 = r6.mo118001J()
                    java.lang.String r6 = r6.mo118136f()
                    java.lang.String r7 = r2
                    if (r7 != 0) goto L_0x0063
                    r6 = r2
                    goto L_0x0067
                L_0x0063:
                    boolean r6 = com.carrefour.fid.android.domain.models.product.Gtin.m157311e(r6, r7)
                L_0x0067:
                    if (r6 == 0) goto L_0x0048
                    goto L_0x006b
                L_0x006a:
                    r5 = r4
                L_0x006b:
                    com.carrefour.fid.android.domain.models.offer.Offer r5 = (com.carrefour.fid.android.domain.models.offer.Offer) r5
                    goto L_0x006f
                L_0x006e:
                    r5 = r4
                L_0x006f:
                    com.carrefour.fid.android.domain.models.basket.a r9 = new com.carrefour.fid.android.domain.models.basket.a
                    if (r5 == 0) goto L_0x0077
                    int r2 = r5.mo118012U()
                L_0x0077:
                    if (r5 == 0) goto L_0x0081
                    int r4 = r5.mo118004M()
                    java.lang.Integer r4 = kotlin.coroutines.jvm.internal.C11064a.m42620f(r4)
                L_0x0081:
                    r9.<init>(r2, r4)
                    r0.label = r3
                    java.lang.Object r9 = r10.emit(r9, r0)
                    if (r9 != r1) goto L_0x008d
                    return r1
                L_0x008d:
                    kotlin.d2 r9 = kotlin.C11079d2.f28267a
                    return r9
                */
                throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.basket.domain.interactors.C13888x3f20449a.C138892.emit(java.lang.Object, kotlin.coroutines.c):java.lang.Object");
            }
        }, cVar);
        if (collect == C11063b.m42612h()) {
            return collect;
        }
        return C11079d2.f28267a;
    }
}
