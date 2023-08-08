package com.carrefour.fid.android.product.domain.interactors;

import com.carrefour.fid.android.domain.interactors.basket.C37559b0;
import com.carrefour.fid.android.domain.interactors.basket.C37606z;
import com.carrefour.fid.android.domain.interactors.favorites.shoppinglist.C37681b;
import com.carrefour.fid.android.domain.interactors.favorites.shoppinglist.C37682c;
import com.carrefour.fid.android.domain.interactors.product.GetOldProductFlowUseCase;
import com.carrefour.fid.android.domain.models.basket.Basket;
import com.carrefour.fid.android.domain.models.favorites.shoppinglist.C38030a;
import com.carrefour.fid.android.domain.models.favorites.shoppinglist.C38033d;
import com.carrefour.fid.android.domain.models.favorites.shoppinglist.ShoppingListSyncState;
import com.carrefour.fid.android.domain.models.offer.CategoryLimit;
import com.carrefour.fid.android.domain.models.offer.Discount;
import com.carrefour.fid.android.domain.models.offer.Offer;
import com.carrefour.fid.android.domain.models.offer.OfferAvailability;
import com.carrefour.fid.android.domain.models.offer.OfferDiscount;
import com.carrefour.fid.android.domain.models.offer.OfferDiscountPromotionCode;
import com.carrefour.fid.android.domain.models.offer.OfferIdentifier;
import com.carrefour.fid.android.domain.models.offer.Prices;
import com.carrefour.fid.android.domain.models.product.Gtin;
import com.carrefour.fid.android.domain.models.product.Product;
import com.carrefour.fid.android.shared.constant.C28547h2;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nAbstractFlowConsolidator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractFlowConsolidator.kt\ncom/carrefour/fid/android/product/domain/interactors/AbstractFlowConsolidator\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,82:1\n1747#2,3:83\n288#2,2:86\n288#2,2:88\n*S KotlinDebug\n*F\n+ 1 AbstractFlowConsolidator.kt\ncom/carrefour/fid/android/product/domain/interactors/AbstractFlowConsolidator\n*L\n69#1:83,3\n72#1:86,2\n75#1:88,2\n*E\n"})
public abstract class AbstractFlowConsolidator<T> {
    @C12579k

    /* renamed from: a */
    public final C37682c f66800a;
    @C12579k

    /* renamed from: b */
    public final C37606z f66801b;
    @C12579k

    /* renamed from: c */
    public final C37559b0 f66802c;
    @C12579k

    /* renamed from: d */
    public final C37681b f66803d;

    public AbstractFlowConsolidator(@C12579k C37682c cVar, @C12579k C37606z zVar, @C12579k C37559b0 b0Var, @C12579k C37681b bVar) {
        Intrinsics.checkNotNullParameter(cVar, "observeShoppingListUseCase");
        Intrinsics.checkNotNullParameter(zVar, "observeBasketUseCase");
        Intrinsics.checkNotNullParameter(b0Var, "observeSyncingInBasketUseCase");
        Intrinsics.checkNotNullParameter(bVar, "getShoppingListUseCase");
        this.f66800a = cVar;
        this.f66801b = zVar;
        this.f66802c = b0Var;
        this.f66803d = bVar;
    }

    @C12579k
    /* renamed from: a */
    public final Offer mo79912a(@C12579k Offer offer, @C12580l C38030a aVar, @C12580l Basket basket, @C12579k Set<Gtin> set) {
        C38030a aVar2 = aVar;
        Set<Gtin> set2 = set;
        Intrinsics.checkNotNullParameter(offer, C28547h2.f69318f);
        Intrinsics.checkNotNullParameter(set2, "syncingInBasket");
        return Offer.m156999C(offer, (OfferIdentifier) null, (CategoryLimit) null, (OfferDiscount) null, (OfferDiscountPromotionCode) null, 0, 0, 0, (List) null, (Prices) null, (Discount) null, (Double) null, (Double) null, (Product) null, mo79916e(offer.mo118010S(), basket), mo79918g(offer.mo118010S(), set2), mo79917f(offer.mo118010S(), aVar2), mo79919h(offer.mo118010S(), aVar2), false, (String) null, (OfferAvailability) null, false, false, (String) null, false, (String) null, false, (List) null, 134094847, (Object) null);
    }

    /* renamed from: b */
    public final GetOldProductFlowUseCase.Param mo79913b(GetOldProductFlowUseCase.Param param) {
        return GetOldProductFlowUseCase.Param.m154723d(param, mo79914c(param.mo114947f()), (String) null, 2, (Object) null);
    }

