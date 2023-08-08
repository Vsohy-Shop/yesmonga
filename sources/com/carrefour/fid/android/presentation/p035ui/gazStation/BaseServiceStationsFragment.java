package com.carrefour.fid.android.presentation.p035ui.gazStation;

import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.internal.C8567o;
import androidx.fragment.app.C19232h;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.C19426h0;
import androidx.navigation.C19693b0;
import androidx.navigation.C19766m;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.databinding.C36819s0;
import com.carrefour.fid.android.navigation.BottomNavActivity;
import com.carrefour.fid.android.presentation.components.toolbar.ToolBarDefaultView;
import com.carrefour.fid.android.presentation.p035ui.gazStation.C24020b;
import com.carrefour.fid.android.presentation.viewmodels.gazStation.ServiceStationsViewModel;
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
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10164b
@C11076d0(mo22515d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\t\u001a\u00020\u0007H\u0002J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0002R\u001b\u0010\u0012\u001a\u00020\r8BX\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0018\u001a\u00020\u00138BX\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/ui/gazStation/BaseServiceStationsFragment;", "Lcom/carrefour/fid/android/shared/base/o;", "Lcom/carrefour/fid/android/databinding/s0;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/d2;", "onViewCreated", "U0", "", "showServiceStation", "T0", "Lcom/carrefour/fid/android/presentation/ui/gazStation/a;", "f", "Landroidx/navigation/m;", "R0", "()Lcom/carrefour/fid/android/presentation/ui/gazStation/a;", "args", "Lcom/carrefour/fid/android/presentation/viewmodels/gazStation/ServiceStationsViewModel;", "g", "Lkotlin/z;", "S0", "()Lcom/carrefour/fid/android/presentation/viewmodels/gazStation/ServiceStationsViewModel;", "serviceStationsViewModel", "<init>", "()V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nBaseServiceStationsFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseServiceStationsFragment.kt\ncom/carrefour/fid/android/presentation/ui/gazStation/BaseServiceStationsFragment\n+ 2 FragmentNavArgsLazy.kt\nandroidx/navigation/fragment/FragmentNavArgsLazyKt\n+ 3 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,60:1\n42#2,3:61\n106#3,15:64\n*S KotlinDebug\n*F\n+ 1 BaseServiceStationsFragment.kt\ncom/carrefour/fid/android/presentation/ui/gazStation/BaseServiceStationsFragment\n*L\n24#1:61,3\n25#1:64,15\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.gazStation.BaseServiceStationsFragment */
public final class BaseServiceStationsFragment extends C24025d<C36819s0> {

    /* renamed from: v */
    public static final int f60203v = 8;
    @C12579k

    /* renamed from: f */
    public final C19766m f60204f = new C19766m(C11342l0.m43547d(C24018a.class), new BaseServiceStationsFragment$special$$inlined$navArgs$1(this));
    @C12579k

    /* renamed from: g */
    public final C11677z f60205g;

    /* renamed from: com.carrefour.fid.android.presentation.ui.gazStation.BaseServiceStationsFragment$a */
    public static final class C23993a implements C19426h0, C11379z {

        /* renamed from: a */
        public final /* synthetic */ C11300l f60207a;

        public C23993a(C11300l lVar) {
            Intrinsics.checkNotNullParameter(lVar, "function");
            this.f60207a = lVar;
        }

        /* renamed from: a */
        public final /* synthetic */ void mo4590a(Object obj) {
            this.f60207a.invoke(obj);
        }

        public final boolean equals(@C12580l Object obj) {
            if (!(obj instanceof C19426h0) || !(obj instanceof C11379z)) {
                return false;
            }
            return Intrinsics.areEqual((Object) getFunctionDelegate(), (Object) ((C11379z) obj).getFunctionDelegate());
        }

        @C12579k
        public final C11660u<?> getFunctionDelegate() {
            return this.f60207a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    public BaseServiceStationsFragment() {
        super(C239921.f60206a);
        C11677z b = C10864b0.m38747b(LazyThreadSafetyMode.NONE, new C23995x437c871b(new C23994x437c871a(this)));
        this.f60205g = FragmentViewModelLazyKt.m89923h(this, C11342l0.m43547d(ServiceStationsViewModel.class), new C23996x437c871c(b), new C23997x437c871d((C11289a) null, b), new C23998x437c871e(this, b));
    }

    /* renamed from: R0 */
    public final C24018a mo70180R0() {
        return (C24018a) this.f60204f.getValue();
    }

    /* renamed from: S0 */
    public final ServiceStationsViewModel mo70181S0() {
        return (ServiceStationsViewModel) this.f60205g.getValue();
    }

    /* renamed from: T0 */
    public final void mo70182T0(boolean z) {
        C19693b0 b0Var;
        if (z) {
            b0Var = C24020b.f60245a.mo70298a(mo70180R0().mo70277g(), mo70180R0().mo70276f());
        } else {
            b0Var = C24020b.C24023c.m106064c(C24020b.f60245a, (String) null, 1, (Object) null);
        }
        FragmentKt.m118823k(this, b0Var);
    }

    /* renamed from: U0 */
    public final void mo70183U0() {
        BottomNavActivity bottomNavActivity;
        C19232h activity = getActivity();
        if (activity instanceof BottomNavActivity) {
            bottomNavActivity = (BottomNavActivity) activity;
        } else {
            bottomNavActivity = null;
        }
        if (bottomNavActivity != null) {
            bottomNavActivity.mo121107M1().mo121278k0(R.string.service_stations_toolbar_title);
            ToolBarDefaultView.setup$default(bottomNavActivity.mo121107M1(), (C11300l) null, BaseServiceStationsFragment$initToolbar$1$1.f60208f, 1, (Object) null);
        }
    }

    public void onViewCreated(@C12579k View view, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        super.onViewCreated(view, bundle);
        mo70183U0();
        ServiceStationsViewModel S0 = mo70181S0();
        S0.mo76655i0().mo57491k(getViewLifecycleOwner(), new C23993a(new BaseServiceStationsFragment$onViewCreated$1$1(this)));
        S0.mo76656j0();
    }
}
