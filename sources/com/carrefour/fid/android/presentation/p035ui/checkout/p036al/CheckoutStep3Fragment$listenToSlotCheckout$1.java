package com.carrefour.fid.android.presentation.p035ui.checkout.p036al;

import androidx.lifecycle.C19423g0;
import androidx.lifecycle.C19456p0;
import androidx.lifecycle.FlowLiveDataConversions;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.fragment.C19736g;
import com.carrefour.fid.android.domain.models.basket.Basket;
import com.carrefour.fid.android.domain.models.slot.BasketSlotBooked;
import com.carrefour.fid.android.domain.models.slot.BasketSlotBookedMessageType;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11908f;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.ui.checkout.al.CheckoutStep3Fragment$listenToSlotCheckout$1", mo22502f = "CheckoutStep3Fragment.kt", mo22503i = {}, mo22504l = {44}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.al.CheckoutStep3Fragment$listenToSlotCheckout$1 */
public final class CheckoutStep3Fragment$listenToSlotCheckout$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    int label;
    final /* synthetic */ CheckoutStep3Fragment this$0;

    /* renamed from: com.carrefour.fid.android.presentation.ui.checkout.al.CheckoutStep3Fragment$listenToSlotCheckout$1$a */
    public static final class C23305a implements C11908f<BasketSlotBooked> {

        /* renamed from: a */
        public final /* synthetic */ C19456p0 f59024a;

        /* renamed from: b */
        public final /* synthetic */ CheckoutStep3Fragment f59025b;

        public C23305a(C19456p0 p0Var, CheckoutStep3Fragment checkoutStep3Fragment) {
            this.f59024a = p0Var;
            this.f59025b = checkoutStep3Fragment;
        }

        @C12580l
        /* renamed from: c */
        public final Object emit(BasketSlotBooked basketSlotBooked, @C12579k C11045c<? super C11079d2> cVar) {
            this.f59024a.mo57654n("KEY_BASKET_SLOT_BOOKED");
            Basket f = basketSlotBooked.mo119440f();
            BasketSlotBookedMessageType g = basketSlotBooked.mo119441g();
            if (f == null || g == null) {
                return C11079d2.f28267a;
            }
            Object u0 = this.f59025b.mo68248O0().mo75844u0(basketSlotBooked.mo119442h(), f, g, this.f59025b.mo68246M0().mo68496k(), cVar);
            if (u0 == C11063b.m42612h()) {
                return u0;
            }
            return C11079d2.f28267a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CheckoutStep3Fragment$listenToSlotCheckout$1(CheckoutStep3Fragment checkoutStep3Fragment, C11045c<? super CheckoutStep3Fragment$listenToSlotCheckout$1> cVar) {
        super(2, cVar);
        this.this$0 = checkoutStep3Fragment;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new CheckoutStep3Fragment$listenToSlotCheckout$1(this.this$0, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        C19456p0 p0Var;
        C19423g0 i;
        C11907e a;
        Object h = C11063b.m42612h();
        int i2 = this.label;
        if (i2 == 0) {
            C11661u0.m45747n(obj);
            NavBackStackEntry G = C19736g.m91827a(this.this$0).mo58099G();
            if (G != null) {
                p0Var = G.mo58069i();
            } else {
                p0Var = null;
            }
            if (!(p0Var == null || (i = p0Var.mo57649i("KEY_BASKET_SLOT_BOOKED")) == null || (a = FlowLiveDataConversions.m90501a(i)) == null)) {
                C23305a aVar = new C23305a(p0Var, this.this$0);
                this.label = 1;
                if (a.collect(aVar, this) == h) {
                    return h;
                }
            }
        } else if (i2 == 1) {
            C11661u0.m45747n(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C11079d2.f28267a;
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((CheckoutStep3Fragment$listenToSlotCheckout$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
