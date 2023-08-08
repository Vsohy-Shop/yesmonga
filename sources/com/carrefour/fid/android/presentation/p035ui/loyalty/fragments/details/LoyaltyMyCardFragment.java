package com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.details;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import androidx.compose.runtime.internal.C8567o;
import androidx.fragment.app.C19232h;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.C19499w;
import androidx.lifecycle.C19501x;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.databinding.C36791p2;
import com.carrefour.fid.android.loyalty.presentation.viewmodels.details.LoyaltyMyCardViewModel;
import com.carrefour.fid.android.loyalty.presentation.viewmodels.details.mvi.LoyaltyMyCard;
import com.carrefour.fid.android.navigation.BottomNavActivity;
import com.carrefour.fid.android.presentation.components.toolbar.ToolBarDefaultView;
import com.carrefour.fid.android.shared.extension.ActivityKt;
import com.google.android.gms.analytics.ecommerce.C40383c;
import dagger.hilt.android.C10164b;
import kotlin.C10864b0;
import kotlin.C11076d0;
import kotlin.C11677z;
import kotlin.LazyThreadSafetyMode;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10164b
@C11076d0(mo22515d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\t\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\u0007H\u0002J\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0002R\u001b\u0010\u0013\u001a\u00020\u000e8BX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/ui/loyalty/fragments/details/LoyaltyMyCardFragment;", "Lcom/carrefour/fid/android/shared/base/o;", "Lcom/carrefour/fid/android/databinding/p2;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/d2;", "onViewCreated", "onDestroyView", "S0", "Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/details/mvi/LoyaltyMyCard$UIState;", "uiState", "T0", "Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/details/LoyaltyMyCardViewModel;", "f", "Lkotlin/z;", "R0", "()Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/details/LoyaltyMyCardViewModel;", "viewModel", "<init>", "()V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nLoyaltyMyCardFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoyaltyMyCardFragment.kt\ncom/carrefour/fid/android/presentation/ui/loyalty/fragments/details/LoyaltyMyCardFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 Fragment.kt\ncom/carrefour/fid/android/shared/extension/FragmentKt\n*L\n1#1,63:1\n106#2,15:64\n168#3,7:79\n*S KotlinDebug\n*F\n+ 1 LoyaltyMyCardFragment.kt\ncom/carrefour/fid/android/presentation/ui/loyalty/fragments/details/LoyaltyMyCardFragment\n*L\n22#1:64,15\n36#1:79,7\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.details.LoyaltyMyCardFragment */
public final class LoyaltyMyCardFragment extends C24473b<C36791p2> {

    /* renamed from: g */
    public static final int f60973g = 8;
    @C12579k

    /* renamed from: f */
    public final C11677z f60974f;

    public LoyaltyMyCardFragment() {
        super(C244661.f60975a);
        C11677z b = C10864b0.m38747b(LazyThreadSafetyMode.NONE, new LoyaltyMyCardFragment$special$$inlined$viewModels$default$2(new LoyaltyMyCardFragment$special$$inlined$viewModels$default$1(this)));
        this.f60974f = FragmentViewModelLazyKt.m89923h(this, C11342l0.m43547d(LoyaltyMyCardViewModel.class), new LoyaltyMyCardFragment$special$$inlined$viewModels$default$3(b), new LoyaltyMyCardFragment$special$$inlined$viewModels$default$4((C11289a) null, b), new LoyaltyMyCardFragment$special$$inlined$viewModels$default$5(this, b));
    }

    /* renamed from: R0 */
    public final LoyaltyMyCardViewModel mo71566R0() {
        return (LoyaltyMyCardViewModel) this.f60974f.getValue();
    }

    /* renamed from: S0 */
    public final void mo71567S0() {
        BottomNavActivity bottomNavActivity;
        C19232h activity = getActivity();
        if (activity instanceof BottomNavActivity) {
            bottomNavActivity = (BottomNavActivity) activity;
        } else {
            bottomNavActivity = null;
        }
        if (bottomNavActivity != null) {
            bottomNavActivity.mo121107M1().mo121278k0(R.string.loyalty_my_card);
            ToolBarDefaultView.setup$default(bottomNavActivity.mo121107M1(), (C11300l) null, LoyaltyMyCardFragment$initToolbar$1$1.f60980f, 1, (Object) null);
        }
    }

    /* renamed from: T0 */
    public final void mo71568T0(LoyaltyMyCard.UIState uIState) {
        ((C36791p2) getBinding()).f91480b.mo121240v(uIState.getCardNumber(), true);
    }

    public void onDestroyView() {
        super.onDestroyView();
        C19232h activity = getActivity();
        if (activity != null) {
            WindowManager.LayoutParams attributes = activity.getWindow().getAttributes();
            if (attributes != null) {
                attributes.screenBrightness = -1.0f;
            }
            activity.getWindow().setAttributes(attributes);
        }
    }

    public void onViewCreated(@C12579k View view, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        super.onViewCreated(view, bundle);
        C19232h activity = getActivity();
        if (activity != null) {
            ActivityKt.m118697g(activity);
            WindowManager.LayoutParams attributes = activity.getWindow().getAttributes();
            attributes.screenBrightness = 1.0f;
            activity.getWindow().setAttributes(attributes);
        }
        mo71567S0();
        LoyaltyMyCardViewModel R0 = mo71566R0();
        C19499w viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        C11723c2 unused = C12038j.m48061f(C19501x.m90847a(viewLifecycleOwner), (CoroutineContext) null, (CoroutineStart) null, new LoyaltyMyCardFragment$onViewCreated$$inlined$processState$1(this, R0, (C11045c) null, this), 3, (Object) null);
        mo71566R0().sendIntent(LoyaltyMyCard.UserAction.FetchLoyaltyCard.INSTANCE);
    }
}
