package com.carrefour.fid.android.domain.interactors.basket;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.domain.extension.C37507h;
import com.carrefour.fid.android.domain.models.FreshnessGuaranteeDomain;
import com.carrefour.fid.android.domain.models.OfferDiscountDomain;
import com.carrefour.fid.android.domain.models.OfferDiscountPromoCodeDomain;
import com.carrefour.fid.android.domain.models.OfferIdentifierDomain;
import com.carrefour.fid.android.domain.models.OfferPriceDomain;
import com.carrefour.fid.android.domain.models.OfferProductDomain;
import com.carrefour.fid.android.domain.models.ProductDomain;
import com.carrefour.fid.android.domain.models.basket.Basket;
import com.carrefour.fid.android.domain.models.offer.Offer;
import com.carrefour.fid.android.domain.models.offer.OfferAvailability;
import com.carrefour.fid.android.domain.models.offer.OfferDiscount;
import com.carrefour.fid.android.domain.models.offer.OfferDiscountArticle;
import com.carrefour.fid.android.domain.repositories.C38199h;
import com.carrefour.fid.android.presentation.models.C38454b;
import com.carrefour.fid.android.presentation.models.OfferProductModel;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Result;
import kotlin.collections.C10978t;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.C11006g;
import kotlin.coroutines.C11045c;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11909g;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nBasketObserveBasketAndOffersUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasketObserveBasketAndOffersUseCase.kt\ncom/carrefour/fid/android/domain/interactors/basket/ObserveBasketAndOffersUseCase\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,95:1\n1549#2:96\n1620#2,3:97\n1045#2:100\n1549#2:101\n1620#2,2:102\n1622#2:105\n766#2:106\n857#2,2:107\n1549#2:109\n1620#2,2:110\n1549#2:112\n1620#2,3:113\n766#2:116\n857#2,2:117\n1622#2:119\n1#3:104\n*S KotlinDebug\n*F\n+ 1 BasketObserveBasketAndOffersUseCase.kt\ncom/carrefour/fid/android/domain/interactors/basket/ObserveBasketAndOffersUseCase\n*L\n55#1:96\n55#1:97,3\n59#1:100\n59#1:101\n59#1:102,2\n59#1:105\n84#1:106\n84#1:107,2\n84#1:109\n84#1:110,2\n85#1:112\n85#1:113,3\n86#1:116\n86#1:117,2\n84#1:119\n*E\n"})
public final class ObserveBasketAndOffersUseCase implements C11300l<String, C11907e<? extends Result<? extends C37562d>>> {

    /* renamed from: d */
    public static final int f94315d = 8;
    @C12579k

    /* renamed from: a */
    public final C37603x f94316a;
    @C12579k

    /* renamed from: b */
    public final C38199h f94317b;
    @C12579k

    /* renamed from: c */
    public final C37585m f94318c;

    @C11363r0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 BasketObserveBasketAndOffersUseCase.kt\ncom/carrefour/fid/android/domain/interactors/basket/ObserveBasketAndOffersUseCase\n*L\n1#1,328:1\n59#2:329\n*E\n"})
    /* renamed from: com.carrefour.fid.android.domain.interactors.basket.ObserveBasketAndOffersUseCase$a */
    public static final class C37552a<T> implements Comparator {
        public final int compare(T t, T t2) {
            String str;
            ProductDomain Q = ((OfferProductDomain) t).mo116032Q();
            String str2 = null;
            if (Q != null) {
                str = Q.mo116553z();
            } else {
                str = null;
            }
            ProductDomain Q2 = ((OfferProductDomain) t2).mo116032Q();
            if (Q2 != null) {
                str2 = Q2.mo116553z();
            }
            return C11006g.m42424l(str, str2);
        }
    }

