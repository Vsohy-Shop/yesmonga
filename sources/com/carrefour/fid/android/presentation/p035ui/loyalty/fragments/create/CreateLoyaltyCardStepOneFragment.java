package com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.create;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.p004ui.platform.ComposeView;
import androidx.compose.runtime.internal.C8553b;
import androidx.compose.runtime.internal.C8567o;
import androidx.fragment.app.C19232h;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.C19501x;
import androidx.navigation.C19766m;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.core.extension.FragmentKt;
import com.carrefour.fid.android.loyalty.presentation.viewmodels.create.InitLoyaltyCardViewModel;
import com.carrefour.fid.android.shared.extension.ActivityKt;
import com.carrefour.fid.android.widget.StepBarView;
import com.google.android.gms.analytics.ecommerce.C40383c;
import dagger.hilt.android.C10164b;
import kotlin.C10864b0;
import kotlin.C11076d0;
import kotlin.C11677z;
import kotlin.coroutines.C11045c;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.C11510n;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10164b
@C11076d0(mo22515d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ&\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\r\u001a\u00020\u000bH\u0002R\u001b\u0010\u0013\u001a\u00020\u000e8BX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0019\u001a\u00020\u00148BX\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/ui/loyalty/fragments/create/CreateLoyaltyCardStepOneFragment;", "Lcom/carrefour/fid/android/shared/base/q;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "view", "Lkotlin/d2;", "onViewCreated", "M0", "Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/create/InitLoyaltyCardViewModel;", "f", "Lkotlin/z;", "L0", "()Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/create/InitLoyaltyCardViewModel;", "viewModel", "Lcom/carrefour/fid/android/presentation/ui/loyalty/fragments/create/d;", "g", "Landroidx/navigation/m;", "K0", "()Lcom/carrefour/fid/android/presentation/ui/loyalty/fragments/create/d;", "args", "<init>", "()V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nCreateLoyaltyCardStepOneFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CreateLoyaltyCardStepOneFragment.kt\ncom/carrefour/fid/android/presentation/ui/loyalty/fragments/create/CreateLoyaltyCardStepOneFragment\n+ 2 HiltNavGraphViewModelLazy.kt\nandroidx/hilt/navigation/fragment/HiltNavGraphViewModelLazyKt\n+ 3 FragmentNavArgsLazy.kt\nandroidx/navigation/fragment/FragmentNavArgsLazyKt\n*L\n1#1,82:1\n48#2,9:83\n42#3,3:92\n*S KotlinDebug\n*F\n+ 1 CreateLoyaltyCardStepOneFragment.kt\ncom/carrefour/fid/android/presentation/ui/loyalty/fragments/create/CreateLoyaltyCardStepOneFragment\n*L\n27#1:83,9\n28#1:92,3\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.CreateLoyaltyCardStepOneFragment */
public final class CreateLoyaltyCardStepOneFragment extends C24432t {

    /* renamed from: v */
    public static final int f60773v = 8;
    @C12579k

    /* renamed from: f */
    public final C11677z f60774f;
    @C12579k

    /* renamed from: g */
    public final C19766m f60775g = new C19766m(C11342l0.m43547d(C24404d.class), new CreateLoyaltyCardStepOneFragment$special$$inlined$navArgs$1(this));

    public CreateLoyaltyCardStepOneFragment() {
        C11677z c = C10864b0.m38748c(new C24334xec3fbee(this, R.id.loyalty_create_code_graph));
        this.f60774f = FragmentViewModelLazyKt.m89922g(this, C11342l0.m43547d(InitLoyaltyCardViewModel.class), new C24335xec3fbef(c, (C11510n) null), new C24336xec3fbf0(this, c, (C11510n) null));
    }

    /* renamed from: K0 */
    public final C24404d mo71173K0() {
        return (C24404d) this.f60775g.getValue();
    }

    /* renamed from: L0 */
    public final InitLoyaltyCardViewModel mo71174L0() {
        return (InitLoyaltyCardViewModel) this.f60774f.getValue();
    }

    /* renamed from: M0 */
    public final void mo71175M0() {
        CreateSecretCodeFragment createSecretCodeFragment = (CreateSecretCodeFragment) FragmentKt.m148916b(this, CreateSecretCodeFragment.class);
        if (createSecretCodeFragment != null) {
            createSecretCodeFragment.mo71219Y0(true);
            createSecretCodeFragment.mo71220Z0(true);
            createSecretCodeFragment.mo71221a1(true);
            createSecretCodeFragment.mo71222b1(StepBarView.STEP.STEP_ONE);
            if (mo71173K0().mo71381g()) {
                String string = createSecretCodeFragment.getString(R.string.loyalty_activate_card_title);
                Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.loyalty_activate_card_title)");
                createSecretCodeFragment.mo71223c1(string);
                mo71174L0().trackScreenActivateCard();
                return;
            }
            mo71174L0().sendScreenViewCreateSecretCode();
            String string2 = createSecretCodeFragment.getString(R.string.loyalty_create_card_title);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.loyalty_create_card_title)");
            createSecretCodeFragment.mo71223c1(string2);
        }
    }

    @C12580l
    public View onCreateView(@C12579k LayoutInflater layoutInflater, @C12580l ViewGroup viewGroup, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        C19501x.m90847a(this).mo57476b(new CreateLoyaltyCardStepOneFragment$onCreateView$1(this, (C11045c<? super CreateLoyaltyCardStepOneFragment$onCreateView$1>) null));
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
        ComposeView composeView = new ComposeView(requireContext, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        composeView.setContent(C8553b.m31049c(-1190945977, true, new CreateLoyaltyCardStepOneFragment$onCreateView$2$1(this)));
        return composeView;
    }

    public void onViewCreated(@C12579k View view, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        super.onViewCreated(view, bundle);
        C19232h activity = getActivity();
        if (activity != null) {
            ActivityKt.m118697g(activity);
        }
        mo71175M0();
    }
}
