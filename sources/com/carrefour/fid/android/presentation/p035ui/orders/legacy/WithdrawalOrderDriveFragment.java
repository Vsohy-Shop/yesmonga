package com.carrefour.fid.android.presentation.p035ui.orders.legacy;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.internal.C8567o;
import androidx.fragment.app.C19232h;
import androidx.navigation.C19766m;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.databinding.C36852v3;
import com.carrefour.fid.android.navigation.BottomNavActivity;
import com.carrefour.fid.android.presentation.components.toolbar.ToolBarDefaultView;
import com.carrefour.fid.android.utils.C22711j;
import com.google.android.gms.analytics.ecommerce.C40383c;
import dagger.hilt.android.C10164b;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10164b
@C11076d0(mo22515d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\t\u001a\u00020\u0007H\u0002J\b\u0010\n\u001a\u00020\u0007H\u0002R\u001b\u0010\u0010\u001a\u00020\u000b8BX\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0015"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/ui/orders/legacy/WithdrawalOrderDriveFragment;", "Lcom/carrefour/fid/android/shared/base/o;", "Lcom/carrefour/fid/android/databinding/v3;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/d2;", "onViewCreated", "R0", "S0", "Lcom/carrefour/fid/android/presentation/ui/orders/legacy/b;", "f", "Landroidx/navigation/m;", "Q0", "()Lcom/carrefour/fid/android/presentation/ui/orders/legacy/b;", "args", "<init>", "()V", "g", "a", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nWithdrawalOrderDriveFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WithdrawalOrderDriveFragment.kt\ncom/carrefour/fid/android/presentation/ui/orders/legacy/WithdrawalOrderDriveFragment\n+ 2 FragmentNavArgsLazy.kt\nandroidx/navigation/fragment/FragmentNavArgsLazyKt\n*L\n1#1,44:1\n42#2,3:45\n*S KotlinDebug\n*F\n+ 1 WithdrawalOrderDriveFragment.kt\ncom/carrefour/fid/android/presentation/ui/orders/legacy/WithdrawalOrderDriveFragment\n*L\n17#1:45,3\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.legacy.WithdrawalOrderDriveFragment */
public final class WithdrawalOrderDriveFragment extends C24699a<C36852v3> {
    @C12579k

    /* renamed from: g */
    public static final C24698a f61319g = new C24698a((DefaultConstructorMarker) null);

    /* renamed from: v */
    public static final int f61320v = 8;

    /* renamed from: w */
    public static final int f61321w = 420;

    /* renamed from: x */
    public static final int f61322x = 220;
    @C12579k

    /* renamed from: f */
    public final C19766m f61323f = new C19766m(C11342l0.m43547d(C24700b.class), new WithdrawalOrderDriveFragment$special$$inlined$navArgs$1(this));

    /* renamed from: com.carrefour.fid.android.presentation.ui.orders.legacy.WithdrawalOrderDriveFragment$a */
    public static final class C24698a {
        public /* synthetic */ C24698a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C24698a() {
        }
    }

    public WithdrawalOrderDriveFragment() {
        super(C246971.f61324a);
    }

    /* renamed from: Q0 */
    public final C24700b mo72185Q0() {
        return (C24700b) this.f61323f.getValue();
    }

    /* renamed from: R0 */
    public final void mo72186R0() {
        BottomNavActivity bottomNavActivity;
        ToolBarDefaultView M1;
        C19232h activity = getActivity();
        if (activity instanceof BottomNavActivity) {
            bottomNavActivity = (BottomNavActivity) activity;
        } else {
            bottomNavActivity = null;
        }
        if (bottomNavActivity != null && (M1 = bottomNavActivity.mo121107M1()) != null) {
            String string = getString(R.string.nhp_label_order);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.nhp_label_order)");
            ToolBarDefaultView toolBarDefaultView = M1;
            ToolBarDefaultView.m158942o0(toolBarDefaultView, string, mo72185Q0().mo72194e(), 0, 4, (Object) null);
            ToolBarDefaultView.m158944r0(toolBarDefaultView, true, (C11300l) null, false, 6, (Object) null);
        }
    }

    /* renamed from: S0 */
    public final void mo72187S0() {
        ((C36852v3) getBinding()).f91799d.setText(mo72185Q0().mo72194e());
        Bitmap a = C22711j.m102878a(mo72185Q0().mo72194e(), 420, f61322x);
        if (a != null) {
            ((C36852v3) getBinding()).f91797b.setImageBitmap(a);
        }
    }

    public void onViewCreated(@C12579k View view, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        super.onViewCreated(view, bundle);
        mo72186R0();
        mo72187S0();
    }
}
