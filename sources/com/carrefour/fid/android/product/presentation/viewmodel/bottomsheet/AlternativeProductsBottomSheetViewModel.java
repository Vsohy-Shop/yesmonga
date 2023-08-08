package com.carrefour.fid.android.product.presentation.viewmodel.bottomsheet;

import androidx.lifecycle.C19476v0;
import androidx.lifecycle.C19500w0;
import com.carrefour.fid.android.domain.interactors.basket.C37588n0;
import com.carrefour.fid.android.domain.interactors.favorites.shoppinglist.C37680a;
import com.carrefour.fid.android.domain.interactors.favorites.shoppinglist.C37684e;
import com.carrefour.fid.android.domain.interactors.product.C37753d;
import com.carrefour.fid.android.domain.models.product.plp.C38114b;
import com.carrefour.fid.android.domain.models.product.plp.C38115c;
import com.carrefour.fid.android.domain.models.product.plp.PlpOffer;
import com.carrefour.fid.android.product.presentation.models.extensions.C27662e;
import com.carrefour.fid.android.product.presentation.p039ui.bottomsheet.C27739f;
import com.carrefour.fid.android.shared.type.C28892e;
import dagger.hilt.android.lifecycle.C10245a;
import java.util.List;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.C11744g;
import kotlinx.coroutines.channels.C11748i;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11909g;
import kotlinx.coroutines.flow.C11940j;
import kotlinx.coroutines.flow.C11952u;
import kotlinx.coroutines.flow.C11953v;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10245a
@C11076d0(mo22515d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B,\b\u0007\u0012\u0006\u0010\u001e\u001a\u00020\u001b\u0012\u0006\u0010\"\u001a\u00020\u001f\u0012\u0006\u0010&\u001a\u00020#\u0012\u0006\u0010*\u001a\u00020'ø\u0001\u0001¢\u0006\u0004\bE\u0010FJ\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tJ\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007J#\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH@ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H@ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u001a\u001a\u00020\u0019*\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\tH\u0002R\u0017\u0010\u001e\u001a\u00020\u001b8\u0002X\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010&\u001a\u00020#8\u0002X\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010*\u001a\u00020'8\u0002X\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010.\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u001a\u00103\u001a\b\u0012\u0004\u0012\u0002000/8\u0002X\u0004¢\u0006\u0006\n\u0004\b1\u00102R \u00109\u001a\b\u0012\u0004\u0012\u000200048\u0000X\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R&\u0010@\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020=0<0;0:8\u0002X\u0004¢\u0006\u0006\n\u0004\b>\u0010?R&\u0010D\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020=0<0;0A8@X\u0004¢\u0006\u0006\u001a\u0004\bB\u0010C\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006G"}, mo22516d2 = {"Lcom/carrefour/fid/android/product/presentation/viewmodel/bottomsheet/AlternativeProductsBottomSheetViewModel;", "Landroidx/lifecycle/v0;", "Lcom/carrefour/fid/android/domain/models/product/Gtin;", "gtin", "Lkotlin/d2;", "j0", "(Ljava/lang/String;)V", "Lcom/carrefour/fid/android/domain/models/product/plp/c;", "product", "", "isInShoppingList", "p0", "o0", "Lcom/carrefour/fid/android/domain/models/basket/Basket;", "basket", "Lcom/carrefour/fid/android/domain/models/offer/OfferIdentifier;", "offerId", "m0", "(Lcom/carrefour/fid/android/domain/models/basket/Basket;Lcom/carrefour/fid/android/domain/models/offer/OfferIdentifier;Lkotlin/coroutines/c;)Ljava/lang/Object;", "", "throwable", "n0", "(Ljava/lang/Throwable;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lcom/carrefour/fid/android/domain/models/product/plp/PlpOffer;", "isOfferRemoved", "Lcom/carrefour/fid/android/domain/interactors/basket/n0$a;", "q0", "Lcom/carrefour/fid/android/domain/interactors/product/d;", "a", "Lcom/carrefour/fid/android/domain/interactors/product/d;", "getAntiInflationProductsFlowUseCase", "Lcom/carrefour/fid/android/domain/interactors/favorites/shoppinglist/a;", "b", "Lcom/carrefour/fid/android/domain/interactors/favorites/shoppinglist/a;", "addProductToShoppingListUseCase", "Lcom/carrefour/fid/android/domain/interactors/favorites/shoppinglist/e;", "c", "Lcom/carrefour/fid/android/domain/interactors/favorites/shoppinglist/e;", "removeProductFromShoppingListUseCase", "Lcom/carrefour/fid/android/domain/interactors/basket/n0;", "d", "Lcom/carrefour/fid/android/domain/interactors/basket/n0;", "updateBasketContentUseCase", "Lkotlinx/coroutines/c2;", "e", "Lkotlinx/coroutines/c2;", "fetchDataJob", "Lkotlinx/coroutines/channels/g;", "Lcom/carrefour/fid/android/product/presentation/ui/bottomsheet/f;", "f", "Lkotlinx/coroutines/channels/g;", "_sideEffect", "Lkotlinx/coroutines/flow/e;", "g", "Lkotlinx/coroutines/flow/e;", "l0", "()Lkotlinx/coroutines/flow/e;", "sideEffect", "Lkotlinx/coroutines/flow/j;", "Lcom/carrefour/fid/android/shared/type/e;", "", "Lcom/carrefour/fid/android/domain/models/product/plp/b;", "h", "Lkotlinx/coroutines/flow/j;", "_antiInflationProductListState", "Lkotlinx/coroutines/flow/u;", "k0", "()Lkotlinx/coroutines/flow/u;", "antiInflationProductListState", "<init>", "(Lcom/carrefour/fid/android/domain/interactors/product/d;Lcom/carrefour/fid/android/domain/interactors/favorites/shoppinglist/a;Lcom/carrefour/fid/android/domain/interactors/favorites/shoppinglist/e;Lcom/carrefour/fid/android/domain/interactors/basket/n0;)V", "product_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nAlternativeProductsBottomSheetViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlternativeProductsBottomSheetViewModel.kt\ncom/carrefour/fid/android/product/presentation/viewmodel/bottomsheet/AlternativeProductsBottomSheetViewModel\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,113:1\n230#2,5:114\n1855#3,2:119\n*S KotlinDebug\n*F\n+ 1 AlternativeProductsBottomSheetViewModel.kt\ncom/carrefour/fid/android/product/presentation/viewmodel/bottomsheet/AlternativeProductsBottomSheetViewModel\n*L\n50#1:114,5\n95#1:119,2\n*E\n"})
public final class AlternativeProductsBottomSheetViewModel extends C19476v0 {
    @C12579k

