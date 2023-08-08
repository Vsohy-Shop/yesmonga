package com.carrefour.fid.android.presentation.p035ui.loyalty.fragments;

import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.internal.C8567o;
import androidx.fragment.app.C19232h;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.C19426h0;
import androidx.lifecycle.C19501x;
import androidx.navigation.C19693b0;
import androidx.navigation.C19766m;
import com.carrefour.fid.android.databinding.C36819s0;
import com.carrefour.fid.android.navigation.BottomNavActivity;
import com.carrefour.fid.android.presentation.components.toolbar.ToolBarDefaultView;
import com.carrefour.fid.android.presentation.viewmodels.loyalty.BaseLoyaltyViewModel;
import com.carrefour.fid.android.shared.extension.FragmentKt;
import com.google.android.gms.analytics.ecommerce.C40383c;
import dagger.hilt.android.C10164b;
import kotlin.C10864b0;
import kotlin.C11076d0;
import kotlin.C11660u;
import kotlin.C11677z;
import kotlin.LazyThreadSafetyMode;
import kotlin.coroutines.C11045c;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.C11379z;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10164b
@C11076d0(mo22515d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016R\u001b\u0010\u000e\u001a\u00020\t8BX\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0014\u001a\u00020\u000f8BX\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/ui/loyalty/fragments/BaseLoyaltyFragment;", "Lcom/carrefour/fid/android/shared/base/o;", "Lcom/carrefour/fid/android/databinding/s0;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/d2;", "onViewCreated", "Lcom/carrefour/fid/android/presentation/viewmodels/loyalty/BaseLoyaltyViewModel;", "f", "Lkotlin/z;", "T0", "()Lcom/carrefour/fid/android/presentation/viewmodels/loyalty/BaseLoyaltyViewModel;", "baseLoyaltyViewModel", "Lcom/carrefour/fid/android/presentation/ui/loyalty/fragments/a;", "g", "Landroidx/navigation/m;", "S0", "()Lcom/carrefour/fid/android/presentation/ui/loyalty/fragments/a;", "args", "<init>", "()V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nBaseLoyaltyFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseLoyaltyFragment.kt\ncom/carrefour/fid/android/presentation/ui/loyalty/fragments/BaseLoyaltyFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 FragmentNavArgsLazy.kt\nandroidx/navigation/fragment/FragmentNavArgsLazyKt\n*L\n1#1,39:1\n106#2,15:40\n42#3,3:55\n*S KotlinDebug\n*F\n+ 1 BaseLoyaltyFragment.kt\ncom/carrefour/fid/android/presentation/ui/loyalty/fragments/BaseLoyaltyFragment\n*L\n22#1:40,15\n23#1:55,3\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.BaseLoyaltyFragment */
public final class BaseLoyaltyFragment extends C24440d<C36819s0> {

    /* renamed from: v */
    public static final int f60619v = 8;
    @C12579k

    /* renamed from: f */
    public final C11677z f60620f;
    @C12579k

    /* renamed from: g */
    public final C19766m f60621g = new C19766m(C11342l0.m43547d(C24237a.class), new BaseLoyaltyFragment$special$$inlined$navArgs$1(this));

    /* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.BaseLoyaltyFragment$a */
    public /* synthetic */ class C24236a implements C19426h0, C11379z {
        public C24236a() {
        }

        /* renamed from: b */
        public final void mo4590a(@C12580l C19693b0 b0Var) {
            FragmentKt.m118823k(BaseLoyaltyFragment.this, b0Var);
        }

        public final boolean equals(@C12580l Object obj) {
            if (!(obj instanceof C19426h0) || !(obj instanceof C11379z)) {
                return false;
            }
            return Intrinsics.areEqual((Object) getFunctionDelegate(), (Object) ((C11379z) obj).getFunctionDelegate());
        }

        @C12579k
        public final C11660u<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(1, BaseLoyaltyFragment.this, FragmentKt.class, "navigateTo", "navigateTo(Landroidx/fragment/app/Fragment;Landroidx/navigation/NavDirections;)V", 1);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    public BaseLoyaltyFragment() {
        super(C242351.f60622a);
        C11677z b = C10864b0.m38747b(LazyThreadSafetyMode.NONE, new BaseLoyaltyFragment$special$$inlined$viewModels$default$2(new BaseLoyaltyFragment$special$$inlined$viewModels$default$1(this)));
        this.f60620f = FragmentViewModelLazyKt.m89923h(this, C11342l0.m43547d(BaseLoyaltyViewModel.class), new BaseLoyaltyFragment$special$$inlined$viewModels$default$3(b), new BaseLoyaltyFragment$special$$inlined$viewModels$default$4((C11289a) null, b), new BaseLoyaltyFragment$special$$inlined$viewModels$default$5(this, b));
    }

    /* renamed from: S0 */
    public final C24237a mo70925S0() {
        return (C24237a) this.f60621g.getValue();
    }

    /* renamed from: T0 */
    public final BaseLoyaltyViewModel mo70926T0() {
        return (BaseLoyaltyViewModel) this.f60620f.getValue();
    }

    public void onViewCreated(@C12579k View view, @C12580l Bundle bundle) {
        BottomNavActivity bottomNavActivity;
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        super.onViewCreated(view, bundle);
        C19232h activity = getActivity();
        if (activity instanceof BottomNavActivity) {
            bottomNavActivity = (BottomNavActivity) activity;
        } else {
            bottomNavActivity = null;
        }
        if (bottomNavActivity != null) {
            ToolBarDefaultView.setup$default(bottomNavActivity.mo121107M1(), (C11300l) null, BaseLoyaltyFragment$onViewCreated$1$1.f60624f, 1, (Object) null);
            ToolBarDefaultView.m158944r0(bottomNavActivity.mo121107M1(), true, (C11300l) null, false, 6, (Object) null);
        }
        mo70926T0().mo77083h0().mo57491k(getViewLifecycleOwner(), new C24236a());
        C19501x.m90847a(this).mo57476b(new BaseLoyaltyFragment$onViewCreated$3(this, (C11045c<? super BaseLoyaltyFragment$onViewCreated$3>) null));
    }
}
