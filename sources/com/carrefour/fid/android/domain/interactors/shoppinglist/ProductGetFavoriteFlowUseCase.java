package com.carrefour.fid.android.domain.interactors.shoppinglist;

import com.carrefour.fid.android.domain.interactors.basket.C37559b0;
import com.carrefour.fid.android.domain.interactors.basket.C37606z;
import com.carrefour.fid.android.domain.interactors.favorites.shoppinglist.C37682c;
import com.carrefour.fid.android.domain.interactors.product.C37774n;
import com.carrefour.fid.android.domain.interactors.product.GetFavoriteProductsFlowUseCase;
import com.carrefour.fid.android.domain.interactors.service.C37823k;
import com.carrefour.fid.android.domain.models.C38184v;
import com.carrefour.fid.android.domain.models.basket.Basket;
import com.carrefour.fid.android.domain.models.category.ProductCategory;
import com.carrefour.fid.android.domain.models.favorites.shoppinglist.C38030a;
import com.carrefour.fid.android.domain.models.product.Gtin;
import com.carrefour.fid.android.domain.models.product.plp.C38113a;
import com.carrefour.fid.android.domain.models.product.plp.C38114b;
import com.carrefour.fid.android.domain.models.product.plp.C38115c;
import com.carrefour.fid.android.domain.models.product.plp.PlpOffer;
import com.carrefour.fid.android.product.presentation.models.extensions.C27662e;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.inject.Inject;
import kotlin.collections.C10978t;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nProductGetFavoriteFlowUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProductGetFavoriteFlowUseCase.kt\ncom/carrefour/fid/android/domain/interactors/shoppinglist/ProductGetFavoriteFlowUseCase\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,129:1\n1477#2:130\n1502#2,3:131\n1505#2,3:141\n1549#2:145\n1620#2,3:146\n1549#2:150\n1620#2,3:151\n361#3,7:134\n215#4:144\n216#4:149\n*S KotlinDebug\n*F\n+ 1 ProductGetFavoriteFlowUseCase.kt\ncom/carrefour/fid/android/domain/interactors/shoppinglist/ProductGetFavoriteFlowUseCase\n*L\n75#1:130\n75#1:131,3\n75#1:141,3\n79#1:145\n79#1:146,3\n87#1:150\n87#1:151,3\n75#1:134,7\n77#1:144\n77#1:149\n*E\n"})
public final class ProductGetFavoriteFlowUseCase implements C37774n {
    @C12579k

    /* renamed from: a */
    public final GetFavoriteProductsFlowUseCase f94928a;
    @C12579k

    /* renamed from: b */
    public final C37682c f94929b;
    @C12579k

    /* renamed from: c */
    public final C37606z f94930c;
    @C12579k

    /* renamed from: d */
    public final C37559b0 f94931d;
    @C12579k

    /* renamed from: e */
    public final C37823k f94932e;

    @Inject
    public ProductGetFavoriteFlowUseCase(@C12579k GetFavoriteProductsFlowUseCase getFavoriteProductsFlowUseCase, @C12579k C37682c cVar, @C12579k C37606z zVar, @C12579k C37559b0 b0Var, @C12579k C37823k kVar) {
        Intrinsics.checkNotNullParameter(getFavoriteProductsFlowUseCase, "getPlpFlowUseCase");
        Intrinsics.checkNotNullParameter(cVar, "observeShoppingListUseCase");
        Intrinsics.checkNotNullParameter(zVar, "observeBasketUseCase");
        Intrinsics.checkNotNullParameter(b0Var, "observeSyncingInBasketUseCase");
        Intrinsics.checkNotNullParameter(kVar, "getServiceSelectedUseCase");
        this.f94928a = getFavoriteProductsFlowUseCase;
        this.f94929b = cVar;
        this.f94930c = zVar;
        this.f94931d = b0Var;
        this.f94932e = kVar;
    }

