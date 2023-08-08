package com.carrefour.fid.android.presentation.p035ui.checkout.p036al;

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
import com.carrefour.fid.android.databinding.C36740k1;
import com.carrefour.fid.android.design.components.extension.ViewKt;
import com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.C26007d;
import com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.CheckoutStep1MVIViewModel;
import com.carrefour.fid.android.shared.extension.BottomSheetBehaviorKt;
import com.google.android.gms.analytics.ecommerce.C40383c;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import dagger.hilt.android.C10164b;
import javax.inject.Inject;
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
@C11076d0(mo22515d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 !2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\"B\u0007¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\t\u001a\u00020\u0007H\u0002J\b\u0010\n\u001a\u00020\u0007H\u0002J\b\u0010\u000b\u001a\u00020\u0007H\u0002R\u001e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\"\u0010\u0018\u001a\u00020\u00118\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001e\u001a\u00020\u00198BX\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006#"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/ui/checkout/al/CheckoutStep1FooterFragment;", "Lcom/carrefour/fid/android/shared/base/o;", "Lcom/carrefour/fid/android/databinding/k1;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/d2;", "onViewCreated", "X0", "initListener", "V0", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "Landroid/view/ViewGroup;", "f", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "bottomSheetBehavior", "Lcom/carrefour/fid/android/presentation/viewmodels/checkout/al/d;", "g", "Lcom/carrefour/fid/android/presentation/viewmodels/checkout/al/d;", "T0", "()Lcom/carrefour/fid/android/presentation/viewmodels/checkout/al/d;", "Z0", "(Lcom/carrefour/fid/android/presentation/viewmodels/checkout/al/d;)V", "analyticsViewModel", "Lcom/carrefour/fid/android/presentation/viewmodels/checkout/al/CheckoutStep1MVIViewModel;", "v", "Lkotlin/z;", "U0", "()Lcom/carrefour/fid/android/presentation/viewmodels/checkout/al/CheckoutStep1MVIViewModel;", "viewModel", "<init>", "()V", "w", "a", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nCheckoutStep1FooterFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CheckoutStep1FooterFragment.kt\ncom/carrefour/fid/android/presentation/ui/checkout/al/CheckoutStep1FooterFragment\n+ 2 HiltNavGraphViewModelLazy.kt\nandroidx/hilt/navigation/fragment/HiltNavGraphViewModelLazyKt\n*L\n1#1,110:1\n48#2,9:111\n*S KotlinDebug\n*F\n+ 1 CheckoutStep1FooterFragment.kt\ncom/carrefour/fid/android/presentation/ui/checkout/al/CheckoutStep1FooterFragment\n*L\n50#1:111,9\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.al.CheckoutStep1FooterFragment */
public final class CheckoutStep1FooterFragment extends C23439y<C36740k1> {
    @C12579k

    /* renamed from: w */
    public static final C23250a f58962w = new C23250a((DefaultConstructorMarker) null);

    /* renamed from: x */
    public static final int f58963x = 8;
    @C12579k

    /* renamed from: y */
    public static final String f58964y = "CheckoutStep1FooterFragment";
    @C12580l

    /* renamed from: f */
    public BottomSheetBehavior<ViewGroup> f58965f;
    @Inject

    /* renamed from: g */
    public C26007d f58966g;
    @C12579k

    /* renamed from: v */
    public final C11677z f58967v;

    /* renamed from: com.carrefour.fid.android.presentation.ui.checkout.al.CheckoutStep1FooterFragment$a */
    public static final class C23250a {
        public /* synthetic */ C23250a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        @C11384m
        /* renamed from: a */
        public final CheckoutStep1FooterFragment mo68130a() {
            return new CheckoutStep1FooterFragment();
        }

        public C23250a() {
        }
    }

    public CheckoutStep1FooterFragment() {
        super(C232491.f58968a);
        C11677z c = C10864b0.m38748c(new C23251x8feb3c28(this, R.id.basket_graph));
        this.f58967v = FragmentViewModelLazyKt.m89922g(this, C11342l0.m43547d(CheckoutStep1MVIViewModel.class), new C23252x8feb3c29(c, (C11510n) null), new C23253x8feb3c2a(this, c, (C11510n) null));
    }

    /* renamed from: W0 */
    public static final void m103936W0(CheckoutStep1FooterFragment checkoutStep1FooterFragment, View view) {
        Intrinsics.checkNotNullParameter(checkoutStep1FooterFragment, "this$0");
        checkoutStep1FooterFragment.mo68125V0();
    }

    @C12579k
    @C11384m
    /* renamed from: Y0 */
    public static final CheckoutStep1FooterFragment m103937Y0() {
        return f58962w.mo68130a();
    }

    @C12579k
    /* renamed from: T0 */
    public final C26007d mo68123T0() {
        C26007d dVar = this.f58966g;
        if (dVar != null) {
            return dVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("analyticsViewModel");
        return null;
    }

    /* renamed from: U0 */
    public final CheckoutStep1MVIViewModel mo68124U0() {
        return (CheckoutStep1MVIViewModel) this.f58967v.getValue();
    }

    /* renamed from: V0 */
    public final void mo68125V0() {
        BottomSheetBehavior<ViewGroup> bottomSheetBehavior = this.f58965f;
        if (bottomSheetBehavior != null) {
            int i = 3;
            if (bottomSheetBehavior.mo88454u0() == 3) {
                i = 4;
            }
            bottomSheetBehavior.mo88418W0(i);
        }
    }

    /* renamed from: X0 */
    public final void mo68126X0() {
        C11907e c;
        BottomSheetBehavior<ViewGroup> bottomSheetBehavior = this.f58965f;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.mo88418W0(4);
        }
        ConstraintLayout constraintLayout = ((C36740k1) getBinding()).f91116c;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "binding.viewBasketFooter");
        String string = getString(R.string.accessibility_action_reduce_deploy);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.acces…ity_action_reduce_deploy)");
        ViewKt.m152130l(constraintLayout, (String) null, string, 1, (Object) null);
        BottomSheetBehavior<ViewGroup> bottomSheetBehavior2 = this.f58965f;
        if (bottomSheetBehavior2 != null && (c = BottomSheetBehaviorKt.m118742c(bottomSheetBehavior2, (C11300l) null, 1, (Object) null)) != null) {
            C19499w viewLifecycleOwner = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
            C11909g.m47412V0(c, C19501x.m90847a(viewLifecycleOwner));
        }
    }

    /* renamed from: Z0 */
    public final void mo68127Z0(@C12579k C26007d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<set-?>");
        this.f58966g = dVar;
    }

    public final void initListener() {
        ((C36740k1) getBinding()).f91116c.setOnClickListener(new C23360e(this));
    }

    public void onViewCreated(@C12579k View view, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        super.onViewCreated(view, bundle);
        ((C36740k1) getBinding()).f91115b.setContent(C8553b.m31049c(1094632298, true, new CheckoutStep1FooterFragment$onViewCreated$1(this)));
        ConstraintLayout constraintLayout = ((C36740k1) getBinding()).f91116c;
        Intrinsics.checkNotNull(constraintLayout, "null cannot be cast to non-null type android.view.ViewGroup");
        this.f58965f = BottomSheetBehavior.m125237i0(constraintLayout);
        mo68126X0();
        initListener();
    }
}
