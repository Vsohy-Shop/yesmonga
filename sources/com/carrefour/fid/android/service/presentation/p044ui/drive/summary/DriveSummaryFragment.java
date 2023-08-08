package com.carrefour.fid.android.service.presentation.p044ui.drive.summary;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.p004ui.platform.ComposeView;
import androidx.compose.p004ui.platform.ViewCompositionStrategy;
import androidx.compose.runtime.internal.C8553b;
import androidx.navigation.C19766m;
import dagger.hilt.android.C10164b;
import kotlin.C11076d0;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10164b
@C11076d0(mo22515d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J$\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016R\u001b\u0010\u0011\u001a\u00020\f8FX\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, mo22516d2 = {"Lcom/carrefour/fid/android/service/presentation/ui/drive/summary/DriveSummaryFragment;", "Lcom/carrefour/fid/android/shared/base/q;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "Lkotlin/d2;", "onStart", "Lcom/carrefour/fid/android/service/presentation/ui/drive/summary/DriveSummaryFragmentArgs;", "args$delegate", "Landroidx/navigation/m;", "getArgs", "()Lcom/carrefour/fid/android/service/presentation/ui/drive/summary/DriveSummaryFragmentArgs;", "args", "<init>", "()V", "service_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nDriveSummaryFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DriveSummaryFragment.kt\ncom/carrefour/fid/android/service/presentation/ui/drive/summary/DriveSummaryFragment\n+ 2 FragmentNavArgsLazy.kt\nandroidx/navigation/fragment/FragmentNavArgsLazyKt\n*L\n1#1,41:1\n42#2,3:42\n*S KotlinDebug\n*F\n+ 1 DriveSummaryFragment.kt\ncom/carrefour/fid/android/service/presentation/ui/drive/summary/DriveSummaryFragment\n*L\n19#1:42,3\n*E\n"})
/* renamed from: com.carrefour.fid.android.service.presentation.ui.drive.summary.DriveSummaryFragment */
public final class DriveSummaryFragment extends Hilt_DriveSummaryFragment {
    @C12579k
    private final C19766m args$delegate = new C19766m(C11342l0.m43547d(DriveSummaryFragmentArgs.class), new DriveSummaryFragment$special$$inlined$navArgs$1(this));

    @C12579k
    public final DriveSummaryFragmentArgs getArgs() {
        return (DriveSummaryFragmentArgs) this.args$delegate.getValue();
    }

    @C12579k
    public View onCreateView(@C12579k LayoutInflater layoutInflater, @C12580l ViewGroup viewGroup, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
        ComposeView composeView = new ComposeView(requireContext, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.f39397b);
        composeView.setContent(C8553b.m31049c(-311055725, true, new DriveSummaryFragment$onCreateView$1$1(this)));
        return composeView;
    }

    public void onStart() {
        super.onStart();
        View view = getView();
        if (view != null) {
            view.sendAccessibilityEvent(8);
        }
    }
}
