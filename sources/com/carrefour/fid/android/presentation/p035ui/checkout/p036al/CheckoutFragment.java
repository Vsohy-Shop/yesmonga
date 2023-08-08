package com.carrefour.fid.android.presentation.p035ui.checkout.p036al;

import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.internal.C8567o;
import androidx.fragment.app.C19232h;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C19426h0;
import androidx.lifecycle.C19499w;
import androidx.navigation.C19758j0;
import androidx.navigation.C19766m;
import androidx.navigation.NavController;
import androidx.navigation.NavGraph;
import androidx.navigation.fragment.C19736g;
import androidx.navigation.fragment.NavHostFragment;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.app.extensions.FragmentExtensionKt;
import com.carrefour.fid.android.core.constants.C36168a;
import com.carrefour.fid.android.data.managers.ClearAppManager;
import com.carrefour.fid.android.databinding.C36680e1;
import com.carrefour.fid.android.shared.extension.ActivityKt;
import com.carrefour.fid.android.shared.extension.FragmentKt;
import com.carrefour.fid.android.shared.util.events.C28928c;
import com.carrefour.fid.android.shared.util.events.EventLiveData;
import com.google.android.gms.analytics.ecommerce.C40383c;
import dagger.hilt.android.C10164b;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.C11660u;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.C11379z;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10164b
@C11076d0(mo22515d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\"\u0010#J\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\t\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\u0007H\u0002J\b\u0010\u000b\u001a\u00020\u0007H\u0002R\"\u0010\u0013\u001a\u00020\f8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001b\u0010!\u001a\u00020\u001c8BX\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006$"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/ui/checkout/al/CheckoutFragment;", "Lcom/carrefour/fid/android/shared/base/o;", "Lcom/carrefour/fid/android/databinding/e1;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/d2;", "onViewCreated", "onDestroyView", "T0", "U0", "Lcom/carrefour/fid/android/data/managers/ClearAppManager;", "f", "Lcom/carrefour/fid/android/data/managers/ClearAppManager;", "S0", "()Lcom/carrefour/fid/android/data/managers/ClearAppManager;", "V0", "(Lcom/carrefour/fid/android/data/managers/ClearAppManager;)V", "clearAppManager", "Landroidx/navigation/NavController;", "g", "Landroidx/navigation/NavController;", "navController", "Landroidx/navigation/NavGraph;", "v", "Landroidx/navigation/NavGraph;", "navGraph", "Lcom/carrefour/fid/android/presentation/ui/checkout/al/a;", "w", "Landroidx/navigation/m;", "R0", "()Lcom/carrefour/fid/android/presentation/ui/checkout/al/a;", "args", "<init>", "()V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nCheckoutFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CheckoutFragment.kt\ncom/carrefour/fid/android/presentation/ui/checkout/al/CheckoutFragment\n+ 2 FragmentNavArgsLazy.kt\nandroidx/navigation/fragment/FragmentNavArgsLazyKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,96:1\n42#2,3:97\n1#3:100\n*S KotlinDebug\n*F\n+ 1 CheckoutFragment.kt\ncom/carrefour/fid/android/presentation/ui/checkout/al/CheckoutFragment\n*L\n39#1:97,3\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.al.CheckoutFragment */
public final class CheckoutFragment extends C23438x<C36680e1> {

    /* renamed from: x */
    public static final int f58955x = 8;
    @Inject

    /* renamed from: f */
    public ClearAppManager f58956f;
    @C12580l

    /* renamed from: g */
    public NavController f58957g;
    @C12580l

    /* renamed from: v */
    public NavGraph f58958v;
    @C12579k

    /* renamed from: w */
    public final C19766m f58959w = new C19766m(C11342l0.m43547d(C23324a.class), new CheckoutFragment$special$$inlined$navArgs$1(this));

    /* renamed from: com.carrefour.fid.android.presentation.ui.checkout.al.CheckoutFragment$a */
    public static final class C23247a implements C19426h0, C11379z {

        /* renamed from: a */
        public final /* synthetic */ C11300l f58961a;

        public C23247a(C11300l lVar) {
            Intrinsics.checkNotNullParameter(lVar, "function");
            this.f58961a = lVar;
        }

        /* renamed from: a */
        public final /* synthetic */ void mo4590a(Object obj) {
            this.f58961a.invoke(obj);
        }

        public final boolean equals(@C12580l Object obj) {
            if (!(obj instanceof C19426h0) || !(obj instanceof C11379z)) {
                return false;
            }
            return Intrinsics.areEqual((Object) getFunctionDelegate(), (Object) ((C11379z) obj).getFunctionDelegate());
        }

        @C12579k
        public final C11660u<?> getFunctionDelegate() {
            return this.f58961a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    public CheckoutFragment() {
        super(C232461.f58960a);
    }

    /* renamed from: R0 */
    public final C23324a mo68113R0() {
        return (C23324a) this.f58959w.getValue();
    }

    @C12579k
    /* renamed from: S0 */
    public final ClearAppManager mo68114S0() {
        ClearAppManager clearAppManager = this.f58956f;
        if (clearAppManager != null) {
            return clearAppManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("clearAppManager");
        return null;
    }

    /* renamed from: T0 */
    public final void mo68115T0() {
        NavController navController = this.f58957g;
        boolean z = false;
        if (navController != null && !navController.mo58156s0()) {
            z = true;
        }
        if (z) {
            C19736g.m91827a(this).mo58152q0();
        }
    }

    /* renamed from: U0 */
    public final void mo68116U0() {
        NavHostFragment navHostFragment;
        NavController navController;
        NavController navController2;
        C19758j0 M;
        NavHostFragment navHostFragment2;
        NavController navController3;
        NavController navController4;
        C19758j0 M2;
        Fragment r0 = getChildFragmentManager().mo56900r0(R.id.fragment_checkout_container_view);
        NavGraph navGraph = null;
        if (mo68113R0().mo68309e()) {
            if (r0 instanceof NavHostFragment) {
                navHostFragment2 = (NavHostFragment) r0;
            } else {
                navHostFragment2 = null;
            }
            if (navHostFragment2 != null) {
                navController3 = navHostFragment2.mo58400k();
            } else {
                navController3 = null;
            }
            this.f58957g = navController3;
            if (!(navController3 == null || (M2 = navController3.mo58111M()) == null)) {
                navGraph = M2.mo58438b(R.navigation.checkout_non_food_step_graph);
            }
            this.f58958v = navGraph;
            if (navGraph != null) {
                navGraph.mo58283V0(R.id.nonFoodCheckoutStep2Fragment);
            }
            NavGraph navGraph2 = this.f58958v;
            if (navGraph2 != null && (navController4 = this.f58957g) != null) {
                navController4.mo58114N0(navGraph2, getArguments());
                return;
            }
            return;
        }
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
        this.f58957g = navController;
        if (!(navController == null || (M = navController.mo58111M()) == null)) {
            navGraph = M.mo58438b(R.navigation.checkout_step_graph);
        }
        this.f58958v = navGraph;
        if (navGraph != null) {
            navGraph.mo58283V0(R.id.checkoutStep2Fragment);
        }
        NavGraph navGraph3 = this.f58958v;
        if (navGraph3 != null && (navController2 = this.f58957g) != null) {
            navController2.mo58114N0(navGraph3, getArguments());
        }
    }

    /* renamed from: V0 */
    public final void mo68117V0(@C12579k ClearAppManager clearAppManager) {
        Intrinsics.checkNotNullParameter(clearAppManager, "<set-?>");
        this.f58956f = clearAppManager;
    }

    public void onDestroyView() {
        this.f58957g = null;
        this.f58958v = null;
        super.onDestroyView();
    }

    public void onViewCreated(@C12579k View view, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        super.onViewCreated(view, bundle);
        FragmentKt.m118815c(this, new CheckoutFragment$onViewCreated$1(this));
        C19232h activity = getActivity();
        if (activity != null) {
            ActivityKt.m118697g(activity);
        }
        FragmentExtensionKt.m58757h(this);
        mo68116U0();
        C28928c<String> a = EventLiveData.f70863b.mo84199a(C36168a.f89273a);
        C19499w viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        a.mo57491k(viewLifecycleOwner, new C23247a(new CheckoutFragment$onViewCreated$2(this)));
    }
}
