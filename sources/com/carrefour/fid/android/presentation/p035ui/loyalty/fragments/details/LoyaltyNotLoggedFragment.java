package com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.details;

import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.app.extensions.FragmentExtensionKt;
import com.carrefour.fid.android.databinding.C36801q2;
import com.carrefour.fid.android.loyalty.presentation.analytics.LoyaltyAnalyticsInterfaceDelegate;
import com.carrefour.fid.android.shared.constant.C28539g;
import com.google.android.gms.analytics.ecommerce.C40383c;
import dagger.hilt.android.C10164b;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10164b
@C11076d0(mo22515d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016R\"\u0010\u0010\u001a\u00020\t8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/ui/loyalty/fragments/details/LoyaltyNotLoggedFragment;", "Lcom/carrefour/fid/android/shared/base/o;", "Lcom/carrefour/fid/android/databinding/q2;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/d2;", "onViewCreated", "Lcom/carrefour/fid/android/loyalty/presentation/analytics/LoyaltyAnalyticsInterfaceDelegate;", "f", "Lcom/carrefour/fid/android/loyalty/presentation/analytics/LoyaltyAnalyticsInterfaceDelegate;", "R0", "()Lcom/carrefour/fid/android/loyalty/presentation/analytics/LoyaltyAnalyticsInterfaceDelegate;", "T0", "(Lcom/carrefour/fid/android/loyalty/presentation/analytics/LoyaltyAnalyticsInterfaceDelegate;)V", "loyaltyAnalytics", "<init>", "()V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.details.LoyaltyNotLoggedFragment */
public final class LoyaltyNotLoggedFragment extends C24474c<C36801q2> {

    /* renamed from: g */
    public static final int f60981g = 8;
    @Inject

    /* renamed from: f */
    public LoyaltyAnalyticsInterfaceDelegate f60982f;

    public LoyaltyNotLoggedFragment() {
        super(C244711.f60983a);
    }

    /* renamed from: S0 */
    public static final void m107297S0(LoyaltyNotLoggedFragment loyaltyNotLoggedFragment, View view) {
        Intrinsics.checkNotNullParameter(loyaltyNotLoggedFragment, "this$0");
        FragmentExtensionKt.m58770u(loyaltyNotLoggedFragment, false, R.anim.slide_in_up, R.anim.no_change, C28539g.f69226B, (Bundle) null, 16, (Object) null);
        loyaltyNotLoggedFragment.mo71575R0().sendTagClickGoToLogin("fidelite");
    }

    @C12579k
    /* renamed from: R0 */
    public final LoyaltyAnalyticsInterfaceDelegate mo71575R0() {
        LoyaltyAnalyticsInterfaceDelegate loyaltyAnalyticsInterfaceDelegate = this.f60982f;
        if (loyaltyAnalyticsInterfaceDelegate != null) {
            return loyaltyAnalyticsInterfaceDelegate;
        }
        Intrinsics.throwUninitializedPropertyAccessException("loyaltyAnalytics");
        return null;
    }

    /* renamed from: T0 */
    public final void mo71576T0(@C12579k LoyaltyAnalyticsInterfaceDelegate loyaltyAnalyticsInterfaceDelegate) {
        Intrinsics.checkNotNullParameter(loyaltyAnalyticsInterfaceDelegate, "<set-?>");
        this.f60982f = loyaltyAnalyticsInterfaceDelegate;
    }

    public void onViewCreated(@C12579k View view, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        super.onViewCreated(view, bundle);
        mo71575R0().sendScreenViewNotLogged();
        ((C36801q2) getBinding()).f91529b.setOnClickListener(new C24491m(this));
    }
}
