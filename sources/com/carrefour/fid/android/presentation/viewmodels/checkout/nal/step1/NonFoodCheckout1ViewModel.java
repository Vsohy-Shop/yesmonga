package com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step1;

import androidx.compose.runtime.internal.C8567o;
import androidx.lifecycle.C19456p0;
import androidx.lifecycle.C19476v0;
import androidx.lifecycle.C19500w0;
import com.carrefour.fid.android.domain.interactors.basket.C37562d;
import com.carrefour.fid.android.domain.interactors.basket.C37567f;
import com.carrefour.fid.android.domain.interactors.basket.C37596r;
import com.carrefour.fid.android.domain.interactors.basket.ObserveBasketAndOffersUseCase;
import com.carrefour.fid.android.domain.interactors.basket.ShowPreparationFeesUseCase;
import com.carrefour.fid.android.domain.interactors.product.C37748a;
import com.carrefour.fid.android.domain.interactors.product.C37751c;
import com.carrefour.fid.android.domain.interactors.product.C37803u;
import com.carrefour.fid.android.domain.interactors.product.list.UpdateBasketUseCase;
import com.carrefour.fid.android.domain.interactors.service.C37825m;
import com.carrefour.fid.android.domain.models.product.Product;
import com.carrefour.fid.android.domain.models.service.models.StoreServiceType;
import com.carrefour.fid.android.presentation.p035ui.checkout.nal.step1.C23515a;
import com.carrefour.fid.android.shared.type.C28892e;
import dagger.hilt.android.lifecycle.C10245a;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C11970i;
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