    @Inject
    public ObserveBasketAndOffersUseCase(@C12579k C37603x xVar, @C12579k C38199h hVar, @C12579k C37585m mVar) {
        Intrinsics.checkNotNullParameter(xVar, "observeBasketByReferenceUseCase");
        Intrinsics.checkNotNullParameter(hVar, "productDetailsRepository");
        Intrinsics.checkNotNullParameter(mVar, "getBasketNumberUseCase");
        this.f94316a = xVar;
        this.f94317b = hVar;
        this.f94318c = mVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: com.carrefour.fid.android.domain.models.offer.Offer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo114336e(com.carrefour.fid.android.domain.models.basket.Basket r9, kotlin.coroutines.C11045c<? super kotlin.Result<? extends java.util.List<? extends com.carrefour.fid.android.presentation.models.OfferProductModel>>> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.carrefour.fid.android.domain.interactors.basket.ObserveBasketAndOffersUseCase$getOfferList$1
            if (r0 == 0) goto L_0x0013
            r0 = r10
            com.carrefour.fid.android.domain.interactors.basket.ObserveBasketAndOffersUseCase$getOfferList$1 r0 = (com.carrefour.fid.android.domain.interactors.basket.ObserveBasketAndOffersUseCase$getOfferList$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.domain.interactors.basket.ObserveBasketAndOffersUseCase$getOfferList$1 r0 = new com.carrefour.fid.android.domain.interactors.basket.ObserveBasketAndOffersUseCase$getOfferList$1
            r0.<init>(r8, r10)
        L_0x0018:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 10
            r4 = 1
            if (r2 == 0) goto L_0x0041
            if (r2 != r4) goto L_0x0039
            java.lang.Object r9 = r0.L$1
            com.carrefour.fid.android.domain.models.basket.Basket r9 = (com.carrefour.fid.android.domain.models.basket.Basket) r9
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.domain.interactors.basket.ObserveBasketAndOffersUseCase r0 = (com.carrefour.fid.android.domain.interactors.basket.ObserveBasketAndOffersUseCase) r0
            kotlin.C11661u0.m45747n(r10)
            kotlin.Result r10 = (kotlin.Result) r10
            java.lang.Object r10 = r10.mo21858l()
            goto L_0x008c
        L_0x0039:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0041:
            kotlin.C11661u0.m45747n(r10)
            com.carrefour.fid.android.domain.repositories.h r10 = r8.f94317b
            java.util.List r2 = r9.mo116817B()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r5 = new java.util.ArrayList
            int r6 = kotlin.collections.C10978t.m41495Y(r2, r3)
            r5.<init>(r6)
            java.util.Iterator r2 = r2.iterator()
        L_0x0059:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L_0x0071
            java.lang.Object r6 = r2.next()
            com.carrefour.fid.android.domain.models.offer.Offer r6 = (com.carrefour.fid.android.domain.models.offer.Offer) r6
            com.carrefour.fid.android.domain.models.offer.OfferIdentifier r6 = r6.mo118001J()
            java.lang.String r6 = r6.mo118136f()
            r5.add(r6)
            goto L_0x0059
        L_0x0071:
            com.carrefour.fid.android.domain.models.basket.BasketLoyaltyCard r2 = r9.mo116816A()
            if (r2 == 0) goto L_0x0079
            r2 = r4
            goto L_0x007a
        L_0x0079:
            r2 = 0
        L_0x007a:
            java.lang.String r6 = r9.mo116859z()
            r0.L$0 = r8
            r0.L$1 = r9
            r0.label = r4
            java.lang.Object r10 = r10.mo111474c(r5, r2, r6, r0)
            if (r10 != r1) goto L_0x008b
            return r1
        L_0x008b:
            r0 = r8
        L_0x008c:
            boolean r1 = kotlin.Result.m38710j(r10)
            if (r1 == 0) goto L_0x00fc
            kotlin.Result$a r1 = kotlin.Result.f28060a
            java.util.List r10 = (java.util.List) r10
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            com.carrefour.fid.android.domain.interactors.basket.ObserveBasketAndOffersUseCase$a r1 = new com.carrefour.fid.android.domain.interactors.basket.ObserveBasketAndOffersUseCase$a
            r1.<init>()
            java.util.List r10 = kotlin.collections.CollectionsKt___CollectionsKt.m40675p5(r10, r1)
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = kotlin.collections.C10978t.m41495Y(r10, r3)
            r1.<init>(r2)
            java.util.Iterator r10 = r10.iterator()
        L_0x00b0:
            boolean r2 = r10.hasNext()
            if (r2 == 0) goto L_0x00f7
            java.lang.Object r2 = r10.next()
            com.carrefour.fid.android.domain.models.OfferProductDomain r2 = (com.carrefour.fid.android.domain.models.OfferProductDomain) r2
            java.util.List r3 = r9.mo116817B()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r3 = r3.iterator()
        L_0x00c6:
            boolean r4 = r3.hasNext()
            r5 = 0
            if (r4 == 0) goto L_0x00ed
            java.lang.Object r4 = r3.next()
            r6 = r4
            com.carrefour.fid.android.domain.models.offer.Offer r6 = (com.carrefour.fid.android.domain.models.offer.Offer) r6
            com.carrefour.fid.android.domain.models.offer.OfferIdentifier r6 = r6.mo118001J()
            java.lang.String r6 = r6.mo118136f()
            com.carrefour.fid.android.domain.models.OfferIdentifierDomain r7 = r2.mo116024I()
            if (r7 == 0) goto L_0x00e6
            java.lang.String r5 = r7.mo115986f()
        L_0x00e6:
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r6, (java.lang.Object) r5)
            if (r5 == 0) goto L_0x00c6
            r5 = r4
        L_0x00ed:
            com.carrefour.fid.android.domain.models.offer.Offer r5 = (com.carrefour.fid.android.domain.models.offer.Offer) r5
            com.carrefour.fid.android.presentation.models.OfferProductModel r2 = r0.mo114339h(r2, r5)
            r1.add(r2)
            goto L_0x00b0
        L_0x00f7:
            java.lang.Object r9 = kotlin.Result.m38702b(r1)
            goto L_0x0100
        L_0x00fc:
            java.lang.Object r9 = kotlin.Result.m38702b(r10)
        L_0x0100:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.interactors.basket.ObserveBasketAndOffersUseCase.mo114336e(com.carrefour.fid.android.domain.models.basket.Basket, kotlin.coroutines.c):java.lang.Object");
    }

    @C12579k
    /* renamed from: f */
    public C11907e<Result<C37562d>> invoke(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "referenceId");
        return C11909g.m47376J0(new ObserveBasketAndOffersUseCase$invoke$1(this, str, (C11045c<? super ObserveBasketAndOffersUseCase$invoke$1>) null));
    }

