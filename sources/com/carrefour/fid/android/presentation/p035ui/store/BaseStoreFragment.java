package com.carrefour.fid.android.presentation.p035ui.store;

import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.internal.C8567o;
import androidx.fragment.app.C19232h;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.C19426h0;
import androidx.navigation.C19693b0;
import androidx.navigation.C19766m;
import com.carrefour.fid.android.C14062p0;
import com.carrefour.fid.android.databinding.C36829t0;
import com.carrefour.fid.android.navigation.BottomNavActivity;
import com.carrefour.fid.android.presentation.components.toolbar.ToolBarDefaultView;
import com.carrefour.fid.android.presentation.viewmodels.store.StoreViewModel;
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
@C11076d0(mo22515d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016R\u001b\u0010\u000e\u001a\u00020\t8BX\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0014\u001a\u00020\u000f8BX\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/ui/store/BaseStoreFragment;", "Lcom/carrefour/fid/android/shared/base/o;", "Lcom/carrefour/fid/android/databinding/t0;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/d2;", "onViewCreated", "Lcom/carrefour/fid/android/p0;", "f", "Landroidx/navigation/m;", "Q0", "()Lcom/carrefour/fid/android/p0;", "args", "Lcom/carrefour/fid/android/presentation/viewmodels/store/StoreViewModel;", "g", "Lkotlin/z;", "R0", "()Lcom/carrefour/fid/android/presentation/viewmodels/store/StoreViewModel;", "storeViewModel", "<init>", "()V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nBaseStoreFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseStoreFragment.kt\ncom/carrefour/fid/android/presentation/ui/store/BaseStoreFragment\n+ 2 FragmentNavArgsLazy.kt\nandroidx/navigation/fragment/FragmentNavArgsLazyKt\n+ 3 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,37:1\n42#2,3:38\n106#3,15:41\n*S KotlinDebug\n*F\n+ 1 BaseStoreFragment.kt\ncom/carrefour/fid/android/presentation/ui/store/BaseStoreFragment\n*L\n22#1:38,3\n23#1:41,15\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.store.BaseStoreFragment */
public final class BaseStoreFragment extends C25753c<C36829t0> {

    /* renamed from: v */
    public static final int f63075v = 8;
    @C12579k

    /* renamed from: f */
    public final C19766m f63076f = new C19766m(C11342l0.m43547d(C14062p0.class), new BaseStoreFragment$special$$inlined$navArgs$1(this));
    @C12579k

    /* renamed from: g */
    public final C11677z f63077g;

    /* renamed from: com.carrefour.fid.android.presentation.ui.store.BaseStoreFragment$a */
    public /* synthetic */ class C25748a implements C19426h0, C11379z {
        public C25748a() {
        }

        /* renamed from: b */
        public final void mo4590a(@C12580l C19693b0 b0Var) {
            FragmentKt.m118823k(BaseStoreFragment.this, b0Var);
        }

        public final boolean equals(@C12580l Object obj) {
            if (!(obj instanceof C19426h0) || !(obj instanceof C11379z)) {
                return false;
            }
            return Intrinsics.areEqual((Object) getFunctionDelegate(), (Object) ((C11379z) obj).getFunctionDelegate());
        }

        @C12579k
        public final C11660u<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(1, BaseStoreFragment.this, FragmentKt.class, "navigateTo", "navigateTo(Landroidx/fragment/app/Fragment;Landroidx/navigation/NavDirections;)V", 1);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    public BaseStoreFragment() {
        super(C257471.f63078a);
        C11677z b = C10864b0.m38747b(LazyThreadSafetyMode.NONE, new BaseStoreFragment$special$$inlined$viewModels$default$2(new BaseStoreFragment$special$$inlined$viewModels$default$1(this)));
        this.f63077g = FragmentViewModelLazyKt.m89923h(this, C11342l0.m43547d(StoreViewModel.class), new BaseStoreFragment$special$$inlined$viewModels$default$3(b), new BaseStoreFragment$special$$inlined$viewModels$default$4((C11289a) null, b), new BaseStoreFragment$special$$inlined$viewModels$default$5(this, b));
    }

    /* renamed from: Q0 */
    public final C14062p0 mo74764Q0() {
        return (C14062p0) this.f63076f.getValue();
    }

    /* renamed from: R0 */
    public final StoreViewModel mo74765R0() {
        return (StoreViewModel) this.f63077g.getValue();
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
            ToolBarDefaultView.setup$default(bottomNavActivity.mo121107M1(), (C11300l) null, BaseStoreFragment$onViewCreated$1$1.f63080f, 1, (Object) null);
        }
        mo74765R0().mo79787i0(mo74764Q0().mo34320g());
        mo74765R0().mo79786h0().mo57491k(getViewLifecycleOwner(), new C25748a());
    }
}
