package com.carrefour.fid.android.presentation.viewmodels.account.list.shopping;

import androidx.compose.runtime.internal.C8567o;
import androidx.lifecycle.C19476v0;
import androidx.lifecycle.C19500w0;
import com.carrefour.fid.android.domain.interactors.basket.C37588n0;
import com.carrefour.fid.android.domain.interactors.favorites.shoppinglist.C37681b;
import com.carrefour.fid.android.domain.interactors.favorites.shoppinglist.C37684e;
import com.carrefour.fid.android.domain.interactors.product.C37774n;
import com.carrefour.fid.android.domain.interactors.user.C37886i;
import com.carrefour.fid.android.domain.models.C38184v;
import com.carrefour.fid.android.domain.models.product.Gtin;
import com.carrefour.fid.android.domain.models.product.plp.C38113a;
import com.carrefour.fid.android.domain.models.product.plp.C38114b;
import com.carrefour.fid.android.domain.models.product.plp.PlpOffer;
import com.carrefour.fid.android.presentation.p035ui.account.list.shopping.C23081i;
import com.carrefour.fid.android.product.presentation.models.C27670g;
import com.carrefour.fid.android.shared.constant.C28547h2;
import com.carrefour.fid.android.shared.type.C28892e;
import dagger.hilt.android.lifecycle.C10245a;
import java.util.Set;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
import kotlinx.coroutines.flow.C11953v;
import org.jetbrains.annotations.C12579k;