@C10245a
@C11076d0(mo22515d1 = {"\u0000Æ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\\\b\u0007\u0012\u0006\u0010\u0017\u001a\u00020\u0014\u0012\u0006\u0010\u001b\u001a\u00020\u0018\u0012\u0006\u0010\u001f\u001a\u00020\u001c\u0012\u0006\u0010#\u001a\u00020 \u0012\u0006\u0010'\u001a\u00020$\u0012\u0006\u0010+\u001a\u00020(\u0012\u0006\u0010/\u001a\u00020,\u0012\u0006\u00103\u001a\u000200\u0012\u0006\u00107\u001a\u000204\u0012\u0006\u0010b\u001a\u00020aø\u0001\u0000¢\u0006\u0004\bc\u0010dJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005J\u0016\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u0005J\u0006\u0010\u000b\u001a\u00020\u0002J\u0006\u0010\f\u001a\u00020\u0002J\u0006\u0010\u000e\u001a\u00020\rJ\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fJ\u0013\u0010\u0011\u001a\u00020\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0013\u001a\u00020\u0002H\u0002R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010'\u001a\u00020$8\u0002X\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010+\u001a\u00020(8\u0002X\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010/\u001a\u00020,8\u0002X\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00103\u001a\u0002008\u0002X\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0017\u00107\u001a\u0002048\u0002X\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b5\u00106R\u0018\u0010;\u001a\u0004\u0018\u0001088\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0018\u0010=\u001a\u0004\u0018\u0001088\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b<\u0010:R\u0014\u0010A\u001a\u00020>8\u0002X\u0004¢\u0006\u0006\n\u0004\b?\u0010@R \u0010F\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020C0B8\u0002X\u0004¢\u0006\u0006\n\u0004\bD\u0010ER \u0010I\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020G0C0B8\u0002X\u0004¢\u0006\u0006\n\u0004\bH\u0010ER\u001a\u0010K\u001a\b\u0012\u0004\u0012\u00020\r0B8\u0002X\u0004¢\u0006\u0006\n\u0004\bJ\u0010ER\u001d\u0010Q\u001a\b\u0012\u0004\u0012\u00020\r0L8\u0006¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR \u0010U\u001a\b\u0012\u0004\u0012\u00020R0L8\u0000X\u0004¢\u0006\f\n\u0004\bS\u0010N\u001a\u0004\bT\u0010PR\u001a\u0010Z\u001a\b\u0012\u0004\u0012\u00020W0V8\u0002X\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u001d\u0010`\u001a\b\u0012\u0004\u0012\u00020W0[8\u0006¢\u0006\f\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_\u0002\u0004\n\u0002\b\u0019¨\u0006e"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/viewmodels/checkout/nal/step1/NonFoodCheckout1ViewModel;", "Landroidx/lifecycle/v0;", "Lkotlin/d2;", "y0", "w0", "Lcom/carrefour/fid/android/domain/models/product/Product;", "product", "p0", "", "newQuantity", "z0", "o0", "v0", "", "q0", "Lcom/carrefour/fid/android/domain/models/service/models/StoreServiceType;", "t0", "x0", "(Lkotlin/coroutines/c;)Ljava/lang/Object;", "u0", "Lcom/carrefour/fid/android/domain/interactors/product/list/UpdateBasketUseCase;", "a", "Lcom/carrefour/fid/android/domain/interactors/product/list/UpdateBasketUseCase;", "updateBasketUseCase", "Lcom/carrefour/fid/android/domain/interactors/basket/ObserveBasketAndOffersUseCase;", "b", "Lcom/carrefour/fid/android/domain/interactors/basket/ObserveBasketAndOffersUseCase;", "observeBasketAndOffersUseCase", "Lcom/carrefour/fid/android/domain/interactors/product/u;", "c", "Lcom/carrefour/fid/android/domain/interactors/product/u;", "updateItemBasketQuantityUseCase", "Lcom/carrefour/fid/android/domain/interactors/product/a;", "d", "Lcom/carrefour/fid/android/domain/interactors/product/a;", "clearBasketByReferenceUseCase", "Lcom/carrefour/fid/android/domain/interactors/product/c;", "e", "Lcom/carrefour/fid/android/domain/interactors/product/c;", "deleteItemBasketUseCase", "Lcom/carrefour/fid/android/domain/interactors/basket/f;", "f", "Lcom/carrefour/fid/android/domain/interactors/basket/f;", "checkNalBasketValidationUseCase", "Lcom/carrefour/fid/android/domain/interactors/basket/r;", "g", "Lcom/carrefour/fid/android/domain/interactors/basket/r;", "getTotalBasketNumberUseCase", "Lcom/carrefour/fid/android/domain/interactors/service/m;", "h", "Lcom/carrefour/fid/android/domain/interactors/service/m;", "getStoreServiceTypeSelectedUseCase", "Lcom/carrefour/fid/android/domain/interactors/basket/ShowPreparationFeesUseCase;", "i", "Lcom/carrefour/fid/android/domain/interactors/basket/ShowPreparationFeesUseCase;", "showPreparationFeesUseCase", "Lkotlinx/coroutines/c2;", "j", "Lkotlinx/coroutines/c2;", "updateDataJob", "k", "basketOfferJob", "", "l", "Ljava/lang/String;", "referenceId", "Lkotlinx/coroutines/flow/j;", "Lcom/carrefour/fid/android/shared/type/e;", "m", "Lkotlinx/coroutines/flow/j;", "_updateBasketState", "Lcom/carrefour/fid/android/domain/interactors/basket/d;", "n", "_basketAndOfferState", "o", "_showPreparationFees", "Lkotlinx/coroutines/flow/u;", "p", "Lkotlinx/coroutines/flow/u;", "r0", "()Lkotlinx/coroutines/flow/u;", "showPreparationFees", "Lcom/carrefour/fid/android/presentation/viewmodels/checkout/nal/step1/b;", "q", "s0", "state", "Lkotlinx/coroutines/channels/g;", "Lcom/carrefour/fid/android/presentation/ui/checkout/nal/step1/a;", "r", "Lkotlinx/coroutines/channels/g;", "_sideEffect", "Lkotlinx/coroutines/flow/e;", "s", "Lkotlinx/coroutines/flow/e;", "getSideEffect", "()Lkotlinx/coroutines/flow/e;", "sideEffect", "Landroidx/lifecycle/p0;", "savedStateHandle", "<init>", "(Lcom/carrefour/fid/android/domain/interactors/product/list/UpdateBasketUseCase;Lcom/carrefour/fid/android/domain/interactors/basket/ObserveBasketAndOffersUseCase;Lcom/carrefour/fid/android/domain/interactors/product/u;Lcom/carrefour/fid/android/domain/interactors/product/a;Lcom/carrefour/fid/android/domain/interactors/product/c;Lcom/carrefour/fid/android/domain/interactors/basket/f;Lcom/carrefour/fid/android/domain/interactors/basket/r;Lcom/carrefour/fid/android/domain/interactors/service/m;Lcom/carrefour/fid/android/domain/interactors/basket/ShowPreparationFeesUseCase;Landroidx/lifecycle/p0;)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nNonFoodCheckout1ViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NonFoodCheckout1ViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/checkout/nal/step1/NonFoodCheckout1ViewModel\n+ 2 NavArguments.kt\ncom/carrefour/fid/android/presentation/viewmodels/checkout/nal/step1/NavArgumentsKt\n+ 3 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,213:1\n7#2:214\n230#3,5:215\n230#3,5:220\n230#3,5:225\n*S KotlinDebug\n*F\n+ 1 NonFoodCheckout1ViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/checkout/nal/step1/NonFoodCheckout1ViewModel\n*L\n66#1:214\n104#1:215,5\n106#1:220,5\n108#1:225,5\n*E\n"})
public final class NonFoodCheckout1ViewModel extends C19476v0 {

    /* renamed from: t */
    public static final int f63907t = 8;
    @C12579k

    /* renamed from: a */
    public final UpdateBasketUseCase f63908a;
    @C12579k

    /* renamed from: b */
    public final ObserveBasketAndOffersUseCase f63909b;
    @C12579k

    /* renamed from: c */
    public final C37803u f63910c;
    @C12579k

    /* renamed from: d */
    public final C37748a f63911d;
    @C12579k

    /* renamed from: e */
    public final C37751c f63912e;
    @C12579k

    /* renamed from: f */
    public final C37567f f63913f;
    @C12579k

    /* renamed from: g */
    public final C37596r f63914g;
    @C12579k

    /* renamed from: h */
    public final C37825m f63915h;
    @C12579k

    /* renamed from: i */
    public final ShowPreparationFeesUseCase f63916i;
    @C12580l

    /* renamed from: j */
    public C11723c2 f63917j;
    @C12580l

    /* renamed from: k */
    public C11723c2 f63918k;
    @C12579k

    /* renamed from: l */
    public final String f63919l;
    @C12579k

    /* renamed from: m */
    public final C11940j<C28892e<C11079d2>> f63920m;
    @C12579k

    /* renamed from: n */
    public final C11940j<C28892e<C37562d>> f63921n;
    @C12579k

    /* renamed from: o */
    public final C11940j<Boolean> f63922o;
    @C12579k

    /* renamed from: p */
    public final C11952u<Boolean> f63923p;
    @C12579k

    /* renamed from: q */
    public final C11952u<C26144b> f63924q;
    @C12579k

    /* renamed from: r */
    public final C11744g<C23515a> f63925r;
    @C12579k

    /* renamed from: s */
    public final C11907e<C23515a> f63926s;

    @Inject
    public NonFoodCheckout1ViewModel(@C12579k UpdateBasketUseCase updateBasketUseCase, @C12579k ObserveBasketAndOffersUseCase observeBasketAndOffersUseCase, @C12579k C37803u uVar, @C12579k C37748a aVar, @C12579k C37751c cVar, @C12579k C37567f fVar, @C12579k C37596r rVar, @C12579k C37825m mVar, @C12579k ShowPreparationFeesUseCase showPreparationFeesUseCase, @C12579k C19456p0 p0Var) {
        Intrinsics.checkNotNullParameter(updateBasketUseCase, "updateBasketUseCase");
        Intrinsics.checkNotNullParameter(observeBasketAndOffersUseCase, "observeBasketAndOffersUseCase");
        Intrinsics.checkNotNullParameter(uVar, "updateItemBasketQuantityUseCase");
        Intrinsics.checkNotNullParameter(aVar, "clearBasketByReferenceUseCase");
        Intrinsics.checkNotNullParameter(cVar, "deleteItemBasketUseCase");
        Intrinsics.checkNotNullParameter(fVar, "checkNalBasketValidationUseCase");
        Intrinsics.checkNotNullParameter(rVar, "getTotalBasketNumberUseCase");
        Intrinsics.checkNotNullParameter(mVar, "getStoreServiceTypeSelectedUseCase");
        Intrinsics.checkNotNullParameter(showPreparationFeesUseCase, "showPreparationFeesUseCase");
        Intrinsics.checkNotNullParameter(p0Var, "savedStateHandle");
        this.f63908a = updateBasketUseCase;
        this.f63909b = observeBasketAndOffersUseCase;
        this.f63910c = uVar;
        this.f63911d = aVar;
        this.f63912e = cVar;
        this.f63913f = fVar;
        this.f63914g = rVar;
        this.f63915h = mVar;
        this.f63916i = showPreparationFeesUseCase;
        Object h = p0Var.mo57648h(C26143a.f63928a);
        Intrinsics.checkNotNull(h);
        this.f63919l = (String) h;
        C28892e.C28896d dVar = C28892e.C28896d.f70785b;
        C11940j<C28892e<C11079d2>> a = C11953v.m47628a(dVar);
        this.f63920m = a;
        C11940j<C28892e<C37562d>> a2 = C11953v.m47628a(dVar);
        this.f63921n = a2;
        C11940j<Boolean> a3 = C11953v.m47628a(Boolean.FALSE);
        this.f63922o = a3;
        this.f63923p = C11909g.m47470m(a3);
        this.f63924q = C11909g.m47392O1(C11909g.m47357D(a2, a, new NonFoodCheckout1ViewModel$state$1((C11045c<? super NonFoodCheckout1ViewModel$state$1>) null)), C19500w0.m90846a(this), C11948r.f29534a.mo24272c(), new C26144b((C28892e) null, (C28892e) null, 3, (DefaultConstructorMarker) null));
        C11744g<C23515a> d = C11748i.m46625d(-2, (BufferOverflow) null, (C11300l) null, 6, (Object) null);
        this.f63925r = d;
        this.f63926s = C11909g.m47490s1(d);
    }

    @C12579k
    public final C11907e<C23515a> getSideEffect() {
        return this.f63926s;
    }

    /* renamed from: o0 */
    public final void mo75941o0() {
        C11723c2 unused = C12038j.m48061f(C19500w0.m90846a(this), (CoroutineContext) null, (CoroutineStart) null, new NonFoodCheckout1ViewModel$clearBasket$1(this, (C11045c<? super NonFoodCheckout1ViewModel$clearBasket$1>) null), 3, (Object) null);
    }

    /* renamed from: p0 */
    public final void mo75942p0(@C12579k Product product) {
        Intrinsics.checkNotNullParameter(product, "product");
        C11723c2 unused = C12038j.m48061f(C19500w0.m90846a(this), (CoroutineContext) null, (CoroutineStart) null, new NonFoodCheckout1ViewModel$deleteProductToBasket$1(this, product, (C11045c<? super NonFoodCheckout1ViewModel$deleteProductToBasket$1>) null), 3, (Object) null);
    }

    /* renamed from: q0 */
    public final boolean mo75943q0() {
        return this.f63914g.mo33353a();
    }

    @C12579k
    /* renamed from: r0 */
    public final C11952u<Boolean> mo75944r0() {
        return this.f63923p;
    }

    @C12579k
    /* renamed from: s0 */
    public final C11952u<C26144b> mo75945s0() {
        return this.f63924q;
    }

    @C12580l
    /* renamed from: t0 */
    public final StoreServiceType mo75946t0() {
        return (StoreServiceType) C11970i.m47708b((CoroutineContext) null, new NonFoodCheckout1ViewModel$getStoreServiceType$1(this, (C11045c<? super NonFoodCheckout1ViewModel$getStoreServiceType$1>) null), 1, (Object) null);
    }

    /* renamed from: u0 */
    public final void mo75947u0() {
        this.f63918k = C12038j.m48061f(C19500w0.m90846a(this), (CoroutineContext) null, (CoroutineStart) null, new NonFoodCheckout1ViewModel$observeBasketOffers$1(this, (C11045c<? super NonFoodCheckout1ViewModel$observeBasketOffers$1>) null), 3, (Object) null);
    }

    /* renamed from: v0 */
    public final void mo75948v0() {
        C11723c2 unused = C12038j.m48061f(C19500w0.m90846a(this), (CoroutineContext) null, (CoroutineStart) null, new NonFoodCheckout1ViewModel$onBasketValidation$1(this, (C11045c<? super NonFoodCheckout1ViewModel$onBasketValidation$1>) null), 3, (Object) null);
    }

    /* renamed from: w0 */
    public final void mo75949w0() {
        C11723c2 c2Var = this.f63917j;
        if (c2Var != null) {
            C11723c2.C11724a.m46184b(c2Var, (CancellationException) null, 1, (Object) null);
        }
        C11723c2 c2Var2 = this.f63918k;
        if (c2Var2 != null) {
            C11723c2.C11724a.m46184b(c2Var2, (CancellationException) null, 1, (Object) null);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: x0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo75950x0(kotlin.coroutines.C11045c<? super kotlin.C11079d2> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step1.NonFoodCheckout1ViewModel$updateBasket$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step1.NonFoodCheckout1ViewModel$updateBasket$1 r0 = (com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step1.NonFoodCheckout1ViewModel$updateBasket$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step1.NonFoodCheckout1ViewModel$updateBasket$1 r0 = new com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step1.NonFoodCheckout1ViewModel$updateBasket$1
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step1.NonFoodCheckout1ViewModel r0 = (com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step1.NonFoodCheckout1ViewModel) r0
            kotlin.C11661u0.m45747n(r6)
            kotlin.Result r6 = (kotlin.Result) r6
            java.lang.Object r6 = r6.mo21858l()
            goto L_0x0064
        L_0x0033:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x003b:
            kotlin.C11661u0.m45747n(r6)
            kotlinx.coroutines.flow.j<com.carrefour.fid.android.shared.type.e<kotlin.d2>> r6 = r5.f63920m
        L_0x0040:
            java.lang.Object r2 = r6.getValue()
            r4 = r2
            com.carrefour.fid.android.shared.type.e r4 = (com.carrefour.fid.android.shared.type.C28892e) r4
            com.carrefour.fid.android.shared.type.e$b r4 = com.carrefour.fid.android.shared.type.C28892e.C28894b.f70781b
            boolean r2 = r6.mo24216e(r2, r4)
            if (r2 == 0) goto L_0x0040
            com.carrefour.fid.android.domain.interactors.product.list.UpdateBasketUseCase r6 = r5.f63908a
            com.carrefour.fid.android.domain.interactors.product.list.UpdateBasketUseCase$a r2 = new com.carrefour.fid.android.domain.interactors.product.list.UpdateBasketUseCase$a
            java.lang.String r4 = r5.f63919l
            r2.<init>(r4)
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r6 = r6.m172990invokegIAlus(r2, r0)
            if (r6 != r1) goto L_0x0063
            return r1
        L_0x0063:
            r0 = r5
        L_0x0064:
            java.lang.Throwable r1 = kotlin.Result.m38705e(r6)
            if (r1 == 0) goto L_0x007e
            kotlinx.coroutines.flow.j<com.carrefour.fid.android.shared.type.e<kotlin.d2>> r2 = r0.f63920m
        L_0x006c:
            java.lang.Object r3 = r2.getValue()
            r4 = r3
            com.carrefour.fid.android.shared.type.e r4 = (com.carrefour.fid.android.shared.type.C28892e) r4
            com.carrefour.fid.android.shared.type.e$a r4 = new com.carrefour.fid.android.shared.type.e$a
            r4.<init>(r1)
            boolean r3 = r2.mo24216e(r3, r4)
            if (r3 == 0) goto L_0x006c
        L_0x007e:
            boolean r1 = kotlin.Result.m38710j(r6)
            if (r1 == 0) goto L_0x009c
            kotlin.d2 r6 = (kotlin.C11079d2) r6
            kotlinx.coroutines.flow.j<com.carrefour.fid.android.shared.type.e<kotlin.d2>> r6 = r0.f63920m
        L_0x0088:
            java.lang.Object r0 = r6.getValue()
            r1 = r0
            com.carrefour.fid.android.shared.type.e r1 = (com.carrefour.fid.android.shared.type.C28892e) r1
            com.carrefour.fid.android.shared.type.e$c r1 = new com.carrefour.fid.android.shared.type.e$c
            kotlin.d2 r2 = kotlin.C11079d2.f28267a
            r1.<init>(r2)
            boolean r0 = r6.mo24216e(r0, r1)
            if (r0 == 0) goto L_0x0088
        L_0x009c:
            kotlin.d2 r6 = kotlin.C11079d2.f28267a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step1.NonFoodCheckout1ViewModel.mo75950x0(kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: y0 */
    public final void mo75951y0() {
        C11723c2 c2Var = this.f63917j;
        boolean z = true;
        if (c2Var != null) {
            C11723c2.C11724a.m46184b(c2Var, (CancellationException) null, 1, (Object) null);
        }
        this.f63917j = C12038j.m48061f(C19500w0.m90846a(this), (CoroutineContext) null, (CoroutineStart) null, new NonFoodCheckout1ViewModel$updateData$1(this, (C11045c<? super NonFoodCheckout1ViewModel$updateData$1>) null), 3, (Object) null);
        C11723c2 c2Var2 = this.f63918k;
        if (c2Var2 == null || !c2Var2.mo23627d()) {
            z = false;
        }
        if (!z) {
            mo75947u0();
        }
    }

    /* renamed from: z0 */
    public final void mo75952z0(int i, @C12579k Product product) {
        Intrinsics.checkNotNullParameter(product, "product");
        C11723c2 unused = C12038j.m48061f(C19500w0.m90846a(this), (CoroutineContext) null, (CoroutineStart) null, new NonFoodCheckout1ViewModel$updateProductQuantity$1(this, product, i, (C11045c<? super NonFoodCheckout1ViewModel$updateProductQuantity$1>) null), 3, (Object) null);
    }
}
