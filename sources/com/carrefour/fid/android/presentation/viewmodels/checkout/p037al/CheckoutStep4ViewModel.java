package com.carrefour.fid.android.presentation.viewmodels.checkout.p037al;

import androidx.compose.runtime.internal.C8567o;
import androidx.lifecycle.C19499w;
import androidx.lifecycle.C19500w0;
import androidx.lifecycle.LiveData;
import com.carrefour.fid.android.data.entities.mapper.C36540w0;
import com.carrefour.fid.android.domain.interactors.basket.C37569f0;
import com.carrefour.fid.android.domain.interactors.checkout.ConfirmPaymentUseCase;
import com.carrefour.fid.android.domain.models.BasketDomain;
import com.carrefour.fid.android.domain.models.OrderConfirmationModel;
import com.carrefour.fid.android.shared.base.C28498p;
import com.carrefour.fid.android.shared.extension.StringKt;
import com.carrefour.fid.android.shared.util.C28947q;
import dagger.hilt.android.lifecycle.C10245a;
import java.util.List;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11622t;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0014\u0012\u0006\u0010\u001b\u001a\u00020\u0018¢\u0006\u0004\b,\u0010-J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002J\u0006\u0010\u0007\u001a\u00020\u0005J\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002J!\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001d\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001d0!8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020'0\u001c8\u0002X\u0004¢\u0006\u0006\n\u0004\b(\u0010\u001fR\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020'0!8@X\u0004¢\u0006\u0006\u001a\u0004\b*\u0010%¨\u0006."}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/viewmodels/checkout/al/CheckoutStep4ViewModel;", "Lcom/carrefour/fid/android/shared/base/p;", "", "url", "userLoyaltyAmount", "Lkotlin/d2;", "q0", "m0", "", "o0", "Landroidx/lifecycle/w;", "owner", "", "clear", "r", "(Landroidx/lifecycle/w;Ljava/lang/Boolean;)V", "Lcom/carrefour/fid/android/domain/interactors/checkout/ConfirmPaymentUseCase;", "d", "Lcom/carrefour/fid/android/domain/interactors/checkout/ConfirmPaymentUseCase;", "confirmPaymentUseCase", "Lcom/carrefour/fid/android/data/entities/mapper/w0;", "e", "Lcom/carrefour/fid/android/data/entities/mapper/w0;", "orderConfirmationModelMapper", "Lcom/carrefour/fid/android/domain/interactors/basket/f0;", "f", "Lcom/carrefour/fid/android/domain/interactors/basket/f0;", "retrieveBasketUseCase", "Lcom/carrefour/fid/android/shared/util/q;", "Lcom/carrefour/fid/android/domain/models/OrderConfirmationModel;", "g", "Lcom/carrefour/fid/android/shared/util/q;", "singleOrderConfirmationModel", "Landroidx/lifecycle/LiveData;", "h", "Landroidx/lifecycle/LiveData;", "p0", "()Landroidx/lifecycle/LiveData;", "orderConfirmationModel", "Lcom/carrefour/fid/android/domain/models/BasketDomain;", "i", "singleBasket", "n0", "basket", "<init>", "(Lcom/carrefour/fid/android/domain/interactors/checkout/ConfirmPaymentUseCase;Lcom/carrefour/fid/android/data/entities/mapper/w0;Lcom/carrefour/fid/android/domain/interactors/basket/f0;)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C10245a
@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.checkout.al.CheckoutStep4ViewModel */
public final class CheckoutStep4ViewModel extends C28498p {

    /* renamed from: j */
    public static final int f63561j = 8;
    @C12579k

    /* renamed from: d */
    public final ConfirmPaymentUseCase f63562d;
    @C12579k

    /* renamed from: e */
    public final C36540w0 f63563e;
    @C12579k

    /* renamed from: f */
    public final C37569f0 f63564f;
    @C12579k

    /* renamed from: g */
    public final C28947q<OrderConfirmationModel> f63565g;
    @C12579k

    /* renamed from: h */
    public final LiveData<OrderConfirmationModel> f63566h;
    @C12579k

    /* renamed from: i */
    public final C28947q<BasketDomain> f63567i = new C28947q<>();

    @Inject
    public CheckoutStep4ViewModel(@C12579k ConfirmPaymentUseCase confirmPaymentUseCase, @C12579k C36540w0 w0Var, @C12579k C37569f0 f0Var) {
        Intrinsics.checkNotNullParameter(confirmPaymentUseCase, "confirmPaymentUseCase");
        Intrinsics.checkNotNullParameter(w0Var, "orderConfirmationModelMapper");
        Intrinsics.checkNotNullParameter(f0Var, "retrieveBasketUseCase");
        this.f63562d = confirmPaymentUseCase;
        this.f63563e = w0Var;
        this.f63564f = f0Var;
        C28947q<OrderConfirmationModel> qVar = new C28947q<>();
        this.f63565g = qVar;
        this.f63566h = qVar;
    }

    /* renamed from: m0 */
    public final void mo75473m0() {
        C11723c2 unused = C12038j.m48061f(C19500w0.m90846a(this), (CoroutineContext) null, (CoroutineStart) null, new CheckoutStep4ViewModel$getBasket$1(this, (C11045c<? super CheckoutStep4ViewModel$getBasket$1>) null), 3, (Object) null);
    }

    @C12579k
    /* renamed from: n0 */
    public final LiveData<BasketDomain> mo75474n0() {
        return this.f63567i;
    }

    @C12579k
    /* renamed from: o0 */
    public final List<String> mo75475o0(@C12579k String str) {
        boolean z;
        boolean z2;
        Intrinsics.checkNotNullParameter(str, "url");
        String C = StringKt.m118894C(str);
        String E = StringKt.m118896E(str);
        if (C == null || C11622t.isBlank(C)) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            if (E == null || C11622t.isBlank(E)) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                return CollectionsKt__CollectionsKt.m40448L(C, E);
            }
        }
        return CollectionsKt__CollectionsKt.m40441E();
    }

    @C12579k
    /* renamed from: p0 */
    public final LiveData<OrderConfirmationModel> mo75476p0() {
        return this.f63566h;
    }

    /* renamed from: q0 */
    public final void mo75477q0(@C12579k String str, @C12580l String str2) {
        Intrinsics.checkNotNullParameter(str, "url");
        List<String> o0 = mo75475o0(str);
        if (o0.isEmpty()) {
            C28947q<Throwable> e0 = mo83420e0();
            e0.mo57493o(new Throwable("No token data available " + o0));
            return;
        }
        C11723c2 unused = C12038j.m48061f(C19500w0.m90846a(this), (CoroutineContext) null, (CoroutineStart) null, new CheckoutStep4ViewModel$initOrderConfirmation$1(this, o0, str2, (C11045c<? super CheckoutStep4ViewModel$initOrderConfirmation$1>) null), 3, (Object) null);
    }

    /* renamed from: r */
    public void mo74786r(@C12579k C19499w wVar, @C12580l Boolean bool) {
        Intrinsics.checkNotNullParameter(wVar, "owner");
        this.f63565g.mo57495q(wVar);
        super.mo74786r(wVar, bool);
    }
}