@C10245a
@C11076d0(mo22515d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B4\b\u0007\u0012\u0006\u0010!\u001a\u00020\u001e\u0012\u0006\u0010%\u001a\u00020\"\u0012\u0006\u0010)\u001a\u00020&\u0012\u0006\u0010-\u001a\u00020*\u0012\u0006\u00101\u001a\u00020.ø\u0001\u0001¢\u0006\u0004\bD\u0010EJ\u0006\u0010\u0003\u001a\u00020\u0002J\u001b\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bJ\u001d\u0010\u000f\u001a\u00020\u000e*\u00020\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\fH\u0002ø\u0001\u0001J\u001b\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H@ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H@ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0016\u0010\u001d\u001a\u00020\u001c*\u00020\b2\b\b\u0002\u0010\u001b\u001a\u00020\u001aH\u0002R\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8\u0002X\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0017\u0010-\u001a\u00020*8\u0002X\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u00101\u001a\u00020.8\u0002X\u0004¢\u0006\u0006\n\u0004\b/\u00100R \u00108\u001a\b\u0012\u0004\u0012\u000203028\u0000X\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020:098\u0002X\u0004¢\u0006\u0006\n\u0004\b;\u0010<R \u0010C\u001a\b\u0012\u0004\u0012\u00020:0>8\u0000X\u0004¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006F"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/viewmodels/account/list/shopping/ShoppingListViewModel;", "Landroidx/lifecycle/v0;", "Lkotlin/d2;", "m0", "Lcom/carrefour/fid/android/domain/models/product/Gtin;", "gtin", "r0", "(Ljava/lang/String;)V", "Lcom/carrefour/fid/android/domain/models/product/plp/PlpOffer;", "offer", "l0", "Lcom/carrefour/fid/android/domain/models/v;", "", "mixingProductOverlays", "Lcom/carrefour/fid/android/product/presentation/models/g;", "u0", "", "throwable", "p0", "(Ljava/lang/Throwable;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lcom/carrefour/fid/android/domain/models/basket/Basket;", "basket", "Lcom/carrefour/fid/android/domain/models/offer/OfferIdentifier;", "id", "q0", "(Lcom/carrefour/fid/android/domain/models/basket/Basket;Lcom/carrefour/fid/android/domain/models/offer/OfferIdentifier;Lkotlin/coroutines/c;)Ljava/lang/Object;", "", "isOfferRemoved", "Lcom/carrefour/fid/android/domain/interactors/basket/n0$a;", "s0", "Lcom/carrefour/fid/android/domain/interactors/favorites/shoppinglist/b;", "a", "Lcom/carrefour/fid/android/domain/interactors/favorites/shoppinglist/b;", "getShoppingListUseCase", "Lcom/carrefour/fid/android/domain/interactors/favorites/shoppinglist/e;", "b", "Lcom/carrefour/fid/android/domain/interactors/favorites/shoppinglist/e;", "removeProductFromShoppingListUseCase", "Lcom/carrefour/fid/android/domain/interactors/basket/n0;", "c", "Lcom/carrefour/fid/android/domain/interactors/basket/n0;", "updateBasketContentUseCase", "Lcom/carrefour/fid/android/domain/interactors/product/n;", "d", "Lcom/carrefour/fid/android/domain/interactors/product/n;", "getFavoriteFlowUseCase", "Lcom/carrefour/fid/android/domain/interactors/user/i;", "e", "Lcom/carrefour/fid/android/domain/interactors/user/i;", "isUserConnectedUseCase", "Lkotlinx/coroutines/flow/j;", "Lcom/carrefour/fid/android/presentation/viewmodels/account/list/shopping/f;", "f", "Lkotlinx/coroutines/flow/j;", "o0", "()Lkotlinx/coroutines/flow/j;", "state", "Lkotlinx/coroutines/channels/g;", "Lcom/carrefour/fid/android/presentation/ui/account/list/shopping/i;", "g", "Lkotlinx/coroutines/channels/g;", "_sideEffect", "Lkotlinx/coroutines/flow/e;", "h", "Lkotlinx/coroutines/flow/e;", "n0", "()Lkotlinx/coroutines/flow/e;", "sideEffect", "<init>", "(Lcom/carrefour/fid/android/domain/interactors/favorites/shoppinglist/b;Lcom/carrefour/fid/android/domain/interactors/favorites/shoppinglist/e;Lcom/carrefour/fid/android/domain/interactors/basket/n0;Lcom/carrefour/fid/android/domain/interactors/product/n;Lcom/carrefour/fid/android/domain/interactors/user/i;)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nShoppingListViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShoppingListViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/account/list/shopping/ShoppingListViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,141:1\n1855#2,2:142\n*S KotlinDebug\n*F\n+ 1 ShoppingListViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/account/list/shopping/ShoppingListViewModel\n*L\n127#1:142,2\n*E\n"})
public final class ShoppingListViewModel extends C19476v0 {

    /* renamed from: i */
    public static final int f63349i = 8;
    @C12579k

    /* renamed from: a */
    public final C37681b f63350a;
    @C12579k

    /* renamed from: b */
    public final C37684e f63351b;
    @C12579k

    /* renamed from: c */
    public final C37588n0 f63352c;
    @C12579k

    /* renamed from: d */
    public final C37774n f63353d;
    @C12579k

    /* renamed from: e */
    public final C37886i f63354e;
    @C12579k

    /* renamed from: f */
    public final C11940j<C25891f> f63355f = C11953v.m47628a(new C25891f((C28892e) null, 1, (DefaultConstructorMarker) null));
    @C12579k

    /* renamed from: g */
    public final C11744g<C23081i> f63356g;
    @C12579k

    /* renamed from: h */
    public final C11907e<C23081i> f63357h;

    @Inject
    public ShoppingListViewModel(@C12579k C37681b bVar, @C12579k C37684e eVar, @C12579k C37588n0 n0Var, @C12579k C37774n nVar, @C12579k C37886i iVar) {
        Intrinsics.checkNotNullParameter(bVar, "getShoppingListUseCase");
        Intrinsics.checkNotNullParameter(eVar, "removeProductFromShoppingListUseCase");
        Intrinsics.checkNotNullParameter(n0Var, "updateBasketContentUseCase");
        Intrinsics.checkNotNullParameter(nVar, "getFavoriteFlowUseCase");
        Intrinsics.checkNotNullParameter(iVar, "isUserConnectedUseCase");
        this.f63350a = bVar;
        this.f63351b = eVar;
        this.f63352c = n0Var;
        this.f63353d = nVar;
        this.f63354e = iVar;
        C11744g<C23081i> d = C11748i.m46625d(-2, (BufferOverflow) null, (C11300l) null, 6, (Object) null);
        this.f63356g = d;
        this.f63357h = C11909g.m47490s1(d);
    }

    /* renamed from: t0 */
    public static /* synthetic */ C37588n0.C37589a m110903t0(ShoppingListViewModel shoppingListViewModel, PlpOffer plpOffer, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return shoppingListViewModel.mo75138s0(plpOffer, z);
    }

    /* renamed from: l0 */
    public final void mo75131l0(@C12579k PlpOffer plpOffer) {
        Intrinsics.checkNotNullParameter(plpOffer, C28547h2.f69318f);
        C11723c2 unused = C12038j.m48061f(C19500w0.m90846a(this), (CoroutineContext) null, (CoroutineStart) null, new ShoppingListViewModel$addToCart$1(this, plpOffer, (C11045c<? super ShoppingListViewModel$addToCart$1>) null), 3, (Object) null);
    }

    /* renamed from: m0 */
    public final void mo75132m0() {
        C11723c2 unused = C12038j.m48061f(C19500w0.m90846a(this), (CoroutineContext) null, (CoroutineStart) null, new ShoppingListViewModel$fetchFavorites$1(this, (C11045c<? super ShoppingListViewModel$fetchFavorites$1>) null), 3, (Object) null);
    }

    @C12579k
    /* renamed from: n0 */
    public final C11907e<C23081i> mo75133n0() {
        return this.f63357h;
    }

    @C12579k
    /* renamed from: o0 */
    public final C11940j<C25891f> mo75134o0() {
        return this.f63355f;
    }

    /* renamed from: p0 */
    public final Object mo75135p0(Throwable th, C11045c<? super C11079d2> cVar) {
        Object h0 = this.f63356g.mo23757h0(new C23081i.C23082a(th), cVar);
        return h0 == C11063b.m42612h() ? h0 : C11079d2.f28267a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: q0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo75136q0(com.carrefour.fid.android.domain.models.basket.Basket r6, com.carrefour.fid.android.domain.models.offer.OfferIdentifier r7, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.carrefour.fid.android.presentation.viewmodels.account.list.shopping.ShoppingListViewModel$handleBasketThrowableListMessage$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.carrefour.fid.android.presentation.viewmodels.account.list.shopping.ShoppingListViewModel$handleBasketThrowableListMessage$1 r0 = (com.carrefour.fid.android.presentation.viewmodels.account.list.shopping.ShoppingListViewModel$handleBasketThrowableListMessage$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.presentation.viewmodels.account.list.shopping.ShoppingListViewModel$handleBasketThrowableListMessage$1 r0 = new com.carrefour.fid.android.presentation.viewmodels.account.list.shopping.ShoppingListViewModel$handleBasketThrowableListMessage$1
            r0.<init>(r5, r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            java.lang.Object r6 = r0.L$1
            java.util.Iterator r6 = (java.util.Iterator) r6
            java.lang.Object r7 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.account.list.shopping.ShoppingListViewModel r7 = (com.carrefour.fid.android.presentation.viewmodels.account.list.shopping.ShoppingListViewModel) r7
            kotlin.C11661u0.m45747n(r8)
            goto L_0x0049
        L_0x0031:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0039:
            kotlin.C11661u0.m45747n(r8)
            java.util.List r6 = com.carrefour.fid.android.domain.models.basket.extension.C37972a.m156171b(r6, r7, r3)
            if (r6 == 0) goto L_0x0069
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
            r7 = r5
        L_0x0049:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L_0x0069
            java.lang.Object r8 = r6.next()
            java.lang.Throwable r8 = (java.lang.Throwable) r8
            kotlinx.coroutines.channels.g<com.carrefour.fid.android.presentation.ui.account.list.shopping.i> r2 = r7.f63356g
            com.carrefour.fid.android.presentation.ui.account.list.shopping.i$a r4 = new com.carrefour.fid.android.presentation.ui.account.list.shopping.i$a
            r4.<init>(r8)
            r0.L$0 = r7
            r0.L$1 = r6
            r0.label = r3
            java.lang.Object r8 = r2.mo23757h0(r4, r0)
            if (r8 != r1) goto L_0x0049
            return r1
        L_0x0069:
            kotlin.d2 r6 = kotlin.C11079d2.f28267a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.account.list.shopping.ShoppingListViewModel.mo75136q0(com.carrefour.fid.android.domain.models.basket.Basket, com.carrefour.fid.android.domain.models.offer.OfferIdentifier, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: r0 */
    public final void mo75137r0(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "gtin");
        C11723c2 unused = C12038j.m48061f(C19500w0.m90846a(this), (CoroutineContext) null, (CoroutineStart) null, new ShoppingListViewModel$removeFromFavorite$1(this, str, (C11045c<? super ShoppingListViewModel$removeFromFavorite$1>) null), 3, (Object) null);
    }

    /* renamed from: s0 */
    public final C37588n0.C37589a mo75138s0(PlpOffer plpOffer, boolean z) {
        int i;
        if (z) {
            i = 0;
        } else {
            i = plpOffer.mo118791B();
        }
        return new C37588n0.C37589a(plpOffer.mo118819v(), i, true);
    }

    /* renamed from: u0 */
    public final C27670g mo75139u0(C38184v vVar, Set<Gtin> set) {
        if (vVar instanceof C38114b) {
            C38114b bVar = (C38114b) vVar;
            return new C27670g.C27676f(bVar, set.contains(Gtin.m157307a(bVar.mo118842j().mo118850A())));
        } else if (vVar instanceof C38113a) {
            C38113a aVar = (C38113a) vVar;
            return new C27670g.C27675e(aVar.mo118827e(), aVar.mo118829f());
        } else {
            String s = C11342l0.m43547d(vVar.getClass()).mo22848s();
            throw new IllegalStateException("Unknown class: " + s);
        }
    }
}