    /* renamed from: a */
    public final C37753d f68066a;
    @C12579k

    /* renamed from: b */
    public final C37680a f68067b;
    @C12579k

    /* renamed from: c */
    public final C37684e f68068c;
    @C12579k

    /* renamed from: d */
    public final C37588n0 f68069d;
    @C12580l

    /* renamed from: e */
    public C11723c2 f68070e;
    @C12579k

    /* renamed from: f */
    public final C11744g<C27739f> f68071f;
    @C12579k

    /* renamed from: g */
    public final C11907e<C27739f> f68072g;
    @C12579k

    /* renamed from: h */
    public final C11940j<C28892e<List<C38114b>>> f68073h = C11953v.m47628a(C28892e.C28896d.f70785b);

    @Inject
    public AlternativeProductsBottomSheetViewModel(@C12579k C37753d dVar, @C12579k C37680a aVar, @C12579k C37684e eVar, @C12579k C37588n0 n0Var) {
        Intrinsics.checkNotNullParameter(dVar, "getAntiInflationProductsFlowUseCase");
        Intrinsics.checkNotNullParameter(aVar, "addProductToShoppingListUseCase");
        Intrinsics.checkNotNullParameter(eVar, "removeProductFromShoppingListUseCase");
        Intrinsics.checkNotNullParameter(n0Var, "updateBasketContentUseCase");
        this.f68066a = dVar;
        this.f68067b = aVar;
        this.f68068c = eVar;
        this.f68069d = n0Var;
        C11744g<C27739f> d = C11748i.m46625d(-2, (BufferOverflow) null, (C11300l) null, 6, (Object) null);
        this.f68071f = d;
        this.f68072g = C11909g.m47490s1(d);
    }

    /* renamed from: r0 */
    public static /* synthetic */ C37588n0.C37589a m117663r0(AlternativeProductsBottomSheetViewModel alternativeProductsBottomSheetViewModel, PlpOffer plpOffer, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return alternativeProductsBottomSheetViewModel.mo81692q0(plpOffer, z);
    }

    /* renamed from: j0 */
    public final void mo81685j0(@C12579k String str) {
        C28892e<List<C38114b>> value;
        Intrinsics.checkNotNullParameter(str, "gtin");
        C11940j<C28892e<List<C38114b>>> jVar = this.f68073h;
        do {
            value = jVar.getValue();
            C28892e eVar = value;
        } while (!jVar.mo24216e(value, C28892e.C28894b.f70781b));
        C11723c2 c2Var = this.f68070e;
        if (c2Var != null) {
            C11723c2.C11724a.m46184b(c2Var, (CancellationException) null, 1, (Object) null);
        }
        this.f68070e = C12038j.m48061f(C19500w0.m90846a(this), (CoroutineContext) null, (CoroutineStart) null, new AlternativeProductsBottomSheetViewModel$fetchData$2(this, str, (C11045c<? super AlternativeProductsBottomSheetViewModel$fetchData$2>) null), 3, (Object) null);
    }

