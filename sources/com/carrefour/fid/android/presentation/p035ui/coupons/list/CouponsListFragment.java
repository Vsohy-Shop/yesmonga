package com.carrefour.fid.android.presentation.p035ui.coupons.list;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.C0302g;
import androidx.compose.p004ui.platform.ComposeView;
import androidx.compose.p004ui.platform.ViewCompositionStrategy;
import androidx.compose.runtime.internal.C8553b;
import androidx.compose.runtime.internal.C8567o;
import androidx.lifecycle.C19423g0;
import androidx.lifecycle.C19426h0;
import androidx.lifecycle.C19499w;
import androidx.navigation.fragment.C19736g;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.app.extensions.FragmentExtensionKt;
import com.carrefour.fid.android.design.components.widgets.NotificationComponent;
import com.carrefour.fid.android.performance.C38326b;
import com.carrefour.fid.android.presentation.models.CouponDetailModel;
import com.carrefour.fid.android.presentation.models.CouponDetailsResult;
import com.carrefour.fid.android.presentation.models.CouponModel;
import com.carrefour.fid.android.presentation.p035ui.coupons.analytics.C23787a;
import com.carrefour.fid.android.shared.extension.C28752e0;
import com.carrefour.fid.android.shared.extension.FragmentKt;
import dagger.hilt.android.C10164b;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.C11660u;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11379z;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b0\u00101J\b\u0010\u0003\u001a\u00020\u0002H\u0016J$\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0002J\b\u0010\u000f\u001a\u00020\u0002H\u0002J\u001a\u0010\u0012\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002R\"\u0010\u001a\u001a\u00020\u00138\u0000@\u0000X.¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\"\u001a\u00020\u001b8\u0000@\u0000X.¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0016\u0010%\u001a\u00020\f8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b#\u0010$R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020'0&8\u0002X\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001e\u0010/\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010,0+8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b-\u0010.¨\u00062"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/ui/coupons/list/CouponsListFragment;", "Lcom/carrefour/fid/android/shared/base/q;", "Lkotlin/d2;", "onResume", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "Lcom/carrefour/fid/android/presentation/models/CouponModel;", "coupon", "Q0", "T0", "", "numberActivateCoupon", "N0", "Lcom/carrefour/fid/android/presentation/ui/coupons/analytics/a;", "f", "Lcom/carrefour/fid/android/presentation/ui/coupons/analytics/a;", "O0", "()Lcom/carrefour/fid/android/presentation/ui/coupons/analytics/a;", "R0", "(Lcom/carrefour/fid/android/presentation/ui/coupons/analytics/a;)V", "couponsAnalytics", "Lcom/carrefour/fid/android/performance/b;", "g", "Lcom/carrefour/fid/android/performance/b;", "P0", "()Lcom/carrefour/fid/android/performance/b;", "S0", "(Lcom/carrefour/fid/android/performance/b;)V", "performance", "v", "Lcom/carrefour/fid/android/presentation/models/CouponModel;", "selectedCoupon", "Landroidx/activity/result/g;", "", "w", "Landroidx/activity/result/g;", "requestPermission", "Landroidx/lifecycle/g0;", "Lcom/carrefour/fid/android/presentation/models/CouponDetailsResult;", "x", "Landroidx/lifecycle/g0;", "updatedCouponResult", "<init>", "()V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C10164b
@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.coupons.list.CouponsListFragment */
public final class CouponsListFragment extends C23893j {

    /* renamed from: y */
    public static final int f59944y = 8;
    @Inject

    /* renamed from: f */
    public C23787a f59945f;
    @Inject

    /* renamed from: g */
    public C38326b f59946g;

    /* renamed from: v */
    public CouponModel f59947v;
    @C12579k

    /* renamed from: w */
    public final C0302g<String> f59948w = FragmentKt.m118833u(this, new CouponsListFragment$requestPermission$1(this), new CouponsListFragment$requestPermission$2(this));
    @C12579k

    /* renamed from: x */
    public C19423g0<CouponDetailsResult> f59949x = new C19423g0<>(null);

    /* renamed from: com.carrefour.fid.android.presentation.ui.coupons.list.CouponsListFragment$a */
    public static final class C23819a implements C19426h0, C11379z {

        /* renamed from: a */
        public final /* synthetic */ C11300l f59950a;

        public C23819a(C11300l lVar) {
            Intrinsics.checkNotNullParameter(lVar, "function");
            this.f59950a = lVar;
        }

        /* renamed from: a */
        public final /* synthetic */ void mo4590a(Object obj) {
            this.f59950a.invoke(obj);
        }

        public final boolean equals(@C12580l Object obj) {
            if (!(obj instanceof C19426h0) || !(obj instanceof C11379z)) {
                return false;
            }
            return Intrinsics.areEqual((Object) getFunctionDelegate(), (Object) ((C11379z) obj).getFunctionDelegate());
        }

        @C12579k
        public final C11660u<?> getFunctionDelegate() {
            return this.f59950a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* renamed from: N0 */
    public final void mo69757N0(CouponModel couponModel, int i) {
        CouponModel couponModel2 = couponModel;
        if (couponModel2 != null) {
            C28752e0.m119043b(C19736g.m91827a(this), R.id.couponsListFragment, C23879f.f60042a.mo69957b(new CouponDetailModel(couponModel2, i)));
            return;
        }
        NotificationComponent.Variant variant = NotificationComponent.Variant.ERROR;
        String string = getString(R.string.coupons_loading_error_toast);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.coupons_loading_error_toast)");
        FragmentKt.m118811B(this, variant, string, (String) null, (String) null, (C11289a) null, false, false, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 2044, (Object) null);
    }

    @C12579k
    /* renamed from: O0 */
    public final C23787a mo69758O0() {
        C23787a aVar = this.f59945f;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("couponsAnalytics");
        return null;
    }

    @C12579k
    /* renamed from: P0 */
    public final C38326b mo69759P0() {
        C38326b bVar = this.f59946g;
        if (bVar != null) {
            return bVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("performance");
        return null;
    }

    /* renamed from: Q0 */
    public final void mo69760Q0(CouponModel couponModel) {
        this.f59947v = couponModel;
        this.f59948w.mo960b("android.permission.CAMERA");
    }

    /* renamed from: R0 */
    public final void mo69761R0(@C12579k C23787a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.f59945f = aVar;
    }

    /* renamed from: S0 */
    public final void mo69762S0(@C12579k C38326b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<set-?>");
        this.f59946g = bVar;
    }

    /* renamed from: T0 */
    public final void mo69763T0() {
        String string = getString(R.string.coupons_scan_dialog_title);
        String string2 = getString(R.string.coupons_scan_dialog_message);
        Drawable h = FragmentKt.m118820h(this, R.drawable.background_search_bar, (Integer) null, 2, (Object) null);
        String string3 = getString(R.string.general_refuse);
        String string4 = getString(R.string.general_accept);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.coupons_scan_dialog_title)");
        Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.coupons_scan_dialog_message)");
        FragmentKt.m118838z(this, string, string2, string3, CouponsListFragment$showPermissionExplanationDialog$1.f59951f, string4, false, new CouponsListFragment$showPermissionExplanationDialog$2(this), (String) null, (C11289a) null, (C11289a) null, h, 0, 2976, (Object) null);
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
        composeView.setContent(C8553b.m31049c(-382203069, true, new CouponsListFragment$onCreateView$1$1(this)));
        return composeView;
    }

    public void onResume() {
        super.onResume();
        FragmentExtensionKt.m58757h(this);
    }
}
