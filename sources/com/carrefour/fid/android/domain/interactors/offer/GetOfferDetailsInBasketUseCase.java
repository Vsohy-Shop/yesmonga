package com.carrefour.fid.android.domain.interactors.offer;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.domain.models.OfferProductDomain;
import com.carrefour.fid.android.domain.models.basket.Basket;
import com.carrefour.fid.android.domain.repositories.C38199h;
import java.util.List;
import javax.inject.Inject;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11074j;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nGetOfferDetailsInBasketUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GetOfferDetailsInBasketUseCase.kt\ncom/carrefour/fid/android/domain/interactors/offer/GetOfferDetailsInBasketUseCase\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,31:1\n1549#2:32\n1620#2,3:33\n1549#2:36\n1620#2,2:37\n1622#2:40\n1#3:39\n*S KotlinDebug\n*F\n+ 1 GetOfferDetailsInBasketUseCase.kt\ncom/carrefour/fid/android/domain/interactors/offer/GetOfferDetailsInBasketUseCase\n*L\n17#1:32\n17#1:33,3\n21#1:36\n21#1:37,2\n21#1:40\n*E\n"})
public final class GetOfferDetailsInBasketUseCase implements C11304p<Basket, C11045c<? super List<? extends OfferProductDomain>>, Object>, C11074j {

    /* renamed from: b */
    public static final int f94603b = 8;
    @C12579k

    /* renamed from: a */
    public final C38199h f94604a;

