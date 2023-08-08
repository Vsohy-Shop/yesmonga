package com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.create;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.internal.C8567o;
import androidx.fragment.app.C19232h;
import androidx.fragment.app.Fragment;
import androidx.navigation.C19758j0;
import androidx.navigation.C19766m;
import androidx.navigation.NavController;
import androidx.navigation.NavGraph;
import androidx.navigation.fragment.C19736g;
import androidx.navigation.fragment.NavHostFragment;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.databinding.C36641a2;
import com.carrefour.fid.android.design.components.widgets.NotificationComponent;
import com.carrefour.fid.android.navigation.BottomNavActivity;
import com.carrefour.fid.android.presentation.components.toolbar.ToolBarDefaultView;
import com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.bonus.LoyaltyBonusListFragment;
import com.carrefour.fid.android.shared.extension.FragmentKt;
import com.carrefour.fid.android.various.core.utils.contentsquare.C22757a;
import com.carrefour.fid.android.widget.StepBarView;
import com.google.android.gms.analytics.ecommerce.C40383c;
import dagger.hilt.android.C10164b;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10164b
@C11076d0(mo22515d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b.\u0010/J\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\t\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\u0007H\u0016J\b\u0010\u000b\u001a\u00020\u0007H\u0016J\u0010\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\fJ\u000e\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000fJ\u000e\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\fJ\u000e\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\fJ\u000e\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\fJ\u000e\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0018J\b\u0010\u001b\u001a\u00020\u0007H\u0002J\b\u0010\u001c\u001a\u00020\u0007H\u0002J\b\u0010\u001d\u001a\u00020\u0007H\u0002J\b\u0010\u001e\u001a\u00020\u0007H\u0002J\b\u0010\u001f\u001a\u00020\u0007H\u0002R\u001b\u0010%\u001a\u00020 8BX\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0018\u0010)\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010-\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b+\u0010,¨\u00060"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/ui/loyalty/fragments/create/CreateSecretCodeFragment;", "Lcom/carrefour/fid/android/shared/base/o;", "Lcom/carrefour/fid/android/databinding/a2;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/d2;", "onViewCreated", "onResume", "onPause", "onDestroyView", "", "showSnackbar", "V0", "Lcom/carrefour/fid/android/widget/StepBarView$STEP;", "step", "b1", "showStep", "Z0", "showBackButton", "Y0", "showToolbar", "a1", "", "title", "c1", "X0", "initUi", "U0", "T0", "initListeners", "Lcom/carrefour/fid/android/presentation/ui/loyalty/fragments/create/p;", "f", "Landroidx/navigation/m;", "S0", "()Lcom/carrefour/fid/android/presentation/ui/loyalty/fragments/create/p;", "args", "Landroidx/navigation/NavController;", "g", "Landroidx/navigation/NavController;", "navController", "Landroidx/navigation/NavGraph;", "v", "Landroidx/navigation/NavGraph;", "navGraph", "<init>", "()V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nCreateSecretCodeFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CreateSecretCodeFragment.kt\ncom/carrefour/fid/android/presentation/ui/loyalty/fragments/create/CreateSecretCodeFragment\n+ 2 FragmentNavArgsLazy.kt\nandroidx/navigation/fragment/FragmentNavArgsLazyKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,140:1\n42#2,3:141\n1#3:144\n*S KotlinDebug\n*F\n+ 1 CreateSecretCodeFragment.kt\ncom/carrefour/fid/android/presentation/ui/loyalty/fragments/create/CreateSecretCodeFragment\n*L\n31#1:141,3\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.CreateSecretCodeFragment */
public final class CreateSecretCodeFragment extends C24435w<C36641a2> {

    /* renamed from: w */
    public static final int f60798w = 8;
    @C12579k

    /* renamed from: f */
    public final C19766m f60799f = new C19766m(C11342l0.m43547d(C24426p.class), new CreateSecretCodeFragment$special$$inlined$navArgs$1(this));
    @C12580l

    /* renamed from: g */
    public NavController f60800g;
    @C12580l

    /* renamed from: v */
    public NavGraph f60801v;

    public CreateSecretCodeFragment() {
        super(C243611.f60802a);
    }

    /* renamed from: W0 */
    public static /* synthetic */ void m106953W0(CreateSecretCodeFragment createSecretCodeFragment, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        createSecretCodeFragment.mo71217V0(z);
    }

    /* renamed from: S0 */
    public final C24426p mo71214S0() {
        return (C24426p) this.f60799f.getValue();
    }

    /* renamed from: T0 */
    public final void mo71215T0() {
        FragmentKt.m118823k(this, C24428q.f60914a.mo71470a());
    }