    /* renamed from: c */
    public final C38114b mo115277c(C38114b bVar, C38030a aVar, Basket basket, Set<Gtin> set) {
        return C38114b.m157704i(bVar, (C38115c) null, C27662e.m116390j(bVar.mo118842j(), basket), C27662e.m116394n(bVar.mo118842j(), aVar), C27662e.m116396p(bVar.mo118842j(), aVar), C27662e.m116395o(bVar.mo118842j(), set), false, false, 97, (Object) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a4 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a5 A[PHI: r10 
      PHI: (r10v2 java.lang.Object) = (r10v8 java.lang.Object), (r10v1 java.lang.Object) binds: [B:29:0x00a2, B:10:0x0028] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo115278d(java.util.List<com.carrefour.fid.android.domain.models.product.Gtin> r9, kotlin.coroutines.C11045c<? super kotlinx.coroutines.flow.C11907e<? extends java.util.List<com.carrefour.fid.android.domain.models.product.plp.C38115c>>> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.carrefour.fid.android.domain.interactors.shoppinglist.ProductGetFavoriteFlowUseCase$getBaseProductFlow$1
            if (r0 == 0) goto L_0x0013
            r0 = r10
            com.carrefour.fid.android.domain.interactors.shoppinglist.ProductGetFavoriteFlowUseCase$getBaseProductFlow$1 r0 = (com.carrefour.fid.android.domain.interactors.shoppinglist.ProductGetFavoriteFlowUseCase$getBaseProductFlow$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.domain.interactors.shoppinglist.ProductGetFavoriteFlowUseCase$getBaseProductFlow$1 r0 = new com.carrefour.fid.android.domain.interactors.shoppinglist.ProductGetFavoriteFlowUseCase$getBaseProductFlow$1
            r0.<init>(r8, r10)
        L_0x0018:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x004b
            if (r2 == r4) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            kotlin.C11661u0.m45747n(r10)
            goto L_0x00a5
        L_0x002d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0035:
            java.lang.Object r9 = r0.L$2
            java.util.List r9 = (java.util.List) r9
            java.lang.Object r2 = r0.L$1
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r4 = r0.L$0
            com.carrefour.fid.android.domain.interactors.shoppinglist.ProductGetFavoriteFlowUseCase r4 = (com.carrefour.fid.android.domain.interactors.shoppinglist.ProductGetFavoriteFlowUseCase) r4
            kotlin.C11661u0.m45747n(r10)
            kotlin.Result r10 = (kotlin.Result) r10
            java.lang.Object r10 = r10.mo21858l()
            goto L_0x006e
        L_0x004b:
            kotlin.C11661u0.m45747n(r10)
            java.lang.String r10 = "A1QD-151-4000"
            java.lang.String[] r10 = new java.lang.String[]{r10}
            java.util.List r10 = kotlin.collections.CollectionsKt__CollectionsKt.m40452P(r10)
            com.carrefour.fid.android.domain.interactors.service.k r2 = r8.f94932e
            r0.L$0 = r8
            r0.L$1 = r9
            r0.L$2 = r10
            r0.label = r4
            java.lang.Object r2 = r2.m172965invokeIoAF18A(r0)
            if (r2 != r1) goto L_0x0069
            return r1
        L_0x0069:
            r4 = r8
            r7 = r2
            r2 = r9
            r9 = r10
            r10 = r7
        L_0x006e:
            boolean r5 = kotlin.Result.m38709i(r10)
            r6 = 0
            if (r5 == 0) goto L_0x0076
            r10 = r6
        L_0x0076:
            com.carrefour.fid.android.domain.models.service.models.k r10 = (com.carrefour.fid.android.domain.models.service.models.C38162k) r10
            if (r10 == 0) goto L_0x007f
            com.carrefour.fid.android.domain.models.service.models.StoreService r10 = r10.mo119354f()
            goto L_0x0080
        L_0x007f:
            r10 = r6
        L_0x0080:
            if (r10 == 0) goto L_0x008a
            java.lang.String r10 = r10.mo119163G()
            r9.add(r10)
            goto L_0x008f
        L_0x008a:
            java.lang.String r10 = "0261-150-6"
            r9.add(r10)
        L_0x008f:
            com.carrefour.fid.android.domain.interactors.product.GetFavoriteProductsFlowUseCase r10 = r4.f94928a
            com.carrefour.fid.android.domain.interactors.product.GetFavoriteProductsFlowUseCase$Param r4 = new com.carrefour.fid.android.domain.interactors.product.GetFavoriteProductsFlowUseCase$Param
            r4.<init>(r9, r2)
            r0.L$0 = r6
            r0.L$1 = r6
            r0.L$2 = r6
            r0.label = r3
            java.lang.Object r10 = r10.invoke(r4, r0)
            if (r10 != r1) goto L_0x00a5
            return r1
        L_0x00a5:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.interactors.shoppinglist.ProductGetFavoriteFlowUseCase.mo115278d(java.util.List, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0097 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00aa A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00c3 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.domain.interactors.product.C37774n.C37775a r9, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlinx.coroutines.flow.C11907e<? extends java.util.List<? extends com.carrefour.fid.android.domain.models.C38184v>>> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.carrefour.fid.android.domain.interactors.shoppinglist.ProductGetFavoriteFlowUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r10
            com.carrefour.fid.android.domain.interactors.shoppinglist.ProductGetFavoriteFlowUseCase$invoke$1 r0 = (com.carrefour.fid.android.domain.interactors.shoppinglist.ProductGetFavoriteFlowUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.domain.interactors.shoppinglist.ProductGetFavoriteFlowUseCase$invoke$1 r0 = new com.carrefour.fid.android.domain.interactors.shoppinglist.ProductGetFavoriteFlowUseCase$invoke$1
            r0.<init>(r8, r10)
        L_0x0018:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L_0x0073
            if (r2 == r6) goto L_0x006a
            if (r2 == r5) goto L_0x005e
            if (r2 == r4) goto L_0x004b
            if (r2 != r3) goto L_0x0043
            java.lang.Object r9 = r0.L$3
            kotlinx.coroutines.flow.e r9 = (kotlinx.coroutines.flow.C11907e) r9
            java.lang.Object r1 = r0.L$2
            kotlinx.coroutines.flow.e r1 = (kotlinx.coroutines.flow.C11907e) r1
            java.lang.Object r2 = r0.L$1
            kotlinx.coroutines.flow.e r2 = (kotlinx.coroutines.flow.C11907e) r2
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.domain.interactors.shoppinglist.ProductGetFavoriteFlowUseCase r0 = (com.carrefour.fid.android.domain.interactors.shoppinglist.ProductGetFavoriteFlowUseCase) r0
            kotlin.C11661u0.m45747n(r10)
            goto L_0x00c9
        L_0x0043:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x004b:
            java.lang.Object r9 = r0.L$2
            kotlinx.coroutines.flow.e r9 = (kotlinx.coroutines.flow.C11907e) r9
            java.lang.Object r2 = r0.L$1
            kotlinx.coroutines.flow.e r2 = (kotlinx.coroutines.flow.C11907e) r2
            java.lang.Object r4 = r0.L$0
            com.carrefour.fid.android.domain.interactors.shoppinglist.ProductGetFavoriteFlowUseCase r4 = (com.carrefour.fid.android.domain.interactors.shoppinglist.ProductGetFavoriteFlowUseCase) r4
            kotlin.C11661u0.m45747n(r10)
            r7 = r4
            r4 = r2
            r2 = r7
            goto L_0x00af
        L_0x005e:
            java.lang.Object r9 = r0.L$1
            kotlinx.coroutines.flow.e r9 = (kotlinx.coroutines.flow.C11907e) r9
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.domain.interactors.shoppinglist.ProductGetFavoriteFlowUseCase r2 = (com.carrefour.fid.android.domain.interactors.shoppinglist.ProductGetFavoriteFlowUseCase) r2
            kotlin.C11661u0.m45747n(r10)
            goto L_0x0098
        L_0x006a:
            java.lang.Object r9 = r0.L$0
            com.carrefour.fid.android.domain.interactors.shoppinglist.ProductGetFavoriteFlowUseCase r9 = (com.carrefour.fid.android.domain.interactors.shoppinglist.ProductGetFavoriteFlowUseCase) r9
            kotlin.C11661u0.m45747n(r10)
            r2 = r9
            goto L_0x0086
        L_0x0073:
            kotlin.C11661u0.m45747n(r10)
            java.util.List r9 = r9.mo115105d()
            r0.L$0 = r8
            r0.label = r6
            java.lang.Object r10 = r8.mo115278d(r9, r0)
            if (r10 != r1) goto L_0x0085
            return r1
        L_0x0085:
            r2 = r8
        L_0x0086:
            r9 = r10
            kotlinx.coroutines.flow.e r9 = (kotlinx.coroutines.flow.C11907e) r9
            com.carrefour.fid.android.domain.interactors.favorites.shoppinglist.c r10 = r2.f94929b
            r0.L$0 = r2
            r0.L$1 = r9
            r0.label = r5
            java.lang.Object r10 = r10.invoke(r0)
            if (r10 != r1) goto L_0x0098
            return r1
        L_0x0098:
            kotlinx.coroutines.flow.e r10 = (kotlinx.coroutines.flow.C11907e) r10
            com.carrefour.fid.android.domain.interactors.basket.z r5 = r2.f94930c
            r0.L$0 = r2
            r0.L$1 = r9
            r0.L$2 = r10
            r0.label = r4
            java.lang.Object r4 = r5.invoke(r0)
            if (r4 != r1) goto L_0x00ab
            return r1
        L_0x00ab:
            r7 = r4
            r4 = r9
            r9 = r10
            r10 = r7
        L_0x00af:
            kotlinx.coroutines.flow.e r10 = (kotlinx.coroutines.flow.C11907e) r10
            com.carrefour.fid.android.domain.interactors.basket.b0 r5 = r2.f94931d
            r0.L$0 = r2
            r0.L$1 = r4
            r0.L$2 = r9
            r0.L$3 = r10
            r0.label = r3
            java.lang.Object r0 = r5.invoke(r0)
            if (r0 != r1) goto L_0x00c4
            return r1
        L_0x00c4:
            r1 = r9
            r9 = r10
            r10 = r0
            r0 = r2
            r2 = r4
        L_0x00c9:
            kotlinx.coroutines.flow.e r10 = (kotlinx.coroutines.flow.C11907e) r10
            com.carrefour.fid.android.domain.interactors.shoppinglist.ProductGetFavoriteFlowUseCase$invoke$2 r3 = new com.carrefour.fid.android.domain.interactors.shoppinglist.ProductGetFavoriteFlowUseCase$invoke$2
            r4 = 0
            r3.<init>(r0, r4)
            kotlinx.coroutines.flow.e r9 = kotlinx.coroutines.flow.C11909g.m47363F(r2, r1, r9, r10, r3)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.interactors.shoppinglist.ProductGetFavoriteFlowUseCase.invoke(com.carrefour.fid.android.domain.interactors.product.n$a, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: f */
    public final List<C38184v> mo115280f(List<C38115c> list, C38030a aVar, Basket basket, Set<Gtin> set) {
        Object obj;
        boolean z;
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object next : list) {
            ProductCategory v = ((C38115c) next).mo118885v();
            if (v == null || (str = v.mo117297q()) == null) {
                str = "unknown";
            }
            Object obj2 = linkedHashMap.get(str);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(str, obj2);
            }
            ((List) obj2).add(next);
        }
        ArrayList<C38184v> arrayList = new ArrayList<>();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList.add(new C38113a((String) entry.getKey(), ((List) entry.getValue()).size()));
            Iterable<C38115c> iterable = (Iterable) entry.getValue();
            ArrayList arrayList2 = new ArrayList(C10978t.m41495Y(iterable, 10));
            for (C38115c cVar : iterable) {
                PlpOffer plpOffer = (PlpOffer) CollectionsKt___CollectionsKt.m40479B2(cVar.mo118855F());
                if (plpOffer != null) {
                    z = plpOffer.mo118793D();
                } else {
                    z = false;
                }
                arrayList2.add(new C38114b(cVar, 0, false, false, false, false, z, 62, (DefaultConstructorMarker) null));
            }
            arrayList.addAll(arrayList2);
        }
        ArrayList arrayList3 = new ArrayList(C10978t.m41495Y(arrayList, 10));
        for (C38184v vVar : arrayList) {
            if (vVar instanceof C38114b) {
                obj = mo115277c((C38114b) vVar, aVar, basket, set);
            } else {
                C38030a aVar2 = aVar;
                Basket basket2 = basket;
                Set<Gtin> set2 = set;
                if (vVar instanceof C38113a) {
                    C38113a aVar3 = (C38113a) vVar;
                    obj = new C38113a(aVar3.mo118829f(), aVar3.mo118827e());
                } else {
                    throw new Exception("Should not use this class here");
                }
            }
            arrayList3.add(obj);
        }
        return arrayList3;
    }
}
