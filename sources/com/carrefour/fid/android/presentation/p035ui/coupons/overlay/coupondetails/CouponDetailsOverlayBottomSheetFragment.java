package com.carrefour.fid.android.presentation.p035ui.coupons.overlay.coupondetails;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import androidx.compose.p004ui.platform.ComposeView;
import androidx.compose.p004ui.platform.ViewCompositionStrategy;
import androidx.compose.runtime.internal.C8553b;
import androidx.compose.runtime.internal.C8567o;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.C19456p0;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.compose.C19714d;
import androidx.navigation.fragment.C19736g;
import com.carrefour.fid.android.databinding.C36840u1;
import com.carrefour.fid.android.presentation.models.CouponDetailsResult;
import com.carrefour.fid.android.presentation.models.CouponModel;
import com.carrefour.fid.android.presentation.p035ui.coupons.overlay.coupondetails.analytics.C23943a;
import com.carrefour.fid.android.presentation.viewmodels.coupons.overlay.OverlayCouponDetailsBottomSheetViewModel;
import com.google.android.gms.analytics.ecommerce.C40383c;
import dagger.hilt.android.C10164b;
import javax.inject.Inject;
import kotlin.C10864b0;
import kotlin.C11076d0;
import kotlin.C11677z;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10164b
@C11076d0(mo22515d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016R\"\u0010\u0013\u001a\u00020\f8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0019\u001a\u00020\u00148BX\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/ui/coupons/overlay/coupondetails/CouponDetailsOverlayBottomSheetFragment;", "Lcom/carrefour/fid/android/design/components/widgets/a;", "Lcom/carrefour/fid/android/databinding/u1;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/d2;", "onViewCreated", "Landroid/content/DialogInterface;", "dialog", "onDismiss", "Lcom/carrefour/fid/android/presentation/ui/coupons/overlay/coupondetails/analytics/a;", "f", "Lcom/carrefour/fid/android/presentation/ui/coupons/overlay/coupondetails/analytics/a;", "S0", "()Lcom/carrefour/fid/android/presentation/ui/coupons/overlay/coupondetails/analytics/a;", "U0", "(Lcom/carrefour/fid/android/presentation/ui/coupons/overlay/coupondetails/analytics/a;)V", "analytics", "Lcom/carrefour/fid/android/presentation/viewmodels/coupons/overlay/OverlayCouponDetailsBottomSheetViewModel;", "g", "Lkotlin/z;", "T0", "()Lcom/carrefour/fid/android/presentation/viewmodels/coupons/overlay/OverlayCouponDetailsBottomSheetViewModel;", "viewModel", "<init>", "()V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nCouponDetailsOverlayBottomSheetFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CouponDetailsOverlayBottomSheetFragment.kt\ncom/carrefour/fid/android/presentation/ui/coupons/overlay/coupondetails/CouponDetailsOverlayBottomSheetFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,58:1\n106#2,15:59\n*S KotlinDebug\n*F\n+ 1 CouponDetailsOverlayBottomSheetFragment.kt\ncom/carrefour/fid/android/presentation/ui/coupons/overlay/coupondetails/CouponDetailsOverlayBottomSheetFragment\n*L\n32#1:59,15\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.coupons.overlay.coupondetails.CouponDetailsOverlayBottomSheetFragment */
public final class CouponDetailsOverlayBottomSheetFragment extends C23953h<C36840u1> {

    /* renamed from: v */
    public static final int f60102v = 8;
    @Inject

    /* renamed from: f */
    public C23943a f60103f;
    @C12579k

    /* renamed from: g */
    public final C11677z f60104g;

    public CouponDetailsOverlayBottomSheetFragment() {
        super(C239171.f60105a, C239182.f60106a, true);
        C11677z b = C10864b0.m38747b(LazyThreadSafetyMode.NONE, new C23920x6178c3b8(new C23919x6178c3b7(this)));
        this.f60104g = FragmentViewModelLazyKt.m89923h(this, C11342l0.m43547d(OverlayCouponDetailsBottomSheetViewModel.class), new C23921x6178c3b9(b), new C23922x6178c3ba((C11289a) null, b), new C23923x6178c3bb(this, b));
    }

    @C12579k
    /* renamed from: S0 */
    public final C23943a mo70043S0() {
        C23943a aVar = this.f60103f;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("analytics");
        return null;
    }

    /* renamed from: T0 */
    public final OverlayCouponDetailsBottomSheetViewModel mo70044T0() {
        return (OverlayCouponDetailsBottomSheetViewModel) this.f60104g.getValue();
    }

    /* renamed from: U0 */
    public final void mo70045U0(@C12579k C23943a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.f60103f = aVar;
    }

    public void onDismiss(@C12579k DialogInterface dialogInterface) {
        C19456p0 i;
        CouponDetailsResult couponDetailsResult;
        Intrinsics.checkNotNullParameter(dialogInterface, C19714d.f50522e);
        CouponModel i0 = mo70044T0().mo76489i0();
        NavBackStackEntry O = C19736g.m91827a(this).mo58115O();
        if (!(O == null || (i = O.mo58069i()) == null)) {
            if (i0 != null) {
                couponDetailsResult = new CouponDetailsResult(i0.mo121396L(), i0.mo121403S().getType());
            } else {
                couponDetailsResult = null;
            }
            i.mo57656q(C23948c.f60118a, couponDetailsResult);
        }
        super.onDismiss(dialogInterface);
    }

    public void onViewCreated(@C12579k View view, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        super.onViewCreated(view, bundle);
        ComposeView composeView = ((C36840u1) getBinding()).f91735b;
        composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnDetachedFromWindow.f39390b);
        composeView.setContent(C8553b.m31049c(-931645950, true, new CouponDetailsOverlayBottomSheetFragment$onViewCreated$1$1(this)));
        hideBackDropHandle();
    }
}
