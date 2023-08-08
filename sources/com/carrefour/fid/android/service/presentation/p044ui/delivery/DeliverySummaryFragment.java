package com.carrefour.fid.android.service.presentation.p044ui.delivery;

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
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.C19499w;
import androidx.navigation.C19766m;
import com.carrefour.fid.android.service.presentation.analytics.delivery.DeliverySummaryAnalyticsReporter;
import com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.summary.DeliverySummaryViewModel;
import com.carrefour.fid.android.shared.navigation.C28796c;
import dagger.hilt.android.C10164b;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.C11677z;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10164b
@C11076d0(mo22515d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b$\u0010%J$\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016R\u001b\u0010\u000f\u001a\u00020\n8BX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0015\u001a\u00020\u00108BX\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\"\u0010\u0017\u001a\u00020\u00168\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010\u001e\u001a\u00020\u001d8\u0000@\u0000X.¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006&"}, mo22516d2 = {"Lcom/carrefour/fid/android/service/presentation/ui/delivery/DeliverySummaryFragment;", "Landroidx/fragment/app/Fragment;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "Lcom/carrefour/fid/android/service/presentation/viewmodels/delivery/mvi/summary/DeliverySummaryViewModel;", "viewModel$delegate", "Lkotlin/z;", "getViewModel", "()Lcom/carrefour/fid/android/service/presentation/viewmodels/delivery/mvi/summary/DeliverySummaryViewModel;", "viewModel", "Lcom/carrefour/fid/android/service/presentation/ui/delivery/DeliverySummaryFragmentArgs;", "args$delegate", "Landroidx/navigation/m;", "getArgs", "()Lcom/carrefour/fid/android/service/presentation/ui/delivery/DeliverySummaryFragmentArgs;", "args", "Lcom/carrefour/fid/android/shared/navigation/c;", "navigator", "Lcom/carrefour/fid/android/shared/navigation/c;", "getNavigator", "()Lcom/carrefour/fid/android/shared/navigation/c;", "setNavigator", "(Lcom/carrefour/fid/android/shared/navigation/c;)V", "Lcom/carrefour/fid/android/service/presentation/analytics/delivery/DeliverySummaryAnalyticsReporter;", "analytics", "Lcom/carrefour/fid/android/service/presentation/analytics/delivery/DeliverySummaryAnalyticsReporter;", "getAnalytics$service_release", "()Lcom/carrefour/fid/android/service/presentation/analytics/delivery/DeliverySummaryAnalyticsReporter;", "setAnalytics$service_release", "(Lcom/carrefour/fid/android/service/presentation/analytics/delivery/DeliverySummaryAnalyticsReporter;)V", "<init>", "()V", "service_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nDeliverySummaryFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeliverySummaryFragment.kt\ncom/carrefour/fid/android/service/presentation/ui/delivery/DeliverySummaryFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 FragmentNavArgsLazy.kt\nandroidx/navigation/fragment/FragmentNavArgsLazyKt\n*L\n1#1,79:1\n56#2,10:80\n42#3,3:90\n*S KotlinDebug\n*F\n+ 1 DeliverySummaryFragment.kt\ncom/carrefour/fid/android/service/presentation/ui/delivery/DeliverySummaryFragment\n*L\n29#1:80,10\n30#1:90,3\n*E\n"})
/* renamed from: com.carrefour.fid.android.service.presentation.ui.delivery.DeliverySummaryFragment */
public final class DeliverySummaryFragment extends Hilt_DeliverySummaryFragment {
    public static final int $stable = 8;
    @Inject
    public DeliverySummaryAnalyticsReporter analytics;
    @C12579k
    private final C19766m args$delegate = new C19766m(C11342l0.m43547d(DeliverySummaryFragmentArgs.class), new DeliverySummaryFragment$special$$inlined$navArgs$1(this));
    @Inject
    public C28796c navigator;
    @C12579k
    private final C11677z viewModel$delegate;

    public DeliverySummaryFragment() {
        DeliverySummaryFragment$special$$inlined$viewModels$default$1 deliverySummaryFragment$special$$inlined$viewModels$default$1 = new DeliverySummaryFragment$special$$inlined$viewModels$default$1(this);
        this.viewModel$delegate = FragmentViewModelLazyKt.m89922g(this, C11342l0.m43547d(DeliverySummaryViewModel.class), new DeliverySummaryFragment$special$$inlined$viewModels$default$2(deliverySummaryFragment$special$$inlined$viewModels$default$1), new DeliverySummaryFragment$special$$inlined$viewModels$default$3(deliverySummaryFragment$special$$inlined$viewModels$default$1, this));
    }

    /* access modifiers changed from: private */
    public final DeliverySummaryFragmentArgs getArgs() {
        return (DeliverySummaryFragmentArgs) this.args$delegate.getValue();
    }

    /* access modifiers changed from: private */
    public final DeliverySummaryViewModel getViewModel() {
        return (DeliverySummaryViewModel) this.viewModel$delegate.getValue();
    }

    @C12579k
    public final DeliverySummaryAnalyticsReporter getAnalytics$service_release() {
        DeliverySummaryAnalyticsReporter deliverySummaryAnalyticsReporter = this.analytics;
        if (deliverySummaryAnalyticsReporter != null) {
            return deliverySummaryAnalyticsReporter;
        }
        Intrinsics.throwUninitializedPropertyAccessException("analytics");
        return null;
    }

    @C12579k
    public final C28796c getNavigator() {
        C28796c cVar = this.navigator;
        if (cVar != null) {
            return cVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("navigator");
        return null;
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
        composeView.setContent(C8553b.m31049c(635287203, true, new DeliverySummaryFragment$onCreateView$1$1(this)));
        return composeView;
    }

    public final void setAnalytics$service_release(@C12579k DeliverySummaryAnalyticsReporter deliverySummaryAnalyticsReporter) {
        Intrinsics.checkNotNullParameter(deliverySummaryAnalyticsReporter, "<set-?>");
        this.analytics = deliverySummaryAnalyticsReporter;
    }

    public final void setNavigator(@C12579k C28796c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.navigator = cVar;
    }
}
