package com.carrefour.fid.android.presentation.p035ui.coupons;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.p004ui.platform.ComposeView;
import androidx.compose.p004ui.platform.ViewCompositionStrategy;
import androidx.compose.runtime.internal.C8553b;
import androidx.compose.runtime.internal.C8567o;
import androidx.lifecycle.C19499w;
import androidx.navigation.C19766m;
import com.carrefour.fid.android.presentation.analytics.C38364e;
import com.carrefour.fid.android.shared.navigation.C28795b;
import com.google.android.gms.analytics.ecommerce.C40383c;
import dagger.hilt.android.C10164b;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10164b
@C11076d0(mo22515d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ$\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016R\"\u0010\u0014\u001a\u00020\r8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001b\u0010\u001a\u001a\u00020\u00158BX\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/ui/coupons/CouponsScanBarcodeFragment;", "Lcom/carrefour/fid/android/shared/base/q;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "view", "Lkotlin/d2;", "onViewCreated", "Lcom/carrefour/fid/android/presentation/analytics/e;", "f", "Lcom/carrefour/fid/android/presentation/analytics/e;", "J0", "()Lcom/carrefour/fid/android/presentation/analytics/e;", "L0", "(Lcom/carrefour/fid/android/presentation/analytics/e;)V", "analyticsDelegate", "Lcom/carrefour/fid/android/presentation/ui/coupons/b;", "g", "Landroidx/navigation/m;", "K0", "()Lcom/carrefour/fid/android/presentation/ui/coupons/b;", "args", "<init>", "()V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nCouponsScanBarcodeFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CouponsScanBarcodeFragment.kt\ncom/carrefour/fid/android/presentation/ui/coupons/CouponsScanBarcodeFragment\n+ 2 FragmentNavArgsLazy.kt\nandroidx/navigation/fragment/FragmentNavArgsLazyKt\n*L\n1#1,53:1\n42#2,3:54\n*S KotlinDebug\n*F\n+ 1 CouponsScanBarcodeFragment.kt\ncom/carrefour/fid/android/presentation/ui/coupons/CouponsScanBarcodeFragment\n*L\n25#1:54,3\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.coupons.CouponsScanBarcodeFragment */
public final class CouponsScanBarcodeFragment extends C23795f {

    /* renamed from: v */
    public static final int f59874v = 8;
    @Inject

    /* renamed from: f */
    public C38364e f59875f;
    @C12579k

    /* renamed from: g */
    public final C19766m f59876g = new C19766m(C11342l0.m43547d(C23790b.class), new CouponsScanBarcodeFragment$special$$inlined$navArgs$1(this));

    @C12579k
    /* renamed from: J0 */
    public final C38364e mo69664J0() {
        C38364e eVar = this.f59875f;
        if (eVar != null) {
            return eVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("analyticsDelegate");
        return null;
    }

    /* renamed from: K0 */
    public final C23790b mo69665K0() {
        return (C23790b) this.f59876g.getValue();
    }

    /* renamed from: L0 */
    public final void mo69666L0(@C12579k C38364e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<set-?>");
        this.f59875f = eVar;
    }

    @C12579k
    public View onCreateView(@C12579k LayoutInflater layoutInflater, @C12580l ViewGroup viewGroup, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
        ComposeView composeView = new ComposeView(requireContext, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        C19499w viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        composeView.setViewCompositionStrategy(new ViewCompositionStrategy.C15808b(viewLifecycleOwner));
        composeView.setContent(C8553b.m31049c(1964306481, true, new CouponsScanBarcodeFragment$onCreateView$view$1$1(this)));
        return composeView;
    }

    public void onViewCreated(@C12579k View view, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        super.onViewCreated(view, bundle);
        C28795b.m119161a(this, false);
    }
}
