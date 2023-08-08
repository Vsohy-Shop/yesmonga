package com.carrefour.fid.android.product.domain.interactors;

import com.carrefour.fid.android.core.paging.C36328a;
import com.carrefour.fid.android.domain.interactors.basket.C37559b0;
import com.carrefour.fid.android.domain.interactors.basket.C37606z;
import com.carrefour.fid.android.domain.interactors.favorites.shoppinglist.C37682c;
import com.carrefour.fid.android.domain.interactors.product.C37760h;
import com.carrefour.fid.android.domain.interactors.product.C37778p;
import com.carrefour.fid.android.domain.interactors.remoteconfig.C37807b;
import com.carrefour.fid.android.domain.models.C38184v;
import com.carrefour.fid.android.domain.models.basket.Basket;
import com.carrefour.fid.android.domain.models.favorites.shoppinglist.C38030a;
import com.carrefour.fid.android.domain.models.product.C38104c;
import com.carrefour.fid.android.domain.models.product.C38111e;
import com.carrefour.fid.android.domain.models.product.Gtin;
import com.carrefour.fid.android.domain.models.product.ProductListParam;
import com.carrefour.fid.android.domain.models.product.plp.C38114b;
import com.carrefour.fid.android.shared.paging.C28851c;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.C11907e;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nProductGetConsolidatedPlpFlowUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProductGetConsolidatedPlpFlowUseCase.kt\ncom/carrefour/fid/android/product/domain/interactors/ProductGetConsolidatedPlpFlowUseCase\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,209:1\n53#2:210\n55#2:214\n53#2:215\n55#2:219\n53#2:220\n55#2:224\n50#3:211\n55#3:213\n50#3:216\n55#3:218\n50#3:221\n55#3:223\n106#4:212\n106#4:217\n106#4:222\n*S KotlinDebug\n*F\n+ 1 ProductGetConsolidatedPlpFlowUseCase.kt\ncom/carrefour/fid/android/product/domain/interactors/ProductGetConsolidatedPlpFlowUseCase\n*L\n125#1:210\n125#1:214\n144#1:215\n144#1:219\n167#1:220\n167#1:224\n125#1:211\n125#1:213\n144#1:216\n144#1:218\n167#1:221\n167#1:223\n125#1:212\n144#1:217\n167#1:222\n*E\n"})
public final class ProductGetConsolidatedPlpFlowUseCase implements C37760h {
    @C12579k

    /* renamed from: a */
    public final C37778p f66832a;
    @C12579k

    /* renamed from: b */
    public final AddMarketingElementsToPlpUseCase f66833b;
    @C12579k

    /* renamed from: c */
    public final C37682c f66834c;
    @C12579k

    /* renamed from: d */
    public final C37606z f66835d;
    @C12579k

    /* renamed from: e */
    public final C37559b0 f66836e;
    @C12579k

    /* renamed from: f */
    public final C37807b f66837f;

