package com.carrefour.fid.android.product.presentation.viewmodel.details;

import androidx.lifecycle.C19456p0;
import androidx.lifecycle.C19476v0;
import androidx.lifecycle.C19500w0;
import com.carrefour.fid.android.domain.interactors.basket.C37591o0;
import com.carrefour.fid.android.domain.interactors.basket.C37605y;
import com.carrefour.fid.android.domain.interactors.product.GetProductDetailsNalUseCase;
import com.carrefour.fid.android.domain.interactors.service.C37835r;
import com.carrefour.fid.android.domain.models.basket.C37968a;
import com.carrefour.fid.android.domain.models.offer.OfferIdentifier;
import com.carrefour.fid.android.domain.models.product.detail.C38106a;
import com.carrefour.fid.android.domain.models.product.detail.C38110e;
import com.carrefour.fid.android.domain.models.product.detail.OfferDetail;
import com.carrefour.fid.android.product.presentation.models.C27656e;
import com.carrefour.fid.android.product.presentation.viewmodel.details.mvi.C28131a;
import com.carrefour.fid.android.shared.constant.C28547h2;
import com.carrefour.fid.android.shared.type.C28892e;
import dagger.hilt.android.lifecycle.C10245a;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11300l;
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
import kotlinx.coroutines.flow.C11948r;
import kotlinx.coroutines.flow.C11952u;
import kotlinx.coroutines.flow.C11953v;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B4\b\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0014\u0012\u0006\u0010\u001b\u001a\u00020\u0018\u0012\u0006\u0010\u001f\u001a\u00020\u001c\u0012\u0006\u0010@\u001a\u00020?ø\u0001\u0000¢\u0006\u0004\bA\u0010BJ.\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bJ\u0006\u0010\r\u001a\u00020\u000bJ\b\u0010\u000e\u001a\u00020\u000bH\u0002J\b\u0010\u000f\u001a\u00020\u000bH\u0002R\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0017\u001a\u00020\u00148\u0002X\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0017\u0010\u001b\u001a\u00020\u00188\u0002X\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001f\u0010#\u001a\u0004\u0018\u00010 8\u0002X\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b!\u0010\"R \u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0%0$8\u0002X\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020*0$8\u0002X\u0004¢\u0006\u0006\n\u0004\b+\u0010(R\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020.0-8\u0002X\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u001d\u00107\u001a\b\u0012\u0004\u0012\u00020.028\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u001d\u0010>\u001a\b\u0012\u0004\u0012\u000209088\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006C"}, mo22516d2 = {"Lcom/carrefour/fid/android/product/presentation/viewmodel/details/NonFoodProductDetailsViewModel;", "Landroidx/lifecycle/v0;", "", "quantity", "Lcom/carrefour/fid/android/domain/models/product/detail/OfferDetail;", "offer", "Lcom/carrefour/fid/android/domain/models/product/detail/e;", "product", "", "isHomeDeliveryNal", "hasMultipleOffers", "Lkotlin/d2;", "n0", "k0", "m0", "l0", "Lcom/carrefour/fid/android/domain/interactors/product/GetProductDetailsNalUseCase;", "a", "Lcom/carrefour/fid/android/domain/interactors/product/GetProductDetailsNalUseCase;", "getProductDetailsNalUseCase", "Lcom/carrefour/fid/android/domain/interactors/service/r;", "b", "Lcom/carrefour/fid/android/domain/interactors/service/r;", "observeServiceSelectionUseCase", "Lcom/carrefour/fid/android/domain/interactors/basket/y;", "c", "Lcom/carrefour/fid/android/domain/interactors/basket/y;", "basketItemQuantityToSellUseCase", "Lcom/carrefour/fid/android/domain/interactors/basket/o0;", "d", "Lcom/carrefour/fid/android/domain/interactors/basket/o0;", "updateBasketUseCase", "Lcom/carrefour/fid/android/domain/models/product/Gtin;", "e", "Ljava/lang/String;", "gtin", "Lkotlinx/coroutines/flow/j;", "Lcom/carrefour/fid/android/shared/type/e;", "Lcom/carrefour/fid/android/domain/models/product/detail/a;", "f", "Lkotlinx/coroutines/flow/j;", "_productAndOfferState", "Lcom/carrefour/fid/android/domain/models/basket/a;", "g", "_basketQuantityToSellState", "Lkotlinx/coroutines/channels/g;", "Lcom/carrefour/fid/android/product/presentation/viewmodel/details/mvi/a;", "h", "Lkotlinx/coroutines/channels/g;", "_sideEffect", "Lkotlinx/coroutines/flow/e;", "i", "Lkotlinx/coroutines/flow/e;", "getSideEffect", "()Lkotlinx/coroutines/flow/e;", "sideEffect", "Lkotlinx/coroutines/flow/u;", "Lcom/carrefour/fid/android/product/presentation/models/e;", "j", "Lkotlinx/coroutines/flow/u;", "getState", "()Lkotlinx/coroutines/flow/u;", "state", "Landroidx/lifecycle/p0;", "savedStateHandle", "<init>", "(Lcom/carrefour/fid/android/domain/interactors/product/GetProductDetailsNalUseCase;Lcom/carrefour/fid/android/domain/interactors/service/r;Lcom/carrefour/fid/android/domain/interactors/basket/y;Lcom/carrefour/fid/android/domain/interactors/basket/o0;Landroidx/lifecycle/p0;)V", "product_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C10245a
public final class NonFoodProductDetailsViewModel extends C19476v0 {
    @C12579k

