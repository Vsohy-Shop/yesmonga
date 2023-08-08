package com.carrefour.fid.android.presentation.p035ui.account;

import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.internal.C8567o;
import androidx.fragment.app.C19232h;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.C19426h0;
import androidx.navigation.C19693b0;
import com.carrefour.fid.android.databinding.C36809r0;
import com.carrefour.fid.android.navigation.BottomNavActivity;
import com.carrefour.fid.android.presentation.components.toolbar.ToolBarDefaultView;
import com.carrefour.fid.android.presentation.viewmodels.account.BaseAccountViewModel;
import com.carrefour.fid.android.shared.extension.FragmentKt;
import com.google.android.gms.analytics.ecommerce.C40383c;
import dagger.hilt.android.C10164b;
import kotlin.C10864b0;
import kotlin.C11076d0;
import kotlin.C11660u;
import kotlin.C11677z;
import kotlin.LazyThreadSafetyMode;
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
@C11076d0(mo22515d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016R\u001b\u0010\u000e\u001a\u00020\t8BX\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/ui/account/BaseAccountFragment;", "Lcom/carrefour/fid/android/shared/base/o;", "Lcom/carrefour/fid/android/databinding/r0;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/d2;", "onViewCreated", "Lcom/carrefour/fid/android/presentation/viewmodels/account/BaseAccountViewModel;", "f", "Lkotlin/z;", "Q0", "()Lcom/carrefour/fid/android/presentation/viewmodels/account/BaseAccountViewModel;", "baseAccountViewModel", "<init>", "()V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nBaseAccountFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseAccountFragment.kt\ncom/carrefour/fid/android/presentation/ui/account/BaseAccountFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,32:1\n106#2,15:33\n*S KotlinDebug\n*F\n+ 1 BaseAccountFragment.kt\ncom/carrefour/fid/android/presentation/ui/account/BaseAccountFragment\n*L\n20#1:33,15\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.account.BaseAccountFragment */
public final class BaseAccountFragment extends C22888c<C36809r0> {

    /* renamed from: g */
    public static final int f58453g = 8;
    @C12579k

    /* renamed from: f */
    public final C11677z f58454f;

    /* renamed from: com.carrefour.fid.android.presentation.ui.account.BaseAccountFragment$a */
    public /* synthetic */ class C22874a implements C19426h0, C11379z {
        public C22874a() {
        }

        /* renamed from: b */
        public final void mo4590a(@C12580l C19693b0 b0Var) {
            FragmentKt.m118823k(BaseAccountFragment.this, b0Var);
        }

        public final boolean equals(@C12580l Object obj) {
            if (!(obj instanceof C19426h0) || !(obj instanceof C11379z)) {
                return false;
            }
            return Intrinsics.areEqual((Object) getFunctionDelegate(), (Object) ((C11379z) obj).getFunctionDelegate());
        }

        @C12579k
        public final C11660u<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(1, BaseAccountFragment.this, FragmentKt.class, "navigateTo", "navigateTo(Landroidx/fragment/app/Fragment;Landroidx/navigation/NavDirections;)V", 1);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    public BaseAccountFragment() {
        super(C228731.f58455a);
        C11677z b = C10864b0.m38747b(LazyThreadSafetyMode.NONE, new BaseAccountFragment$special$$inlined$viewModels$default$2(new BaseAccountFragment$special$$inlined$viewModels$default$1(this)));
        this.f58454f = FragmentViewModelLazyKt.m89923h(this, C11342l0.m43547d(BaseAccountViewModel.class), new BaseAccountFragment$special$$inlined$viewModels$default$3(b), new BaseAccountFragment$special$$inlined$viewModels$default$4((C11289a) null, b), new BaseAccountFragment$special$$inlined$viewModels$default$5(this, b));
    }

    /* renamed from: Q0 */
    public final BaseAccountViewModel mo67334Q0() {
        return (BaseAccountViewModel) this.f58454f.getValue();
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
            ToolBarDefaultView.setup$default(bottomNavActivity.mo121107M1(), (C11300l) null, BaseAccountFragment$onViewCreated$1$1.f58457f, 1, (Object) null);
        }
        mo67334Q0().mo74783g0().mo57491k(getViewLifecycleOwner(), new C22874a());
    }
}