    /* renamed from: g */
    public final List<C38454b> mo114338g(Basket basket, List<OfferProductModel> list) {
        String str;
        boolean z;
        ArrayList<OfferDiscount> arrayList = new ArrayList<>();
        for (Object next : basket.mo116857x()) {
            if (((OfferDiscount) next).mo118085x() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(C10978t.m41495Y(arrayList, 10));
        for (OfferDiscount offerDiscount : arrayList) {
            Iterable<OfferDiscountArticle> y = offerDiscount.mo118086y();
            ArrayList arrayList3 = new ArrayList(C10978t.m41495Y(y, 10));
            for (OfferDiscountArticle e : y) {
                arrayList3.add(e.mo118096e());
            }
            ArrayList arrayList4 = new ArrayList();
            for (Object next2 : list) {
                OfferIdentifierDomain W = ((OfferProductModel) next2).mo121502W();
                if (W != null) {
                    str = W.mo115986f();
                } else {
                    str = null;
                }
                if (CollectionsKt___CollectionsKt.m40558R1(arrayList3, str)) {
                    arrayList4.add(next2);
                }
            }
            list.removeAll(arrayList4);
            arrayList2.add(new C38454b(arrayList4, offerDiscount));
        }
        return arrayList2;
    }

    /* renamed from: h */
    public final OfferProductModel mo114339h(OfferProductDomain offerProductDomain, Offer offer) {
        if (offer == null) {
            return C37507h.m153956h(offerProductDomain);
        }
        OfferAvailability D = offer.mo117995D();
        boolean Y = offer.mo118016Y();
        int U = offer.mo118012U();
        int M = offer.mo118004M();
        int O = offer.mo118006O();
        int K = offer.mo118002K();
        Double P = offer.mo118007P();
        return C37507h.m153956h(OfferProductDomain.m155535z(offerProductDomain, D, (List) null, (OfferIdentifierDomain) null, (ProductDomain) null, (OfferPriceDomain) null, offer.mo118008Q(), P, (OfferDiscountDomain) null, (OfferDiscountPromoCodeDomain) null, U, Integer.valueOf(K), Integer.valueOf(M), Integer.valueOf(O), Y, (Double) null, (String) null, (Double) null, (Integer) null, (Double) null, (String) null, (Double) null, (FreshnessGuaranteeDomain) null, false, false, 16761246, (Object) null));
    }
}
