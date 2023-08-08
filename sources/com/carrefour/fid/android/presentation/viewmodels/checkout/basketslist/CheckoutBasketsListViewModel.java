package com.carrefour.fid.android.presentation.viewmodels.checkout.basketslist;

import androidx.compose.runtime.internal.C8567o;
import androidx.lifecycle.C19476v0;
import androidx.lifecycle.C19500w0;
import com.carrefour.fid.android.domain.interactors.basket.C37587n;
import com.carrefour.fid.android.domain.interactors.basket.C37596r;
import com.carrefour.fid.android.domain.interactors.service.C37825m;
import com.carrefour.fid.android.domain.models.basket.Basket;
import com.carrefour.fid.android.domain.models.service.models.StoreServiceType;
import com.carrefour.fid.android.shared.type.C28892e;
import dagger.hilt.android.lifecycle.C10245a;
import java.util.List;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C11970i;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.C11909g;
import kotlinx.coroutines.flow.C11940j;
import kotlinx.coroutines.flow.C11952u;
import kotlinx.coroutines.flow.C11953v;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\u0006\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b!\u0010\"J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R&\u0010\u001a\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u00150\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R)\u0010 \u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u00150\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006#"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/viewmodels/checkout/basketslist/CheckoutBasketsListViewModel;", "Landroidx/lifecycle/v0;", "Lkotlin/d2;", "g0", "", "f0", "Lcom/carrefour/fid/android/domain/models/service/models/StoreServiceType;", "h0", "Lcom/carrefour/fid/android/domain/interactors/basket/n;", "a", "Lcom/carrefour/fid/android/domain/interactors/basket/n;", "getBasketsListUseCase", "Lcom/carrefour/fid/android/domain/interactors/basket/r;", "b", "Lcom/carrefour/fid/android/domain/interactors/basket/r;", "getTotalBasketNumberUseCase", "Lcom/carrefour/fid/android/domain/interactors/service/m;", "c", "Lcom/carrefour/fid/android/domain/interactors/service/m;", "getStoreServiceTypeSelectedUseCase", "Lkotlinx/coroutines/flow/j;", "Lcom/carrefour/fid/android/shared/type/e;", "", "Lcom/carrefour/fid/android/domain/models/basket/Basket;", "d", "Lkotlinx/coroutines/flow/j;", "_basketsList", "Lkotlinx/coroutines/flow/u;", "e", "Lkotlinx/coroutines/flow/u;", "getState", "()Lkotlinx/coroutines/flow/u;", "state", "<init>", "(Lcom/carrefour/fid/android/domain/interactors/basket/n;Lcom/carrefour/fid/android/domain/interactors/basket/r;Lcom/carrefour/fid/android/domain/interactors/service/m;)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C10245a
@C8567o(parameters = 0)
public final class CheckoutBasketsListViewModel extends C19476v0 {

    /* renamed from: f */
    public static final int f63894f = 8;
    @C12579k

    /* renamed from: a */
    public final C37587n f63895a;
    @C12579k

    /* renamed from: b */
    public final C37596r f63896b;
    @C12579k

    /* renamed from: c */
    public final C37825m f63897c;
    @C12579k

    /* renamed from: d */
    public final C11940j<C28892e<List<Basket>>> f63898d;
    @C12579k

    /* renamed from: e */
    public final C11952u<C28892e<List<Basket>>> f63899e;

    @Inject
    public CheckoutBasketsListViewModel(@C12579k C37587n nVar, @C12579k C37596r rVar, @C12579k C37825m mVar) {
        Intrinsics.checkNotNullParameter(nVar, "getBasketsListUseCase");
        Intrinsics.checkNotNullParameter(rVar, "getTotalBasketNumberUseCase");
        Intrinsics.checkNotNullParameter(mVar, "getStoreServiceTypeSelectedUseCase");
        this.f63895a = nVar;
        this.f63896b = rVar;
        this.f63897c = mVar;
        C11940j<C28892e<List<Basket>>> a = C11953v.m47628a(C28892e.C28896d.f70785b);
        this.f63898d = a;
        this.f63899e = C11909g.m47470m(a);
    }

    /* renamed from: f0 */
    public final boolean mo75923f0() {
        return this.f63896b.mo33353a();
    }

    /* renamed from: g0 */
    public final void mo75924g0() {
        C11723c2 unused = C12038j.m48061f(C19500w0.m90846a(this), (CoroutineContext) null, (CoroutineStart) null, new CheckoutBasketsListViewModel$getBasketsList$1(this, (C11045c<? super CheckoutBasketsListViewModel$getBasketsList$1>) null), 3, (Object) null);
    }

    @C12579k
    public final C11952u<C28892e<List<Basket>>> getState() {
        return this.f63899e;
    }

    @C12580l
    /* renamed from: h0 */
    public final StoreServiceType mo75926h0() {
        return (StoreServiceType) C11970i.m47708b((CoroutineContext) null, new CheckoutBasketsListViewModel$getStoreServiceType$1(this, (C11045c<? super CheckoutBasketsListViewModel$getStoreServiceType$1>) null), 1, (Object) null);
    }
}
