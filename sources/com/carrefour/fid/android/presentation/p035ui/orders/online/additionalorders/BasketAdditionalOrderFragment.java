package com.carrefour.fid.android.presentation.p035ui.orders.online.additionalorders;

import android.os.Bundle;
import android.view.View;
import androidx.annotation.C0324b1;
import androidx.compose.runtime.internal.C8553b;
import androidx.compose.runtime.internal.C8567o;
import androidx.core.p027os.C17779d;
import androidx.fragment.app.C19221c0;
import androidx.fragment.app.C19232h;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.C19499w;
import androidx.lifecycle.C19501x;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.navigation.C19758j0;
import androidx.navigation.C19766m;
import androidx.navigation.NavController;
import androidx.navigation.NavGraph;
import androidx.navigation.fragment.C19736g;
import androidx.navigation.fragment.NavHostFragment;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.app.extensions.FragmentExtensionKt;
import com.carrefour.fid.android.core.constants.C36170c;
import com.carrefour.fid.android.core.p057io.CheckoutPaymentResponseThrowable;
import com.carrefour.fid.android.databinding.C36839u0;
import com.carrefour.fid.android.design.components.widgets.StepBarView;
import com.carrefour.fid.android.design.components.widgets.counter.CountDownTimerComponent;
import com.carrefour.fid.android.presentation.p035ui.orders.online.additionalorders.analytics.C24979a;
import com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.BasketAdditionalOrderViewModel;
import com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.C26906e;
import com.carrefour.fid.android.shared.extension.ActivityKt;
import com.carrefour.fid.android.shared.extension.C28746b0;
import com.carrefour.fid.android.shared.extension.FragmentKt;
import com.carrefour.fid.android.shared.extension.ViewKt;
import com.contentsquare.android.api.C14092c;
import com.google.android.gms.analytics.ecommerce.C40383c;
import com.google.android.material.appbar.AppBarLayout;
import dagger.hilt.android.C10164b;
import javax.inject.Inject;
import kotlin.C10864b0;
import kotlin.C11076d0;
import kotlin.C11078d1;
import kotlin.C11677z;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10164b
@C11076d0(mo22515d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\bC\u0010DJ\u001a\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\n\u001a\u00020\bH\u0016J\u0018\u0010\u000e\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0006H\u0016J\b\u0010\u000f\u001a\u00020\bH\u0016J\u000e\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010J\u000e\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0013J\u000e\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0006J\u000e\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0018J\b\u0010\u001b\u001a\u00020\bH\u0002J\u0010\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002J\b\u0010\u001f\u001a\u00020\bH\u0002J\u0012\u0010\"\u001a\u00020\b2\b\b\u0003\u0010!\u001a\u00020 H\u0002J\b\u0010#\u001a\u00020\bH\u0002R\"\u0010+\u001a\u00020$8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001b\u00101\u001a\u00020,8BX\u0002¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u001b\u00107\u001a\u0002028BX\u0002¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0018\u0010;\u001a\u0004\u0018\u0001088\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010>\u001a\u00020\u00108\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0018\u0010B\u001a\u0004\u0018\u00010?8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b@\u0010A¨\u0006E"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/ui/orders/online/additionalorders/BasketAdditionalOrderFragment;", "Lcom/carrefour/fid/android/shared/base/o;", "Lcom/carrefour/fid/android/databinding/u0;", "Landroidx/fragment/app/c0;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/d2;", "onViewCreated", "onResume", "", "requestKey", "result", "p", "onDestroyView", "", "isExpend", "g1", "Lcom/carrefour/fid/android/design/components/widgets/StepBarView$STEP;", "step", "f1", "bundle", "a1", "Lcom/carrefour/fid/android/core/io/CheckoutPaymentResponseThrowable;", "throwable", "b1", "c1", "Lcom/carrefour/fid/android/presentation/viewmodels/order/online/additionalorders/mvi/e$a;", "event", "d1", "W0", "", "titleRes", "h1", "V0", "Lcom/carrefour/fid/android/presentation/ui/orders/online/additionalorders/analytics/a;", "f", "Lcom/carrefour/fid/android/presentation/ui/orders/online/additionalorders/analytics/a;", "X0", "()Lcom/carrefour/fid/android/presentation/ui/orders/online/additionalorders/analytics/a;", "e1", "(Lcom/carrefour/fid/android/presentation/ui/orders/online/additionalorders/analytics/a;)V", "basketAdditionalOrderAnalytics", "Lcom/carrefour/fid/android/presentation/viewmodels/order/online/additionalorders/BasketAdditionalOrderViewModel;", "g", "Lkotlin/z;", "Z0", "()Lcom/carrefour/fid/android/presentation/viewmodels/order/online/additionalorders/BasketAdditionalOrderViewModel;", "viewModel", "Lcom/carrefour/fid/android/presentation/ui/orders/online/additionalorders/i;", "v", "Landroidx/navigation/m;", "Y0", "()Lcom/carrefour/fid/android/presentation/ui/orders/online/additionalorders/i;", "navArg", "Landroidx/navigation/NavController;", "w", "Landroidx/navigation/NavController;", "navController", "x", "Z", "isExpended", "Landroidx/navigation/NavGraph;", "y", "Landroidx/navigation/NavGraph;", "navGraph", "<init>", "()V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nBasketAdditionalOrderFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasketAdditionalOrderFragment.kt\ncom/carrefour/fid/android/presentation/ui/orders/online/additionalorders/BasketAdditionalOrderFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 FragmentNavArgsLazy.kt\nandroidx/navigation/fragment/FragmentNavArgsLazyKt\n+ 4 Fragment.kt\ncom/carrefour/fid/android/shared/extension/FragmentKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,220:1\n106#2,15:221\n42#3,3:236\n183#4,6:239\n1#5:245\n*S KotlinDebug\n*F\n+ 1 BasketAdditionalOrderFragment.kt\ncom/carrefour/fid/android/presentation/ui/orders/online/additionalorders/BasketAdditionalOrderFragment\n*L\n55#1:221,15\n56#1:236,3\n71#1:239,6\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.additionalorders.BasketAdditionalOrderFragment */
public final class BasketAdditionalOrderFragment extends C25187q<C36839u0> implements C19221c0 {

    /* renamed from: z */
    public static final int f61764z = 8;
    @Inject

    /* renamed from: f */
    public C24979a f61765f;
    @C12579k

    /* renamed from: g */
    public final C11677z f61766g;
    @C12579k

    /* renamed from: v */
    public final C19766m f61767v = new C19766m(C11342l0.m43547d(C25175i.class), new BasketAdditionalOrderFragment$special$$inlined$navArgs$1(this));
    @C12580l

    /* renamed from: w */
    public NavController f61768w;

    /* renamed from: x */
    public boolean f61769x;
    @C12580l

    /* renamed from: y */
    public NavGraph f61770y;

    /* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.additionalorders.BasketAdditionalOrderFragment$a */
    public /* synthetic */ class C24958a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                com.carrefour.fid.android.design.components.widgets.StepBarView$STEP[] r0 = com.carrefour.fid.android.design.components.widgets.StepBarView.STEP.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.carrefour.fid.android.design.components.widgets.StepBarView$STEP r1 = com.carrefour.fid.android.design.components.widgets.StepBarView.STEP.STEP_ONE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.carrefour.fid.android.design.components.widgets.StepBarView$STEP r1 = com.carrefour.fid.android.design.components.widgets.StepBarView.STEP.STEP_TWO     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                com.carrefour.fid.android.design.components.widgets.StepBarView$STEP r1 = com.carrefour.fid.android.design.components.widgets.StepBarView.STEP.STEP_THREE     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.orders.online.additionalorders.BasketAdditionalOrderFragment.C24958a.<clinit>():void");
        }
    }

    public BasketAdditionalOrderFragment() {
        super(C249571.f61771a);
        C11677z b = C10864b0.m38747b(LazyThreadSafetyMode.NONE, new C24965xe57b8ad9(new C24964xe57b8ad8(this)));
        this.f61766g = FragmentViewModelLazyKt.m89923h(this, C11342l0.m43547d(BasketAdditionalOrderViewModel.class), new C24966xe57b8ada(b), new C24967xe57b8adb((C11289a) null, b), new C24968xe57b8adc(this, b));
    }

    /* renamed from: Q0 */
    public static final /* synthetic */ C36839u0 m108421Q0(BasketAdditionalOrderFragment basketAdditionalOrderFragment) {
        return (C36839u0) basketAdditionalOrderFragment.getBinding();
    }

    /* renamed from: i1 */
    public static /* synthetic */ void m108426i1(BasketAdditionalOrderFragment basketAdditionalOrderFragment, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = R.string.title_header_basket_additional_order;
        }
        basketAdditionalOrderFragment.mo72757h1(i);
    }

    /* renamed from: V0 */
    public final void mo72745V0() {
        NavHostFragment navHostFragment;
        NavController navController;
        NavController navController2;
        C19758j0 M;
        Fragment r0 = getChildFragmentManager().mo56900r0(R.id.fragment_basket_additional_order_container);
        NavGraph navGraph = null;
        if (r0 instanceof NavHostFragment) {
            navHostFragment = (NavHostFragment) r0;
        } else {
            navHostFragment = null;
        }
        if (navHostFragment != null) {
            navController = navHostFragment.mo58400k();
        } else {
            navController = null;
        }
        this.f61768w = navController;
        if (!(navController == null || (M = navController.mo58111M()) == null)) {
            navGraph = M.mo58438b(R.navigation.checkout_additional_order_graph);
        }
        this.f61770y = navGraph;
        if (navGraph != null) {
            navGraph.mo58283V0(R.id.checkoutStepOneAdditionalOrderFragment);
        }
        NavGraph navGraph2 = this.f61770y;
        if (navGraph2 != null && (navController2 = this.f61768w) != null) {
            navController2.mo58114N0(navGraph2, mo72748Y0().mo73160h());
        }
    }

    /* renamed from: W0 */
    public final void mo72746W0() {
        m108426i1(this, 0, 1, (Object) null);
        CountDownTimerComponent countDownTimerComponent = ((C36839u0) getBinding()).f91733h;
        countDownTimerComponent.mo113325B(30, new BasketAdditionalOrderFragment$bindUiView$1$1$1(this, countDownTimerComponent));
        countDownTimerComponent.setOnCancelTimerClickListener(new BasketAdditionalOrderFragment$bindUiView$1$1$2(this));
    }

    @C12579k
    /* renamed from: X0 */
    public final C24979a mo72747X0() {
        C24979a aVar = this.f61765f;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("basketAdditionalOrderAnalytics");
        return null;
    }

    /* renamed from: Y0 */
    public final C25175i mo72748Y0() {
        return (C25175i) this.f61767v.getValue();
    }

    /* renamed from: Z0 */
    public final BasketAdditionalOrderViewModel mo72749Z0() {
        return (BasketAdditionalOrderViewModel) this.f61766g.getValue();
    }

    /* renamed from: a1 */
    public final void mo72750a1(@C12579k Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        ((C36839u0) getBinding()).f91733h.mo113329x();
        FragmentKt.m118823k(this, C25177j.f62018a.mo73178a(bundle));
    }

    /* renamed from: b1 */
    public final void mo72751b1(@C12579k CheckoutPaymentResponseThrowable checkoutPaymentResponseThrowable) {
        Intrinsics.checkNotNullParameter(checkoutPaymentResponseThrowable, "throwable");
        FragmentKt.m118823k(this, C25177j.f62018a.mo73179c(C17779d.m81164b(C11078d1.m42659a(C36170c.f89279a, checkoutPaymentResponseThrowable.mo108357b()), C11078d1.m42659a(C36170c.f89281c, checkoutPaymentResponseThrowable.mo108358c()))));
    }

    /* renamed from: c1 */
    public final void mo72752c1() {
        NavController navController = this.f61768w;
        boolean z = false;
        if (navController != null && !navController.mo58156s0()) {
            z = true;
        }
        if (z) {
            C19736g.m91827a(this).mo58152q0();
        }
    }

    /* renamed from: d1 */
    public final void mo72753d1(C26906e.C26907a aVar) {
        if (Intrinsics.areEqual((Object) aVar, (Object) C26906e.C26907a.C26908a.f65559a)) {
            ((C36839u0) getBinding()).f91733h.mo113329x();
            FragmentKt.m118825m(this, mo72748Y0().mo73159g());
        } else if (Intrinsics.areEqual((Object) aVar, (Object) C26906e.C26907a.C26909b.f65561a)) {
            FragmentExtensionKt.m58754e(this);
        }
    }

    /* renamed from: e1 */
    public final void mo72754e1(@C12579k C24979a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.f61765f = aVar;
    }

    /* renamed from: f1 */
    public final void mo72755f1(@C12579k StepBarView.STEP step) {
        int i;
        Intrinsics.checkNotNullParameter(step, "step");
        int i2 = C24958a.$EnumSwitchMapping$0[step.ordinal()];
        if (i2 != 1) {
            i = R.string.title_header_checkout_additional_order;
            if (!(i2 == 2 || i2 == 3)) {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            i = R.string.title_header_basket_additional_order;
        }
        mo72757h1(i);
        ((C36839u0) getBinding()).f91732g.mo113178u(step);
    }

    /* renamed from: g1 */
    public final void mo72756g1(boolean z) {
        int i;
        C36839u0 u0Var = (C36839u0) getBinding();
        if (this.f61769x != z) {
            AppBarLayout appBarLayout = u0Var.f91727b;
            Intrinsics.checkNotNullExpressionValue(appBarLayout, "additionalOrderAppBar");
            C19499w viewLifecycleOwner = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
            LifecycleCoroutineScope a = C19501x.m90847a(viewLifecycleOwner);
            if (z) {
                i = 56;
            } else {
                i = C14092c.f34545P;
            }
            ViewKt.m119000m(appBarLayout, a, C28746b0.m119031b(i), 350, new BasketAdditionalOrderFragment$setExpandedAppBar$1$1(u0Var, this, z));
        }
    }

    /* renamed from: h1 */
    public final void mo72757h1(@C0324b1 int i) {
        ((C36839u0) getBinding()).f91728c.setContent(C8553b.m31049c(847738824, true, new BasketAdditionalOrderFragment$setHeader$1(i, this)));
    }

    public void onDestroyView() {
        this.f61768w = null;
        this.f61770y = null;
        super.onDestroyView();
    }

    public void onResume() {
        super.onResume();
        C19499w viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        C19501x.m90847a(viewLifecycleOwner).mo57477c(new BasketAdditionalOrderFragment$onResume$1(this, (C11045c<? super BasketAdditionalOrderFragment$onResume$1>) null));
    }

    public void onViewCreated(@C12579k View view, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        super.onViewCreated(view, bundle);
        FragmentKt.m118815c(this, new BasketAdditionalOrderFragment$onViewCreated$1(this));
        FragmentExtensionKt.m58757h(this);
        C19232h requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
        ActivityKt.m118697g(requireActivity);
        mo72746W0();
        mo72745V0();
        BasketAdditionalOrderViewModel Z0 = mo72749Z0();
        C19499w viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        C11723c2 unused = C12038j.m48061f(C19501x.m90847a(viewLifecycleOwner), (CoroutineContext) null, (CoroutineStart) null, new C24959x44d74d62(this, Z0, (C11045c) null, this), 3, (Object) null);
        requireActivity().mo57175g0().mo56861b(AdditionalOrderFragment.f61744Y, this, this);
        mo72747X0().sendScreenView();
    }

    /* renamed from: p */
    public void mo32757p(@C12579k String str, @C12579k Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "requestKey");
        Intrinsics.checkNotNullParameter(bundle, "result");
        if (bundle.getBoolean(ExitAdditionalOrderBottomSheetFragment.f61778v, false) || bundle.getBoolean(ExpiredAdditionalOrderBottomSheetFragment.f61783c, false)) {
            requireActivity().mo57175g0().mo56865c(AdditionalOrderFragment.f61744Y);
            mo72749Z0().sendIntent(C26906e.C26913c.C26915b.f65567a);
        }
    }
}