    @Inject
    public GetOfferDetailsInBasketUseCase(@C12579k C38199h hVar) {
        Intrinsics.checkNotNullParameter(hVar, "productDetailsRepository");
        this.f94604a = hVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: com.carrefour.fid.android.domain.models.offer.Offer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo114780b(com.carrefour.fid.android.domain.models.basket.Basket r8, kotlin.coroutines.C11045c<? super kotlin.Result<? extends java.util.List<com.carrefour.fid.android.domain.models.OfferProductDomain>>> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.carrefour.fid.android.domain.interactors.offer.GetOfferDetailsInBasketUseCase$getOfferList$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.carrefour.fid.android.domain.interactors.offer.GetOfferDetailsInBasketUseCase$getOfferList$1 r0 = (com.carrefour.fid.android.domain.interactors.offer.GetOfferDetailsInBasketUseCase$getOfferList$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.domain.interactors.offer.GetOfferDetailsInBasketUseCase$getOfferList$1 r0 = new com.carrefour.fid.android.domain.interactors.offer.GetOfferDetailsInBasketUseCase$getOfferList$1
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 10
            r4 = 1
            if (r2 == 0) goto L_0x003d
            if (r2 != r4) goto L_0x0035
            java.lang.Object r8 = r0.L$0
            com.carrefour.fid.android.domain.models.basket.Basket r8 = (com.carrefour.fid.android.domain.models.basket.Basket) r8
            kotlin.C11661u0.m45747n(r9)
            kotlin.Result r9 = (kotlin.Result) r9
            java.lang.Object r9 = r9.mo21858l()
            goto L_0x0085
        L_0x0035:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x003d:
            kotlin.C11661u0.m45747n(r9)
            com.carrefour.fid.android.domain.repositories.h r9 = r7.f94604a
            java.util.List r2 = r8.mo116817B()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r5 = new java.util.ArrayList
            int r6 = kotlin.collections.C10978t.m41495Y(r2, r3)
            r5.<init>(r6)
            java.util.Iterator r2 = r2.iterator()
        L_0x0055:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L_0x006d
            java.lang.Object r6 = r2.next()
            com.carrefour.fid.android.domain.models.offer.Offer r6 = (com.carrefour.fid.android.domain.models.offer.Offer) r6
            com.carrefour.fid.android.domain.models.offer.OfferIdentifier r6 = r6.mo118001J()
            java.lang.String r6 = r6.mo118136f()
            r5.add(r6)
            goto L_0x0055
        L_0x006d:
            com.carrefour.fid.android.domain.models.basket.BasketLoyaltyCard r2 = r8.mo116816A()
            if (r2 == 0) goto L_0x0075
            r2 = r4
            goto L_0x0076
        L_0x0075:
            r2 = 0
        L_0x0076:
            java.lang.String r6 = r8.mo116859z()
            r0.L$0 = r8
            r0.label = r4
            java.lang.Object r9 = r9.mo111474c(r5, r2, r6, r0)
            if (r9 != r1) goto L_0x0085
            return r1
        L_0x0085:
            boolean r0 = kotlin.Result.m38710j(r9)
            if (r0 == 0) goto L_0x00ef
            kotlin.Result$a r0 = kotlin.Result.f28060a
            java.util.List r9 = (java.util.List) r9
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = kotlin.collections.C10978t.m41495Y(r9, r3)
            r0.<init>(r1)
            java.util.Iterator r9 = r9.iterator()
        L_0x009e:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L_0x00ea
            java.lang.Object r1 = r9.next()
            com.carrefour.fid.android.domain.models.OfferProductDomain r1 = (com.carrefour.fid.android.domain.models.OfferProductDomain) r1
            java.util.List r2 = r8.mo116817B()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
        L_0x00b4:
            boolean r3 = r2.hasNext()
            r4 = 0
            if (r3 == 0) goto L_0x00db
            java.lang.Object r3 = r2.next()
            r5 = r3
            com.carrefour.fid.android.domain.models.offer.Offer r5 = (com.carrefour.fid.android.domain.models.offer.Offer) r5
            com.carrefour.fid.android.domain.models.offer.OfferIdentifier r5 = r5.mo118001J()
            java.lang.String r5 = r5.mo118136f()
            com.carrefour.fid.android.domain.models.OfferIdentifierDomain r6 = r1.mo116024I()
            if (r6 == 0) goto L_0x00d4
            java.lang.String r4 = r6.mo115986f()
        L_0x00d4:
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r4)
            if (r4 == 0) goto L_0x00b4
            r4 = r3
        L_0x00db:
            com.carrefour.fid.android.domain.models.offer.Offer r4 = (com.carrefour.fid.android.domain.models.offer.Offer) r4
            if (r4 == 0) goto L_0x00e6
            int r2 = r4.mo118012U()
            r1.mo116057g0(r2)
        L_0x00e6:
            r0.add(r1)
            goto L_0x009e
        L_0x00ea:
            java.lang.Object r8 = kotlin.Result.m38702b(r0)
            goto L_0x00f3
        L_0x00ef:
            java.lang.Object r8 = kotlin.Result.m38702b(r9)
        L_0x00f3:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.interactors.offer.GetOfferDetailsInBasketUseCase.mo114780b(com.carrefour.fid.android.domain.models.basket.Basket, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.domain.models.basket.Basket r5, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super java.util.List<com.carrefour.fid.android.domain.models.OfferProductDomain>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.carrefour.fid.android.domain.interactors.offer.GetOfferDetailsInBasketUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.carrefour.fid.android.domain.interactors.offer.GetOfferDetailsInBasketUseCase$invoke$1 r0 = (com.carrefour.fid.android.domain.interactors.offer.GetOfferDetailsInBasketUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.domain.interactors.offer.GetOfferDetailsInBasketUseCase$invoke$1 r0 = new com.carrefour.fid.android.domain.interactors.offer.GetOfferDetailsInBasketUseCase$invoke$1
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
            goto L_0x0043
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0037:
            kotlin.C11661u0.m45747n(r6)
            r0.label = r3
            java.lang.Object r5 = r4.mo114780b(r5, r0)
            if (r5 != r1) goto L_0x0043
            return r1
        L_0x0043:
            boolean r6 = kotlin.Result.m38709i(r5)
            if (r6 == 0) goto L_0x004a
            r5 = 0
        L_0x004a:
            java.util.List r5 = (java.util.List) r5
            if (r5 != 0) goto L_0x0052
            java.util.List r5 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
        L_0x0052:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.interactors.offer.GetOfferDetailsInBasketUseCase.invoke(com.carrefour.fid.android.domain.models.basket.Basket, kotlin.coroutines.c):java.lang.Object");
    }
}