    @C12579k
    /* renamed from: k0 */
    public final C11952u<C28892e<List<C38114b>>> mo81686k0() {
        return C11909g.m47470m(this.f68073h);
    }

    @C12579k
    /* renamed from: l0 */
    public final C11907e<C27739f> mo81687l0() {
        return this.f68072g;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: m0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo81688m0(com.carrefour.fid.android.domain.models.basket.Basket r5, com.carrefour.fid.android.domain.models.offer.OfferIdentifier r6, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.carrefour.fid.android.product.presentation.viewmodel.bottomsheet.C28103xcf27807
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.carrefour.fid.android.product.presentation.viewmodel.bottomsheet.AlternativeProductsBottomSheetViewModel$handleBasketThrowableListMessage$1 r0 = (com.carrefour.fid.android.product.presentation.viewmodel.bottomsheet.C28103xcf27807) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.product.presentation.viewmodel.bottomsheet.AlternativeProductsBottomSheetViewModel$handleBasketThrowableListMessage$1 r0 = new com.carrefour.fid.android.product.presentation.viewmodel.bottomsheet.AlternativeProductsBottomSheetViewModel$handleBasketThrowableListMessage$1
            r0.<init>(r4, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            java.lang.Object r5 = r0.L$1
            java.util.Iterator r5 = (java.util.Iterator) r5
            java.lang.Object r6 = r0.L$0
            com.carrefour.fid.android.product.presentation.viewmodel.bottomsheet.AlternativeProductsBottomSheetViewModel r6 = (com.carrefour.fid.android.product.presentation.viewmodel.bottomsheet.AlternativeProductsBottomSheetViewModel) r6
            kotlin.C11661u0.m45747n(r7)
            goto L_0x0049
        L_0x0031:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0039:
            kotlin.C11661u0.m45747n(r7)
            java.util.List r5 = com.carrefour.fid.android.domain.models.basket.extension.C37972a.m156171b(r5, r6, r3)
            if (r5 == 0) goto L_0x0062
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r5 = r5.iterator()
            r6 = r4
        L_0x0049:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x0062
            java.lang.Object r7 = r5.next()
            java.lang.Throwable r7 = (java.lang.Throwable) r7
            r0.L$0 = r6
            r0.L$1 = r5
            r0.label = r3
            java.lang.Object r7 = r6.mo81689n0(r7, r0)
            if (r7 != r1) goto L_0x0049
            return r1
        L_0x0062:
            kotlin.d2 r5 = kotlin.C11079d2.f28267a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.presentation.viewmodel.bottomsheet.AlternativeProductsBottomSheetViewModel.mo81688m0(com.carrefour.fid.android.domain.models.basket.Basket, com.carrefour.fid.android.domain.models.offer.OfferIdentifier, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: n0 */
    public final Object mo81689n0(Throwable th, C11045c<? super C11079d2> cVar) {
        Object h0 = this.f68071f.mo23757h0(new C27739f.C27740a(th), cVar);
        return h0 == C11063b.m42612h() ? h0 : C11079d2.f28267a;
    }

    /* renamed from: o0 */
    public final void mo81690o0(@C12579k C38115c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "product");
        PlpOffer i = C27662e.m116389i(cVar);
        if (i != null) {
            C11723c2 unused = C12038j.m48061f(C19500w0.m90846a(this), (CoroutineContext) null, (CoroutineStart) null, new AlternativeProductsBottomSheetViewModel$onAddToCartPressed$1(this, i, (C11045c<? super AlternativeProductsBottomSheetViewModel$onAddToCartPressed$1>) null), 3, (Object) null);
        }
    }

    /* renamed from: p0 */
    public final void mo81691p0(@C12579k C38115c cVar, boolean z) {
        Intrinsics.checkNotNullParameter(cVar, "product");
        C11723c2 unused = C12038j.m48061f(C19500w0.m90846a(this), (CoroutineContext) null, (CoroutineStart) null, new AlternativeProductsBottomSheetViewModel$onAddToFavorites$1(z, this, cVar, (C11045c<? super AlternativeProductsBottomSheetViewModel$onAddToFavorites$1>) null), 3, (Object) null);
    }

    /* renamed from: q0 */
    public final C37588n0.C37589a mo81692q0(PlpOffer plpOffer, boolean z) {
        int i;
        if (z) {
            i = 0;
        } else {
            i = plpOffer.mo118791B();
        }
        return new C37588n0.C37589a(plpOffer.mo118819v(), i, true);
    }
}