    /* renamed from: c */
    public final String mo79914c(String str) {
        return new Regex("-(294|308|309|310)-").mo23336m(str, "-150-");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x008c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a5 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo79915d(@org.jetbrains.annotations.C12579k kotlinx.coroutines.flow.C11907e<? extends T> r8, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlinx.coroutines.flow.C11907e<? extends T>> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.carrefour.fid.android.product.domain.interactors.AbstractFlowConsolidator$getConsolidatedFlow$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.carrefour.fid.android.product.domain.interactors.AbstractFlowConsolidator$getConsolidatedFlow$1 r0 = (com.carrefour.fid.android.product.domain.interactors.AbstractFlowConsolidator$getConsolidatedFlow$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.product.domain.interactors.AbstractFlowConsolidator$getConsolidatedFlow$1 r0 = new com.carrefour.fid.android.product.domain.interactors.AbstractFlowConsolidator$getConsolidatedFlow$1
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
            com.carrefour.fid.android.product.domain.interactors.AbstractFlowConsolidator r0 = (com.carrefour.fid.android.product.domain.interactors.AbstractFlowConsolidator) r0
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
            com.carrefour.fid.android.product.domain.interactors.AbstractFlowConsolidator r4 = (com.carrefour.fid.android.product.domain.interactors.AbstractFlowConsolidator) r4
            kotlin.C11661u0.m45747n(r9)
            r6 = r4
            r4 = r2
            r2 = r6
            goto L_0x0091
        L_0x005b:
            java.lang.Object r8 = r0.L$1
            kotlinx.coroutines.flow.e r8 = (kotlinx.coroutines.flow.C11907e) r8
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.product.domain.interactors.AbstractFlowConsolidator r2 = (com.carrefour.fid.android.product.domain.interactors.AbstractFlowConsolidator) r2
            kotlin.C11661u0.m45747n(r9)
            goto L_0x007a
        L_0x0067:
            kotlin.C11661u0.m45747n(r9)
            com.carrefour.fid.android.domain.interactors.favorites.shoppinglist.c r9 = r7.f66800a
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
            com.carrefour.fid.android.domain.interactors.basket.z r5 = r2.f66801b
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
            com.carrefour.fid.android.domain.interactors.basket.b0 r5 = r2.f66802c
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
            com.carrefour.fid.android.product.domain.interactors.AbstractFlowConsolidator$getConsolidatedFlow$2 r3 = new com.carrefour.fid.android.product.domain.interactors.AbstractFlowConsolidator$getConsolidatedFlow$2
            r4 = 0
            r3.<init>(r0, r4)
            kotlinx.coroutines.flow.e r8 = kotlinx.coroutines.flow.C11909g.m47363F(r2, r1, r8, r9, r3)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.domain.interactors.AbstractFlowConsolidator.mo79915d(kotlinx.coroutines.flow.e, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: e */
    public final int mo79916e(Product product, Basket basket) {
        List<Offer> B;
        Object obj;
        if (!(basket == null || (B = basket.mo116817B()) == null)) {
            Iterator it = B.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (Gtin.m157311e(((Offer) obj).mo118010S().mo118415P(), product.mo118415P())) {
                    break;
                }
            }
            Offer offer = (Offer) obj;
            if (offer != null) {
                return offer.mo118012U();
            }
        }
        return 0;
    }

    /* renamed from: f */
    public final boolean mo79917f(Product product, C38030a aVar) {
        List<C38033d> e;
        if (aVar == null || (e = aVar.mo117697e()) == null) {
            return false;
        }
        Iterable<C38033d> iterable = e;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return false;
        }
        for (C38033d a : iterable) {
            if (Intrinsics.areEqual((Object) a.mo117724a(), (Object) product.mo118415P())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: g */
    public final boolean mo79918g(Product product, Set<Gtin> set) {
        return set.contains(Gtin.m157307a(product.mo118415P()));
    }

    /* renamed from: h */
    public final boolean mo79919h(Product product, C38030a aVar) {
        List<C38033d> e;
        Object obj;
        ShoppingListSyncState shoppingListSyncState = null;
        if (!(aVar == null || (e = aVar.mo117697e()) == null)) {
            Iterator it = e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (Intrinsics.areEqual((Object) ((C38033d) obj).mo117724a(), (Object) product.mo118415P())) {
                    break;
                }
            }
            C38033d dVar = (C38033d) obj;
            if (dVar != null) {
                shoppingListSyncState = dVar.mo117725b();
            }
        }
        if (shoppingListSyncState == ShoppingListSyncState.SYNCING) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public abstract T mo79920i(T t, @C12580l C38030a aVar, @C12580l Basket basket, @C12579k Set<Gtin> set);
}
