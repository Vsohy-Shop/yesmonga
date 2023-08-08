package com.carrefour.fid.android.presentation.p035ui.orders.online.additionalorders.checkout;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.C8553b;
import androidx.compose.runtime.internal.C8567o;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.C19499w;
import androidx.lifecycle.C19501x;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.databinding.C36810r1;
import com.carrefour.fid.android.design.components.extension.ViewKt;
import com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutStepOneAdditionalOrderViewModel;
import com.carrefour.fid.android.shared.extension.BottomSheetBehaviorKt;
import com.google.android.gms.analytics.ecommerce.C40383c;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import dagger.hilt.android.C10164b;
import kotlin.C10864b0;
import kotlin.C11076d0;
import kotlin.C11677z;
import kotlin.jvm.C11384m;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.C11510n;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11909g;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10164b
@C11076d0(mo22515d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\t\u001a\u00020\u0007H\u0002J\b\u0010\n\u001a\u00020\u0007H\u0002J\b\u0010\u000b\u001a\u00020\u0007H\u0002R\u001b\u0010\u0011\u001a\u00020\f8BX\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00128\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u001b"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/ui/orders/online/additionalorders/checkout/CheckoutStepOneBottomSheetFragment;", "Lcom/carrefour/fid/android/shared/base/o;", "Lcom/carrefour/fid/android/databinding/r1;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/d2;", "onViewCreated", "W0", "initListener", "U0", "Lcom/carrefour/fid/android/presentation/viewmodels/order/online/additionalorders/checkout/CheckoutStepOneAdditionalOrderViewModel;", "f", "Lkotlin/z;", "T0", "()Lcom/carrefour/fid/android/presentation/viewmodels/order/online/additionalorders/checkout/CheckoutStepOneAdditionalOrderViewModel;", "viewModel", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "Landroid/view/ViewGroup;", "g", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "bottomSheetBehavior", "<init>", "()V", "v", "a", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nCheckoutStepOneBottomSheetFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CheckoutStepOneBottomSheetFragment.kt\ncom/carrefour/fid/android/presentation/ui/orders/online/additionalorders/checkout/CheckoutStepOneBottomSheetFragment\n+ 2 HiltNavGraphViewModelLazy.kt\nandroidx/hilt/navigation/fragment/HiltNavGraphViewModelLazyKt\n*L\n1#1,96:1\n48#2,9:97\n*S KotlinDebug\n*F\n+ 1 CheckoutStepOneBottomSheetFragment.kt\ncom/carrefour/fid/android/presentation/ui/orders/online/additionalorders/checkout/CheckoutStepOneBottomSheetFragment\n*L\n43#1:97,9\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.additionalorders.checkout.CheckoutStepOneBottomSheetFragment */
public final class CheckoutStepOneBottomSheetFragment extends C25150q0<C36810r1> {
    @C12579k

    /* renamed from: v */
    public static final C25060a f61867v = new C25060a((DefaultConstructorMarker) null);

    /* renamed from: w */
    public static final int f61868w = 8;
    @C12579k

    /* renamed from: x */
    public static final String f61869x = "CheckoutStepOneBottomSheetFragment";
    @C12579k

    /* renamed from: f */
    public final C11677z f61870f;
    @C12580l

    /* renamed from: g */
    public BottomSheetBehavior<ViewGroup> f61871g;

    /* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.additionalorders.checkout.CheckoutStepOneBottomSheetFragment$a */
    public static final class C25060a {
        public /* synthetic */ C25060a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        @C11384m
        /* renamed from: a */
        public final CheckoutStepOneBottomSheetFragment mo72914a() {
            return new CheckoutStepOneBottomSheetFragment();
        }

        public C25060a() {
        }
    }

    public CheckoutStepOneBottomSheetFragment() {
        super(C250591.f61872a);
        C11677z c = C10864b0.m38748c(new C25061xa33bf0ae(this, R.id.checkout_additional_order_graph));
        this.f61870f = FragmentViewModelLazyKt.m89922g(this, C11342l0.m43547d(CheckoutStepOneAdditionalOrderViewModel.class), new C25062xa33bf0af(c, (C11510n) null), new C25063xa33bf0b0(this, c, (C11510n) null));
    }

    /* renamed from: V0 */
    public static final void m108619V0(CheckoutStepOneBottomSheetFragment checkoutStepOneBottomSheetFragment, View view) {
        Intrinsics.checkNotNullParameter(checkoutStepOneBottomSheetFragment, "this$0");
        checkoutStepOneBottomSheetFragment.mo72910U0();
    }

    @C12579k
    @C11384m
    /* renamed from: X0 */
    public static final CheckoutStepOneBottomSheetFragment m108620X0() {
        return f61867v.mo72914a();
    }

    /* renamed from: T0 */
    public final CheckoutStepOneAdditionalOrderViewModel mo72909T0() {
        return (CheckoutStepOneAdditionalOrderViewModel) this.f61870f.getValue();
    }

    /* renamed from: U0 */
    public final void mo72910U0() {
        BottomSheetBehavior<ViewGroup> bottomSheetBehavior = this.f61871g;
        if (bottomSheetBehavior != null) {
            int i = 3;
            if (bottomSheetBehavior.mo88454u0() == 3) {
                i = 4;
            }
            bottomSheetBehavior.mo88418W0(i);
        }
    }

    /* renamed from: W0 */
    public final void mo72911W0() {
        C11907e c;
        BottomSheetBehavior<ViewGroup> bottomSheetBehavior = this.f61871g;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.mo88418W0(4);
        }
        ConstraintLayout constraintLayout = ((C36810r1) getBinding()).f91562c;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "binding.viewBasketFooter");
        String string = getString(R.string.accessibility_action_reduce_deploy);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.acces…ity_action_reduce_deploy)");
        ViewKt.m152130l(constraintLayout, (String) null, string, 1, (Object) null);
        BottomSheetBehavior<ViewGroup> bottomSheetBehavior2 = this.f61871g;
        if (bottomSheetBehavior2 != null && (c = BottomSheetBehaviorKt.m118742c(bottomSheetBehavior2, (C11300l) null, 1, (Object) null)) != null) {
            C19499w viewLifecycleOwner = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
            C11909g.m47412V0(c, C19501x.m90847a(viewLifecycleOwner));
        }
    }

    public final void initListener() {
        ((C36810r1) getBinding()).f91562c.setOnClickListener(new C25161w(this));
    }

    public void onViewCreated(@C12579k View view, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        super.onViewCreated(view, bundle);
        ((C36810r1) getBinding()).f91561b.setContent(C8553b.m31049c(-216484067, true, new CheckoutStepOneBottomSheetFragment$onViewCreated$1(this)));
        ConstraintLayout constraintLayout = ((C36810r1) getBinding()).f91562c;
        Intrinsics.checkNotNull(constraintLayout, "null cannot be cast to non-null type android.view.ViewGroup");
        this.f61871g = BottomSheetBehavior.m125237i0(constraintLayout);
        mo72911W0();
        initListener();
    }
}
