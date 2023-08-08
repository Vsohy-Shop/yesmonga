package com.carrefour.fid.android.presentation.p035ui.notification;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.C8567o;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.C19232h;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.databinding.C36737j8;
import com.carrefour.fid.android.navigation.BottomNavActivity;
import com.carrefour.fid.android.presentation.components.toolbar.ToolBarDefaultView;
import com.carrefour.fid.android.presentation.viewmodels.notification.C26628a;
import com.carrefour.fid.android.shared.extension.ActivityKt;
import com.carrefour.fid.android.shared.util.FragmentViewBindingDelegate;
import com.carrefour.fid.android.shared.util.FragmentViewBindingDelegateKt;
import com.google.android.gms.analytics.ecommerce.C40383c;
import dagger.hilt.android.C10164b;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.C11510n;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ$\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\r\u001a\u00020\u000bH\u0002R\u001b\u0010\u0013\u001a\u00020\u000e8BX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\"\u0010\u001b\u001a\u00020\u00148\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/ui/notification/SubscribeToNewsNotificationFragment;", "Landroidx/fragment/app/Fragment;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "view", "Lkotlin/d2;", "onViewCreated", "L0", "Lcom/carrefour/fid/android/databinding/j8;", "f", "Lcom/carrefour/fid/android/shared/util/FragmentViewBindingDelegate;", "K0", "()Lcom/carrefour/fid/android/databinding/j8;", "binding", "Lcom/carrefour/fid/android/presentation/viewmodels/notification/a;", "g", "Lcom/carrefour/fid/android/presentation/viewmodels/notification/a;", "J0", "()Lcom/carrefour/fid/android/presentation/viewmodels/notification/a;", "N0", "(Lcom/carrefour/fid/android/presentation/viewmodels/notification/a;)V", "analyticsViewModel", "<init>", "()V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C10164b
@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.notification.SubscribeToNewsNotificationFragment */
public final class SubscribeToNewsNotificationFragment extends C24649a {

    /* renamed from: v */
    public static final /* synthetic */ C11510n<Object>[] f61227v = {C11342l0.m43564u(new PropertyReference1Impl(SubscribeToNewsNotificationFragment.class, "binding", "getBinding()Lcom/carrefour/fid/android/databinding/SubscribeToNewsNotificationFragmentBinding;", 0))};

    /* renamed from: w */
    public static final int f61228w = 8;
    @C12579k

    /* renamed from: f */
    public final FragmentViewBindingDelegate f61229f = FragmentViewBindingDelegateKt.m119491b(this, SubscribeToNewsNotificationFragment$binding$2.f61231a);
    @Inject

    /* renamed from: g */
    public C26628a f61230g;

    /* renamed from: M0 */
    public static final void m107694M0(SubscribeToNewsNotificationFragment subscribeToNewsNotificationFragment, View view) {
        Intrinsics.checkNotNullParameter(subscribeToNewsNotificationFragment, "this$0");
        C19232h requireActivity = subscribeToNewsNotificationFragment.requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
        ActivityKt.m118702l(requireActivity);
    }

    @C12579k
    /* renamed from: J0 */
    public final C26628a mo72035J0() {
        C26628a aVar = this.f61230g;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("analyticsViewModel");
        return null;
    }

    /* renamed from: K0 */
    public final C36737j8 mo72036K0() {
        return (C36737j8) this.f61229f.mo22938a(this, f61227v[0]);
    }

    /* renamed from: L0 */
    public final void mo72037L0() {
        BottomNavActivity bottomNavActivity;
        ToolBarDefaultView M1;
        C19232h activity = getActivity();
        if (activity instanceof BottomNavActivity) {
            bottomNavActivity = (BottomNavActivity) activity;
        } else {
            bottomNavActivity = null;
        }
        if (bottomNavActivity != null && (M1 = bottomNavActivity.mo121107M1()) != null) {
            M1.mo121278k0(R.string.notification_toolbar_title);
            ToolBarDefaultView.m158944r0(M1, true, (C11300l) null, false, 6, (Object) null);
        }
    }

    /* renamed from: N0 */
    public final void mo72038N0(@C12579k C26628a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.f61230g = aVar;
    }

    @C12579k
    public View onCreateView(@C12579k LayoutInflater layoutInflater, @C12580l ViewGroup viewGroup, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        ConstraintLayout b = mo72036K0().getRoot();
        Intrinsics.checkNotNullExpressionValue(b, "binding.root");
        return b;
    }

    public void onViewCreated(@C12579k View view, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        super.onViewCreated(view, bundle);
        mo72037L0();
        mo72036K0().f91099b.setOnClickListener(new C24650b(this));
        mo72035J0().mo77376a();
    }
}
