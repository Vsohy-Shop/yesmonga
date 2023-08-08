package com.carrefour.fid.android.presentation.viewmodels.order.refont.fragment;

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
import androidx.fragment.app.C19221c0;
import androidx.fragment.app.C19232h;
import androidx.lifecycle.C19499w;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.app.extensions.FragmentExtensionKt;
import com.carrefour.fid.android.core.extension.FragmentKt;
import com.carrefour.fid.android.core.type.AccountListType;
import com.carrefour.fid.android.databinding.C36861w2;
import com.carrefour.fid.android.design.components.widgets.NotificationComponent;
import com.carrefour.fid.android.navigation.BottomNavActivity;
import com.carrefour.fid.android.presentation.p035ui.orders.C24680g;
import com.carrefour.fid.android.presentation.p035ui.orders.OrdersFragment;
import com.carrefour.fid.android.presentation.p035ui.orders.online.additionalorders.AdditionalOrderBottomSheetFragment;
import com.carrefour.fid.android.presentation.viewmodels.order.refont.C27052b;
import com.carrefour.fid.android.shared.domain.models.order.OrderType;
import com.carrefour.fid.android.shared.navigation.C28796c;
import com.google.android.gms.analytics.ecommerce.C40383c;
import dagger.hilt.android.C10164b;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10164b
@C11076d0(mo22515d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b5\u00106J\b\u0010\u0005\u001a\u00020\u0004H\u0016J$\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\u0018\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\nH\u0016J\u001a\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016J\b\u0010\u0016\u001a\u00020\u000eH\u0002J\u0010\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0010H\u0002J\u0010\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0010H\u0002J\b\u0010\u001a\u001a\u00020\u000eH\u0002J\b\u0010\u001b\u001a\u00020\u000eH\u0002J\u0010\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0010H\u0002J\u0010\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0010H\u0002J \u0010!\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0010H\u0002J \u0010$\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020\"H\u0002R\"\u0010,\u001a\u00020%8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u00104\u001a\u00020-8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103¨\u00067"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/viewmodels/order/refont/fragment/OrderOnlineFragment;", "Lcom/carrefour/fid/android/shared/base/o;", "Lcom/carrefour/fid/android/databinding/w2;", "Landroidx/fragment/app/c0;", "", "tabTitleId", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "Lkotlin/d2;", "onResume", "", "requestKey", "result", "p", "view", "onViewCreated", "g1", "orderId", "b1", "f1", "Z0", "c1", "a1", "h1", "Lcom/carrefour/fid/android/shared/domain/models/order/OrderType;", "orderType", "facilityStoreId", "e1", "", "statusIsAtLeastBilled", "d1", "Lcom/carrefour/fid/android/presentation/viewmodels/order/refont/b;", "f", "Lcom/carrefour/fid/android/presentation/viewmodels/order/refont/b;", "Y0", "()Lcom/carrefour/fid/android/presentation/viewmodels/order/refont/b;", "i1", "(Lcom/carrefour/fid/android/presentation/viewmodels/order/refont/b;)V", "analytics", "Lcom/carrefour/fid/android/shared/navigation/c;", "g", "Lcom/carrefour/fid/android/shared/navigation/c;", "getNavigator", "()Lcom/carrefour/fid/android/shared/navigation/c;", "setNavigator", "(Lcom/carrefour/fid/android/shared/navigation/c;)V", "navigator", "<init>", "()V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
public final class OrderOnlineFragment extends C27068a<C36861w2> implements C19221c0 {

    /* renamed from: v */
    public static final int f65791v = 8;
    @Inject

    /* renamed from: f */
    public C27052b f65792f;
    @Inject

    /* renamed from: g */
    public C28796c f65793g;

    public OrderOnlineFragment() {
        super(C270581.f65794a);
    }

    @C12579k
    /* renamed from: Y0 */
    public final C27052b mo78593Y0() {
        C27052b bVar = this.f65792f;
        if (bVar != null) {
            return bVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("analytics");
        return null;
    }

    /* renamed from: Z0 */
    public final void mo78594Z0() {
        OrdersFragment ordersFragment = (OrdersFragment) FragmentKt.m148916b(this, OrdersFragment.class);
        if (ordersFragment != null) {
            com.carrefour.fid.android.shared.extension.FragmentKt.m118823k(ordersFragment, C24680g.C24685e.m107782i(C24680g.f61288a, 0, 1, (Object) null));
        }
    }

    /* renamed from: a1 */
    public final void mo78595a1(String str) {
        OrdersFragment ordersFragment = (OrdersFragment) FragmentKt.m148916b(this, OrdersFragment.class);
        if (ordersFragment != null) {
            com.carrefour.fid.android.shared.extension.FragmentKt.m118823k(ordersFragment, C24680g.f61288a.mo72133a(str, AccountListType.Order.f89772d));
        }
    }

    /* renamed from: b1 */
    public final void mo78596b1(String str) {
        FragmentExtensionKt.m58751b(this, str);
    }

    /* renamed from: c1 */
    public final void mo78597c1() {
        C19232h activity = getActivity();
        BottomNavActivity bottomNavActivity = activity instanceof BottomNavActivity ? (BottomNavActivity) activity : null;
        if (bottomNavActivity != null) {
            bottomNavActivity.mo121118U1();
        }
    }

    /* renamed from: d1 */
    public final void mo78598d1(String str, OrderType orderType, boolean z) {
        OrdersFragment ordersFragment = (OrdersFragment) FragmentKt.m148916b(this, OrdersFragment.class);
        if (ordersFragment != null) {
            com.carrefour.fid.android.shared.extension.FragmentKt.m118823k(ordersFragment, C24680g.f61288a.mo72135d(orderType, str, z));
        }
    }

    /* renamed from: e1 */
    public final void mo78599e1(String str, OrderType orderType, String str2) {
        OrdersFragment ordersFragment = (OrdersFragment) FragmentKt.m148916b(this, OrdersFragment.class);
        if (ordersFragment != null) {
            com.carrefour.fid.android.shared.extension.FragmentKt.m118823k(ordersFragment, C24680g.f61288a.mo72138j(str, orderType, str2));
        }
    }

    /* renamed from: f1 */
    public final void mo78600f1(String str) {
        com.carrefour.fid.android.shared.extension.FragmentKt.m118823k(this, C24680g.f61288a.mo72139k(str));
    }

    /* renamed from: g1 */
    public final void mo78601g1() {
        NotificationComponent.Variant variant = NotificationComponent.Variant.ERROR;
        String string = getString(R.string.cancel_order_default_error_message);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.cance…er_default_error_message)");
        com.carrefour.fid.android.shared.extension.FragmentKt.m118811B(this, variant, string, (String) null, (String) null, (C11289a) null, false, false, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 2044, (Object) null);
    }

    @C12579k
    public final C28796c getNavigator() {
        C28796c cVar = this.f65793g;
        if (cVar != null) {
            return cVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("navigator");
        return null;
    }

    /* renamed from: h1 */
    public final void mo78603h1(String str) {
        com.carrefour.fid.android.shared.extension.FragmentKt.m118823k(this, C24680g.f61288a.mo72136f(str));
    }

    /* renamed from: i1 */
    public final void mo78604i1(@C12579k C27052b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<set-?>");
        this.f65792f = bVar;
    }

    @C12579k
    public View onCreateView(@C12579k LayoutInflater layoutInflater, @C12580l ViewGroup viewGroup, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        super.onCreateView(layoutInflater, viewGroup, bundle);
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
        ComposeView composeView = new ComposeView(requireContext, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        C19499w viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        composeView.setViewCompositionStrategy(new ViewCompositionStrategy.C15808b(viewLifecycleOwner));
        composeView.setContent(C8553b.m31049c(-422380795, true, new OrderOnlineFragment$onCreateView$view$1$1(this)));
        return composeView;
    }

    public void onResume() {
        super.onResume();
        requireActivity().mo57175g0().mo56861b(AdditionalOrderBottomSheetFragment.f61711x, this, this);
    }

    public void onViewCreated(@C12579k View view, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        super.onViewCreated(view, bundle);
        FragmentExtensionKt.m58757h(this);
    }

    /* renamed from: p */
    public void mo32757p(@C12579k String str, @C12579k Bundle bundle) {
        Bundle bundle2 = bundle;
        Intrinsics.checkNotNullParameter(str, "requestKey");
        Intrinsics.checkNotNullParameter(bundle2, "result");
        if (bundle2.getBoolean(AdditionalOrderBottomSheetFragment.f61712y, false)) {
            requireActivity().mo57175g0().mo56865c(AdditionalOrderBottomSheetFragment.f61711x);
            if (bundle2.getBoolean(AdditionalOrderBottomSheetFragment.f61713z, false)) {
                NotificationComponent.Variant variant = NotificationComponent.Variant.ERROR;
                String string = getString(R.string.additional_order_not_eligible);
                Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.additional_order_not_eligible)");
                com.carrefour.fid.android.shared.extension.FragmentKt.m118811B(this, variant, string, (String) null, (String) null, (C11289a) null, false, false, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 2044, (Object) null);
                return;
            }
            mo78594Z0();
            return;
        }
    }

    public final void setNavigator(@C12579k C28796c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f65793g = cVar;
    }

    public int tabTitleId() {
        return R.string.order_tab_title;
    }
}
