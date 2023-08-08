package com.carrefour.fid.android.presentation.p035ui.orders;

import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.internal.C8567o;
import androidx.fragment.app.C19232h;
import androidx.navigation.C19766m;
import androidx.navigation.fragment.C19736g;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.databinding.C36880y2;
import com.carrefour.fid.android.navigation.BottomNavActivity;
import com.carrefour.fid.android.presentation.components.toolbar.ToolBarDefaultView;
import com.carrefour.fid.android.shared.extension.FragmentKt;
import com.carrefour.fid.android.shared.navigation.C28796c;
import com.google.android.gms.analytics.ecommerce.C40383c;
import dagger.hilt.android.C10164b;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10164b
@C11076d0(mo22515d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\t\u001a\u00020\u0007H\u0002J\b\u0010\n\u001a\u00020\u0007H\u0002J\b\u0010\u000b\u001a\u00020\u0007H\u0002R\u001b\u0010\u0011\u001a\u00020\f8BX\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\"\u0010\u0019\u001a\u00020\u00128\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/ui/orders/OrdersSuccessHandleFragment;", "Lcom/carrefour/fid/android/shared/base/o;", "Lcom/carrefour/fid/android/databinding/y2;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/d2;", "onViewCreated", "T0", "V0", "initListeners", "Lcom/carrefour/fid/android/presentation/ui/orders/j;", "f", "Landroidx/navigation/m;", "S0", "()Lcom/carrefour/fid/android/presentation/ui/orders/j;", "successArgs", "Lcom/carrefour/fid/android/shared/navigation/c;", "g", "Lcom/carrefour/fid/android/shared/navigation/c;", "getNavigator", "()Lcom/carrefour/fid/android/shared/navigation/c;", "setNavigator", "(Lcom/carrefour/fid/android/shared/navigation/c;)V", "navigator", "<init>", "()V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nOrdersSuccessHandleFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OrdersSuccessHandleFragment.kt\ncom/carrefour/fid/android/presentation/ui/orders/OrdersSuccessHandleFragment\n+ 2 FragmentNavArgsLazy.kt\nandroidx/navigation/fragment/FragmentNavArgsLazyKt\n*L\n1#1,53:1\n42#2,3:54\n*S KotlinDebug\n*F\n+ 1 OrdersSuccessHandleFragment.kt\ncom/carrefour/fid/android/presentation/ui/orders/OrdersSuccessHandleFragment\n*L\n20#1:54,3\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.OrdersSuccessHandleFragment */
public final class OrdersSuccessHandleFragment extends C24675b<C36880y2> {

    /* renamed from: v */
    public static final int f61270v = 8;
    @C12579k

    /* renamed from: f */
    public final C19766m f61271f = new C19766m(C11342l0.m43547d(C24691j.class), new OrdersSuccessHandleFragment$special$$inlined$navArgs$1(this));
    @Inject

    /* renamed from: g */
    public C28796c f61272g;

    public OrdersSuccessHandleFragment() {
        super(C246731.f61273a);
    }

    /* renamed from: U0 */
    public static final void m107751U0(OrdersSuccessHandleFragment ordersSuccessHandleFragment, View view) {
        Intrinsics.checkNotNullParameter(ordersSuccessHandleFragment, "this$0");
        C19736g.m91827a(ordersSuccessHandleFragment).mo58152q0();
    }

    /* renamed from: S0 */
    public final C24691j mo72087S0() {
        return (C24691j) this.f61271f.getValue();
    }

    /* renamed from: T0 */
    public final void mo72088T0() {
        C19736g.m91827a(this).mo58152q0();
    }

    /* renamed from: V0 */
    public final void mo72089V0() {
        BottomNavActivity bottomNavActivity;
        C19232h activity = getActivity();
        if (activity instanceof BottomNavActivity) {
            bottomNavActivity = (BottomNavActivity) activity;
        } else {
            bottomNavActivity = null;
        }
        if (bottomNavActivity != null) {
            ToolBarDefaultView M1 = bottomNavActivity.mo121107M1();
            String string = bottomNavActivity.getString(R.string.nhp_label_order);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.nhp_label_order)");
            ToolBarDefaultView.m158942o0(M1, string, bottomNavActivity.getString(R.string.order_txt_order_number, new Object[]{mo72087S0().mo72165e()}), 0, 4, (Object) null);
            ToolBarDefaultView.m158944r0(bottomNavActivity.mo121107M1(), false, (C11300l) null, false, 6, (Object) null);
        }
    }

    @C12579k
    public final C28796c getNavigator() {
        C28796c cVar = this.f61272g;
        if (cVar != null) {
            return cVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("navigator");
        return null;
    }

    public final void initListeners() {
        ((C36880y2) getBinding()).f91966b.setOnClickListener(new C24690i(this));
    }

    public void onViewCreated(@C12579k View view, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        super.onViewCreated(view, bundle);
        FragmentKt.m118815c(this, new OrdersSuccessHandleFragment$onViewCreated$1(this));
        mo72089V0();
        initListeners();
    }

    public final void setNavigator(@C12579k C28796c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f61272g = cVar;
    }
}