    @Inject
    public ProductGetConsolidatedPlpFlowUseCase(@C12579k C37778p pVar, @C12579k AddMarketingElementsToPlpUseCase addMarketingElementsToPlpUseCase, @C12579k C37682c cVar, @C12579k C37606z zVar, @C12579k C37559b0 b0Var, @C12579k C37807b bVar) {
        Intrinsics.checkNotNullParameter(pVar, "getPlpFlowUseCase");
        Intrinsics.checkNotNullParameter(addMarketingElementsToPlpUseCase, "addMarketingElementsToPlpUseCase");
        Intrinsics.checkNotNullParameter(cVar, "observeShoppingListUseCase");
        Intrinsics.checkNotNullParameter(zVar, "observeBasketUseCase");
        Intrinsics.checkNotNullParameter(b0Var, "observeSyncingInBasketUseCase");
        Intrinsics.checkNotNullParameter(bVar, "checkRemoteConfigUseCase");
        this.f66832a = pVar;
        this.f66833b = addMarketingElementsToPlpUseCase;
        this.f66834c = cVar;
        this.f66835d = zVar;
        this.f66836e = b0Var;
        this.f66837f = bVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x008c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a5 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo79957e(kotlinx.coroutines.flow.C11907e<com.carrefour.fid.android.core.paging.C36328a<com.carrefour.fid.android.domain.models.C38184v>> r8, kotlin.coroutines.C11045c<? super kotlinx.coroutines.flow.C11907e<com.carrefour.fid.android.core.paging.C36328a<com.carrefour.fid.android.domain.models.C38184v>>> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.carrefour.fid.android.product.domain.interactors.ProductGetConsolidatedPlpFlowUseCase$getConsolidatedFlow$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.carrefour.fid.android.product.domain.interactors.ProductGetConsolidatedPlpFlowUseCase$getConsolidatedFlow$1 r0 = (com.carrefour.fid.android.product.domain.interactors.ProductGetConsolidatedPlpFlowUseCase$getConsolidatedFlow$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.product.domain.interactors.ProductGetConsolidatedPlpFlowUseCase$getConsolidatedFlow$1 r0 = new com.carrefour.fid.android.product.domain.interactors.ProductGetConsolidatedPlpFlowUseCase$getConsolidatedFlow$1
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0067
            if (r2 == r5) goto L_0x005b
            if (r2 == r4) goto L_0x0048
            if (r2 != r3) goto L_0x0040
            java.lang.Object r8 = r0.L$3
            kotlinx.coroutines.flow.e r8 = (kotlinx.coroutines.flow.C11907e) r8
            java.lang.Object r1 = r0.L$2
            kotlinx.coroutines.flow.e r1 = (kotlinx.coroutines.flow.C11907e) r1
            java.lang.Object r2 = r0.L$1
            kotlinx.coroutines.flow.e r2 = (kotlinx.coroutines.flow.C11907e) r2
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.product.domain.interactors.ProductGetConsolidatedPlpFlowUseCase r0 = (com.carrefour.fid.android.product.domain.interactors.ProductGetConsolidatedPlpFlowUseCase) r0
            kotlin.C11661u0.m45747n(r9)
            goto L_0x00ab
        L_0x0040:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0048:
            java.lang.Object r8 = r0.L$2
            kotlinx.coroutines.flow.e r8 = (kotlinx.coroutines.flow.C11907e) r8
            java.lang.Object r2 = r0.L$1
            kotlinx.coroutines.flow.e r2 = (kotlinx.coroutines.flow.C11907e) r2
            java.lang.Object r4 = r0.L$0
            com.carrefour.fid.android.product.domain.interactors.ProductGetConsolidatedPlpFlowUseCase r4 = (com.carrefour.fid.android.product.domain.interactors.ProductGetConsolidatedPlpFlowUseCase) r4
            kotlin.C11661u0.m45747n(r9)
            r6 = r4
            r4 = r2
            r2 = r6
            goto L_0x0091
        L_0x005b:
            java.lang.Object r8 = r0.L$1
            kotlinx.coroutines.flow.e r8 = (kotlinx.coroutines.flow.C11907e) r8
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.product.domain.interactors.ProductGetConsolidatedPlpFlowUseCase r2 = (com.carrefour.fid.android.product.domain.interactors.ProductGetConsolidatedPlpFlowUseCase) r2
            kotlin.C11661u0.m45747n(r9)
            goto L_0x007a
        L_0x0067:
            kotlin.C11661u0.m45747n(r9)
            com.carrefour.fid.android.domain.interactors.favorites.shoppinglist.c r9 = r7.f66834c
            r0.L$0 = r7
            r0.L$1 = r8
            r0.label = r5
            java.lang.Object r9 = r9.invoke(r0)
            if (r9 != r1) goto L_0x0079
            return r1
        L_0x0079:
            r2 = r7
        L_0x007a:
            kotlinx.coroutines.flow.e r9 = (kotlinx.coroutines.flow.C11907e) r9
            com.carrefour.fid.android.domain.interactors.basket.z r5 = r2.f66835d
            r0.L$0 = r2
            r0.L$1 = r8
            r0.L$2 = r9
            r0.label = r4
            java.lang.Object r4 = r5.invoke(r0)
            if (r4 != r1) goto L_0x008d
            return r1
        L_0x008d:
            r6 = r4
            r4 = r8
            r8 = r9
            r9 = r6
        L_0x0091:
            kotlinx.coroutines.flow.e r9 = (kotlinx.coroutines.flow.C11907e) r9
            com.carrefour.fid.android.domain.interactors.basket.b0 r5 = r2.f66836e
            r0.L$0 = r2
            r0.L$1 = r4
            r0.L$2 = r8
            r0.L$3 = r9
            r0.label = r3
            java.lang.Object r0 = r5.invoke(r0)
            if (r0 != r1) goto L_0x00a6
            return r1
        L_0x00a6:
            r1 = r8
            r8 = r9
            r9 = r0
            r0 = r2
            r2 = r4
        L_0x00ab:
            kotlinx.coroutines.flow.e r9 = (kotlinx.coroutines.flow.C11907e) r9
            com.carrefour.fid.android.product.domain.interactors.ProductGetConsolidatedPlpFlowUseCase$getConsolidatedFlow$2 r3 = new com.carrefour.fid.android.product.domain.interactors.ProductGetConsolidatedPlpFlowUseCase$getConsolidatedFlow$2
            r4 = 0
            r3.<init>(r0, r4)
            kotlinx.coroutines.flow.e r8 = kotlinx.coroutines.flow.C11909g.m47363F(r2, r1, r8, r9, r3)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.domain.interactors.ProductGetConsolidatedPlpFlowUseCase.mo79957e(kotlinx.coroutines.flow.e, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: f */
    public final boolean mo79958f(List<C38111e> list) {
        return list.size() == 1 && Intrinsics.areEqual((Object) ((C38111e) CollectionsKt___CollectionsKt.m40706w2(list)).mo118782h(), (Object) "score");
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0090 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.domain.models.product.ProductListParam r9, @org.jetbrains.annotations.C12580l com.carrefour.fid.android.domain.models.product.C38104c r10, @org.jetbrains.annotations.C12580l kotlinx.coroutines.flow.C11911i<com.carrefour.fid.android.core.paging.C36334b> r11, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlinx.coroutines.flow.C11907e<com.carrefour.fid.android.core.paging.C36328a<com.carrefour.fid.android.domain.models.C38184v>>> r12) {
        /*
            r8 = this;
            boolean r0 = r12 instanceof com.carrefour.fid.android.product.domain.interactors.ProductGetConsolidatedPlpFlowUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r12
            com.carrefour.fid.android.product.domain.interactors.ProductGetConsolidatedPlpFlowUseCase$invoke$1 r0 = (com.carrefour.fid.android.product.domain.interactors.ProductGetConsolidatedPlpFlowUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.product.domain.interactors.ProductGetConsolidatedPlpFlowUseCase$invoke$1 r0 = new com.carrefour.fid.android.product.domain.interactors.ProductGetConsolidatedPlpFlowUseCase$invoke$1
            r0.<init>(r8, r12)
        L_0x0018:
            java.lang.Object r12 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L_0x0065
            if (r2 == r6) goto L_0x0051
            if (r2 == r5) goto L_0x0041
            if (r2 == r4) goto L_0x003c
            if (r2 != r3) goto L_0x0034
            kotlin.C11661u0.m45747n(r12)
            goto L_0x00c3
        L_0x0034:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x003c:
            kotlin.C11661u0.m45747n(r12)
            goto L_0x00af
        L_0x0041:
            java.lang.Object r9 = r0.L$2
            com.carrefour.fid.android.domain.models.product.c r9 = (com.carrefour.fid.android.domain.models.product.C38104c) r9
            java.lang.Object r10 = r0.L$1
            com.carrefour.fid.android.domain.models.product.ProductListParam r10 = (com.carrefour.fid.android.domain.models.product.ProductListParam) r10
            java.lang.Object r11 = r0.L$0
            com.carrefour.fid.android.product.domain.interactors.ProductGetConsolidatedPlpFlowUseCase r11 = (com.carrefour.fid.android.product.domain.interactors.ProductGetConsolidatedPlpFlowUseCase) r11
            kotlin.C11661u0.m45747n(r12)
            goto L_0x0094
        L_0x0051:
            java.lang.Object r9 = r0.L$3
            com.carrefour.fid.android.product.domain.interactors.ProductGetConsolidatedPlpFlowUseCase r9 = (com.carrefour.fid.android.product.domain.interactors.ProductGetConsolidatedPlpFlowUseCase) r9
            java.lang.Object r10 = r0.L$2
            com.carrefour.fid.android.domain.models.product.c r10 = (com.carrefour.fid.android.domain.models.product.C38104c) r10
            java.lang.Object r11 = r0.L$1
            com.carrefour.fid.android.domain.models.product.ProductListParam r11 = (com.carrefour.fid.android.domain.models.product.ProductListParam) r11
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.product.domain.interactors.ProductGetConsolidatedPlpFlowUseCase r2 = (com.carrefour.fid.android.product.domain.interactors.ProductGetConsolidatedPlpFlowUseCase) r2
            kotlin.C11661u0.m45747n(r12)
            goto L_0x007e
        L_0x0065:
            kotlin.C11661u0.m45747n(r12)
            com.carrefour.fid.android.domain.interactors.product.p r12 = r8.f66832a
            r0.L$0 = r8
            r0.L$1 = r9
            r0.L$2 = r10
            r0.L$3 = r8
            r0.label = r6
            java.lang.Object r12 = r12.invoke(r9, r10, r11, r0)
            if (r12 != r1) goto L_0x007b
            return r1
        L_0x007b:
            r2 = r8
            r11 = r9
            r9 = r2
        L_0x007e:
            kotlinx.coroutines.flow.e r12 = (kotlinx.coroutines.flow.C11907e) r12
            r0.L$0 = r2
            r0.L$1 = r11
            r0.L$2 = r10
            r0.L$3 = r7
            r0.label = r5
            java.lang.Object r12 = r9.mo79962j(r12, r11, r0)
            if (r12 != r1) goto L_0x0091
            return r1
        L_0x0091:
            r9 = r10
            r10 = r11
            r11 = r2
        L_0x0094:
            kotlinx.coroutines.flow.e r12 = (kotlinx.coroutines.flow.C11907e) r12
            boolean r9 = r11.mo79961i(r9)
            if (r9 == 0) goto L_0x00b0
            kotlinx.coroutines.flow.e r9 = r11.mo79963k(r12, r10)
            r0.L$0 = r7
            r0.L$1 = r7
            r0.L$2 = r7
            r0.label = r4
            java.lang.Object r12 = r11.mo79957e(r9, r0)
            if (r12 != r1) goto L_0x00af
            return r1
        L_0x00af:
            return r12
        L_0x00b0:
            kotlinx.coroutines.flow.e r9 = r11.mo79964l(r12)
            r0.L$0 = r7
            r0.L$1 = r7
            r0.L$2 = r7
            r0.label = r3
            java.lang.Object r12 = r11.mo79957e(r9, r0)
            if (r12 != r1) goto L_0x00c3
            return r1
        L_0x00c3:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.domain.interactors.ProductGetConsolidatedPlpFlowUseCase.invoke(com.carrefour.fid.android.domain.models.product.ProductListParam, com.carrefour.fid.android.domain.models.product.c, kotlinx.coroutines.flow.i, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: h */
    public final C36328a<C38184v> mo79960h(C36328a<C38184v> aVar, C38030a aVar2, Basket basket, Set<Gtin> set) {
        return C28851c.m119328a(aVar, new ProductGetConsolidatedPlpFlowUseCase$onChange$1(aVar2, basket, set));
    }

    /* renamed from: i */
    public final boolean mo79961i(C38104c cVar) {
        if (cVar == null) {
            return true;
        }
        if (cVar.mo118662e().isEmpty() && cVar.mo118664f().isEmpty()) {
            return true;
        }
        if (!cVar.mo118662e().isEmpty() || !mo79958f(cVar.mo118664f())) {
            return false;
        }
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: com.carrefour.fid.android.domain.models.product.ProductListParam} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo79962j(kotlinx.coroutines.flow.C11907e<com.carrefour.fid.android.core.paging.C36328a<com.carrefour.fid.android.domain.models.product.plp.C38115c>> r6, com.carrefour.fid.android.domain.models.product.ProductListParam r7, kotlin.coroutines.C11045c<? super kotlinx.coroutines.flow.C11907e<com.carrefour.fid.android.core.paging.C36328a<com.carrefour.fid.android.domain.models.product.plp.C38114b>>> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.carrefour.fid.android.product.domain.interactors.ProductGetConsolidatedPlpFlowUseCase$toPlpItemData$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.carrefour.fid.android.product.domain.interactors.ProductGetConsolidatedPlpFlowUseCase$toPlpItemData$1 r0 = (com.carrefour.fid.android.product.domain.interactors.ProductGetConsolidatedPlpFlowUseCase$toPlpItemData$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.product.domain.interactors.ProductGetConsolidatedPlpFlowUseCase$toPlpItemData$1 r0 = new com.carrefour.fid.android.product.domain.interactors.ProductGetConsolidatedPlpFlowUseCase$toPlpItemData$1
            r0.<init>(r5, r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0040
            if (r2 != r3) goto L_0x0038
            java.lang.Object r6 = r0.L$1
            r7 = r6
            com.carrefour.fid.android.domain.models.product.ProductListParam r7 = (com.carrefour.fid.android.domain.models.product.ProductListParam) r7
            java.lang.Object r6 = r0.L$0
            kotlinx.coroutines.flow.e r6 = (kotlinx.coroutines.flow.C11907e) r6
            kotlin.C11661u0.m45747n(r8)
            kotlin.Result r8 = (kotlin.Result) r8
            java.lang.Object r8 = r8.mo21858l()
            goto L_0x0059
        L_0x0038:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0040:
            kotlin.C11661u0.m45747n(r8)
            com.carrefour.fid.android.domain.interactors.remoteconfig.b r8 = r5.f66837f
            com.carrefour.fid.android.domain.interactors.remoteconfig.b$a r2 = new com.carrefour.fid.android.domain.interactors.remoteconfig.b$a
            com.carrefour.fid.android.domain.models.remoteconfig.RemoteConfigTag r4 = com.carrefour.fid.android.domain.models.remoteconfig.RemoteConfigTag.AntiInflation
            r2.<init>(r4)
            r0.L$0 = r6
            r0.L$1 = r7
            r0.label = r3
            java.lang.Object r8 = r8.m172966invokegIAlus(r2, r0)
            if (r8 != r1) goto L_0x0059
            return r1
        L_0x0059:
            r0 = 0
            java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.C11064a.m42615a(r0)
            boolean r2 = kotlin.Result.m38709i(r8)
            if (r2 == 0) goto L_0x0065
            r8 = r1
        L_0x0065:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            boolean r1 = r7 instanceof com.carrefour.fid.android.domain.models.product.ProductListParam.Department
            if (r1 == 0) goto L_0x0071
            r1 = r3
            goto L_0x0073
        L_0x0071:
            boolean r1 = r7 instanceof com.carrefour.fid.android.domain.models.product.ProductListParam.Search
        L_0x0073:
            if (r1 == 0) goto L_0x0077
            r1 = r3
            goto L_0x0079
        L_0x0077:
            boolean r1 = r7 instanceof com.carrefour.fid.android.domain.models.product.ProductListParam.Promo
        L_0x0079:
            if (r1 == 0) goto L_0x007c
            goto L_0x0086
        L_0x007c:
            boolean r1 = r7 instanceof com.carrefour.fid.android.domain.models.product.ProductListParam.Gtins
            if (r1 == 0) goto L_0x0081
            goto L_0x0083
        L_0x0081:
            boolean r3 = r7 instanceof com.carrefour.fid.android.domain.models.product.ProductListParam.Query
        L_0x0083:
            if (r3 == 0) goto L_0x008c
            r3 = r0
        L_0x0086:
            com.carrefour.fid.android.product.domain.interactors.ProductGetConsolidatedPlpFlowUseCase$toPlpItemData$$inlined$map$1 r7 = new com.carrefour.fid.android.product.domain.interactors.ProductGetConsolidatedPlpFlowUseCase$toPlpItemData$$inlined$map$1
            r7.<init>(r6, r8, r3)
            return r7
        L_0x008c:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.domain.interactors.ProductGetConsolidatedPlpFlowUseCase.mo79962j(kotlinx.coroutines.flow.e, com.carrefour.fid.android.domain.models.product.ProductListParam, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: k */
    public final C11907e<C36328a<C38184v>> mo79963k(C11907e<C36328a<C38114b>> eVar, ProductListParam productListParam) {
        return new C27530x100d1a06(eVar, this, productListParam);
    }

    /* renamed from: l */
    public final C11907e<C36328a<C38184v>> mo79964l(C11907e<C36328a<C38114b>> eVar) {
        return new C27533x8cc1dce(eVar);
    }
}