    /* renamed from: U0 */
    public final void mo71216U0() {
        boolean z;
        Fragment r0 = getChildFragmentManager().mo56900r0(R.id.frame_container_attach_card);
        boolean z2 = true;
        if (r0 instanceof SuccessCreateCardFragment) {
            z = true;
        } else {
            z = r0 instanceof LoyaltyBonusListFragment;
        }
        if (z) {
            m106953W0(this, false, 1, (Object) null);
        } else {
            NavController navController = this.f60800g;
            if (navController == null || !navController.mo58156s0()) {
                z2 = false;
            }
            if (z2) {
                return;
            }
        }
        C19736g.m91827a(this).mo58152q0();
    }

    /* renamed from: V0 */
    public final void mo71217V0(boolean z) {
        if (mo71214S0().mo71464i()) {
            String string = getString(R.string.general_external_link_popup_title);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.gener…xternal_link_popup_title)");
            String string2 = getString(R.string.cagnote_mise_a_jour);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.cagnote_mise_a_jour)");
            FragmentKt.m118838z(this, string, string2, (String) null, (C11289a) null, getString(R.string.loyalty_success_create_card_button), false, new CreateSecretCodeFragment$handleResult$1(this), (String) null, (C11289a) null, (C11289a) null, (Drawable) null, 0, 4012, (Object) null);
            return;
        }
        if (z) {
            NotificationComponent.Variant variant = NotificationComponent.Variant.ERROR;
            String string3 = getString(R.string.loyalty_init_secret_code_error);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(R.string.loyalty_init_secret_code_error)");
            FragmentKt.m118811B(this, variant, string3, (String) null, (String) null, (C11289a) null, false, false, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 2044, (Object) null);
        }
        mo71215T0();
    }

    /* renamed from: X0 */
    public final void mo71218X0() {
        NavHostFragment navHostFragment;
        NavController navController;
        NavController navController2;
        C19758j0 M;
        Fragment r0 = getChildFragmentManager().mo56900r0(R.id.frame_container_attach_card);
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
        this.f60800g = navController;
        if (!(navController == null || (M = navController.mo58111M()) == null)) {
            navGraph = M.mo58438b(R.navigation.loyalty_create_code_graph);
        }
        this.f60801v = navGraph;
        if (navGraph != null) {
            navGraph.mo58283V0(R.id.createLoyaltyCardStepOne);
        }
        NavGraph navGraph2 = this.f60801v;
        if (navGraph2 != null && (navController2 = this.f60800g) != null) {
            navController2.mo58114N0(navGraph2, mo71214S0().mo71465j());
        }
    }

    /* renamed from: Y0 */
    public final void mo71219Y0(boolean z) {
        ToolBarDefaultView M1;
        C19232h activity = getActivity();
        BottomNavActivity bottomNavActivity = activity instanceof BottomNavActivity ? (BottomNavActivity) activity : null;
        if (bottomNavActivity != null && (M1 = bottomNavActivity.mo121107M1()) != null) {
            ToolBarDefaultView.m158944r0(M1, z, (C11300l) null, false, 6, (Object) null);
        }
    }

    /* renamed from: Z0 */
    public final void mo71220Z0(boolean z) {
        ((C36641a2) getBinding()).f90550b.setVisibility(z ? 0 : 8);
    }

    /* renamed from: a1 */
    public final void mo71221a1(boolean z) {
        ((C36641a2) getBinding()).f90551c.setVisibility(z ? 0 : 8);
    }

    /* renamed from: b1 */
    public final void mo71222b1(@C12579k StepBarView.STEP step) {
        Intrinsics.checkNotNullParameter(step, "step");
        ((C36641a2) getBinding()).f90550b.mo67300v(step);
    }

    /* renamed from: c1 */
    public final void mo71223c1(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "title");
        ((C36641a2) getBinding()).f90551c.setLabelText(str);
    }

    public final void initListeners() {
        ((C36641a2) getBinding()).f90551c.setOnIconLeftClickListener(new CreateSecretCodeFragment$initListeners$1(this));
    }

    public final void initUi() {
        BottomNavActivity bottomNavActivity;
        C19232h activity = getActivity();
        ToolBarDefaultView toolBarDefaultView = null;
        if (activity instanceof BottomNavActivity) {
            bottomNavActivity = (BottomNavActivity) activity;
        } else {
            bottomNavActivity = null;
        }
        if (bottomNavActivity != null) {
            toolBarDefaultView = bottomNavActivity.mo121107M1();
        }
        if (toolBarDefaultView != null) {
            toolBarDefaultView.setVisibility(8);
        }
        ((C36641a2) getBinding()).f90550b.setVisibility(0);
    }

    public void onDestroyView() {
        this.f60800g = null;
        this.f60801v = null;
        super.onDestroyView();
    }

    public void onPause() {
        FragmentKt.m118832t(this);
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        FragmentKt.m118814b(this);
    }

    public void onViewCreated(@C12579k View view, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        super.onViewCreated(view, bundle);
        FragmentKt.m118815c(this, new CreateSecretCodeFragment$onViewCreated$1(this));
        mo71218X0();
        initUi();
        initListeners();
        C22757a.m102929c(false);
    }
}