    /* renamed from: a */
    public final GetProductDetailsNalUseCase f68080a;
    @C12579k

    /* renamed from: b */
    public final C37835r f68081b;
    @C12579k

    /* renamed from: c */
    public final C37605y f68082c;
    @C12579k

    /* renamed from: d */
    public final C37591o0 f68083d;
    @C12580l

    /* renamed from: e */
    public final String f68084e;
    @C12579k

    /* renamed from: f */
    public final C11940j<C28892e<C38106a>> f68085f;
    @C12579k

    /* renamed from: g */
    public final C11940j<C37968a> f68086g;
    @C12579k

    /* renamed from: h */
    public final C11744g<C28131a> f68087h;
    @C12579k

    /* renamed from: i */
    public final C11907e<C28131a> f68088i;
    @C12579k

    /* renamed from: j */
    public final C11952u<C27656e> f68089j;

    @Inject
    public NonFoodProductDetailsViewModel(@C12579k GetProductDetailsNalUseCase getProductDetailsNalUseCase, @C12579k C37835r rVar, @C12579k C37605y yVar, @C12579k C37591o0 o0Var, @C12579k C19456p0 p0Var) {
        String str;
        Intrinsics.checkNotNullParameter(getProductDetailsNalUseCase, "getProductDetailsNalUseCase");
        Intrinsics.checkNotNullParameter(rVar, "observeServiceSelectionUseCase");
        Intrinsics.checkNotNullParameter(yVar, "basketItemQuantityToSellUseCase");
        Intrinsics.checkNotNullParameter(o0Var, "updateBasketUseCase");
        Intrinsics.checkNotNullParameter(p0Var, "savedStateHandle");
        this.f68080a = getProductDetailsNalUseCase;
        this.f68081b = rVar;
        this.f68082c = yVar;
        this.f68083d = o0Var;
        OfferIdentifier offerIdentifier = (OfferIdentifier) p0Var.mo57648h("offerIdentifier");
        if (offerIdentifier != null) {
            str = offerIdentifier.mo118136f();
        } else {
            str = null;
        }
        this.f68084e = str;
        C11940j<C28892e<C38106a>> a = C11953v.m47628a(C28892e.C28896d.f70785b);
        this.f68085f = a;
        C11940j<C37968a> a2 = C11953v.m47628a(new C37968a(0, (Integer) null));
        this.f68086g = a2;
        C11744g<C28131a> d = C11748i.m46625d(-2, (BufferOverflow) null, (C11300l) null, 6, (Object) null);
        this.f68087h = d;
        this.f68088i = C11909g.m47490s1(d);
        this.f68089j = C11909g.m47392O1(C11909g.m47357D(a, a2, new NonFoodProductDetailsViewModel$state$1((C11045c<? super NonFoodProductDetailsViewModel$state$1>) null)), C19500w0.m90846a(this), C11948r.f29534a.mo24272c(), new C27656e((C28892e) null, 0, (Integer) null, false, 15, (DefaultConstructorMarker) null));
        mo81701k0();
        mo81702l0();
        mo81703m0();
    }

    @C12579k
    public final C11907e<C28131a> getSideEffect() {
        return this.f68088i;
    }

    @C12579k
    public final C11952u<C27656e> getState() {
        return this.f68089j;
    }

    /* renamed from: k0 */
    public final void mo81701k0() {
        C11723c2 unused = C12038j.m48061f(C19500w0.m90846a(this), (CoroutineContext) null, (CoroutineStart) null, new NonFoodProductDetailsViewModel$getProductAndOffer$1(this, (C11045c<? super NonFoodProductDetailsViewModel$getProductAndOffer$1>) null), 3, (Object) null);
    }

    /* renamed from: l0 */
    public final void mo81702l0() {
        C11723c2 unused = C12038j.m48061f(C19500w0.m90846a(this), (CoroutineContext) null, (CoroutineStart) null, new NonFoodProductDetailsViewModel$observeBasketItemQuantityToSell$1(this, (C11045c<? super NonFoodProductDetailsViewModel$observeBasketItemQuantityToSell$1>) null), 3, (Object) null);
    }

    /* renamed from: m0 */
    public final void mo81703m0() {
        C11723c2 unused = C12038j.m48061f(C19500w0.m90846a(this), (CoroutineContext) null, (CoroutineStart) null, new NonFoodProductDetailsViewModel$observeServiceSelection$1(this, (C11045c<? super NonFoodProductDetailsViewModel$observeServiceSelection$1>) null), 3, (Object) null);
    }

    /* renamed from: n0 */
    public final void mo81704n0(int i, @C12579k OfferDetail offerDetail, @C12579k C38110e eVar, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(offerDetail, C28547h2.f69318f);
        Intrinsics.checkNotNullParameter(eVar, "product");
        C11723c2 unused = C12038j.m48061f(C19500w0.m90846a(this), (CoroutineContext) null, (CoroutineStart) null, new NonFoodProductDetailsViewModel$onAddToCartClicked$1(this, offerDetail, i, z, z2, eVar, (C11045c<? super NonFoodProductDetailsViewModel$onAddToCartClicked$1>) null), 3, (Object) null);
    }
}
